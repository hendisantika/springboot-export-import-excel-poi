INSERT INTO roles(description, name)
VALUES ('Admin', 'Admin');
INSERT INTO roles(description, name)
VALUES ('Editor', 'Editor');
INSERT INTO roles(description, name)
VALUES ('Sale', 'Sale');
INSERT INTO roles(description, name)
VALUES ('Shipper', 'Shipper');
INSERT INTO roles(description, name)
VALUES ('Support', 'Support');

INSERT INTO users(email, enabled, full_name, password)
VALUES ('user1@yopmail.com', 1, 'user1', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user2@yopmail.com', 1, 'user2', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user3@yopmail.com', 1, 'user3', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user4@yopmail.com', 0, 'user4', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user5@yopmail.com', 1, 'user5', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user6@yopmail.com', 0, 'user6', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user7@yopmail.com', 1, 'user7', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user8@yopmail.com', 1, 'user8', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user9@yopmail.com', 0, 'user9', 'user');
INSERT INTO users(email, enabled, full_name, password)
VALUES ('user10@yopmail.com', 1, 'user10', 'user');

INSERT INTO users_roles(user_id, role_id)
VALUES (1, 1);
INSERT INTO users_roles(user_id, role_id)
VALUES (1, 2);
INSERT INTO users_roles(user_id, role_id)
VALUES (2, 2);
INSERT INTO users_roles(user_id, role_id)
VALUES (2, 3);
INSERT INTO users_roles(user_id, role_id)
VALUES (3, 3);
INSERT INTO users_roles(user_id, role_id)
VALUES (3, 4);
INSERT INTO users_roles(user_id, role_id)
VALUES (4, 4);
INSERT INTO users_roles(user_id, role_id)
VALUES (5, 5);
INSERT INTO users_roles(user_id, role_id)
VALUES (6, 1);
INSERT INTO users_roles(user_id, role_id)
VALUES (7, 1);
INSERT INTO users_roles(user_id, role_id)
VALUES (7, 2);
INSERT INTO users_roles(user_id, role_id)
VALUES (8, 1);
INSERT INTO users_roles(user_id, role_id)
VALUES (8, 5);
INSERT INTO users_roles(user_id, role_id)
VALUES (9, 5);
INSERT INTO users_roles(user_id, role_id)
VALUES (10, 3);
INSERT INTO users_roles(user_id, role_id)
VALUES (11, 4);
