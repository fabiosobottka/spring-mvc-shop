CREATE TABLE category (
	id int NOT NULL AUTO_INCREMENT,
    name VARCHAR(35) NOT NULL,
    description VARCHAR(255),
    image_url VARCHAR(50),
    is_active boolean,
    PRIMARY KEY (id)
);