/*-- Insert addresses
INSERT INTO address (id, street, zip, city) VALUES
                                                (1, '123 Main Street', 12345, 'City A'),
                                                (2, '456 Park Avenue', 56789, 'City B'),
                                                (3, '789 Elm Road', 98765, 'City C');

-- Insert categories
INSERT INTO category (id, name) VALUES
                                    (1, 'Category 1'),
                                    (2, 'Category 2'),
                                    (3, 'Category 3');

-- Insert products
INSERT INTO product (id, name, price, rating, category_id) VALUES
                                                               (1, 'Product 1', 100, 4, 1),
                                                               (2, 'Product 2', 200, 5, 2),
                                                               (3, 'Product 3', 150, 3, 1),
                                                               (4, 'Product 4', 300, 4, 3);

-- Insert users
INSERT INTO user (id, email, password, first_name, last_name, address_id) VALUES
                                                                            (1, 'user1@example.com', 'password1', 'John', 'Doe', 1),
                                                                            (2, 'user2@example.com', 'password2', 'Jane', 'Smith', 2),
                                                                            (3, 'user3@example.com', 'password3', 'Alice', 'Johnson', 3);

-- Insert reviews
INSERT INTO review (id, comment, product_id, user_id) VALUES
                                                          (1, 'Great product!', 1, 1),
                                                          (2, 'Excellent quality!', 2, 2),
                                                          (3, 'Average product.', 1, 3),
                                                          (4, 'Really liked it!', 4, 1);
*/