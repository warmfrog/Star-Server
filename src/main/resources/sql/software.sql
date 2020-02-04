drop table if exists "star"."software";
create table "star"."software"(
  "software_name" varchar(256) not null,
  "version" varchar(64),
  "developer" varchar(128),
  "size" int8,
  "md5" varchar(64),
  "official_site" varchar(256),
  "introduction" varchar(1024),
  "icon" varchar(256),
  "screenshots" varchar(256)[],
  "tags" varchar(64)[],
  "classifications" varchar(64)[],
  "score" varchar(32),
  "platform" varchar(32),
  "language" varchar(32),
  "free" smallint,
  "likes" int,
  "dislikes" smallint,
  "open_source" smallint,
  "git" varchar(256),
  "dist_platforms" varchar(32)[],
  "download_link" varchar(256),
  "download_links" jsonb,
  "tutorials" varchar(256)[],
  "remark" varchar(256),
  "histories" jsonb
)
inherits("star"."base");

comment on column "star"."software"."software_name" is '软件名';
comment on column "star"."software"."version" is '版本';
comment on column "star"."software"."developer" is '开发者';
comment on column "star"."software"."size" is '大小';
comment on column "star"."software"."md5" is 'md5';
comment on column "star"."software"."official_site" is '官网';
comment on column "star"."software"."introduction" is '简介';
comment on column "star"."software"."icon" is '图标';
comment on column "star"."software"."screenshots" is '软件截图';
comment on column "star"."software"."tags" is '标签';
comment on column "star"."software"."classifications" is '分类';
comment on column "star"."software"."score" is '软件评分';
comment on column "star"."software"."platform" is '平台';
comment on column "star"."software"."language" is '语言';
comment on column "star"."software"."free" is '是否免费：0.否，1是';
comment on column "star"."software"."likes" is '喜欢数';
comment on column "star"."software"."dislikes" is '踩数';
comment on column "star"."software"."open_source" is '是否开源：0.否，1是';

comment on column "star"."software"."git" is 'git仓库';
comment on column "star"."software"."dist_platforms" is '可运行的平台';

comment on column "star"."software"."download_link" is '下载链接';
comment on column "star"."software"."download_links" is '下载链接';
comment on column "star"."software"."tutorials" is '指南';
comment on column "star"."software"."remark" is '备注';

comment on column "star"."software"."histories" is '历史版本';