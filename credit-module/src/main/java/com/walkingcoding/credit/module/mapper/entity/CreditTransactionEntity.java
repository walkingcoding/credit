package com.walkingcoding.credit.module.mapper.entity;

import com.walkingcoding.credit.module.base.SuperCreditTransaction;

import java.util.Date;

/**
 * @author songhuiqing
 */
public class CreditTransactionEntity extends SuperCreditTransaction {

    public CreditTransactionEntity() {
    }

    public CreditTransactionEntity(String userId, String channelId, String eventId, int credit, Date expiredTime) {
        super(null, userId, channelId, eventId, credit, new Date(), expiredTime);
    }
}
