CREATE TABLE `Postagem` (
	`ID_postagem` bigint NOT NULL AUTO_INCREMENT,
	`Usuario` bigint NOT NULL,
	`Tema` bigint NOT NULL,
	`Descricao_postagem` varchar(2000) NOT NULL,
	`DataHora` DATETIME(8) NOT NULL,
	PRIMARY KEY (`ID_postagem`)
);

CREATE TABLE `Usuário` (
	`ID_usuario` bigint NOT NULL AUTO_INCREMENT,
	`Nome_Completo` varchar(255) NOT NULL,
	`Cargo` varchar(50) NOT NULL,
	`E-mail` varchar(1000) NOT NULL,
	`Senha` varchar(12) NOT NULL,
	PRIMARY KEY (`ID_usuario`)
);

CREATE TABLE `Tema` (
	`ID_tema` bigint NOT NULL AUTO_INCREMENT,
	`Descricao_tema` varchar(50) NOT NULL,
	`Vaga` BOOLEAN NOT NULL,
	`Descricao_duvida` varchar(50) NOT NULL,
	`Duvida` BOOLEAN NOT NULL,
	PRIMARY KEY (`ID_tema`)
);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk0` FOREIGN KEY (`Usuario`) REFERENCES `Usuário`(`ID_usuario`);

ALTER TABLE `Postagem` ADD CONSTRAINT `Postagem_fk1` FOREIGN KEY (`Tema`) REFERENCES `Tema`(`ID_tema`);

