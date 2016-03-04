# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table image (
  internal_id               bigint not null,
  pic                       blob,
  file_path                 varchar(255),
  constraint pk_image primary key (internal_id))
;

create table member (
  email                     varchar(255) not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  password                  varchar(255),
  grad_year                 varchar(255),
  major                     varchar(255),
  second_major              varchar(255),
  pid                       varchar(255),
  blurb                     varchar(255),
  organization              varchar(255),
  image_id                  bigint,
  constraint pk_member primary key (email))
;

create sequence image_seq;

create sequence member_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists image;

drop table if exists member;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists image_seq;

drop sequence if exists member_seq;

