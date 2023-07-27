INSERT INTO Category (id, name)
VALUES (1, 'Electronics'),
       (2, 'Clothing'),
       (3, 'Home & Kitchen');

INSERT INTO Product (id, name, price, rating, category_id)
VALUES (1, 'Smartphone', 500.00, 4.5, 1),
       (2, 'Laptop', 1200.00, 4.8, 1),
       (3, 'T-Shirt', 20.00, 4.2, 2),
       (4, 'Dress Shirt', 35.00, 4.5, 2),
       (5, 'Coffee Maker', 80.00, 4.0, 3),
       (6, 'Blender', 50.00, 4.1, 3);

INSERT INTO User (id, email, password, firstName, lastName, address_id)
VALUES (1, 'carey@miu.edu', 'password123', 'Carey', 'Nyein', 1),
       (2, 'phyo.thein.gi@miu.edu', 'pass456', 'Phyo', 'Theingi', 2);

INSERT INTO Address (id, street, zip, city)
VALUES (1, '1000 N Main St', '52557', 'Fairfield'),
       (2, '1000 N 4th St', '52557', 'Fairfield');

INSERT INTO Review (id, comment, user_id, product_id)
VALUES (1, 'Great product!', 1, 1),
       (2, 'Fast shipping', 1, 2),
       (3, 'Comfortable fit', 2, 3);
