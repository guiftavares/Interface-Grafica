package lugar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLugar extends JFrame {
	
		
	private JPanel contentPane;
	private JTextField txt_pais;
	private JTextField txt_data;
	private JTextField txt_objetivo;
	private JTextField txt_clima;
	private JTextField txt_hotel;
	protected Component Lugar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLugar frame = new ViewLugar();
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
	public ViewLugar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
						
		txt_hotel = new JTextField();
		txt_hotel.setBounds(10, 193, 200, 20);
		contentPane.add(txt_hotel);
		txt_hotel.setColumns(10);
		
		JLabel txt_ = new JLabel("Informe o Hotel que ir\u00E1 se hospedar");
		txt_.setForeground(Color.WHITE);
		txt_.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		txt_.setBounds(10, 166, 189, 29);
		contentPane.add(txt_);
		
		txt_clima = new JTextField();
		txt_clima.setBounds(235, 135, 189, 20);
		contentPane.add(txt_clima);
		txt_clima.setColumns(10);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Informe o Clima do Pa\u00EDs");
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblNewLabel_2_2_1.setBounds(235, 108, 189, 29);
		contentPane.add(lblNewLabel_2_2_1);
		
		txt_objetivo = new JTextField();
		txt_objetivo.setBounds(10, 135, 200, 20);
		contentPane.add(txt_objetivo);
		txt_objetivo.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Informe o objetivo da viagem");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblNewLabel_2_2.setBounds(10, 108, 189, 29);
		contentPane.add(lblNewLabel_2_2);
		
		txt_data = new JTextField("dd/mm/aaaa",10);
		txt_data.setBounds(235, 70, 189, 20);
		contentPane.add(txt_data);
		txt_data.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Data da viagem");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(235, 40, 189, 29);
		contentPane.add(lblNewLabel_2_1);
		
		txt_pais = new JTextField();
		txt_pais.setBounds(10, 70, 200, 20);
		contentPane.add(txt_pais);
		txt_pais.setColumns(10);
		
		JButton btn_gerarinfo = new JButton("GERAR");
		btn_gerarinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
										
				Lugar lug = new Lugar(txt_pais.getText(), txt_clima.getText(), txt_objetivo.getText(),
						txt_hotel.getText(), txt_data.getText());
				JOptionPane.showMessageDialog(null, "Você irá viajar para " + lug.getPais() + " a " + lug.getObjetivo() + " em " + lug.getData()
					+ " e ficará hospedado no " + lug.getHotel() + ". Prepare-se para um clima " + lug.getClima() + ".");			}
			});
		btn_gerarinfo.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		btn_gerarinfo.setBounds(335, 192, 89, 23);
		contentPane.add(btn_gerarinfo);
		
		JLabel lblNewLabel_2 = new JLabel("Informe o pa\u00EDs de destino");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 40, 150, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("INFORMA\u00C7\u00C3O DE VIAGEM");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(0, 11, 434, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\guita\\Desktop\\ativ_interface\\graphic_interface\\viajar.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
