drop table if exists base;
create table base (
  "uuid" varchar(32) not null,
  "create_time" timestamp(6) default current_timestamp,
  "update_time" timestamp(6) default current_timestamp,
  "create_user" varchar(64),
  "update_user" varchar(64),
  constraint "base_pkey" primary key ("uuid")
);

COMMENT ON COLUMN "star"."base"."uuid" IS '软件名';
COMMENT ON COLUMN "star"."base"."create_time" IS '创建时间';
COMMENT ON COLUMN "star"."base"."update_time" IS '更新时间';
COMMENT ON COLUMN "star"."base"."create_user" IS '创建用户';
COMMENT ON COLUMN "star"."base"."update_user" IS '更新用户';