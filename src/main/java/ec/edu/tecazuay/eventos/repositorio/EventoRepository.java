package ec.edu.tecazuay.eventos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.tecazuay.eventos.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
