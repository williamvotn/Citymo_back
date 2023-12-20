#!/bin/bash

# Creez la base de donnees si elle n'existe pas
mysql -h localhost -u root -proot <<EOF
CREATE DATABASE IF NOT EXISTS siteimmo;
USE siteimmo;
SET GLOBAL local_infile=1;
EOF

# Utilisez la base de donnees
mysql -h localhost -u root -proot --local-infile=1 siteimmo <<EOF
# Creez la table si elle n'existe pas
CREATE TABLE IF NOT EXISTS paris (
    id INT PRIMARY KEY,
    lien_source TEXT,
    image_url TEXT,
    prix INT,
    arrondissement INT,
    features TEXT,
    classe_de_performance_energetique CHAR(1),
    classe_d_emission_a_effet_de_serre CHAR(1),
    description TEXT,
    latitude DECIMAL(9,6),
    longitude DECIMAL(9,6),
    surface DECIMAL(9,2),
    nombre_de_pieces INT,
    nombre_de_chambres INT,
    nombre_de_salles_de_bain INT,
    nombre_de_salles_d_eau INT,
    chauffage VARCHAR(255),
    cave BOOLEAN,
    ascenseur BOOLEAN,
    balcon BOOLEAN,
    box BOOLEAN,
    digicode BOOLEAN,
    gardien BOOLEAN,
    exposition VARCHAR(255),
    interphone BOOLEAN,
    garage BOOLEAN,
    parking BOOLEAN,
    cheminee BOOLEAN,
    alarme BOOLEAN,
    climatisation BOOLEAN,
    dependance BOOLEAN,
    terrasse BOOLEAN,
    radiateurs BOOLEAN,
    jardin BOOLEAN
);

CREATE TABLE IF NOT EXISTS user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(255) UNIQUE,
    password VARCHAR(255),
    name VARCHAR(255),
    firstname VARCHAR(255),
    phone VARCHAR(255),
    address VARCHAR(255),
    zip_code VARCHAR(255),
    birthdate DATE,
    inscription_date DATE
);

INSERT INTO user (email, password, name, firstname, phone, address, zip_code, birthdate, inscription_date)
VALUES ('john.doe@example.com', 'motdepasse123', 'Doe', 'John', '123456789', '123 Main St', '12345', '1990-01-01', '2023-01-01');



-- Utiliser LOAD DATA INFILE pour charger les données depuis le fichier CSV
LOAD DATA LOCAL INFILE '/docker-entrypoint-initdb.d/paris.csv'
INTO TABLE paris
FIELDS TERMINATED BY ','
ENCLOSED BY '"'
LINES TERMINATED BY '\n'
IGNORE 1 LINES; -- Ignore la première ligne (en-tête)
EOF
