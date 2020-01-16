package com.walkingcoding.credit.module.base;

import lombok.Data;

/**
 * 积分规则父类
 *
 * @author songhuiqing
 */
@Data
public class SuperCreditRule {

    private String ruleId;
    private String ruleName;
    private String channelId;
    private String ruleLimitCondition;
    private Integer credit;
}
