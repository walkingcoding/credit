package com.walkingcoding.credit.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.walkingcoding.credit.module.mapper.CreditRuleMapper;
import com.walkingcoding.credit.module.mapper.entity.CreditRuleEntity;
import com.walkingcoding.credit.module.service.CreditRuleService;
import org.springframework.stereotype.Service;

/**
 * @author songhuiqing
 */
@Service
public class CreditRuleServiceImpl extends ServiceImpl<CreditRuleMapper, CreditRuleEntity> implements CreditRuleService {
}
