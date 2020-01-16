package com.walkingcoding.credit.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.walkingcoding.credit.module.mapper.entity.CreditRuleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分规则Mapper
 *
 * @author songhuiqing
 */
@Mapper
public interface CreditRuleMapper extends BaseMapper<CreditRuleEntity> {
}
