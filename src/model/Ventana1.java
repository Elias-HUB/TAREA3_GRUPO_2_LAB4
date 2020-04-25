package model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtFecha;
	/**
	 * Launch the application.
	 */
	
	
	/**
	 * Create the frame.
	 */
	public Ventana1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		
		JLabel lblNewLabel_2 = new JLabel("Telefono");
		
		JLabel lblNewLabel_3 = new JLabel("Fecha Nac.");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		txtFecha = new JTextField();
		txtFecha.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Los datos ingresados fueron:");
		
		JLabel lblResultado = new JLabel("");
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(txtNombre.getText().length()==0) 
				{
					//txtNombre.setBackground(255,0,0);
					//txtNombre = new JTextField("Aca el texto", 12);
					//txtNombre.setEnabled(true);
					txtNombre.setBackground(Color.RED);
				}
				if(txtApellido.getText().length()==0) 
				{
					txtApellido.setBackground(Color.RED);
				}
				if(txtTelefono.getText().length()==0) 
				{
					txtTelefono.setBackground(Color.RED);
				}
				if(txtFecha.getText().length()==0) 
				{
					txtFecha.setBackground(Color.RED);
				}

				if(txtNombre.getText().length()>0 && txtApellido.getText().length()>0 && 
						txtTelefono.getText().length()>0 && txtFecha.getText().length()>0)
				{
					txtNombre.setBackground(Color.WHITE);
					txtApellido.setBackground(Color.WHITE);
					txtTelefono.setBackground(Color.WHITE);
					txtFecha.setBackground(Color.WHITE);
					lblResultado.setText(txtNombre.getText()+", "+txtApellido.getText()+", "+
							txtTelefono.getText()+", "+txtFecha.getText());
					txtNombre.setText("");
					txtApellido.setText("");
					txtTelefono.setText("");
					txtFecha.setText("");
				}				
				txtNombre.setText("");
				txtApellido.setText("");
				txtTelefono.setText("");
				txtFecha.setText("");
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnMostrar))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblResultado, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_2)
										.addComponent(lblNewLabel_3))
									.addGap(37)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(txtTelefono, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
										.addComponent(txtApellido, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
										.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
										.addComponent(txtFecha, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))))
					.addGap(72))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnMostrar)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblResultado, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}

}
