use community;
create table user
(
    id           int auto_increment primary key,
    account_id   varchar(100) null,
    NAME         varchar(50)  null,
    TOKEN        varchar(36)  null,
    GMT_CREAT    bigint(19)   null,
    GMT_MODIFIED bigint(19)   null
);