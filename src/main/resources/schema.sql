DROP SCHEMA IF EXISTS `full-stack-ecommerce`;

CREATE SCHEMA `full-stack-ecommerce`;


CREATE TABLE IF NOT EXISTS `full-stack-ecommerce`.`product_category`(
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `category_name` VARCHAR(45)
);

CREATE TABLE IF NOT EXISTS `full-stack-ecommerce`.`product`(
    `id` INT AUTO_INCREMENT PRIMARY KEY,
    `sku` VARCHAR(45),
    `name` VARCHAR(45),
    `description` VARCHAR(255),
    `unit_price` NUMERIC(13,2),
    `image_url` VARCHAR(255),
    `active` INT,
    `units_in_stock` INT,
    `date_created` TIMESTAMP ,
    `last_updated` TIMESTAMP ,
    `category_id` INT NOT NULL,
    FOREIGN KEY (`category_id`) REFERENCES `product_category` (`id`)
);