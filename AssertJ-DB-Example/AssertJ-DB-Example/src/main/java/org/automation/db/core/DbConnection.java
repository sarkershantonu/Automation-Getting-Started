package org.automation.db.core;

import java.sql.Connection;

public class DbConnection {

    private Connection dbConnection;
    private final DbType aType;

    public DbConnection(DbType aType) {
        this.aType = aType;
    }

    public Connection getDbConnection(){
        return null;// for now
    }

    public synchronized void initialize(){
        //initialization of DB based on Types

        if(null==dbConnection){

        }
    }
}
