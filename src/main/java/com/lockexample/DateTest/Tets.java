package com.lockexample.DateTest;

import java.math.BigDecimal;

/**
 * @name:
 * @Copyright: CopyRight(c) 2020
 * @description: <br>
 * @precautionsғ
 * @date: 2020/12/26 22:10 <br>
 * @author: liujing <br>
 * @version: 1.0.0 <br>
 */
public class Tets {
    public static void main(String[] args) {
        BigDecimal includingTaxPrice = BigDecimal.valueOf(2000);
        BigDecimal taxRate = BigDecimal.valueOf(0.1);
        BigDecimal discount = BigDecimal.valueOf(0.1);
        BigDecimal excludingTaxPrice = includingTaxPrice.divide(BigDecimal.ONE.add(taxRate),6,BigDecimal.ROUND_HALF_UP);
        BigDecimal discountTaxPrice = includingTaxPrice.divide(BigDecimal.ONE.add(taxRate))
                .multiply(BigDecimal.ONE.subtract(discount))
                .setScale(6, BigDecimal.ROUND_HALF_UP);

    }
}
