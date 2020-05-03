package ec.edu.tecazuay.eventos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.tecazuay.eventos.model.Categoria;
import ec.edu.tecazuay.eventos.model.Evento;
import ec.edu.tecazuay.eventos.repositorio.CategoriaRepository;
import ec.edu.tecazuay.eventos.repositorio.EventoRepository;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RestController
@RequestMapping("categoria")
public class CategoriaRest {
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping("")
	@CrossOrigin
	public List<Categoria> listar() {
		return this.categoriaRepository.findAll();
		
	}
	@PostMapping("")
	@CrossOrigin
	public Categoria listar( @RequestBody Categoria e) {
		return this.categoriaRepository.save(e);
	}
}
