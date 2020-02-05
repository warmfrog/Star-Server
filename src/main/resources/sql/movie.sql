drop table if exists "star"."movie";
create table "star"."movie"(
  "name" varchar(64),
  "year" int,
  "tags" varchar(32)[],
  "screenshots" varchar(256)[],
  "cover" varchar(256),
  "classifications" varchar(32)[],
  "director" varchar(64),
  "leading_roles" varchar(64)[],
  "screenwriters" varchar(64)[],
  "madein" varchar(64)[],
  "showing_date" jsonb,
  "languages" varchar(32)[],
  "score" varchar(32),
  "length" int8,
  "size" int8,
  "download_links" jsonb,
  "play_links" jsonb,
  "alias" varchar(64),
  "brief" varchar(1024),
  "douban" jsonb,
  "imdb" jsonb,
	CONSTRAINT "movie_pkey" PRIMARY key("uuid")
) inherits ("star"."base");

comment on column "star"."movie"."name" is '电影名';
comment on column "star"."movie"."year" is '年份';
comment on column "star"."movie"."tags" is '标签';
comment on column "star"."movie"."screenshots" is '截图';
comment on column "star"."movie"."cover" is '封面';
comment on column "star"."movie"."classifications" is '分类';
comment on column "star"."movie"."director" is '导演';
comment on column "star"."movie"."leading_roles" is '主演';
comment on column "star"."movie"."screenwriters" is '编剧';
comment on column "star"."movie"."madein" is '拍摄地区';
comment on column "star"."movie"."showing_date" is '上映日期';
comment on column "star"."movie"."languages" is '语言';
comment on column "star"."movie"."score" is '评分';
comment on column "star"."movie"."length" is '时长';
comment on column "star"."movie"."size" is '文件大小';
comment on column "star"."movie"."download_links" is '下载链接';
comment on column "star"."movie"."play_links" is '播放链接';
comment on column "star"."movie"."alias" is '别名';
comment on column "star"."movie"."brief" is '简介';
comment on column "star"."movie"."douban" is '豆瓣页';
comment on column "star"."movie"."imdb" is 'imdb页';