INSERT INTO user_details (birth_date, id, name)
VALUES(current_date(), 10001, 'ranga');

INSERT INTO user_details (birth_date, id, name)
VALUES(current_date(), 10002, 'anuj');

INSERT INTO user_details (birth_date, id, name)
VALUES(current_date(), 10003, 'alexa');

INSERT INTO post (id, description, user_id)
VALUES(20001, 'I want to learn AWS', 10001);

INSERT INTO post (id, description, user_id)
VALUES(20002, 'I want to learn DevOps', 10001);

INSERT INTO post (id, description, user_id)
VALUES(20003, 'I want to learn Azure', 10002);

INSERT INTO post (id, description, user_id)
VALUES(20004, 'I want to learn GCP', 10002);