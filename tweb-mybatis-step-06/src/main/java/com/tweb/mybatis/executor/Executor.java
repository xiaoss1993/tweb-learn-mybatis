package com.tweb.mybatis.executor;

import com.tweb.mybatis.mapping.BoundSql;
import com.tweb.mybatis.mapping.MappedStatement;
import com.tweb.mybatis.session.ResultHandler;
import com.tweb.mybatis.transaction.Transaction;

import java.sql.SQLException;
import java.util.List;

/**
 * @author sizt
 * @description: 执行器
 * @date 2026/1/17 21:02
 */
public interface Executor {
    ResultHandler NO_RESULT_HANDLER = null;

    <E> List<E> query(MappedStatement ms, Object parameter, ResultHandler resultHandler, BoundSql boundSql);

    Transaction getTransaction();

    void commit(boolean required) throws SQLException;

    void rollback(boolean required) throws SQLException;

    void close(boolean forceRollback);
}
