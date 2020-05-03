package ec.edu.tecazuay.eventos.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GeneratorType;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter()
@Setter()
public class Evento implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idEvento;
@ApiModelProperty(hidden = false)
	private String nombre;
	private String descripcion;
	private Date fecha;
	private String color;
	private boolean repite;
	private Integer repeticion;
	@ManyToMany
	private List<Categoria> categorias;
	public Long getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isRepite() {
		return repite;
	}
	public void setRepite(boolean repite) {
		this.repite = repite;
	}
	public Integer getRepeticion() {
		return repeticion;
	}
	public void setRepeticion(Integer repeticion) {
		this.repeticion = repeticion;
	}
	public List<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}
	
	
}
