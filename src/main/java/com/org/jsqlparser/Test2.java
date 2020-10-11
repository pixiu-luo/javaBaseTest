package com.org.jsqlparser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.create.table.CreateTable;

import java.io.StringReader;
import java.text.ParseException;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/29 13:48 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test2 {

    public static void main(String[] args) throws JSQLParserException, ParseException {
        String sql = "CREATE TABLE company (comid int(10) unsigned NOT NULL AUTO_INCREMENT,name varchar(45) NOT NULL,organizationcode varchar(45) DEFAULT NULL,businesscode varchar(45) DEFAULT NULL,taxcode varchar(45) DEFAULT NULL,telephone varchar(45) DEFAULT NULL,comcode int(11) NOT NULL,PRIMARY KEY (comid),UNIQUE KEY comid_UNIQUE (comid),UNIQUE KEY comcode_UNIQUE (comcode) USING BTREE) ENGINE=InnoDB AUTO_INCREMENT=1004 DEFAULT CHARSET=utf8";
        int i;
        if (sql.contains("USING BTREE")) {
            sql = sql.replaceAll("USING BTREE", "");
        }
        List tablename = getTableNameBySql(sql);
        for (i = 0; i < tablename.size(); i++) {
            //System.out.println(tablename.get(i).getColumnName() +" : “+tablename.get(i).getColDataType()+” : "+tablename.get(i).getColumnSpecStrings());
        }
    }

    public static List getTableNameBySql(String sql) throws JSQLParserException {
        CCJSqlParserManager parser = new CCJSqlParserManager();
        List columnList = null;
        Statement stmt = parser.parse(new StringReader(sql));
        if (stmt instanceof CreateTable) {
            columnList = ((CreateTable) stmt).getColumnDefinitions();
        }
        return columnList;
    }
}
