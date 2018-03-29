package principal;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.CuentaUsuario;
import modelo.Operaciones;

public class Vista {
	JButton registrar, consultar, retirar, deposito, guardar,aceptar1,aceptar2,aceptar3;
	JLabel clav,nom,sald, apelli,nip1,opcion;
	JTextField clave,nombre,saldo, apellido, nip;
	JFrame frame=new JFrame();
	JInternalFrame frame2=new JInternalFrame();
	public Vista() {
		
		frame.setLayout(null);//diseño del jframe
		Dimension dimencion=new Dimension();
		opcion=new JLabel("¿QUE OPCION DESEAS REALIZAR?");
		opcion.setBackground(SystemColor.getColor(""));
		opcion.setBounds(new Rectangle(150, 1, 200, 25));
		frame.add(opcion);
		registrar=new JButton("REGISTROS");
		consultar=new JButton("CONSULTAR SALDO ");
		retirar=new JButton("RETIRO DE SALDO");
		deposito=new JButton("DEPOSITOS DE SALDO");
		guardar=new JButton("GUARDAR");
		registrar.setBackground(SystemColor.getColor(""));
		registrar.setBounds(new Rectangle(25,50,100,50));
		consultar.setBackground(SystemColor.getColor(""));
		consultar.setBounds(new Rectangle(200,50,200,50));
		retirar.setBackground(SystemColor.getColor(""));
		retirar.setBounds(new Rectangle(25,200,150,50));
		deposito.setBackground(SystemColor.getColor(""));
		deposito.setBounds(new Rectangle(200,200,200,50));
//		OyenteRegistrar oyenteRegistrar=new OyenteRegistrar();
		registrar.addActionListener(new OyenteRegistrar());
		consultar.addActionListener(new OyenteConsultar());
		deposito.addActionListener(new OyenteDepositar());
		frame.add(registrar);
		frame.add(consultar);
		frame.add(retirar);
		frame.add(deposito);

//		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame2.setResizable(false);//redfinir el tamaño del  jframe
//		frame2.setLocation(100, 100);
//		frame2.setSize(100,100);
//		frame2.setVisible(true);
//		frame.add(frame2);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);//redfinir el tamaño del  jframe
		frame.setLocation(200, 200);
		frame.setSize(500,400);
		frame.setVisible(true);
		
	}


	public static void main(String[] args) {

		new Vista();
	}
	private class OyenteRegistrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame nuevo=new JFrame();
			JTextField texto= new JTextField();
			nuevo.setLayout(null);
			/////////creando los labels
			clav=new JLabel("CLAVE :");
			clav.setBackground(SystemColor.getHSBColor(100, 100, 100));
			clav.setBounds(new Rectangle(25,25,200,20));
			nom=new JLabel(" USUARIO :");
			nom.setBackground(SystemColor.magenta);
			nom.setBounds(new Rectangle(25,75,200,20));
			apelli=new JLabel("APELLIDOS");
			apelli.setBackground(SystemColor.WHITE);
			apelli.setBounds(new Rectangle(25, 125, 200, 20));
			sald=new JLabel("SALDO INICIAL:");
			sald.setBackground(SystemColor.magenta);
			sald.setBounds(new Rectangle(25,175,200,20));
			nip1=new JLabel("NIP");
			nip1.setBackground(SystemColor.getColor("", 5));
			nip1.setBounds(new Rectangle(25, 225, 150, 20));
			///////////////creaando las cajas de texto
			clave=new JTextField();
			clave.setBackground(SystemColor.WHITE);
			clave.setBounds(new Rectangle(120,25 , 150, 30));
			nombre=new JTextField();
			nombre.setBackground(SystemColor.WHITE);
			nombre.setBounds(new Rectangle(120, 75, 150, 30));
			apellido=new JTextField();
			apellido.setBackground(SystemColor.WHITE);
			apellido.setBounds(new Rectangle(120, 125, 150, 30));
			saldo=new JTextField();
			saldo.setBackground(SystemColor.WHITE);
			saldo.setBounds(new Rectangle(120, 175, 150, 30));
			nip=new JTextField();
			nip.setBackground(SystemColor.WHITE);
			nip.setBounds(new Rectangle(120, 225, 150, 30));
			//////////
			aceptar1=new JButton("ACEPTAR");
			aceptar1.setBackground(SystemColor.getColor(""));
			aceptar1.setBounds(new Rectangle(100,300,100,30));
			aceptar1.addActionListener(new OyenteUsuario());
			nuevo.add(clav);
			nuevo.add(nom);
			nuevo.add(apelli);
			nuevo.add(sald);
			nuevo.add(nip1);
			nuevo.add(clave);
			nuevo.add(nombre);
			nuevo.add(apellido);
			nuevo.add(saldo);
			nuevo.add(nip);
			nuevo.add(aceptar1);
			nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			nuevo.setResizable(false);//redfinir el tamaño del  jframe
			nuevo.setLocation(200, 200);
			nuevo.setSize(300,400);
			nuevo.setVisible(true);
			frame.setVisible(false);

		}

	}
	private class OyenteConsultar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "ENTRE AQUI");
			
		}
		
	}
	public class OyenteRetirarSaldo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public class OyenteDepositar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JFrame frameDeposito= new JFrame();
			frameDeposito.setLayout(null);
			clav=new JLabel("CLAVE :");
			clav.setBackground(SystemColor.getHSBColor(100, 100, 100));
			clav.setBounds(new Rectangle(25,25,200,20));
			sald=new JLabel("DEPOSITO :");
			sald.setBackground(SystemColor.magenta);
			sald.setBounds(new Rectangle(25,75,200,20));
			saldo=new JTextField();
			saldo.setBackground(SystemColor.WHITE);
			saldo.setBounds(new Rectangle(120, 25, 150, 30));
			nip=new JTextField();
			clave=new JTextField();
			clave.setBackground(SystemColor.WHITE);
			clave.setBounds(new Rectangle(120,75 , 150, 30));
			frameDeposito.add(clav);
			frameDeposito.add(sald);
			frameDeposito.add(clave);
			frameDeposito.add(saldo);
			aceptar2=new JButton("ACEPTAR");
			aceptar2.setBackground(SystemColor.PINK);
			aceptar2.setBounds(new Rectangle(100,125,100,30));
			frameDeposito.add(aceptar2);
			frameDeposito.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frameDeposito.setResizable(false);
			frameDeposito.setLocation(200, 200);
			frameDeposito.setSize(300,250);
			frameDeposito.setVisible(true);
			
		}
		
	}
	public class OyenteUsuario implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			CuentaUsuario registro=new CuentaUsuario();
			Operaciones operacion=new Operaciones();
			String usuario=nombre.getText();
			registro.setNombreUsuario(usuario);
			String claveUsuario=clave.getText();
			registro.setClaveUsuario(claveUsuario);
			String apellidos=apellido.getText();
			registro.setApellidos(claveUsuario);
			int saldo1=Integer.parseInt(saldo.getText());
			int nip1=Integer.parseInt(nip.getText());
			registro.setSaldo(saldo1);
			operacion.agregar(registro);
			System.out.println(registro.getNombreUsuario());
		}
		
	}
}
