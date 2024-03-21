INSERT INTO account (account_number, owner, balance, version, created_date_time) VALUES ('1234567890', 'John Doe', 1000.50, 0, CURRENT_TIMESTAMP),
('0987654321', 'Jane Smith', 500.25, 0, CURRENT_TIMESTAMP),
('9876543210', 'Michael Brown', 2500.75, 0, CURRENT_TIMESTAMP),
('1012345678', 'Alice Johnson', 800.00, 0, CURRENT_TIMESTAMP),
('2345678901', 'David Miller', 1500.00, 0, CURRENT_TIMESTAMP),
('5678901234', 'Sarah Garcia', 3000.10, 0, CURRENT_TIMESTAMP),
('8901234567', 'William Davis', 4200.99, 0, CURRENT_TIMESTAMP),
('1234567809', 'Emily Jones', 780.33, 0, CURRENT_TIMESTAMP),
('4567890123', 'Robert Hernandez', 950.45, 0, CURRENT_TIMESTAMP),
('7890123456', 'Jennifer Lopez', 1200.00, 0, CURRENT_TIMESTAMP);


INSERT INTO transaction (account, amount, version, created_date_time, transaction_type, approval_code)
VALUES
  ('1234567890', 100.00, 1, NOW(), 'Deposit', 'ABC123'),
  ('0987654321', 50.00, 1, NOW(), 'Withdrawal', 'DEF456'),
  ('9876543210', 200.00, 1, NOW(), 'Transfer', 'GHI789'),
  ('1012345678', 75.00, 1, NOW(), 'Payment', 'JKL012'),
  ('2345678901', 125.50, 1, NOW(), 'Deposit', 'MNO345'),
  ('5678901234', -100.00, 1, NOW(), 'Fee', 'PQR678'),
  ('8901234567', 350.00, 1, NOW(), 'Purchase', 'STU901'),
  ('1234567809', 75.75, 1, NOW(), 'Deposit', 'VWX123'),
  ('4567890123', 150.25, 1, NOW(), 'Transfer', 'YZX345'),
  ('7890123456', 200.00, 1, NOW(), 'Bill Payment', 'MNB678');