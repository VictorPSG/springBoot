

INSERT INTO tb_usina(watts, status) VALUES (10000, 0);
INSERT INTO tb_usina(watts, status) VALUES (4000, 1);
INSERT INTO tb_usina(watts, status) VALUES (8000, 1);

INSERT INTO tb_modulos(serie, watts, usina_id) VALUES ('ABC1234', 5000, 1);
INSERT INTO tb_modulos(serie, watts, usina_id) VALUES ('ABC4321', 5000, 1);

INSERT INTO tb_modulos(serie, watts, usina_id) VALUES ('ABC5678', 2000, 2);
INSERT INTO tb_modulos(serie, watts, usina_id) VALUES ('ABC8765', 2000, 2);

INSERT INTO tb_modulo(serie, watts, usina_id) VALUES ('CBA1234', 4000, 3);
INSERT INTO tb_modulo(serie, watts, usina_id) VALUES ('CBA4321', 4000, 3);


INSERT INTO tb_placa(corrente, tensao, modulos_id) VALUES (12.22, 45, 2);
INSERT INTO tb_placa(corrente, tensao, modulos_id) VALUES (12.0, 45.4, 2);
INSERT INTO tb_placa(corrente, tensao, modulos_id) VALUES (12.5, 44.2, 2);
INSERT INTO tb_placa(corrente, tensao, modulos_id) VALUES (12.22, 44.2, 2);


