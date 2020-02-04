drop table if exists "star"."album";
create table "star"."album"(
  "theme" varchar(64),
  "title" varchar(64),
  "thumbnail" varchar(256),
  "download_url" varchar(256),
  "likes" int,
  "collect_count" int,
  "download_count" int,
  "comment_count" int,
  "browsed_count" int,
  "upload_date" timestamp(6),
  "shoot_time" timestamp(6),
  "tags" varchar(32)[],
  "classifications" varchar(32)[],
  "photographer" varchar(64),
  "model" varchar(64),
  "position" varchar(64),
  "metadata" jsonb
) inherits ("star"."base");

comment on column "star"."album"."theme" is '主题';
comment on column "star"."album"."title" is '标题';
comment on column "star"."album"."thumbnail" is '缩略图';
comment on column "star"."album"."download_url" is '下载地址';
comment on column "star"."album"."likes" is '赞';
comment on column "star"."album"."collect_count" is '收藏数';
comment on column "star"."album"."download_count" is '下载数';
comment on column "star"."album"."comment_count" is '评论数';
comment on column "star"."album"."browsed_count" is '浏览数';
comment on column "star"."album"."upload_date" is '更新日期';
comment on column "star"."album"."shoot_time" is '拍摄时间';
comment on column "star"."album"."tags" is '标签';
comment on column "star"."album"."classifications" is '分类';
comment on column "star"."album"."photographer" is '摄影师';
comment on column "star"."album"."model" is '模特';
comment on column "star"."album"."position" is '位置';
comment on column "star"."album"."metadata" is '元数据';
