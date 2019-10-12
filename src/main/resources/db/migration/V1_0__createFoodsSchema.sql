CREATE TABLE `foods` (
    `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `menu` varchar(255),
    `description` varchar(255),
    `quantity` integer(11),
    `price` double(11,2)
);