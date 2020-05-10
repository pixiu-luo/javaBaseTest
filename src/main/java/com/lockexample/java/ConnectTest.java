package com.lockexample.java;

import redis.clients.jedis.Jedis;

import java.util.List;

public class ConnectTest {
        public static void main(String[] args) {
            // 创建一个jedis对象，传入服务器ip地址
            Jedis jedis = new Jedis("182.92.129.85");
            System.out.println("connect successfully");
            // 如果设置了认证，就需要认证一下
            jedis.auth("123456");
            System.out.println("Server is running: "+jedis.ping());
            // push值
            jedis.lpush("durant", "Redis","Mongodb","Mysql","durant");
            // 再取出所有数据jedis.lrange是按范围取出，
            // 第一个是key，第二个是起始位置，第三个是结束位置，jedis.llen获取长度 -1表示取得所有
            List<String> list = jedis.lrange("durant",0,5);
            list.forEach(s -> System.out.println("value:"+s));

        }
}
