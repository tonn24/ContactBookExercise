CREATE TABLE users (
                       id bigserial PRIMARY KEY,
                       first_name VARCHAR ( 50 ) NOT NULL,
                       last_name VARCHAR ( 50 ) NOT NULL,
                       username VARCHAR (50) unique not null
);

CREATE TABLE contacts (
                          id bigserial PRIMARY KEY,
                          user_id bigint REFERENCES users (id),
                          contact_type VARCHAR ( 50 ) NOT NULL,
                          value VARCHAR (250) not null
);