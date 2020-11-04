create table nts_user_company
(
    id         bigint auto_increment
        primary key,
    user_id    bigint null,
    company_id bigint null
)
    charset = utf8mb4;

create index index_company_id
    on nts_user_company (company_id);

create index index_user_id
    on nts_user_company (user_id);

INSERT INTO coldchain_user.nts_user_company (id, user_id, company_id) VALUES (1, 2, 1);
INSERT INTO coldchain_user.nts_user_company (id, user_id, company_id) VALUES (2, 2, 2);
INSERT INTO coldchain_user.nts_user_company (id, user_id, company_id) VALUES (3, 30, 3);