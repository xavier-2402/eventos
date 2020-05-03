package ec.edu.tecazuay.eventos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.tecazuay.eventos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
