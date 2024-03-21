CREATE TABLE account (
  id INT PRIMARY KEY AUTO_INCREMENT,
  account_number VARCHAR(255) NOT NULL UNIQUE,
  owner VARCHAR(255) NOT NULL,
  balance DECIMAL(10,2) NOT NULL DEFAULT 0,
  active BOOLEAN NOT NULL DEFAULT TRUE,
  version INT NOT NULL,
  created_date_time DATETIME NOT NULL
);

CREATE TABLE transaction (
  id INT PRIMARY KEY AUTO_INCREMENT,
  account VARCHAR(255) NOT NULL,
  amount DECIMAL(10,2) NOT NULL,
  version INT NOT NULL,
  created_date_time DATETIME NOT NULL,
  transaction_type VARCHAR(255) NOT NULL,
  approval_code VARCHAR(255),
  phone_number VARCHAR(255)
);