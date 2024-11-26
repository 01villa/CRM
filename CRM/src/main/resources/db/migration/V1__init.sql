CREATE TABLE IF NOT EXISTS client (
    id SERIAL,
    full_name VARCHAR(255) NOT NULL,
    age INT NOT NULL,
    address VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
    );


CREATE TABLE IF NOT EXISTS invoice (
    id SERIAL,
    code VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total DECIMAL(10, 2) NOT NULL,
    client_id INT,
    FOREIGN KEY (client_id) REFERENCES client(id),
    PRIMARY KEY (id),
    );




