INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('arturo', '$2a$10$aPm2TRAAqwzQXA62l7rOiu4FJnPjQpPojHYZt2oZMLdaSyXETu9IG', 1, 'Arturo', 'Hernandez Navarro', 'hernandezn.arturo@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('turo', '$2a$10$acU1Tvd9E.ibY4AEbQAmk.Z2DymCosyWmcjMCDgaAithbTwN59KfO', 1, 'José', 'Hernandez Navarro', 'turo.arturo@gmail.com');


INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,1);
