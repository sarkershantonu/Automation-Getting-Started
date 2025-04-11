package org.automation.db.core.support;

import java.sql.Connection;

public interface DbClient {
    Connection getConnection();
}
