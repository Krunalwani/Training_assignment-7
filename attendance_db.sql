CREATE TABLE Employee (emp_id INT PRIMARY KEY,emp_name VARCHAR(50),department VARCHAR(30));
CREATE TABLE Attendance (attendance_id INT PRIMARY KEY,emp_id INT,attendance_date DATE,is_present BOOLEAN,UNIQUE (emp_id, attendance_date),FOREIGN KEY (emp_id) REFERENCES Employee(emp_id));
INSERT INTO Employee VALUES(1, 'Vijay Pandey', 'Development'),(2, 'YASH', 'Testing');
INSERT INTO Attendance VALUES(1, 1, CURRENT_DATE, TRUE),(2, 2, CURRENT_DATE, FALSE);
SELECT * FROM Attendance;