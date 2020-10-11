package com.org.freemarker;

import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/10/9 10:15 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class testGroovyClasses1 {
    public static void main(String[] args) throws Exception {

        String sql = "select person_id,person_name,delete_flag from person";

        List<BaseModel> select = (List<BaseModel>)OperationDBUtil.select(sql, BaseModel.class);

        select.forEach(item->{
            System.out.println(item.getPerson_id());
        });

    }
}
