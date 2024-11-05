package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaOp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaOp frame = new VistaOp();
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
	public VistaOp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnResult = new JButton("Resultado");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Obtener los valores de los campos de texto
					int num1 = Integer.parseInt(txt1.getText()); // Convertir el valor de txt1 a entero
					int num2 = Integer.parseInt(txt2.getText()); // Convertir el valor de txt2 a entero
					
					// Realizar la multiplicación
					int resultado = num1 * num2;
					
					// Mostrar el resultado en el campo de texto txtResultado
					txtResultado.setText(String.valueOf(resultado));
				} catch (NumberFormatException ex) {
					// Manejo de error si no se ingresa un número válido
					txtResultado.setText("Error");
				}
			}
		});
		btnResult.setBounds(156, 174, 85, 21);
		contentPane.add(btnResult);
		
		JLabel lblNewLabel = new JLabel("Multiplicación");
		lblNewLabel.setBounds(174, 10, 191, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa valores");
		lblNewLabel_1.setBounds(32, 69, 75, 40);
		contentPane.add(lblNewLabel_1);
		
		txt1 = new JTextField();
		txt1.setBounds(117, 53, 96, 19);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(117, 90, 96, 19);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(117, 119, 101, 21);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(42, 123, 45, 13);
		contentPane.add(lblNewLabel_2);
	}
}
