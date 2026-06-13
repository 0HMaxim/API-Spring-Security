CREATE TABLE shop (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(100) NOT NULL,
                      address VARCHAR(255),
                      phone VARCHAR(20),
                      email VARCHAR(100),
                      website VARCHAR(100),
                      category VARCHAR(50),
                      description TEXT
);

INSERT INTO shops (name, address, phone, email, website, category, description) VALUES
        ('Shop No. 1', '19a Volodymyrska St', '123-456-7890', 'shop1@example.com', 'http://shop1.com', 'Grocery', 'One of the best shops.'),
        ('Shop No. 2', '25 Sofiyivska St, Kyiv, Ukraine, 02000', '987-654-3210', 'shop2@example.com', 'http://shop2.com', 'Sports', 'Sports equipment store.'),
        ('Shop No. 3', '51 Olesia Honchara St', '555-555-5555', 'shop3@example.com', 'http://shop3.com', 'Household', 'Home goods store.'),
        ('Shop No. 4', '10 Khreshchatyk St, Kyiv, Ukraine, 01001', '111-222-3333', 'shop4@example.com', 'http://shop4.com', 'Electronics', 'Latest gadgets and electronics.'),
        ('Shop No. 5', '7 Lva Tolstoho St', '222-333-4444', 'shop5@example.com', 'http://shop5.com', 'Clothing', 'Fashionable clothes for everyone.'),
        ('Shop No. 6', '14 Velyka Vasylkivska St', '333-444-5555', 'shop6@example.com', 'http://shop6.com', 'Bookstore', 'Wide selection of books and stationery.'),
        ('Shop No. 7', '3 Khoryva St', '444-555-6666', 'shop7@example.com', 'http://shop7.com', 'Pharmacy', 'Medicines and health products.'),
        ('Shop No. 8', '22 Antonovycha St', '555-666-7777', 'shop8@example.com', 'http://shop8.com', 'Electronics', 'Computers, phones and accessories.'),
        ('Shop No. 9', '8 Dmytrivska St', '666-777-8888', 'shop9@example.com', 'http://shop9.com', 'Bakery', 'Fresh bread and pastries daily.');
