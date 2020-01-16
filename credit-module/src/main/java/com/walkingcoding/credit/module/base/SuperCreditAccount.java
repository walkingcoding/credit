package com.walkingcoding.credit.module.base;

import lombok.Data;

import java.util.Date;

/**
 * 积分账户父类
 * @author songhuiqing
 */
@Data
public class SuperCreditAccount {

    private String creditAccountId;
    private String userId;
    private String credit;
    private Date creditCalculateTime;
}
