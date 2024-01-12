drop table if exists `test`;
create table `test` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment 'name',
                        `password` varchar(50) comment 'comment',
                        primary key (`id`)
)engine=innodb default
charset=utf8mb4 comment='test';

drop table if exists `demo`;
create table `demo` (
                        `id` bigint not null comment 'id',
                        `name` varchar(50) comment 'name',
                        primary key (`id`)
)engine=innodb default
    charset=utf8mb4 comment='test';

insert into `demo` (id, name) VALUES (1, 'wikiDev');

select * from test;

insert into `test` (id, name, password) VALUES (1, 'wikiDev', 'wikiDev');