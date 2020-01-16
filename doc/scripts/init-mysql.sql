INSERT INTO `credit_channel`(`channel_id`, `channel_name`, `channel_type`, `credit_valid_month`) VALUES ('1', '登录', 1, 12);
INSERT INTO `credit_channel`(`channel_id`, `channel_name`, `channel_type`, `credit_valid_month`) VALUES ('2', '签到', 1, 12);
INSERT INTO `credit_channel`(`channel_id`, `channel_name`, `channel_type`, `credit_valid_month`) VALUES ('3', '评论', 1, -1);
INSERT INTO `credit_channel`(`channel_id`, `channel_name`, `channel_type`, `credit_valid_month`) VALUES ('10', '积分兑换', -1, -1);


INSERT INTO `credit_rule`(`rule_id`, `rule_name`, `rule_limit_condition`, `credit`, `channel_id`) VALUES ('1', '每天登录1次获取2积分', 'day<=2', 2, 1);
INSERT INTO `credit_rule`(`rule_id`, `rule_name`, `rule_limit_condition`, `credit`, `channel_id`) VALUES ('2', '每天签到获取2积分', 'day<=2', 2, 1);
INSERT INTO `credit_rule`(`rule_id`, `rule_name`, `rule_limit_condition`, `credit`, `channel_id`) VALUES ('3', '评论，评论1次获得1积分，最多3积分', 'day<=3', 1, 1);
