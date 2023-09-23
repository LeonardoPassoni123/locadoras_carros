insert into carro (id, nome, ano, modelo, placa, especificacoes) values (1,'Car Model','2023','Sedan','ABC-1234','Tem 4 rodas');
insert into carro (id, nome, ano, modelo, placa, especificacoes) values (2,'Sporty Car','2022','Sports Coupe','XYZ-5678','Não tem 4 rodas');
insert into carro (id, nome, ano, modelo, placa, especificacoes) values (3,'Family SUV','2021','SUV','DEF-4321','Tem 2 rodas');
insert into carro (id, nome, ano, modelo, placa, especificacoes) values (4,'Compact Car','2018','Hatchback','GHI-7890','Tem 4 rodas');

insert into usuario(id, nome, email, senha) values (1,'John Doe','johndoe@example.com','password123');
insert into usuario(id, nome, email, senha) values (2,'Jane Smith','janesmith@example.com','securepass456');
insert into usuario(id, nome, email, senha) values (3,'Bob Johnson','bob@example.com','mysecretpass');
insert into usuario(id, nome, email, senha) values (4,'Alice Williams','alice@example.com','p@ssw0rd');

insert into cliente(id, nome, email, telefone, cpf) values (1,'John Doe','johndoe@example.com','9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (2,'Jane Smith','janesmith@example.com','9912312345', '435.123.543-76' );
insert into cliente(id, nome, email, telefone, cpf) values (3,'Bob Johnson','bob@example.com', '9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (4,'Alice Williams','alice@example.com', '9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (5,'John Doe','johndoe@example.com','9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (6,'Jane Smith','janesmith@example.com','9912312345', '435.123.543-76' );
insert into cliente(id, nome, email, telefone, cpf) values (7,'Bob Johnson','bob@example.com', '9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (8,'Alice Williams','alice@example.com', '9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (9,'John Doe','johndoe@example.com','9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (10,'Jane Smith','janesmith@example.com','9912312345', '435.123.543-76' );
insert into cliente(id, nome, email, telefone, cpf) values (11,'Bob Johnson','bob@example.com', '9912312345', '435.123.543-76');
insert into cliente(id, nome, email, telefone, cpf) values (12,'Alice Williams','alice@example.com', '9912312345', '435.123.543-76');

insert into locacao(carro_id, cliente_id, data_inicio, data_retorno, valor_total, status)
values(1, 3, '2023-09-10T14:20:59.254516', '2023-09-18T14:20:59.254829',720.00,'EM_ANDAMENTO');

insert into locacao(carro_id, cliente_id, data_inicio, data_retorno, valor_total, status)
values(4, 2, '2023-09-10T14:20:59.254516', '2023-09-18T14:20:59.254829',8260.00,'FINALIZADA');

insert into locacao(carro_id, cliente_id, data_inicio, data_retorno, valor_total, status)
values(3, 1, '2023-09-10T14:20:59.254516', '2023-09-18T14:20:59.254829',4342, 'CANCELADA');
