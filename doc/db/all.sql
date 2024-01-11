drop table if exists `test`;
create table `test` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment 'name',
                        `password` varchar(50) comment 'comment',
                        primary key (`id`)
)engine=innodb default
charset=utf8mb4 comment='test';

select * from test;

insert into `test` (id, name, password) VALUES (1, 'pui', 'pui');