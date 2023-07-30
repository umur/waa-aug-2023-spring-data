use `spring-data-lab3`;

INSERT INTO address (id, street, city, zip)
VALUES (1, '123 Main Street', 'New York', '12345');

INSERT INTO address (id, street, city, zip)
VALUES (2, '456 Elm Avenue', 'Los Angeles', '67890');

INSERT INTO address (id, street, city, zip)
VALUES (3, '789 Oak Road', 'Chicago', '54321');

-- Inserting data for User 1
INSERT INTO user (id, first_name, last_name, email, password, address_id)
VALUES (1, 'John', 'Doe', 'john@example.com', 'password123', 1);

-- Inserting data for User 2
INSERT INTO user (id, first_name, last_name, email, password, address_id)
VALUES (2, 'Alice', 'Smith', 'alice@example.com', 'securepass', 2);

-- Inserting data for User 3
INSERT INTO user (id, first_name, last_name, email, password, address_id)
VALUES (3, 'Bob', 'Johnson', 'bob@example.com', 'password456', 3);



INSERT INTO category (id, name)
VALUES (1, 'Category A');

INSERT INTO category (id, name)
VALUES (2, 'Category B');

INSERT INTO category (id, name)
VALUES (3, 'Category C');


-- Inserting data for Product 1
INSERT INTO product (id, name, price, category_id)
VALUES (1, 'Product 1', 10.99, 1);

-- Inserting data for Product 2
INSERT INTO product (id, name, price, category_id)
VALUES (2, 'Product 2', 15.49, 1);

-- Inserting data for Product 3
INSERT INTO product (id, name, price, category_id)
VALUES (3, 'Product 3', 8.75, 2);

-- Inserting data for Product 4
INSERT INTO product (id, name, price, category_id)
VALUES (4, 'Product 4', 12.50, 2);

-- Inserting data for Product 5
INSERT INTO product (id, name, price, category_id)
VALUES (5, 'Product 5', 9.99, 3);



-- Inserting data for Review 1
INSERT INTO review (id, comment, user_id, product_id)
VALUES (1, 'Great product!', 1, 1);

-- Inserting data for Review 2
INSERT INTO review (id, comment, user_id, product_id)
VALUES (2, 'Excellent service!', 1, 2);

-- Inserting data for Review 3
INSERT INTO review (id, comment, user_id, product_id)
VALUES (3, 'Could be better.', 2, 1);


