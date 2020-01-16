package com.walkingcoding.credit.module.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 积分流水父类
 *
 * @author songhuiqing
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperCreditTransaction {

    private String creditTransactionId;
    private String userId;
    private String channelId;
    private String eventId;
    private int credit;
    private Date createTime;
    private Date expiredTime;
}
