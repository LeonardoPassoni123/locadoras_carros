insert into carro (id, nome, ano, modelo, placa, especificacoes) values (1,'Car Model','2023','Sedan','ABC-1234','Tem 4 rodas');
insert into carro (id, nome, ano, modelo, placa, especificacoes) values (2,'Sporty Car','2022','Sports Coupe','XYZ-5678','Não tem 4 rodas');
insert into carro (id, nome, ano, modelo, placa, especificacoes) values (3,'Family SUV','2021','SUV','DEF-4321','Tem 2 rodas');
insert into carro (id, nome, ano, modelo, placa, especificacoes) values (4,'Compact Car','2018','Hatchback','GHI-7890','Tem 4 rodas');

insert into usuario(id, nome, email, senha) values (1,'John Doe','johndoe@example.com','password123');
insert into usuario(id, nome, email, senha) values (2,'Jane Smith','janesmith@example.com','securepass456');
insert into usuario(id, nome, email, senha) values (3,'Bob Johnson','bob@example.com','mysecretpass');
insert into usuario(id, nome, email, senha) values (4,'Alice Williams','alice@example.com','p@ssw0rd');

insert into cliente(id, nome, email) values (1,'John Doe','johndoe@example.com');
insert into cliente(id, nome, email) values (2,'Jane Smith','janesmith@example.com');
insert into cliente(id, nome, email) values (3,'Bob Johnson','bob@example.com');
insert into cliente(id, nome, email) values (4,'Alice Williams','alice@example.com');

insert into locacao(carro_id, cliente_id, data_inicio, data_retorno, num_cnh, valor_total, status)
values(1, 3, '2023-09-10T14:20:59.254516', '2023-09-18T14:20:59.254829', '43412312',720.00,'EM_ANDAMENTO');

insert into locacao(carro_id, cliente_id, data_inicio, data_retorno, num_cnh, valor_total, status)
values(4, 2, '2023-09-10T14:20:59.254516', '2023-09-18T14:20:59.254829', '235345',8260.00,'FINALIZADA');

insert into locacao(carro_id, cliente_id, data_inicio, data_retorno, num_cnh, valor_total, status)
values(3, 1, '2023-09-10T14:20:59.254516', '2023-09-18T14:20:59.254829', '6645345',640.00,'CANCELADA');
