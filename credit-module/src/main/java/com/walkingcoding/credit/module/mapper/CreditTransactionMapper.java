package com.walkingcoding.credit.module.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.walkingcoding.credit.module.mapper.entity.CreditTransactionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分明细Mapper
 * @author songhuiqing
 */
@Mapper
public interface CreditTransactionMapper extends BaseMapper<CreditTransactionEntity> {
}
