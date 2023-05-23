#DROP SCHEMA IF EXISTS chaos_demo_db;

CREATE SCHEMA IF NOT EXISTS chaos_demo_db;

USE chaos_demo_db;

CREATE TABLE IF NOT EXISTS CHIMP (
                 ID serial NOT NULL PRIMARY KEY,
                 NAME varchar(100),
                 MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                 INDEX `modified_index` (`MODIFIED`)
);

CREATE TABLE IF NOT EXISTS GORILLA (
                 ID serial NOT NULL PRIMARY KEY,
                 NAME varchar(100),
                 MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
                 INDEX `modified_index` (`MODIFIED`)
);

CREATE TABLE IF NOT EXISTS MONKEY (
               ID serial NOT NULL PRIMARY KEY,
               NAME varchar(100),
               MODIFIED TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
               INDEX `modified_index` (`MODIFIED`)
);