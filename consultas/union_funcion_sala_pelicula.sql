select f.Precio,f.Horario,s.num_sala,p.nombre from funcion as f
inner join sala as s on s.idSala = f.Sala_idSala
inner join pelicula as p on p.idPelicula = f.Pelicula_idPelicula
GROUP BY s.num_sala;