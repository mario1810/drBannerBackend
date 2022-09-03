INSERT INTO roles (tipo) VALUES ('cliente');
INSERT INTO roles (tipo) VALUES ('admin');

INSERT INTO usuarios(apellido, avatar, correo, nombre, numero_tarjeta, password, telefono, tipo_tarjeta, roles_id_rol) VALUES ('Malave Rengel', 'https://reqres.in/img/faces/2-image.jpg', 'emperatriz.668@gmail.com', 'Coromoto', '4198220007580929', 'cori.123', '3317621177', 'debito', '2');
INSERT INTO usuarios(apellido, avatar, correo, nombre, numero_tarjeta, password, telefono, tipo_tarjeta, roles_id_rol) VALUES ('Alvarez Bautista', 'https://reqres.in/img/faces/8-image.jpg', 'mario.alvarez1810@gmail.com', 'Mario Ivan', '4198220007580929', 'mario.123', '5518460509', 'debito', '2');
INSERT INTO usuarios(apellido, avatar, correo, nombre, numero_tarjeta, password, telefono, tipo_tarjeta, roles_id_rol) VALUES ('Gonzalez Rios', 'https://reqres.in/img/faces/5-image.jpg', 'gorcglez99@outlook.com', 'Carlos Adrian', '4198220007580929', 'adrian.123', '6441569677', 'debito', '1');
INSERT INTO usuarios(apellido, avatar, correo, nombre, numero_tarjeta, password, telefono, tipo_tarjeta, roles_id_rol) VALUES ('Ruiz Andrade', 'https://reqres.in/img/faces/6-image.jpg', 'ruiz.gerardo.r@gmail.com', 'Gerardo Ramiro', '4198220007580929', 'gera.123', '2293918140', 'debito', '1');
INSERT INTO usuarios(apellido, avatar, correo, nombre, numero_tarjeta, password, telefono, tipo_tarjeta, roles_id_rol) VALUES ('Fernández Rodríguez', 'https://reqres.in/img/faces/1-image.jpg', 'aaronfernarodri27@gmail.com', 'Aarón', '4198220007580929', 'aaron.123', '8123908838', 'debito', '1');
INSERT INTO usuarios(apellido, avatar, correo, nombre, numero_tarjeta, password, telefono, tipo_tarjeta, roles_id_rol) VALUES ('Flores Avellaneda', 'https://reqres.in/img/faces/5-image.jpg', 'antonio.avellaneda13@gmail.com', 'Marco Antonio', '4198220007580929', 'marco.123', '5561183707', 'debito', '1');


INSERT INTO comentarios(comentario, estrellas, fecha_comentario, usuarios_id_usuario) VALUES ('Son todo lo que dicen, en verdad muy profesionales en cada momento, es justo lo que necesitábamos para nuestro evento, quedé muy satisfecha con el trabajo que realizaron, sobre todo el equipo de producción, muy amables siempre.', '4', '2022-03-14', '1'); 
INSERT INTO comentarios(comentario, estrellas, fecha_comentario, usuarios_id_usuario) VALUES ('Desde que me contaron de Dr. Banner Photography supe que los quería para mi evento, con muy puntuales, ofrecen fotografías de alta calidad y una atención de primer nivel, además los precios son muy accesibles.', '5', '2022-04-12', '2');
INSERT INTO comentarios(comentario, estrellas, fecha_comentario, usuarios_id_usuario) VALUES ('Decidí contratar  los servicios para mi boda y quedé más que satisfecho y agradecido con el resultado, cuentan con un equipo de producción buenísimo. Mil gracias por tan buen trabajo que hicieron, seguramente yo los recomiendo.', '4', '2022-01-05', '3');
INSERT INTO comentarios(comentario, estrellas, fecha_comentario, usuarios_id_usuario) VALUES ('Es increíble lo que pueden hacer con una cámara, estoy fascinado con el trabajo que hicieron, he tenido malas experiencias con otros fotógrafos pero con Dr. Banner Photography es calidad garantizada', '5', '2021-12-13', '4');
INSERT INTO comentarios(comentario, estrellas, fecha_comentario, usuarios_id_usuario) VALUES ('Cuando te comunicas con el equipo te brindan una gran confianza, los paquetes me parecen excelentes y ni se diga de la calidad que manejan, sabía que no iban a decepcionarme, hermosas fotos que logran, están para presumirse en todos lados.', '4', '2021-10-09', '5');
INSERT INTO comentarios(comentario, estrellas, fecha_comentario, usuarios_id_usuario) VALUES ('Un amigo me recomendó su servicio de fotografía, mire que hacían un buen trabajo y no dudé en ponerme en contacto, se ve que aman lo que hacen, el equipo muy amable y servicial, me encanto como trabajan 10/10', '5', '2022-07-22', '6');


INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '8500', '2021-05-12', '14:40:15', '1');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '8500', '2022-03-12', '07:36:15', '1');

INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '2000', '2021-10-03', '21:30:12', '2');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '2500', '2022-04-10', '09:25:12', '2');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('0', '2000', '2022-04-10', '10:00:11', '2');

INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '8500', '2022-01-02', '22:05:14', '3');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('0', '2000', '2022-06-25', '14:22:36', '3');

INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '6500', '2021-12-07', '16:15:42', '4');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '2000', '2022-04-21', '22:05:21', '4');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('0', '2000', '2022-07-11', '23:56:12', '4');

INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('0', '2000', '2021-10-01', '14:03:48', '5');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '6500', '2021-10-01', '15:25:26', '5');

INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '8500', '2021-03-21', '09:32:10', '6');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '2500', '2021-12-05', '16:28:21', '6');
INSERT INTO compras(carrito, costo_total, fecha_compra, hora_compra, usuarios_id_usuario) VALUES ('1', '2000', '2022-02-14', '12:34:58', '6');


INSERT INTO categorias(nombre_categoria) VALUES ('Familiar');
INSERT INTO categorias(nombre_categoria) VALUES ('Boda');
INSERT INTO categorias(nombre_categoria) VALUES ('XV');


INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-1 familiar', 'https://i.ibb.co/6Z4pxgP/IMG-8348.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-2 familiar', 'https://i.ibb.co/XjZb7Jj/IMG-8332.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-3 familiar', 'https://i.ibb.co/SQpshkM/IMG-8336.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-1 familiar', 'https://i.ibb.co/FskdxZ4/MG-2-1.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-2 familiar', 'https://i.ibb.co/3CWSkhJ/MG-2-2.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-3 familiar', 'https://i.ibb.co/rZKCk7F/MG-2-3.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-1 familiar', 'https://i.ibb.co/Nn3gMmZ/MG-3-1.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-2 familiar', 'https://i.ibb.co/TwpmD24/MG-3-2.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-3 familiar', 'https://i.ibb.co/Pz6hGpk/MG-3-3.jpg', '1');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-1 de boda', 'https://i.ibb.co/1sW4Bmb/269704074-209487838045674-9209495460227678371-n.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-2 de boda', 'https://i.ibb.co/sm3yhr6/269894626-209487678045690-1840351644850199577-n.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-3 de boda', 'https://i.ibb.co/DDh0fjK/269761297-209487568045701-88917452-n.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-1 de boda', 'https://i.ibb.co/N77RXTH/MG-2-1.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-2 de boda', 'https://i.ibb.co/MCC79HX/MG-2-2.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-3 de boda', 'https://i.ibb.co/QpM5WTY/MG-2-3.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-1 de boda', 'https://i.ibb.co/F4tJx7Z/MG-3-1.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-2 de boda', 'https://i.ibb.co/2vwSf93/MG-3-2.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-3 de boda', 'https://i.ibb.co/dpdwbN3/MG-3-3.jpg', '2');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-1 de xv', 'https://i.ibb.co/BVmRGxq/image-1-15.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-2 de xv', 'https://i.ibb.co/gtWjv4P/279035778-284812310513226-8862332794736184389-n.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 1-3 de xv', 'https://i.ibb.co/Rg4f4R5/image-3-15.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-1 de xv', 'https://i.ibb.co/fSthdK2/IMG-2-1.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-2 de xv', 'https://i.ibb.co/VpLCq7W/IMG-2-2.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 2-3 de xv', 'https://i.ibb.co/sbS5jTq/IMG-2-3.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-1 de xv', 'https://i.ibb.co/x37Fjwh/IMG-3-1.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-2 de xv', 'https://i.ibb.co/ZYmZNVT/IMG-3-2.jpg', '3');
INSERT INTO imagenes(descripcion, url, categorias_id_categoria) VALUES ('imagen 3-3 de xv', 'https://i.ibb.co/vhgkft1/IMG-3-3.jpg', '3');

