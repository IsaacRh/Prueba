package modelo;

public class Operaciones {
CuentaUsuario cajero[];
int contador;
public Operaciones( ) {
	super();
	this.contador = contador;
	this.cajero=new CuentaUsuario[100];
}
public void agregar (CuentaUsuario registro){
	cajero[contador]=registro;
	System.out.println(contador);
	contador++;
}
}
