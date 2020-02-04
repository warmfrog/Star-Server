drop table if exists "star"."menu";
create table "star"."menu"(
  "name" varchar(32),
  "count" int,
  "icon" varchar(32),
  "bg_color" varchar(32),
  "url" varchar(256),
  "rank" int
)inherits("star"."base");

comment on column "star"."menu"."name" is '菜单名称';
comment on column "star"."menu"."count" is '资源数';
comment on column "star"."menu"."icon" is '图标';
comment on column "star"."menu"."bg_color" is '背景颜色';
comment on column "star"."menu"."url" is 'url';
comment on column "star"."menu"."count" is '资源数';
comment on column "star"."menu"."rank" is '排序';

