package com.tweb.mybatis.transaction.jdbc;

import com.tweb.mybatis.session.TransactionIsolationLevel;
import com.tweb.mybatis.transaction.Transaction;
import com.tweb.mybatis.transaction.TransactionFactory;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author sizt
 * @description: TODO
 * @date 2026/1/21 20:05
 */
public class JdbcTransactionFactory implements TransactionFactory {

    @Override
    public Transaction newTransaction(Connection conn) {
        return new JdbcTransaction(conn);
    }

    @Override
    public Transaction newTransaction(DataSource dataSource, TransactionIsolationLevel level, boolean autoCommit) {
        return new JdbcTransaction(dataSource, level, autoCommit);
    }

}
