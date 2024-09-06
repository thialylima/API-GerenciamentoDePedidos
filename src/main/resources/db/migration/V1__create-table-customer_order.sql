CREATE TABLE customer_order (
    id BIGINT NOT NULL AUTO_INCREMENT,
    codigo_cliente INT DEFAULT NULL,
    data_cadastro DATETIME DEFAULT NULL,
    nome_produto VARCHAR(255) DEFAULT NULL,
    numero_controle INT DEFAULT NULL,
    quantidade INT DEFAULT NULL,
    valor_un DOUBLE DEFAULT NULL,
    valor_total DOUBLE DEFAULT NULL,
    valor_desconto DOUBLE DEFAULT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY UK_numero_controle (numero_controle)
);


