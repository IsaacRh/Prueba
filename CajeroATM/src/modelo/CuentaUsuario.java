package modelo;

public class CuentaUsuario {
String claveUsuario;
String nombreUsuario;
String apellidos;
int saldo;
int nip;
public String getClaveUsuario() {
	return claveUsuario;
}
public void setClaveUsuario(String claveUsuario) {
	this.claveUsuario = claveUsuario;
}
public String getNombreUsuario() {
	return nombreUsuario;
}
public void setNombreUsuario(String nombreUsuario) {
	this.nombreUsuario = nombreUsuario;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public int getSaldo() {
	return saldo;
}
public void setSaldo(int saldo) {
	this.saldo = saldo;
}
public int getNip() {
	return nip;
}
public void setNip(int nip) {
	this.nip = nip;
}

}
