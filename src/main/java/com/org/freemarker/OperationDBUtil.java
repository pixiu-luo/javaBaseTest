package com.org.freemarker;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class OperationDBUtil {

    public static <T> T select(String sql, Class<T> clazz) throws Exception {
        JDBCUtil jdbcUtils = new JDBCUtil();
        QueryRunner queryRunner = new QueryRunner();
        Object result = queryRunner.query(jdbcUtils.getConnection(), sql, new BeanListHandler(clazz));
        DbUtils.close(jdbcUtils.getConnection());
        return (T) result;
    }

}
