-- SELECT * FROM Customers

-- SELECT * FROM Customers WHERE City = 'Paris';

-- SELECT DISTINCT City FROM Customers WHERE Country = 'France';

-- SELECT * FROM Customers WHERE ContactTitle = 'Sales Representative';

-- SELECT * FROM Products WHERE ProductName = 'Pavlova';

-- SELECT * FROM Products WHERE SupplierID = 7;

-- SELECT * FROM Products WHERE UnitsInStock = 0;

-- SELECT * FROM Products WHERE UnitsInStock BETWEEN 20 AND 40 AND Discontinued = 0;

-- SELECT * FROM Products WHERE ProductName LIKE 'Chef%';

-- SELECT * FROM Products WHERE QuantityPerUnit LIKE '%jars';

-- SELECT * FROM Employees WHERE BirthDate < '1960-01-01';

-- INSERT INTO Employees (LastName, FirstName, Title, TitleOfCourtesy, Birthdate, HireDate, Address, City, Region, PostalCode, Country, HomePhone, Extension, Notes)
-- VALUES ('Tims', 'Seth', 'Sales Representative', 'Mx.', '1945-04-12', '1999-05-09', '123 Peachy Avenue', 'Nempnet', 'NULL', '69420', 'UK', '(71) 555-6969', '4567', 'Best Kid on the Block');

------------------  Joins ---------------------  
-- SELECT * FROM Categories
-- INNER JOIN Products
-- ON Categories.CategoryID = Products.CategoryID

-- SELECT * FROM Categories AS CAT
-- INNER JOIN Products AS PROD 
-- ON CAT.CategoryID = PROD.CategoryID
-- WHERE PROD.ProductName = 'Chai'

-- SELECT * FROM Customers AS CUST INNER JOIN Orders AS ORD ON CUST.CustomerID = ORD.CustomerID

-- SELECT * FROM Suppliers AS SUPP INNER JOIN Products AS PROD ON SUPP.SupplierID = PROD.SupplierID

-- SELECT CompanyName, OrderDate, ShipCity FROM Customers AS CUST INNER JOIN Orders AS ORD ON CUST.CustomerID = ORD.CustomerID

-- SELECT * FROM Categories AS CAT INNER JOIN Products AS PROD ON CAT.CategoryID = PROD.CategoryID WHERE UnitPrice > '20'

--  SELECT CUST.CustomerID, CompanyName, Country, OrderID, OrderDate,ShipCountry FROM Orders AS ORD INNER JOIN Customers AS CUST ON ORD.CustomerID = CUST.CustomerID
--  WHERE OrderDate LIKE '%1998%'