-- Insere 10 orders na tabela customer_order

INSERT INTO customer_order (id, codigo_cliente, data_cadastro, nome_produto, numero_controle, quantidade, valor_un, valor_total, valor_desconto)
VALUES
    (1, 1, '2024-08-07 14:32:39.419000', 'Pipos Cachorro Quente', '001', 25, 2.77, 69.25, 62.33),
    (2, 2, '2024-08-06 14:31:46.169000', 'Desinfetante', '002', 7, 18.3, 128.1, 121.69),
    (3, 3, '2024-08-07 14:31:05.810000', 'Amaciante', '003', 13, 36, 468, 421.2),
    (4, 4, '2024-08-07 14:33:32.324000', 'Molho de tomate', '004', 30, 7.84, 235.2, 211.68),
    (5, 3, '2024-08-07 14:39:40.956000', 'Vodka', '005', 6, 78.5, 471, 447.45),
    (6, 4, '2024-08-07 16:25:04.511000', 'Monster Energético', '006', 2, 10, 20, 20),
    (7, 1, '2024-08-07 16:25:59.134000', 'Feijão Carioca', '007', 6, 12.85, 77.1, 73.24),
    (8, 2, '2024-08-07 16:27:54.305000', 'Desodorante Rexona', '008', 2, 23, 46, 46),
    (9, 1, '2024-08-07 16:29:06.130000', 'Sabonete Líquido Dove', '009', 6, 15, 90, 85.5),
    (10, 3, '2024-08-07 16:29:59.722000', 'Cerveja Heineken', '010', 15, 8.56, 128.4, 115.56);
