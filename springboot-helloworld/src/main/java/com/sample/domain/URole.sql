-- auto Generated on 2018-02-27 17:56:35 
-- DROP TABLE IF EXISTS `u_role`; 
CREATE TABLE u_role(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '角色名称',
    `type` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '角色类型',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'u_role';
