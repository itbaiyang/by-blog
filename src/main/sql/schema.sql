# CREATE DATABASE blog;
#
# use blog;

CREATE TABLE article(
  `article_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '文章id',
  `name` VARCHAR(120) NOT NULL COMMENT '文章名称',
  `create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
  `content` BLOB NOT NULL COMMENT '文章内容',
  PRIMARY KEY (article_id),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='文章列表';

CREATE TABLE user(
  `user_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` VARCHAR(30) NOT NULL COMMENT '用户名',
  `password` VARCHAR(20) NOT NULL COMMENT '密码',
  `create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
  PRIMARY KEY (user_id),
  KEY idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='文章列表';