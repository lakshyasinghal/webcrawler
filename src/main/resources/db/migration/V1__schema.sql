Create TABLE `page_info` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `title` varchar(50),
  `url` varchar(100) NOT NULL,
  `image` varchar(10) NOT NULL,
  `short_desc` varchar(1000) NOT NULL,
  `created_at` timestamp DEFAULT CURRENT_TIMESTAMP
) ENGINE = INNODB;


