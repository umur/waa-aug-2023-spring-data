-- Insert data for the User table
INSERT INTO User (email, password, first_name, last_name)
VALUES
    ('user1@example.com', 'password1', 'John', 'Doe'),
    ('user2@example.com', 'password2', 'Jane', 'Smith'),
    ('user3@example.com', 'password3', 'Mike', 'Johnson'),
    ('user4@example.com', 'password4', 'Alice', 'Williams'),
    ('user5@example.com', 'password5', 'Bob', 'Brown');

-- Insert data for the Address table
INSERT INTO Address (street, city, zip, user_id)
VALUES
    ('123 Main St', 'New York', '10001', 1),
    ('456 Oak St', 'Los Angeles', '90001', 2),
    ('789 Maple St', 'Chicago', '60007', 3),
    ('101 Elm St', 'Houston', '77002', 4),
    ('111 Pine St', 'Dallas', '75201', 5);


-- Insert data for the Category table
INSERT INTO Category (name)
VALUES
    ('Electronics'),
    ('Clothing'),
    ('Books'),
    ('Home & Kitchen'),
    ('Toys');

-- Insert data for the Product table
INSERT INTO Product (name, price, category_id)
VALUES
    ('Laptop', 1200.00, 1),
    ('T-Shirt', 20.00, 2),
    ('Java Programming Book', 35.99, 3),
    ('Coffee Maker', 50.00, 4),
    ('Remote Control Car', 25.00, 5);

-- Insert data for the Review table
INSERT INTO Review (comment, user_id, product_id)
VALUES
    ('Great product!', 1, 1),
    ('Nice fit!', 2, 2),
    ('Very informative!', 3, 3),
    ('Makes great coffee!', 4, 4),
    ('Lots of fun!', 5, 5);
