drop table if exists base;
create table base (
  "uuid" varchar(32) not null, -- uuid
  "create_time" timestamp(6) default current_timestamp, -- 创建时间,
  "update_time" timestamp(6) default current_timestamp, -- 更新时间,
  "create_user" varchar(64), -- 创建用户
  "update_user" varchar(64), --更新用户
	"delete_flag" smallint,
  constraint "base_pkey" primary key ("uuid")
);

COMMENT ON COLUMN "star"."base"."uuid" IS '软件名';
COMMENT ON COLUMN "star"."base"."create_time" IS '创建时间';
COMMENT ON COLUMN "star"."base"."update_time" IS '更新时间';
COMMENT ON COLUMN "star"."base"."create_user" IS '创建用户';
COMMENT ON COLUMN "star"."base"."update_user" IS '更新用户';
comment on column "star"."base"."delete_flag" is '删除标志：0，未删除，1，已删除';