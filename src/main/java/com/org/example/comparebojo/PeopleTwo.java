package com.org.example.comparebojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

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
public class PeopleTwo {
    @ApiModelProperty(value = "aa")
    public int aa;
    public String bb;
    public int cc;
    private int dd;
    private BigDecimal ee;

}
