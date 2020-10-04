package org.automation.webtest.core;

import org.automation.webtest.config.PropertyLoader;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;


public abstract class DataBaseConnection {

    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;


    protected DataBaseConnection() {
        try {
            PropertyLoader.loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
        loadOracleDriver();
    }

    /**
     * Load Oracle JDBC Driver
     */
    private void loadOracleDriver() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {

        }
    }

    /**
     * Create Data Base Connection
     */
    private void createConnection() {

        try {

            String dbUrl = System.getProperty("db.url")
                    + ":@"
                    + System.getProperty("db.host")
                    + ":"
                    + System.getProperty("db.port")
                    + "/"
                    + System.getProperty("db.schema");

            connection = DriverManager.getConnection(dbUrl, System.getProperty("db.user"), System.getProperty("db.password"));

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    /**
     * Close Data Base Connection
     */
    private void closeDataBaseConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Fetch data from Data Base by Select Query
     * @param sqlQuery : takes SQL query in String format
     * @return data in Row-Column Format
     */
    protected LinkedHashSet<LinkedHashMap<String, String>> fetchData(String sqlQuery) {
        createConnection();

        LinkedHashSet<LinkedHashMap<String, String>> data = null;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sqlQuery);
            data = processDataFromSqlReturn(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeResultSet();
            closeStatement();
            closeDataBaseConnection();
        }
        return data;
    }

    /**
     * Process query result in Row-Column Format
     * @param resultSet : takes data base query result in raw format
     * @return data in Row-Column Format
     * @throws SQLException
     */
    private LinkedHashSet<LinkedHashMap<String, String>> processDataFromSqlReturn(ResultSet resultSet) throws SQLException {

        LinkedHashSet<LinkedHashMap<String,String>> data = new LinkedHashSet<LinkedHashMap<String,String>>();
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int columnsNumber = resultSetMetaData.getColumnCount();
        while (resultSet.next()) {
            LinkedHashMap<String, String> dataRow = new LinkedHashMap<>();
            for (int i = 1; i <= columnsNumber; i++) {
                String columnValue = resultSet.getString(i);
                String columnName =  resultSetMetaData.getColumnName(i);
                dataRow.put(columnName, columnValue);
            }
            data.add(dataRow);
        }
        return data;
    }

    /**
     * This method will update data in data base table
     * @param sqlString : takes SQL query in String format
     * @return Number of Rows Affected by the Update Query in integer
     */
    protected int updateData(String sqlString){
        createConnection();
        int affectedRowCount = 0;
        try {
            statement = connection.createStatement();
            affectedRowCount = statement.executeUpdate(sqlString);

        } catch (SQLException e) {
        } finally {
            closeStatement();
            closeDataBaseConnection();
        }
        return  affectedRowCount;
    }

    /**
     * Close Result Set
     */
    private void closeResultSet() {
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Close Statement
     */
    private void closeStatement() {
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
