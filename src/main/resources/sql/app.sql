drop table if exists "star"."app";
create table "star"."app" (
  "name" varchar(64) not null,
  "update_date" timestamp(6) default current_timestamp,
  "version" varchar(32) not null,
  "platform" varchar(32) not null,
  "dist_platforms" varchar(32)[],
  "size" bigint not null,
  "hasAd" smallint,
  "brief" varchar(2048),
  "score" smallint,
  "classifications" varchar(32)[],
  "tags" varchar(32)[],
  "developer" varchar(64),
  "developers" varchar(64)[],
  "free_charge" smallint,
  "open_source" smallint,
  "git" varchar(256),
  "icon" varchar(256),
  "screenshots" varchar(256)[],
  "download_links" jsonb,
  constraint "app_pkey" primary key ("uuid")
)
inherits ("star"."base");

comment on column "star"."app"."name" is '软件名';
comment on column "star"."app"."update_date" is '更新日期';
comment on column "star"."app"."version" is '版本号';
comment on column "star"."app"."platform" is '软件运行平台';
comment on column "star"."app"."dist_platfroms" is '软件可运行的所有平台';
comment on column "star"."app"."size" is '软件大小';
comment on column "star"."app"."hasAd" is '1.有广告，0.无广告';
comment on column "star"."app"."brief" is '软件简介';
comment on column "star"."app"."score" is '软件评分，5 分满分';
comment on column "star"."app"."classifications" is '软件分类';
comment on column "star"."app"."tags" is '软件标签';
comment on column "star"."app"."developer" is '软件开发者';
comment on column "star"."app"."developers" is '软件所有开发者';
comment on column "star"."app"."free_charge" is '是否收费：0.免费，1.收费';
comment on column "star"."app"."open_source" is '是否开源：0.否，1.是';
comment on column "star"."app"."git" is 'git 地址';
comment on column "star"."app"."icon" is '软件图标';
comment on column "star"."app"."screenshots" is '软件截图';
comment on column "star"."app"."download_links" is '下载链接';
