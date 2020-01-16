package com.walkingcoding.credit.module.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.walkingcoding.credit.module.mapper.entity.CreditRuleEntity;
import com.walkingcoding.credit.module.mapper.entity.CreditTransactionEntity;
import com.walkingcoding.credit.module.service.CreditChannelService;
import com.walkingcoding.credit.module.service.CreditRuleService;
import com.walkingcoding.credit.module.service.CreditTransactionService;
import com.walkingcoding.credit.module.service.UserCreditService;
import com.walkingcoding.credit.module.service.bo.CreditTransactionBo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 用户积分接口实现
 *
 * @author songhuiqing
 */
@Service
public class UserCreditServiceImpl implements UserCreditService {

    @Autowired
    private CreditTransactionService creditTransactionService;

    @Autowired
    private CreditChannelService creditChannelService;

    @Autowired
    private CreditRuleService creditRuleService;

    @Override
    public String addCredit(String userId, String channelId, String eventId) {

        creditTransactionService.save(new CreditTransactionEntity(userId, channelId, eventId, 0, new Date()));
        return "";
    }

    @Override
    public boolean consumeCredit(String userId, String channelId, String eventId) {
        return false;
    }

    @Override
    public Integer getCredit(String userId) {
        return null;
    }

    @Override
    public List<CreditTransactionBo> listCreditTransaction(String userId, int type, Page<CreditTransactionBo> page) {
        return null;
    }
}
