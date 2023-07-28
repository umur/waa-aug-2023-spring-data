-- Insert Categories
INSERT INTO Category (name) VALUES ('Electronics');
INSERT INTO Category (name) VALUES ('Clothing');
INSERT INTO Category (name) VALUES ('Books');

-- Insert Products
INSERT INTO Product (name, price, rating, category_id) VALUES ('Laptop', 1200.0, '4.5', 1);
INSERT INTO Product (name, price, rating, category_id) VALUES ('T-shirt', 25.0, '4.0', 2);
INSERT INTO Product (name, price, rating, category_id) VALUES ('Phone', 800.0, '4.2', 1);

-- Insert Users
INSERT INTO User (email, password, first_Name, last_Name) VALUES ('john@example.com', 'password123', 'John', 'Doe');
INSERT INTO User (email, password, first_Name, last_Name) VALUES ('jane@example.com', 'test123', 'Jane', 'Smith');

-- Insert Addresses
INSERT INTO Address (street, zip, city, user_id) VALUES ('123 Main St', '12345', 'New York', 1);
INSERT INTO Address (street, zip, city, user_id) VALUES ('456 Elm St', '67890', 'Los Angeles', 2);

-- Insert Reviews
INSERT INTO Review (comment, user_id, product_id) VALUES ('Great product!', 1, 1);
INSERT INTO Review (comment, user_id, product_id) VALUES ('Fast delivery!', 2, 2);
INSERT INTO Review (comment, user_id, product_id) VALUES ('Good quality.', 1, 3);
