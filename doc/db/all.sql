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

# course
-- 课程
drop table if exists course;
create table course (
                        id char(8) not null default '' comment 'id',
                        name varchar(50) not null comment 'name',
                        summary varchar(2000) comment 'summary',
                        time int default 0 comment 'time|s',
                        price decimal(8,2) default 0.00 comment 'price',
                        image varchar(100) comment 'image',
                        level char(1) comment 'level|enum[CourseLevelEnum]：ONE("1", "beginner"),TWO("2", "intermediate"),THREE("3", "advanced")',
                        charge char(1) comment 'charge|enum[CourseChargeEnum]：CHARGE("C", "charge"),FREE("F", "free")',
                        status char(1) comment 'status|enum[CourseStatusEnum]：PUBLISH("P", "posted"),DRAFT("D", "draft")',
                        enroll integer default 0 comment 'enroll',
                        sort int comment 'sort',
                        created_at datetime(3) comment 'created_at',
                        updated_at datetime(3) comment 'updated_at',
                        primary key (id)
) engine=innodb default charset=utf8mb4 comment='course';

select * from course;

insert into course (id, name, summary, time, price, image, level, charge, status, enroll, sort, created_at, updated_at)
values ('00000001', 'test01', 'This is a test course;', 7200, 19.9, '', 1, 'C', 'P', 100, 0, now(), now());

alter table `course` add column (`teacher_id` char(8) comment '讲师|teacher.id');
