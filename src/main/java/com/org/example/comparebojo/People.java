package com.org.example.comparebojo;

import lombok.Data;

/**
 * @name: aa
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/6/12 18:13 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
@Data
public class People {

    public String aa;
    private int bb;
    public int cc;
    public int ee;

    /*public BigDecimal getAa() {
        return new BigDecimal(aa);
    }*/

    public People(String aa, int bb, int cc, int ee) {
        this.aa = aa;
        this.bb = bb;
        this.cc = cc;
        this.ee = ee;
    }

    public People() {
    }
}
