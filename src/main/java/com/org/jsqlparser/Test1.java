package com.org.jsqlparser;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.util.TablesNamesFinder;

import java.io.StringReader;
import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/9/29 11:23 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test1 {

    public static void main(String[] args) throws JSQLParserException {
        //tablesNameBysql();

        updateDemo();
    }

    public static List tablesNameBysql() throws JSQLParserException {

        CCJSqlParserManager pm = new CCJSqlParserManager();

        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append(" INSERT INTO FAE_VOUCHER_B")
                .append(" PK_AMOUNTTYPECRITERION,")
                .append(" PK_AMOUNTTYPE,")
                .append(" AMOUNTTYPE_CODE")
                .append(" )")
                .append(" WITH FAE_ASSFLOW_B_TEMP AS (")
                .append("  SELECT")
                .append(" T1.RECORD_DT ,")
                .append(" T1.DEAL_DT ,")
                .append(" T1.DEAL_CODE ")
                .append(" CASE WHEN T1.CDFLAG='C' THEN  DEAL_AMT")
                .append(" WHEN T1.CDFLAG='D' THEN -DEAL_AMT")
                .append(" ELSE 0 END DEAL_AMT")
                .append(" ON A.PK_AMOUNTTYPE=C.PK_AMOUNTTYPE")
                .append(" WHERE NVL(A.DR,0)=0")
                .append(" AND NVL(B.ISENABLE,'Y')='Y' AND NVL(B.DR,0)=0")
                .append(" AND NVL(C.ISENABLE,'Y')='Y' AND NVL(C.DR,0)=0");


        Statement statement = pm.parse(new StringReader(stringBuffer.toString()));

        //String sql = "select * from Outvisit l left join patient p on l.patid=p.patientid join patstatic c on  l.patid=c.patid inner join patphone  ph  on l.patid=ph.patid where l.name='kevin'  union all select * from invisit v";

        //Statement statement = CCJSqlParserUtil.parse(sql);

        //Select selectStatement = (Select)statement;

        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();

        List result = tablesNamesFinder.getTableList(statement);

        for (Object tableStr : result) {

            System.out.println(tableStr.toString());

        }

        return result;
    }

    public static void updateDemo() throws JSQLParserException {
        CCJSqlParserManager pm = new CCJSqlParserManager();

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("update ac_operator op ");
        stringBuffer.append("set op.errcount=(");
        stringBuffer.append("(select case when op1.errcount is null then 0 else op1.errcount end as errcount ");
        stringBuffer.append("from ac_operator op1 ");
        stringBuffer.append("where op1.loginname = '中国' )+1");
        stringBuffer.append("),lastlogin='中国' ");
        stringBuffer.append("where PROCESS_ID=");
        stringBuffer.append("(select distinct g.id from tempTable g where g.ID='中国')");
        stringBuffer.append("and columnName2 = '890' and columnName3 = '678' and columnName4 = '456'");

        Statement statement = pm.parse(new StringReader(stringBuffer.toString()));

        if (statement instanceof Update) {
            // 获得Update对象
            Update updateStatement = (Update) statement;
            // 获得表名
            System.out.println("table:" + updateStatement.getTables().get(0).getName());

            List<Column> columns = updateStatement.getColumns();

            for (Column column : columns) {
                System.out.println(column.getColumnName());
            }

        }
    }


}
