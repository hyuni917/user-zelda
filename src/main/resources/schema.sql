-- user
drop table if exists `user`;

create table `user` (
  `user_no` bigint(20) not null auto_increment comment '유저번호',
  `user_id` varchar(100) not null comment '유저아이디',
  `user_name` varchar(100) not null comment '유저이름',
  `password` varchar(255) not null comment '패스워드',
  `cellphone` varchar(50) null comment '휴대폰',
  `email` varchar(100) null comment '이메일',
  `ci` varchar(255) null comment 'CI',
  `di` varchar(255) null comment 'DI',
  `date_created` datetime not null default CURRENT_TIMESTAMP comment '등록일',
  `create_ip` varchar(50) not null comment '등록IP',
  `date_updated` datetime not null default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP comment '수정일',
  `update_ip` varchar(50) not null comment '수정IP',
  `date_password_changed` datetime not null default CURRENT_TIMESTAMP comment '패스워드 변경일',
  `use_yn` char(1) not null default 'Y' comment '사용여부 Y/N',
  primary key (`user_no`)
) ENGINE=InnoDB auto_increment=100000000000 default CHARSET=utf8mb4;

-- user_changed_history
drop table if exists `user_changed_history`;

create table user_zelda.`user_changed_history` (
  `user_no` bigint(20) not null comment '유저번호',
  `user_id` varchar(100) not null comment '유저아이디',
  `user_name` varchar(100) not null comment '유저이름',
  `password` varchar(255) not null comment '패스워드',
  `cellphone` varchar(50) null comment '휴대폰',
  `email` varchar(100) null comment '이메일',
  `ci` varchar(255) null comment 'CI',
  `di` varchar(255) null comment 'DI',
  `date_created` datetime not null comment '등록일',
  `create_ip` varchar(50) not null comment '등록IP',
  `date_updated` datetime not null comment '수정일',
  `update_ip` varchar(50) not null comment '수정IP',
  `date_password_changed` datetime not null comment '패스워드 변경일',
  `use_yn` char(1) not null default 'Y' comment '사용여부 Y/N'
) ENGINE=InnoDB default CHARSET=utf8mb4;
