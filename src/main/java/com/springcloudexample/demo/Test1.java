package com.springcloudexample.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2021/1/28 10:45 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "[{\"id\":2571,\"name\":\"科布伦茨\"}]";

        //JSONObject object = JSON.parseObject(str);

        List<CoupaDept> coupaDeptList = JSONObject.parseObject(str, List.class);
        CoupaDept coupaDept = JSONObject.parseObject(String.valueOf(coupaDeptList.get(0)), CoupaDept.class);
        System.out.println(coupaDept.getName());

    }


}
