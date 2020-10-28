package com.qfjy.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @Classname Account
 * @Author guoweixin
 * @Description TODO
 * @Date 2019/12/3 16:48
 * @Created by Administrator
 */
@Data
public class Account  implements Serializable {

    private String id;
    private String uid;
    /**
     * 用于计算金额单位：
     *  不能用double 会导致精度丢失
     *    BigDecimal bigDecimal=
     *    long  20.30
     *    100000
     */
    private long balance;

}