INSERT INTO paquetes(costo, descripcion, nombre_paquete, categorias_id_categoria) VALUES ('2000', '\"2 horas y media de sesión\",\"1 cambio de ropa.\",\"30 fotos.\",\"15 fotos impresas tamaño 6*8 pulgadas.\"', 'Básico', '1');
INSERT INTO paquetes(costo, descripcion, nombre_paquete, categorias_id_categoria) VALUES ('2500', '\"3 horas y media de sesión.\",\"2 cambios de ropa.\",\"50 fotos.\",\"30 fotos impresas 6*8 pulgadas.\",\"1 marco de 6*8 pulgadas.\"', 'Elite', '1');
INSERT INTO paquetes(costo, descripcion, nombre_paquete, categorias_id_categoria) VALUES ('2000', '\"20 fotos editadas y retocadas.\",\"1 cambio de ropa.\",\"1 cuadro para adorno en la boda de tamano 40*50 cm texturizado.\",\"15 fotos impresas tamaño 6*8 pulgadas.\"', 'Pre Evento', '2');
INSERT INTO paquetes(costo, descripcion, nombre_paquete, categorias_id_categoria) VALUES ('6500', '\"Se cubre todo el evento.\",\"200 fotos aproximadamente editadas y retocadas.\",\"40 fotos impresas de tamaño 6*8.\",\"Cajita donde van impresas todas las fotos.\",\"Caballete para la exposición de las fotos.\", \"Video tipo documental.\"', 'Evento', '2');
INSERT INTO paquetes(costo, descripcion, nombre_paquete, categorias_id_categoria) VALUES ('2000', '\"20 fotos editadas y retocadas\",\"1 cambio de ropa.\",\"2 cuadros para adorno en los xv años o en el hogar de tamaño 40*50 cm.\",\"15 fotos impresas tamaño 6*8 pulgadas.\"', 'Pre Evento', '3');
INSERT INTO paquetes(costo, descripcion, nombre_paquete, categorias_id_categoria) VALUES ('6500', '\"Se cubre todo el evento.\",\"200 fotos aproximadamente editadas y retocadas.\",\"45 fotos impresas de tamaño 6*8.\",\"Cajita donde van impresas todas las fotos.\",\"Caballete para la exposición de las fotos.\",\"Video tipo documental.\"', 'Evento', '3');


INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Calle Manuel Bracamontes No 3120, Playa Linda, 30830 Tapachula, Chis.', '2021-05-13', '1', '5');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('30140 Centro, 3a. Calle Sur Pte. 44, Centro, Chis.', '2021-05-14', '1', '6');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('30955 Bejucal de Ocampo, Chis.', '2022-03-13', '2', '3');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Quinta Sur Pte., Cuernavaca, 30140 Frontera Comalapa, Chis.', '2022-03-15', '2', '4');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('1a. Avenida Pte. Sur, Centro, 30140 Frontera Comalapa, Chis.', '2021-10-07', '3', '1');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('30140, 6a. Avenida Pte. Sur 480, El Sabinito, Frontera Comalapa, Chis.', '2022-04-12', '4', '2');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Segunda Pte. Nte. 11, Centro, 30140 Centro, Chis.', '2022-04-15', '5', '5');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('3a. Calle Sur Pte. 295, La Esmeralda, 30140 Frontera Comalapa, Chis.', '2022-01-06', '6', '5');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Calle Manuel Bracamontes No 3120, Playa Linda, 30830 Tapachula, Chis.', '2022-01-08', '6', '6');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('30955 Bejucal de Ocampo, Chis.', '2022-06-27', '7', '3');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Segunda Pte. Nte. 11, Centro, 30140 Centro, Chis.', '2021-12-10', '8', '4');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Avenida Central rte 12-B, Centro, 30140 Frontera Comalapa, Chis.', '2022-04-22', '9', '1');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Quinta Sur Pte., Cuernavaca, 30140 Frontera Comalapa, Chis.', '2022-07-18', '10', '5');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Segunda Calle Nte. Pte. 16-31, Centro, 30140 Frontera Comalapa, Chis.', '2021-10-28', '11', '3');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Centro, 30140 Frontera Comalapa, Chis.', '2021-11-05', '12', '4');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('1a. Avenida Pte. Sur, Centro, 30140 Frontera Comalapa, Chis.', '2021-04-06', '13', '5');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Calle Manuel Bracamontes No 3120, Playa Linda, 30830 Tapachula, Chis.', '2021-04-17', '13', '6');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Avenida Central rte 12-B, Centro, 30140 Frontera Comalapa, Chis.', '2021-12-22', '14', '2');
INSERT INTO pedidos(direccion, fecha, compras_id_compra, paquetes_id_paquete) VALUES ('Segunda Calle Sur Pte. 10, Centro, 30140 Frontera Comalapa, Chis.', '2022-02-23', '15', '1');
