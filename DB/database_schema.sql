
-- Create Categories table
CREATE TABLE Categories (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    parent_id INT,
    FOREIGN KEY (parent_id) REFERENCES Categories(id)
);

-- Create Products table
CREATE TABLE Products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2),
    category_id INT,
    available BOOLEAN,
    FOREIGN KEY (category_id) REFERENCES Categories(id)
);

-- Note: Schema designed to allow for a future feature to get the full category path
