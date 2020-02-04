drop table if exists post;
create table "star"."post"(
  "title" varchar(128) not null,
  "key_words" varchar(32)[],
  "author" jsonb,
  "authors" jsonb,
  "file_path" varchar(256),
  "download_url" varchar(256),
  "content_markdown" varchar(102400),
  "content_html" varchar(102400),
  "release_time" timestamp(6),
  "brief" varchar(512),
  "cover_image" varchar(256),
  "images" varchar(256)[],
  "word_count" int,
  "reader_count" int,
  "likes" int,
  "dislikes" int,
  "collection_count" int,
  "download_count" int,
  "comment_count" int,
  "released_platforms" jsonb,
  "referenced_count" int,
  "score" int,
  "language" varchar(32),
  "tags" varchar(32)[],
  "classifications" varchar(32)[],
  "type" smallint,
  "references" jsonb
) inherits("star"."base");

comment on column "star"."post"."title" is '博文标题';
comment on column "star"."post"."key_words" is '关键字';
comment on column "star"."post"."author" is '作者';
comment on column "star"."post"."authors" is '所有作者';
comment on column "star"."post"."file_path" is '文件路径';
comment on column "star"."post"."content_markdown" is '博文 markdown';
comment on column "star"."post"."content_html" is '博文 html';
comment on column "star"."post"."release_time" is '发布时间';
comment on column "star"."post"."brief" is '博文简介';
comment on column "star"."post"."cover_image" is '封面';
comment on column "star"."post"."images" is '博文图像';
comment on column "star"."post"."word_count" is '博文字数';
comment on column "star"."post"."reader_count" is '阅读量';
comment on column "star"."post"."likes" is '喜欢人数';
comment on column "star"."post"."dislikes" is '不喜欢人数';
comment on column "star"."post"."collection_count" is '收藏人数';
comment on column "star"."post"."download_count" is '下载数';
comment on column "star"."post"."comment_count" is '评论数';
comment on column "star"."post"."released_platforms" is '发布的平台';
comment on column "star"."post"."referenced_count" is '被引用数';
comment on column "star"."post"."score" is '评分';
comment on column "star"."post"."language" is '语言';
comment on column "star"."post"."tags" is '标签';
comment on column "star"."post"."classifications" is '分类';
comment on column "star"."post"."type" is '0:原创，1:转载';
comment on column "star"."post"."references" is '引用列表';
