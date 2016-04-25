package pe.com.peruInka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
public class Product {
	
	private Long sucursalId;
	private Long id;
	private String nombproduct;
	private double precio;
	private String descripcion;
	private String atributo;
	private String estado;
	private String tipproduct;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSurcusalId() {
		return sucursalId;
	}
	public void setSurcusalId(Long sucursalId) {
		this.sucursalId = sucursalId;
	}
	public String getNombproduct() {
		return nombproduct;
	}
	public void setNombproduct(String nombproduct) {
		this.nombproduct = nombproduct;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAtributo() {
		return atributo;
	}
	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipproduct() {
		return tipproduct;
	}
	public void setTipproduct(String tipproduct) {
		this.tipproduct = tipproduct;
	}
	

}
