create table nts_login_log
(
    id          int auto_increment
        primary key,
    userId      int                                 null,
    accountName varchar(20)                         null,
    loginTime   timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP,
    loginIP     varchar(40)                         null
);

create index ly_user_loginlist
    on nts_login_log (id);

