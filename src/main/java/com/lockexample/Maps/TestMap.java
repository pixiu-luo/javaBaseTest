package com.lockexample.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/17 10:13 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class TestMap {
    public static void main(String[] args) {
        // 创建map
        Map<String, Object> map = new HashMap<String, Object>();
        // 模拟添加数据
        map.put("a1", "1");
        map.put("a2", "2");
        map.put("b1", "11");
        map.put("b2", "22");
        map.put("c1", "111");
        map.put("c2", "222");

        // 打印原始map
        System.out.println(map.toString());

        // map中key（键）的迭代器对象
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){// 循环取键值进行判断
            String key = iterator.next();// 键
            if(key.startsWith("a")){
                iterator.remove();// 移除map中以a字符开头的键对应的键值对
            }
        }

        System.out.println(map.toString());// 打印移除键值对后的map
    }

}
