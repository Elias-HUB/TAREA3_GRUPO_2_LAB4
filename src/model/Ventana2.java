package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Ventana2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txbN1;
	private JTextField txbN2;
	private JTextField txbN3;
	private JTextField txbPromedio;
	private JTextField txbCondicion;

	/**
	 * Launch the application.
	 */

	

	/**
	 * Create the frame.
	 */
	public Ventana2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PanelNotas = new JPanel();
		PanelNotas.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelNotas.setBounds(10, 11, 287, 150);
		contentPane.add(PanelNotas);
		PanelNotas.setLayout(null);
		
		JLabel lblN1 = new JLabel("Nota 1 :");
		lblN1.setBounds(49, 23, 56, 14);
		PanelNotas.add(lblN1);
		
		txbN1 = new JTextField();
		txbN1.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char Validar = e.getKeyChar();
					if(!Character.isDigit(Validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "Ingrese solamente numeros");
				}
			}
		});
		txbN1.setBounds(115, 20, 110, 20);
		PanelNotas.add(txbN1);
		txbN1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Nota 2 :");
		lblNota2.setBounds(49, 51, 56, 14);
		PanelNotas.add(lblNota2);
		
		txbN2 = new JTextField();
		txbN2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Validar = e.getKeyChar();
				if(!Character.isDigit(Validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "Ingrese solamente numeros");
				}
			}
		});
		txbN2.setColumns(10);
		txbN2.setBounds(115, 48, 110, 20);
		PanelNotas.add(txbN2);
		
		JLabel lblN3 = new JLabel("Nota 3 :");
		lblN3.setBounds(49, 79, 56, 14);
		PanelNotas.add(lblN3);
		
		txbN3 = new JTextField();
		txbN3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char Validar = e.getKeyChar();
				if(!Character.isDigit(Validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "Ingrese solamente numeros");
			}
					
						}});
		txbN3.setColumns(10);
		txbN3.setBounds(115, 76, 110, 20);
		PanelNotas.add(txbN3);
		
		JLabel lblTP = new JLabel("TPS");
		lblTP.setBounds(49, 112, 56, 14);
		PanelNotas.add(lblTP);
		
		String [] estados = {"Aprobado", "Desaprobado" };
		JComboBox cboTP = new JComboBox(estados);
		cboTP.setSelectedIndex(-1);
		cboTP.setBounds(115, 109, 112, 20);
		PanelNotas.add(cboTP);
		
		JPanel PanelResultados = new JPanel();
		PanelResultados.setBorder(new TitledBorder(null, "Notas del estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		PanelResultados.setBounds(16, 166, 287, 84);
		contentPane.add(PanelResultados);
		PanelResultados.setLayout(null);
		
		JLabel lblProm = new JLabel("Promedio");
		lblProm.setBounds(37, 28, 56, 14);
		PanelResultados.add(lblProm);
		
		txbPromedio = new JTextField();
		txbPromedio.setEditable(false);
		txbPromedio.setColumns(10);
		txbPromedio.setBounds(116, 25, 109, 20);
		PanelResultados.add(txbPromedio);
		
		JLabel lblCond = new JLabel("Condicion");
		lblCond.setBounds(37, 56, 56, 14);
		PanelResultados.add(lblCond);
		
		txbCondicion = new JTextField();
		txbCondicion.setEditable(false);
		txbCondicion.setColumns(10);
		txbCondicion.setBounds(116, 53, 109, 20);
		PanelResultados.add(txbCondicion);
		
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ACA HAGO EL PROMEDIO
				try {
					int n1 = Integer.parseInt(txbN1.getText()); 
					int n2 = Integer.parseInt(txbN2.getText()); 
					int n3 = Integer.parseInt(txbN3.getText()); 
					if(n1>10 || n2>10 || n3>10 )
					{
						JOptionPane.showMessageDialog(rootPane, "Ingrese un numero del 1 al 10");
						txbPromedio.setText("");
						txbCondicion.setText("");
					}
					else 
					{
						Double prom = (Double.parseDouble(txbN1.getText())+ Double.parseDouble(txbN2.getText())+ Double.parseDouble(txbN3.getText()))/3;
						prom = Math.round(prom * 100) / 100d;
						txbPromedio.setText(String.valueOf(prom));
					}
					
					//ACA EVALUO LA CONDICION
					if(cboTP.getSelectedItem().equals("Desaprobado"))
						{
						txbCondicion.setText("Libre"); 
						}
					else if(cboTP.getSelectedItem().equals(""))
					{
						JOptionPane.showMessageDialog(rootPane, "Ingrese condicion de TP");
					}
					else if(Integer.parseInt(txbN1.getText())<6 
						|| Integer.parseInt(txbN2.getText())<6 
						|| Integer.parseInt(txbN3.getText())<6)
							{
							txbCondicion.setText("Libre");
							}
						else if(Integer.parseInt(txbN1.getText())>=6 && Integer.parseInt(txbN1.getText())<=8
						    && Integer.parseInt(txbN2.getText())>=6 && Integer.parseInt(txbN3.getText())<=8 
						    && Integer.parseInt(txbN3.getText())>=6 && Integer.parseInt(txbN3.getText())<=8  
						    & cboTP.getSelectedItem().equals("Aprobado"))
							{
								txbCondicion.setText("Regular");
							}
						
						else if (Integer.parseInt(txbN1.getText())>=8 && Integer.parseInt(txbN1.getText())<=10
							    && Integer.parseInt(txbN2.getText())>=8 && Integer.parseInt(txbN3.getText())<=10 
							    && Integer.parseInt(txbN3.getText())>=8 && Integer.parseInt(txbN3.getText())<=10  
							    & cboTP.getSelectedItem().equals("Aprobado"))
						{
							txbCondicion.setText("Promocionado");
						}
				}
				catch(NumberFormatException ex)
				{
					JOptionPane.showMessageDialog(rootPane, "Ingrese notas");
				}
				catch(Exception e1) {
					txbPromedio.setText("");
					JOptionPane.showMessageDialog(rootPane, "Ingrese condicion de TP");
				}

				}
		}); 
				
		btnCalcular.setBounds(322, 37, 102, 30);
		contentPane.add(btnCalcular);
		
		// ACA LIMPIO LOS TEXTBOXS
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txbN1.setText("");
				txbN2.setText("");
			    txbN3.setText("");
				cboTP.setSelectedIndex(-1); 
				txbPromedio.setText("");
				txbCondicion.setText("");
			}
		});
		btnNuevo.setBounds(322, 77, 102, 30);
		contentPane.add(btnNuevo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(322, 118, 102, 30);
		contentPane.add(btnSalir);
	}
}
