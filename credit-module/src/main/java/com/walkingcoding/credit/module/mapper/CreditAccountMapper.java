package com.walkingcoding.credit.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.walkingcoding.credit.module.mapper.entity.CreditAccountEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分账户Mapper
 * @author songhuiqing
 */
@Mapper
public interface CreditAccountMapper extends BaseMapper<CreditAccountEntity> {
}
