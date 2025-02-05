
CREATE TABLE IF NOT EXISTS `product` (
    `id` int NOT NULL AUTO_INCREMENT COMMENT 'Primary Key',
    `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
    `price` int DEFAULT NULL,
    `description` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '상품';

INSERT INTO product
VALUES (NULL, "pen", 2000, "black pink");

INSERT INTO product
VALUES (NULL, "note", 3000, "white note");