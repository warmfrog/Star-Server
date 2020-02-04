drop table if exists "star"."site";
create table "star"."site"(
  "site_name" varchar(64) not null,
  "url" varchar(256),
  "tags" varchar(32)[],
  "classifications" varchar(32)[],
  "thumbnail" varchar(256),
  "screenshots" varchar(256)[],
  "need_vpn" smallint,
  "language" varchar(32)
)
inherits ("star"."base");

comment on column "star"."site"."site_name" is '站点名';
comment on column "star"."site"."url" is 'url';
comment on column "star"."site"."tags" is '标签';
comment on column "star"."site"."classifications" is '分类';
comment on column "star"."site"."thumbnail" is '缩略图';
comment on column "star"."site"."screenshots" is '屏幕截图';
comment on column "star"."site"."need_vpn" is '需要vpn';
comment on column "star"."site"."language" is '语言';