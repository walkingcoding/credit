--
-- ER/Studio Data Architect SQL Code Generation
-- Project :      积分.dm1
--
-- Date Created : Thursday, January 16, 2020 16:34:31
-- Target DBMS : MySQL 5.x
--

--
-- TABLE: credit_account
--

CREATE TABLE credit_account(
    credit_account_id        VARCHAR(50)    NOT NULL    COMMENT '积分账户ID',
    user_id                  VARCHAR(50)    NOT NULL    COMMENT '用户ID',
    credit                   INT                COMMENT '总积分',
    credit_calculate_time    DATETIME           COMMENT '积分计算时间',
    PRIMARY KEY (credit_account_id)
)ENGINE=INNODB
COMMENT='积分账户'
;

--
-- TABLE: credit_channel
--

CREATE TABLE credit_channel(
    channel_id           VARCHAR(50)     NOT NULL    COMMENT '渠道ID',
    channel_name         VARCHAR(100)        COMMENT '渠道名称',
    channel_type         TINYINT             COMMENT '渠道类型',
    credit_valid_month   INT                 COMMENT '积分有效期',
    PRIMARY KEY (channel_id)
)ENGINE=INNODB
COMMENT='积分渠道'
;

--
-- TABLE: credit_rule
--

CREATE TABLE credit_rule(
    rule_id                 VARCHAR(50)     NOT NULL    COMMENT '积分规则ID',
    rule_name                 VARCHAR(100)     NOT NULL    COMMENT '积分名称',
    rule_limit_condition    VARCHAR(200)        COMMENT '限制条件',
    credit                  INT                 COMMENT '积分',
    channel_id              VARCHAR(50)     NOT NULL    COMMENT '渠道ID',
    PRIMARY KEY (rule_id)
)ENGINE=INNODB
COMMENT='积分规则'
;

--
-- TABLE: credit_transaction
--

CREATE TABLE credit_transaction(
    credit_transaction_id    VARCHAR(50)    NOT NULL    COMMENT '明细ID',
    user_id                  VARCHAR(50)        COMMENT '用户ID',
    channel_id               VARCHAR(50)        COMMENT '渠道ID',
    event_id                 VARCHAR(50)        COMMENT '事件ID',
    credit                   INT                COMMENT '积分',
    create_time              DATETIME           COMMENT '积分时间',
    expired_time             DATETIME           COMMENT '积分过期时间',
    PRIMARY KEY (credit_transaction_id)
)ENGINE=INNODB
COMMENT='积分流水明细'
;

--
-- TABLE: credit_rule
--

ALTER TABLE credit_rule ADD CONSTRAINT Refcredit_channel1
    FOREIGN KEY (channel_id)
    REFERENCES credit_channel(channel_id)
;


