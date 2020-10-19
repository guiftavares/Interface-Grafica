package graphic_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class InterfacePlaneta extends JFrame {

	protected static final Planet[] Pl = new Planet [8];
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfacePlaneta frame = new InterfacePlaneta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Pl [0] = new Planet ("Mercúrio", 58.6, 0.24, "57.910.000", 4879.4);
		Pl [1] = new Planet ("Vênus", 243, 0.61, "108.200.000", 12104);
		Pl [2] = new Planet ("Terra", 0.99, 1.00, "149.600.000", 12742);
		Pl [3] = new Planet ("Marte", 1.03, 1.88, "227.900.000", 6779);
		Pl [4] = new Planet ("Júpiter", 0.41, 11.86, "778.500.000", 139820);
		Pl [5] = new Planet ("Saturno", 0.45,29.46,"1.434.000.000",116460);
		Pl [6] = new Planet ("Urano", 0.72, 84.01, "2.871.000.000", 50724);
		Pl [7] = new Planet ("Netuno", 0.67, 164.79, "4.495.000.000", 49244);
	}
	
	/**
	 * Create the frame.
	 */
	public InterfacePlaneta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JComboBox box_planetinfo = new JComboBox();
		box_planetinfo.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		box_planetinfo.setModel(new DefaultComboBoxModel(new String[] {"< Selecione >", "Mercurio", "Venus", "Terra", "Marte", "Jupiter", "Saturno", "Urano", "Netuno"}));
		box_planetinfo.setBounds(60, 130, 230, 28);
		contentPane.add(box_planetinfo);
		
		JButton btn_pesquisar = new JButton("PESQUISAR");
		btn_pesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(box_planetinfo.getSelectedItem().equals("< Selecione >")) {					
					JOptionPane.showMessageDialog(null, "Opção Inválida, escolha as demais", null, WIDTH);
				} 					
				if (box_planetinfo.getSelectedItem().equals("Mercurio")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[0].getNome()  + " tem rotação de " + Pl[0].getRotacao() + " dias terrestres e translação de " + Pl[0].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[0].getDistancia_sol() + " km do Sol e possui " + Pl[0].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				if (box_planetinfo.getSelectedItem().equals("Venus")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[1].getNome()  + " tem rotação de " + Pl[1].getRotacao() + " dias terrestres e translação de " + Pl[1].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[1].getDistancia_sol() + " km do Sol e possui " + Pl[1].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				if (box_planetinfo.getSelectedItem().equals("Terra")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[2].getNome()  + " tem rotação de " + Pl[2].getRotacao() + " dias terrestres e translação de " + Pl[2].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[2].getDistancia_sol() + " km do Sol e possui " + Pl[2].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				if (box_planetinfo.getSelectedItem().equals("Marte")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[3].getNome()  + " tem rotação de " + Pl[3].getRotacao() + " dias terrestres e translação de " + Pl[3].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[3].getDistancia_sol() + " km do Sol e possui " + Pl[3].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				if (box_planetinfo.getSelectedItem().equals("Jupiter")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[4].getNome()  + " tem rotação de " + Pl[4].getRotacao() + " dias terrestres e translação de " + Pl[4].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[4].getDistancia_sol() + " km do Sol e possui " + Pl[4].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				if (box_planetinfo.getSelectedItem().equals("Saturno")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[5].getNome()  + " tem rotação de " + Pl[5].getRotacao() + " dias terrestres e translação de " + Pl[5].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[5].getDistancia_sol() + " km do Sol e possui " + Pl[5].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				if (box_planetinfo.getSelectedItem().equals("Urano")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[6].getNome()  + " tem rotação de " + Pl[6].getRotacao() + " dias terrestres e translação de " + Pl[6].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[6].getDistancia_sol() + " km do Sol e possui " + Pl[6].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				if (box_planetinfo.getSelectedItem().equals("Netuno")) {
					JOptionPane.showMessageDialog(null, "O planeta " + Pl[7].getNome()  + " tem rotação de " + Pl[7].getRotacao() + " dias terrestres e translação de " + Pl[7].getTranslacao() 
					+ " anos terrestres. Está a " + Pl[7].getDistancia_sol() + " km do Sol e possui " + Pl[7].getTamanho() + " km de tamanho.", null, WIDTH);
					}
				}
		
		});
		btn_pesquisar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		btn_pesquisar.setBounds(303, 130, 110, 28);
		contentPane.add(btn_pesquisar);
		
		JLabel lblNewLabel_2 = new JLabel("Escolha um Planeta abaixo:");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2.setBounds(60, 91, 230, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("NOSSO SISTEMA SOLAR");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 24));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 11, 414, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\guita\\Desktop\\ativ_interface\\graphic_interface\\planeta.jpg"));
		lblNewLabel.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabel);
	}
}
