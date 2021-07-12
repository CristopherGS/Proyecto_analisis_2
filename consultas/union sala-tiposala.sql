select s.num_sala, ts.nombre,ts.asientos  from sala as s 
inner join tiposala as ts on ts.idTipoSala = s.TipoSala_idTipoSala where 1=1;