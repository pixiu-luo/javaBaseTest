package com.org.didiShare;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/11/9 17:23 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test {
    public static void main(String[] args) {

        TestQuestion testQuestion = new TestQuestion();
        /*testQuestion.setAa("111");
        testQuestion.setBb("222");*/

        CompletableFuture<List<String>> listCompletableFuture = CompletableFuture.supplyAsync(() -> getList());

        List<String> requisitionsNumbers = Lists.newArrayList("111");
        List<String> deptCodeList = Lists.newArrayList("111", "222");

        /*Boolean deptFlag = deptCodeList.stream().anyMatch(model -> model.equals(orderHeader.getDeptCode()));
        Boolean approvedFlag = requisitionsNumbers.stream()
                .anyMatch(model -> model.equals(orderHeader.getRequisitionNumber()));*/

        try {
            List<String> resultList = listCompletableFuture.get();
            Boolean deptFlag = deptCodeList.stream().anyMatch(model -> model.equals(testQuestion.getAa()));
            Boolean approvedFlag = resultList.stream()
                    .anyMatch(model -> model.equals(testQuestion.getAa()));
            System.out.println(approvedFlag + "" + deptFlag);
        }catch (Exception e){
            System.out.println("yic");
        }

    }

    public static List<String> getList() {
        return Lists.newArrayList("111", "222");
    }
}
