package com.senai.pablineeandre.hotel.repository;

import com.senai.pablineeandre.hotel.entity.Detalhe;
import com.senai.pablineeandre.hotel.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetalheRepository extends JpaRepository <Detalhe, Long>{
    List<Reserva>findByDetalheIsNotNull();
    List<Reserva>findByDetalheIsNull();
}
