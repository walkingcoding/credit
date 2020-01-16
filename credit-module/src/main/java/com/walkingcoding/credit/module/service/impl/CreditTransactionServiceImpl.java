package com.walkingcoding.credit.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.walkingcoding.credit.module.mapper.CreditTransactionMapper;
import com.walkingcoding.credit.module.mapper.entity.CreditTransactionEntity;
import com.walkingcoding.credit.module.service.CreditTransactionService;
import org.springframework.stereotype.Service;

/**
 * @author songhuiqing
 */
@Service
public class CreditTransactionServiceImpl extends ServiceImpl<CreditTransactionMapper, CreditTransactionEntity> implements CreditTransactionService {
}
