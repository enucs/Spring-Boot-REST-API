create table projects
(
    id int not null,
    amount_pledged decimal not null,
    blurb varchar null,
    by varchar not null,
    country varchar not null,
    currency varchar not null,
    end_time date not null,
    location varchar  not null,
    percentage_funded int not null,
    state varchar not null,
    title varchar not null,
    type varchar not null,
    url varchar not null,
    primary key (id)
);