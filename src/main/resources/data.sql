create table tb_cidade (
    id_cidade bigint not null primary key,
    nome varchar(50) not null,
    qtd_habitantes bigint
 );

 insert into tb_cidade
    (id_cidade, nome, qtd_habitantes)
 values
    (1, 'São Paulo', 12396372),
    (2, 'Rio de Janeiro', 1000000),
    (3, 'Fortaleza', 6908333),
    (4, 'Salvador', 7911870),
    (5, 'Belo Horizonte', 6099765),
    (6, 'Porto Alegre', 7710556),
    (7, 'Porto Velho', 2300801),
    (8, 'Palmas', 1871009),
    (9, 'Recife', 4391109),
    (10, 'Natal', 8144099),
    (11, 'Brasilia', 4392220);

