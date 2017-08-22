 CREATE TABLE category(

	id IDENTITY,
	name VARCHAR(50),
	description VARCHAR(255),
	image_url VARCHAR(50),
	is_active BOOLEAN,
	
	CONSTRAINT pk_category_id PRIMARY KEY(id)
);

INSERT INTO category(name,description,image_url,is_active) VALUES('Romance','This is Romance Genre','Romance1.jpg',true);
INSERT INTO category(name,description,image_url,is_active) VALUES('Fiction','This is Fiction Genre','Fiction1.jpg',true);
INSERT INTO category(name,description,image_url,is_active) VALUES('Thriller','This is Thriller Genre','Thriller1.jpg',true);
INSERT INTO category(name,description,image_url,is_active) VALUES('Horror','This is Horror Genre','Horror1.jpg',true);
INSERT INTO category(name,description,image_url,is_active) VALUES('Science Fiction.','Science fiction is fiction that imagines possible alternatives to reality. It is reality + "What-if." For example: What if the world ended? What if there were life on other planets? The imaginary part of science fiction is based on known scientific facts.','sfic.jpg',true);
INSERT INTO category(name,description,image_url,is_active) VALUES('Realistic',' Realistic fiction is a genre consisting of stories that could have actually occurred to people or animals in a believable setting. These stories resemble real life, and fictional characters within these stories react similarly to real people. ','realistic1.jpg',true);

CREATE TABLE user_details(
	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(50),
	email VARCHAR(100),
	contact_number VARCHAR(15),
	
	CONSTRAINT pk_user_id PRIMARY KEY(id),
	
);

INSERT INTO user_details
(first_name, last_name , role , enabled , password , email , contact_number)
VALUES('Ram' , 'Prakash' , 'ADMIN' , true , 'admin' , 'ramPrackash.90@gmail.com' , '9015687452');

INSERT INTO user_details
(first_name, last_name , role , enabled , password , email , contact_number)
VALUES('Aarthi' , 'karnan' , 'SUPPLIER' , true , '123654' , 'aarthikarnan23@gmail.com' , '8693287452');

INSERT INTO user_details
(first_name, last_name , role , enabled , password , email , contact_number)
VALUES('Revathi' , 'Krishnan' , 'SUPPLIER' , true , '147852' , 'revathikrishnan90@gmail.com' , '9015682552');

CREATE TABLE product(
	id IDENTITY,
	code VARCHAR(20),
	name VARCHAR(50),
	author VARCHAR(50),
	description VARCHAR(250),
	unit_price DECIMAL(10,2),
	quantity INT,
	is_active BOOLEAN,
	category_id INT,
	supplier_id INT ,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	CONSTRAINT pk_product_id PRIMARY KEY(id),
	CONSTRAINT fk_product_category_id FOREIGN KEY(category_id) REFERENCES category (id), 
	CONSTRAINT fk_product_supplier_id FOREIGN KEY(supplier_id) REFERENCES user_details (id),
);

INSERT INTO product(code , name, author, description, unit_price, quantity, is_active , category_id , supplier_id )
VALUES ('PRDABC123A','Notebook','Nicholas Sparks','Duke reads the story of Allie and Noah, two lovers who were separated by fate, to Ms. Hamilton, an old woman who suffers from Alzheimers, on a daily basis out of his notebook.','197','5', true , '1' , '2');

INSERT INTO product(code , name, author, description, unit_price, quantity, is_active , category_id , supplier_id )
VALUES('PRDABC124B','Harry Potter and the Order of Phenoix','J.K.Rowling','Harry Potter and the Order of the Phoenix is the fifth and antepenultimate novel in the Harry Potter series, written by J. K. Rowling.','949','10',true,'2','3');

INSERT INTO product(code , name, author, description, unit_price, quantity, is_active , category_id , supplier_id )
VALUES('PRDABC125C' , 'If Tomorrow Comes' ,'Sydney Sheldon', 'If Tomorrow Comes is a 1985 crime fiction novel by American author Sidney Sheldon. It is a story portraying an ordinary woman who is framed by the Mafia, her subsequent quest for vengeance towards them and her later life as a con artist.', '214' ,'12' ,true, '3' , '1');

INSERT INTO product(code , name, author, description, unit_price, quantity, is_active , category_id , supplier_id )
VALUES('PRDABC126D' , 'Pride and Prejudice' , 'Jane Austen' ,'Pride and Prejudice is a romance novel by Jane Austen.' ,'120' ,'2' ,true,'1','1');

INSERT INTO product(code , name, author, description, unit_price, quantity, is_active , category_id , supplier_id )
VALUES('PRDABC127E' , 'The Shinning' , 'Stephen King' ,'The Shining is a horror novel by American author Stephen King. Published in 1977.' ,'250' ,'1' ,true,'4','3');

INSERT INTO product(code , name, author, description, unit_price, quantity, is_active , category_id , supplier_id )
VALUES('PRDB741C7C0C6' , 'The Hunger Games: Catching Fire' , 'Suzanne Collins' ,'Katniss is advised by President Snow to participate in a special edition of the Hunger Games that will feature all its previous winners in order to eliminate her, due to her influential nature.' ,'1165.00' ,'0' ,true,'2','2');

INSERT INTO product(code , name, author, description, unit_price, quantity, is_active , category_id , supplier_id )
VALUES('PRD4CCB759DC8' , 'The Girl of my Dreams' , 'We are in the car. She’s looking at me. I can see the love in her eyes for me. Then a huge crash. She’s flung out of the window. I’m thrown out too. A pool of blood. Her eyes are still on me... but now it’s a death stare. I am Daman and I wake up to this nightmare. Every. Single. Day.' ,'129.00' ,'5' ,true,'1','1');

CREATE TABLE user_detail(

	id IDENTITY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	role VARCHAR(50),
	enabled BOOLEAN,
	password VARCHAR(60),
	email VARCHAR(100),
	contact_number VARCHAR(15),
	CONSTRAINT pk_user_id PRIMARY KEY(id)
);

INSERT INTO user_detail
(first_name , last_name , role , enabled , password ,email ,contact_number)
VALUES('Sangeetha','Krish','ADMIN',true,'$2a$06$w6nknshLSQFwY/rW0.wileKwcAJAsarPK/LEh7d/2nRVS2QNNKaPm','sangeethakrish5797@gmail.com','99405913330');
INSERT INTO user_detail
(first_name , last_name , role , enabled , password ,email ,contact_number)
VALUES('Ravi', 'Chandar', 'SUPPLIER', true , '$2a$06$wU8173e/8B7ex6q2WdjxZO7rpqNDJKrdE1JsaZfiNWx58aK4aswry' , 'ravichandar@gmail.com' ,'9632587410');
INSERT INTO user_detail
(first_name , last_name , role , enabled , password ,email ,contact_number)
VALUES('Bala', 'Krishnan' , 'SUPPLIER' ,true , '$2a$06$c.mJecfW4C77.u4NRnpgCOA1Diev1ULcyKbzDLesAC0dNroWlkdBW' ,'balakrishnan@gmail.com' , '9632587024');
