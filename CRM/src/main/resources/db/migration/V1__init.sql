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

CREATE TABLE IF NOT EXISTS lead (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    phone VARCHAR(50),
    created_at DATE,
    updated_at DATE
    );


CREATE TABLE IF NOT EXISTS activity (
     id SERIAL PRIMARY KEY,
     description TEXT,
     scheduled_at DATE,
    created_at DATE,
     updated_at DATE,
    lead_id INT NOT NULL,
    FOREIGN KEY (lead_id) REFERENCES lead(id) ON DELETE CASCADE
    );


