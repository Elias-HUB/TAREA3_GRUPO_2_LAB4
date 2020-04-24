package model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel PanelEjer3;
	private JFormattedTextField TboxHoras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 frame = new Ventana3();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana3() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Ejercicio 3");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 526, 334);
		PanelEjer3 = new JPanel();
		PanelEjer3.setBorder(null);
		setContentPane(PanelEjer3);
		PanelEjer3.setLayout(null);
		
		JPanel PanelSisOpe = new JPanel();
		PanelSisOpe.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		PanelSisOpe.setBounds(10, 32, 490, 55);
		PanelEjer3.add(PanelSisOpe);
		PanelSisOpe.setLayout(null);
		
		JRadioButton RbtnLinux = new JRadioButton("Linux");
		RbtnLinux.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnLinux.setBounds(403, 7, 81, 41);
		PanelSisOpe.add(RbtnLinux);
		
		JRadioButton RbtnMac = new JRadioButton("Mac");
		RbtnMac.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnMac.setBounds(320, 7, 81, 41);
		PanelSisOpe.add(RbtnMac);
		
		JRadioButton RbtnWindows = new JRadioButton("Windows");
		RbtnWindows.setFont(new Font("Tahoma", Font.BOLD, 13));
		RbtnWindows.setBounds(202, 7, 102, 41);
		PanelSisOpe.add(RbtnWindows);
		
		JLabel LblElijeUnSistema = new JLabel("Elije un sistema Operativo");
		LblElijeUnSistema.setFont(new Font("Tahoma", Font.BOLD, 13));
		LblElijeUnSistema.setBounds(20, 7, 176, 41);
		PanelSisOpe.add(LblElijeUnSistema);
		
		JPanel panelEspecialidad = new JPanel();
		panelEspecialidad.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelEspecialidad.setBounds(10, 98, 490, 108);
		PanelEjer3.add(panelEspecialidad);
		GridBagLayout gbl_panelEspecialidad = new GridBagLayout();
		gbl_panelEspecialidad.columnWidths = new int[]{242, 240, 0};
		gbl_panelEspecialidad.rowHeights = new int[]{30, 30, 28, 0};
		gbl_panelEspecialidad.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panelEspecialidad.rowWeights = new double[]{2.0, 2.0, 2.0, Double.MIN_VALUE};
		panelEspecialidad.setLayout(gbl_panelEspecialidad);
		
		JCheckBox CboxProgramacion = new JCheckBox("Programaci\u00F3n");
		CboxProgramacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_CboxProgramacion = new GridBagConstraints();
		gbc_CboxProgramacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_CboxProgramacion.insets = new Insets(0, 0, 5, 0);
		gbc_CboxProgramacion.gridx = 1;
		gbc_CboxProgramacion.gridy = 0;
		panelEspecialidad.add(CboxProgramacion, gbc_CboxProgramacion);
		
		JLabel LblElijeUnaEspecialidad = new JLabel("Elije Una especialidad");
		LblElijeUnaEspecialidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_LblElijeUnaEspecialidad = new GridBagConstraints();
		gbc_LblElijeUnaEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_LblElijeUnaEspecialidad.gridx = 0;
		gbc_LblElijeUnaEspecialidad.gridy = 1;
		panelEspecialidad.add(LblElijeUnaEspecialidad, gbc_LblElijeUnaEspecialidad);
		
		JCheckBox CboxAdministracion = new JCheckBox("Administraci\u00F3n");
		CboxAdministracion.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_CboxAdministracion = new GridBagConstraints();
		gbc_CboxAdministracion.fill = GridBagConstraints.HORIZONTAL;
		gbc_CboxAdministracion.insets = new Insets(0, 0, 5, 0);
		gbc_CboxAdministracion.gridx = 1;
		gbc_CboxAdministracion.gridy = 1;
		panelEspecialidad.add(CboxAdministracion, gbc_CboxAdministracion);
		
		JCheckBox CboxDiseñoGrafico = new JCheckBox("Dise\u00F1o Gr\u00E1fico");
		CboxDiseñoGrafico.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_CboxDiseñoGrafico = new GridBagConstraints();
		gbc_CboxDiseñoGrafico.fill = GridBagConstraints.HORIZONTAL;
		gbc_CboxDiseñoGrafico.gridx = 1;
		gbc_CboxDiseñoGrafico.gridy = 2;
		panelEspecialidad.add(CboxDiseñoGrafico, gbc_CboxDiseñoGrafico);
		
		JLabel LblHotas = new JLabel("Cantidad de horas en el computador:");
		LblHotas.setFont(new Font("Tahoma", Font.BOLD, 13));
		LblHotas.setBounds(30, 230, 261, 14);
		PanelEjer3.add(LblHotas);
		
		TboxHoras = new JFormattedTextField();
		TboxHoras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				char Validar = evt.getKeyChar();
				
				if(!Character.isDigit(Validar)) {
					getToolkit().beep();
					evt.consume();
					
					JOptionPane.showMessageDialog(rootPane, "Ingrese solamente numeros enteros");
				}
			}
		});
		TboxHoras.setHorizontalAlignment(SwingConstants.LEFT);
		TboxHoras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		TboxHoras.setBounds(301, 227, 86, 20);
		PanelEjer3.add(TboxHoras);
		TboxHoras.setColumns(10);
		
		JButton BtnAceptar = new JButton("Aceptar");
		BtnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BtnAceptar.setBounds(398, 261, 89, 23);
		PanelEjer3.add(BtnAceptar);
	}
}
