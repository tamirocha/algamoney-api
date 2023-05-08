CREATE TABLE pessoa(
    codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    ativo BIT(1) NOT NULL,
    logradouro VARCHAR(100),
    numero VARCHAR(10) NOT NULL,
    complemento VARCHAR(50),
    bairro VARCHAR(50),
    cep VARCHAR(50) NOT NULL,
    cidade VARCHAR(50) NOT NULL,
    estado VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado)
    values ('Rodrigo Alves', 1, 'Rua Guimarães Rosa', '157', 'casa A', 'Vila Inácia', '81280-000', 'São Paulo', 'SP');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Maria José Alves', 1, 'Rua Sardinha', '021', '01240-356', 'Rio de Janeiro', 'RJ');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Jacira dos Santos', 1, 'Alameda Antônio Américo', '015', '33005-022', 'Belo Horizonte', 'MG');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Matheus Oliveira', 1, 'Avenida dos Promotores', '624', '15721-001', 'Rio Grande', 'RS');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Kléber Santos da Silva', 1, 'Rua da Dobradinha', '257', '51927-346', 'Salvador', 'BA');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Aline Aparecida Moraes', 1, 'Rua Francisco Aleixo', '086', '35123-000', 'Paranaiba', 'PI');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Francisco de Lima Andrade', 1, 'Rodovia Antônio Terra', 'S/N', '06231-064', 'Vitória', 'ES');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Carlos Amancio', 1, 'Rua das Flores', '333', '41325-6100', 'Manaus', 'AM');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Marcia Cavalcanti', 1, 'Rua Hortência Lima', '005', '02071-439', 'Rio Branco', 'AC');
INSERT INTO pessoa (nome, ativo, logradouro, numero, cep, cidade, estado)
    values ('Adelaide Aparecida Schimidt', 1, 'Avenida dos Iguaçus', '500', '72365-321', 'Cuiabá', 'MT');