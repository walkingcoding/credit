package com.walkingcoding.credit.module.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.walkingcoding.credit.module.mapper.CreditAccountMapper;
import com.walkingcoding.credit.module.mapper.entity.CreditAccountEntity;
import com.walkingcoding.credit.module.service.CreditAccountService;
import org.springframework.stereotype.Service;

/**
 * @author songhuiqing
 */

@Service
public class CreditAccountServiceImpl extends ServiceImpl<CreditAccountMapper, CreditAccountEntity> implements CreditAccountService {
}
