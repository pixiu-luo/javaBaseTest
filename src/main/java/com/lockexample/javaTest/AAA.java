package com.lockexample.javaTest;

public class AAA {

    static public int water = 0;

    public void outlet() {
        if (water >= 2) {
            water = water - 2;
        } else {
            water = 0;
        }
    }

    public void inlet() {
        water = water + 3;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Pool out = new Pool();
        Pool in = new Pool();
        System.out.println("水池的水量为：" + Pool.AA);

        System.out.println("向水池注入两次水后：");
        in.cc();
//        in.inlet();
//        in.inlet();
//        System.out.println("水池的水量为：" + Pool.water);
//        System.out.println("水池倒出一次水后：");
//        out.outlet();
//        System.out.println("最后水池的水为：" + Pool.water);

    }

}
