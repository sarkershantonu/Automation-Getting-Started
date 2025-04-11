package org.automation.db.core;

public enum DbType {
    ORACLE("oracle", "oracle.jdbc.thin"),
    ORACLE_OCI("oracle","oracle.jdbc.oci"),
    MYSQL("mysql","mysql.jdbc"),
    MS_SQLSERVER("sqlserver","ms.sqlserver.jdbc"),
    JTDS_SQLSERVER("jtds_sqlserver","jtds.sqlserver.jdbc")

    ;

    private String dbName,propertyName;

    DbType(String dbName, String propertyName) {
        this.dbName = dbName;
        this.propertyName = propertyName;
    }
}
