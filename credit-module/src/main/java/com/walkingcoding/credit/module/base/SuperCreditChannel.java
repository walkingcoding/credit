package com.walkingcoding.credit.module.base;

import lombok.Data;


/**
 * 积分渠道父类
 *
 * @author songhuiqing
 */
@Data
public class SuperCreditChannel {
    private String channelId;
    private String channelName;
    private int channelType;
    private int creditValidMonth;
}
