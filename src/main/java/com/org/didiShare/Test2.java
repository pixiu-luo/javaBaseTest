package com.org.didiShare;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/11/10 11:27 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> poLineIds = Lists.newArrayList("11","22");
        String poLineIdsStr = StringUtils.join(poLineIds, ",");
        System.out.println(poLineIdsStr);
    }


}
