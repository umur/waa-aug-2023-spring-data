INSERT INTO category (id, name)
VALUES
    (1, 'Beverages'),
    (2, 'Clothing'),
    (3, 'Home & Garden'),
    (4, 'Toiletries'),
    (5, 'Groceries'),
    (6, 'Bakery'),
    (7, 'Hardware'),
    (8, 'Furniture'),
    (9, 'Liquor'),
    (10,'Books');

INSERT INTO product (category_id, id, name, price) VALUES (1, 1001, 'Product A', 19);
INSERT INTO product (category_id, id, name, price) VALUES (2, 1002, 'Product B', 29);
INSERT INTO product (category_id, id, name, price) VALUES (3, 1003, 'Product C', 9);
INSERT INTO product (category_id, id, name, price) VALUES (2, 1004, 'Product D', 15);
INSERT INTO product (category_id, id, name, price) VALUES (1, 1005, 'Product E', 12);
INSERT INTO product (category_id, id, name, price) VALUES (3, 1006, 'Product F', 24);
INSERT INTO product (category_id, id, name, price) VALUES (2, 1007, 'Product G', 7);
INSERT INTO product (category_id, id, name, price) VALUES (1, 1008, 'Product H', 39);
INSERT INTO product (category_id, id, name, price) VALUES (3, 1009, 'Product I', 14);
INSERT INTO product (category_id, id, name, price) VALUES (2, 1010, 'Product J', 10);

INSERT INTO user (id, first_name, last_name, email, password) VALUES (1, 'John', 'Doe', 'john.doe@example.com', 'hashed_password_1');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (2, 'Jane', 'Smith', 'jane.smith@example.com', 'hashed_password_2');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (3, 'Michael', 'Johnson', 'michael.johnson@example.com', 'hashed_password_3');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (4, 'Emily', 'Williams', 'emily.williams@example.com', 'hashed_password_4');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (5, 'Robert', 'Brown', 'robert.brown@example.com', 'hashed_password_5');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (6, 'Linda', 'Jones', 'linda.jones@example.com', 'hashed_password_6');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (7, 'William', 'Davis', 'william.davis@example.com', 'hashed_password_7');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (8, 'Karen', 'Miller', 'karen.miller@example.com', 'hashed_password_8');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (9, 'Richard', 'Wilson', 'richard.wilson@example.com', 'hashed_password_9');
INSERT INTO user (id, first_name, last_name, email, password) VALUES (10, 'Sarah', 'Taylor', 'sarah.taylor@example.com', 'hashed_password_10');

INSERT INTO review (id, product_id, user_id, comment) VALUES (1, 1001, 1, 'Great product! I highly recommend it.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (2, 1002, 2, 'The quality is excellent.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (3, 1003, 3, 'Good value for the price.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (4, 1001, 4, 'Fast shipping and well-packaged.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (5, 1004, 5, 'Not as expected. Disappointed.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (6, 1002, 6, 'Impressive design and functionality.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (7, 1005, 7, 'Perfect fit. Love it!');
INSERT INTO review (id, product_id, user_id, comment) VALUES (8, 1003, 8, 'Could be better. Needs improvement.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (9, 1006, 9, 'Very satisfied with my purchase.');
INSERT INTO review (id, product_id, user_id, comment) VALUES (10, 1001, 10, 'Best product in its category.');


INSERT INTO address (id, street, city, zip, user_id) VALUES (1, '123 Main Street', 'New York City', '10001', 1);
INSERT INTO address (id, street, city, zip, user_id) VALUES (2, '456 Elm Avenue', 'Los Angeles', '90012', 2);
INSERT INTO address (id, street, city, zip, user_id) VALUES (3, '789 Oak Road', 'Chicago', '60601', 3);
INSERT INTO address (id, street, city, zip, user_id) VALUES (4, '10 Pine Street', 'San Francisco', '94102', 4);
INSERT INTO address (id, street, city, zip, user_id) VALUES (5, '555 Maple Lane', 'Seattle', '98101', 5);
INSERT INTO address (id, street, city, zip, user_id) VALUES (6, '999 Birch Drive', 'Boston', '02108', 6);
INSERT INTO address (id, street, city, zip, user_id) VALUES (7, '777 Cedar Court', 'Miami', '33130', 7);
INSERT INTO address (id, street, city, zip, user_id) VALUES (8, '333 Walnut Street', 'Dallas', '75201', 8);
INSERT INTO address (id, street, city, zip, user_id) VALUES (9, '222 Cherry Avenue', 'Atlanta', '30301', 9);
INSERT INTO address (id, street, city, zip, user_id) VALUES (10, '444 Pineapple Boulevard', 'Denver', '80202', 10);


