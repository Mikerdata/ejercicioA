package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="usuarios")
public class Usuarios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String password;
	String nombre;
	String cliente;
	String email;
	Date fechaalta;
	Date fechabaja;
	String status;
	Integer intentosInteger;
	Date fecharevocado;
	Date fechavigencia;
	Integer no_acceso;
	String apellido_paterno;
	String apellido_materno;
	Integer area;
	Date fechamodificacion;
	Date fecha_vigencia;
	String login;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaalta() {
		return fechaalta;
	}
	public void setFechaalta(Date fechaalta) {
		this.fechaalta = fechaalta;
	}
	public Date getFechabaja() {
		return fechabaja;
	}
	public void setFechabaja(Date fechabaja) {
		this.fechabaja = fechabaja;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getIntentosInteger() {
		return intentosInteger;
	}
	public void setIntentosInteger(Integer intentosInteger) {
		this.intentosInteger = intentosInteger;
	}
	public Date getFecharevocado() {
		return fecharevocado;
	}
	public void setFecharevocado(Date fecharevocado) {
		this.fecharevocado = fecharevocado;
	}
	public Date getFechavigencia() {
		return fechavigencia;
	}
	public void setFechavigencia(Date fechavigencia) {
		this.fechavigencia = fechavigencia;
	}
	public Integer getNo_acceso() {
		return no_acceso;
	}
	public void setNo_acceso(Integer no_acceso) {
		this.no_acceso = no_acceso;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public Integer getArea() {
		return area;
	}
	public void setArea(Integer area) {
		this.area = area;
	}
	public Date getFechamodificacion() {
		return fechamodificacion;
	}
	public void setFechamodificacion(Date fechamodificacion) {
		this.fechamodificacion = fechamodificacion;
	}
	public Date getFecha_vigencia() {
		return fecha_vigencia;
	}
	public void setFecha_vigencia(Date fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", password=" + password + ", nombre=" + nombre + ", cliente=" + cliente
				+ ", email=" + email + ", fechaalta=" + fechaalta + ", fechabaja=" + fechabaja + ", status=" + status
				+ ", intentosInteger=" + intentosInteger + ", fecharevocado=" + fecharevocado + ", fechavigencia="
				+ fechavigencia + ", no_acceso=" + no_acceso + ", apellido_paterno=" + apellido_paterno
				+ ", apellido_materno=" + apellido_materno + ", area=" + area + ", fechamodificacion="
				+ fechamodificacion + ", fecha_vigencia=" + fecha_vigencia + ", login=" + login + "]";
	}
	
	
	

	

}
