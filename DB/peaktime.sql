-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema peaktimesdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `peaktimesdb` ;

-- -----------------------------------------------------
-- Schema peaktimesdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `peaktimesdb` DEFAULT CHARACTER SET utf8 ;
USE `peaktimesdb` ;

-- -----------------------------------------------------
-- Table `event`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `event` ;

CREATE TABLE IF NOT EXISTS `event` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(45) NULL,
  `created_at` DATETIME NOT NULL COMMENT ' ',
  `rant` LONGTEXT NOT NULL,
  `imgurl` VARCHAR(45) NULL,
  `disabled` TINYINT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `imgurl_UNIQUE` ON `event` (`imgurl` ASC);

CREATE UNIQUE INDEX `title_UNIQUE` ON `event` (`title` ASC);

SET SQL_MODE = '';
DROP USER IF EXISTS admin@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'admin'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `event`
-- -----------------------------------------------------
START TRANSACTION;
USE `peaktimesdb`;
INSERT INTO `event` (`id`, `title`, `created_at`, `rant`, `imgurl`, `disabled`) VALUES (1, 'just be', '2023-01-27T11:17:33.000', 'I always told people that I’m not very religious or spiritual. But at  times and every time I see a fountain I can chuck a coin into, I ask my ancestors for good fortune? Whatever, you have the ability to carry out conversation alone, and sing to ice cream. I want to believe, you can just call me Moulder, waiting for Scully to find my sister.', 'https://i.imgur.com/1e9rLuY.jpg', 0);
INSERT INTO `event` (`id`, `title`, `created_at`, `rant`, `imgurl`, `disabled`) VALUES (2, 'cause you are', '2023-01-27T11:17:33.000', 'you remember when you were a kid and the lame adults would make fun of the words  you used? Once you live long enough, you become them. I hope you remember to have the decency to share mockery with those liked minded. Bet bet bet bet bet bet bet bet; I’m glad you found  a favorite word. You are you cause you are', 'https://i.imgur.com/ZxkiWon.jpg', 0);
INSERT INTO `event` (`id`, `title`, `created_at`, `rant`, `imgurl`, `disabled`) VALUES (3, 'who wouldn’t', '2023-01-27T11:17:33.000', 'for you 1000 times over, for myself 1000 times more…...the sun is bright and the day is new', 'https://i.imgur.com/POPqEN8.jpg', 0);
INSERT INTO `event` (`id`, `title`, `created_at`, `rant`, `imgurl`, `disabled`) VALUES (4, 'hush I agree, I wish I were here too', '2023-01-27T11:17:33.000', 'it really all depends so please be specific, it’s a very unless detail but would you like to know more', 'https://i.imgur.com/0UObcP7.jpg', 0);
INSERT INTO `event` (`id`, `title`, `created_at`, `rant`, `imgurl`, `disabled`) VALUES (5, 'sum is the same', '2023-01-27T11:17:33.000', 'math doesn’t care if you didn’t know, it won’t change for you', 'https://i.imgur.com/5ye4y7m.jpg', 0);

COMMIT;

