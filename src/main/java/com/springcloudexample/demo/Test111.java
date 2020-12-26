package com.springcloudexample.demo;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/11/26 17:35 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test111 {
    public static void main(String[] args) {
        //每天学会一点点
        //用map接参数然后转json在转对象；
        /*{
            "type": "3",
                "no": "11",
                "protocolVersion": 1,
                "source": "CXYX-ISCM",
                "body": {
            "id": 11,
                    "supplierId": 1000595,
                    "supplierName": "橙心商贸-供货公司1",
                    "goodsName": "绿农 测试邮件告警 标品果橙 箱(100个*50g)",
                    "skuCode": 21000593005910,
                    "cityId": 17,
                    "status": 3
        },
            "virtual": true
        }*/

        List<String> oldCitys = Lists.newArrayList("qq","ww","rr");

        List<String> newCitys1 = Lists.newArrayList("qq","ww");

        List<String> newCitys2 = Lists.newArrayList("ee","tt","00");

        List<String> newCitys3 = Lists.newArrayList();
        List<String> newCitys4 = Lists.newArrayList("qq1");
        List<String> newCitys5 = Lists.newArrayList("qq");



        //System.out.println(oldCitys.retainAll(newCitys1));
        System.out.println(oldCitys.retainAll(newCitys2));
        /*System.out.println(oldCitys.retainAll(newCitys3));
        System.out.println(oldCitys.retainAll(newCitys4));
        System.out.println(oldCitys.retainAll(newCitys5));*/

        /*{"type":"3","no":"5","protocolVersion":1,"source":"CXYX-ISCM","body":{"id":5,"supplierId":1000596,"supplierName":"橙心商贸-供货公司2","goodsName":"皇室 新增标品 (101g±0.2g)*101个/瓶","skuCode":21000593005921,"cityId":17,"status":1},"virtual":false}*/
        System.out.println("a" + "w");



    }
}
