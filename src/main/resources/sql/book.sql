drop table if exists "star"."book";
create table "star"."book"(
  "title" varchar(128) not null,
  "subtitle" varchar(128),
  "version" jsonb,
  "isbn" varchar(32),
  "author" jsonb,
  "translators" jsonb,
  "producer" varchar(64),
  "thumbnail" varchar(256),
  "cover_images" varchar(256)[],
  "has_paper" smallint,
  "has_ebook" smallint,
  "book_design" varchar(32),
  "publisher" varchar(64),
  "publish_date" timestamp(6),
  "pages" int,
  "price" varchar(128),
  "language" varchar(32),
  "brief" varchar(2048),
  "catalog" varchar(256)[],
  "score" varchar(32),
  "tags" varchar(32)[],
  "classifications" varchar(32)[],
  "download_links" jsonb,
  "paper_purchase_links" jsonb,
  "ebook_purchase_links" jsonb,
  "douban" jsonb,
  "read_count" int,
  "reading_count" int,
  "want_read_count" int
) inherits ("star"."base");

comment on column "star"."book"."title" is '书标题';
comment on column "star"."book"."subtitle" is '书子标题';
comment on column "star"."book"."version" is '书版本';
comment on column "star"."book"."isbn" is '图书isbn';
comment on column "star"."book"."author" is '作者';
comment on column "star"."book"."translators" is '译者';
comment on column "star"."book"."producer" is '出品机构';
comment on column "star"."book"."thumbnail" is '书封面';
comment on column "star"."book"."cover_images" is '封面';
comment on column "star"."book"."has_paper" is '有纸质版';
comment on column "star"."book"."has_ebook" is '有电子版';
comment on column "star"."book"."book_design" is '封装类型';
comment on column "star"."book"."publisher" is '出版社';
comment on column "star"."book"."publish_date" is '出版日期';
comment on column "star"."book"."pages" is '页数';
comment on column "star"."book"."language" is '语言';
comment on column "star"."book"."price" is '价格';
comment on column "star"."book"."brief" is '简介';
comment on column "star"."book"."catalog" is '目录';
comment on column "star"."book"."score" is '评分';
comment on column "star"."book"."tags" is '标签';
comment on column "star"."book"."classifications" is '分类';
comment on column "star"."book"."download_links" is '下载链接';
comment on column "star"."book"."paper_purchase_links" is '纸质版购买链接';
comment on column "star"."book"."ebook_purchase_links" is '电子版链接';
comment on column "star"."book"."douban" is '豆瓣链接';
comment on column "star"."book"."read_count" is '阅读数';
comment on column "star"."book"."reading_count" is '正在阅读人数';
comment on column "star"."book"."want_read_count" is '想要阅读人数';