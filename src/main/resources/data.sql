INSERT INTO address (id, street, zip, city)
VALUES (1, '123 Main Street', '12345', 'New York');
INSERT INTO address (id, street, zip, city)
VALUES (2, '456 Elm Avenue', '67890', 'Los Angeles');
INSERT INTO address (id, street, zip, city)
VALUES (3, '789 Oak Road', '54321', 'Chicago');
-- Add more sample addresses as needed

INSERT INTO user (id, email, password, first_name, last_name, address_id)
VALUES (1, 'user1@example.com', 'password123', 'John', 'Doe', 1);
INSERT INTO user (id, email, password, first_name, last_name, address_id)
VALUES (2, 'user2@example.com', 'securepass', 'Alice', 'Smith', 2);
INSERT INTO user (id, email, password, first_name, last_name, address_id)
VALUES (3, 'user3@example.com', 'password456', 'Bob', 'Johnson', 3);
-- Add more sample users as needed


INSERT INTO category (id, name)
VALUES (1, 'Category1');
INSERT INTO category (id, name)
VALUES (2, 'Category2');
INSERT INTO category (id, name)
VALUES (3, 'Category3');
-- Add more sample categories as needed






INSERT INTO product (id, name, price, rating, category_id)
VALUES (1, 'Product 1', 10.99, 4, 1);
INSERT INTO product (id, name, price, rating, category_id)
VALUES (2, 'Product 2', 15.49, 5, 1);
INSERT INTO product (id, name, price, rating, category_id)
VALUES (3, 'Product 3', 8.75, 3, 2);
INSERT INTO product (id, name, price, rating, category_id)
VALUES (4, 'abc', 8.75, 3, 2);
-- Add more sample products as needed



INSERT INTO review (id, comment, user_id, product_id)
VALUES (1, 'Great product!', 1, 1);
INSERT INTO review (id, comment, user_id, product_id)
VALUES (2, 'Excellent service!', 1, 2);
INSERT INTO review (id, comment, user_id, product_id)
VALUES (3, 'Could be better.', 2, 1);