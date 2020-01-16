package com.walkingcoding.credit.module.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.walkingcoding.credit.module.service.bo.CreditTransactionBo;

import java.util.List;

/**
 * 用户积分接口
 *
 * @author songhuiqing
 */
public interface UserCreditService {


    /**
     * 获得积分，成功积分返回积分明细ID，当日积分已满返回""
     *
     * @param userId    用户id
     * @param channelId 渠道id
     * @param eventId   事件id
     * @return 积分明细ID
     */
    String addCredit(String userId, String channelId, String eventId);

    /**
     * 消费积分，消费积分时，需要调用业务方提供的积分个数接口，返回true则消费成功，false为余额不足
     *
     * @param userId    用户id
     * @param channelId 渠道id
     * @param eventId   事件id
     * @return
     */
    boolean consumeCredit(String userId, String channelId, String eventId);

    /**
     * 获取个人的总可用积分
     *
     * @param userId 用户ID
     * @return
     */
    Integer getCredit(String userId);


    /**
     * 分页查询个人总积分明细
     *
     * @param userId 用户ID
     * @param page   分页条件
     * @return
     */
    default List<CreditTransactionBo> listCreditTransaction(String userId, Page<CreditTransactionBo> page) {
        return listCreditTransaction(userId, 0, page);
    }

    /**
     * 分页查询个人消费积分明细
     *
     * @param userId 用户ID
     * @param page   分页条件
     * @return
     */
    default List<CreditTransactionBo> listConsumeTransaction(String userId, Page<CreditTransactionBo> page) {
        return listCreditTransaction(userId, -1, page);
    }

    /**
     * 分页查询个人赚取积分明细
     *
     * @param userId 用户ID
     * @param page   分页条件
     * @return
     */
    default List<CreditTransactionBo> listAddTransaction(String userId, Page<CreditTransactionBo> page) {
        return listCreditTransaction(userId, 1, page);
    }


    /**
     * 分页查询个人总积分明细
     *
     * @param userId 用户ID
     * @param type   类型，-1：消费积分明细，0：全部积分，1：赚取积分明细
     * @param page   分页条件
     * @return
     */
    List<CreditTransactionBo> listCreditTransaction(String userId, int type, Page<CreditTransactionBo> page);
}
