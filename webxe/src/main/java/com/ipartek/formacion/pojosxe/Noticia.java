package com.ipartek.formacion.pojosxe;

import java.util.Date;

public class Noticia {

	private Long id;
	private String titular;
	private Date fecha;
	private String autor;
	private String texto;
	
	public Noticia(Long id, String titular, Date fecha, String autor, String texto) {
		super();
		this.id = id;
		this.titular = titular;
		this.fecha = fecha;
		this.autor = autor;
		this.texto = texto;
	}
		
	public Noticia() {

	}
	
	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getTitular() {
		return titular;
	}





	public void setTitular(String titular) {
		this.titular = titular;
	}





	public Date getFecha() {
		return fecha;
	}





	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}





	public String getAutor() {
		return autor;
	}





	public void setAutor(String autor) {
		this.autor = autor;
	}





	public String getTexto() {
		return texto;
	}





	public void setTexto(String texto) {
		this.texto = texto;
	}





	





	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titular=" + titular + ", fecha=" + fecha + ", autor=" + autor + ", texto="
				+ texto + "]";
	}
	
}
