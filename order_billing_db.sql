CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_name VARCHAR(50),
    order_amount FLOAT,
    tax_percentage FLOAT,
    order_date DATE
);
INSERT INTO Orders VALUES
(1, 'Amit Sharma', 2000.00, 5.0, CURRENT_DATE),
(2, 'Neha Verma', 3500.50, 12.0, CURRENT_DATE),
(3, 'Rahul Mehta', 1500.75, 18.0, CURRENT_DATE);
SELECT * FROM Orders;