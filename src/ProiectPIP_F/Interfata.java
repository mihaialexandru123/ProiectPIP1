package ProiectPIP_F;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;

public class Interfata extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfata frame = new Interfata();
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
	public Interfata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		textArea.setEditable(false);
		textArea.setBounds(124, 420, 255, 33);
		contentPane.add(textArea);
		
		JButton btnVortex = new JButton("Vortex display");
		btnVortex.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVortex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Vortex(new Display("Display"),"Vortex");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnVortex.setBounds(10, 62, 145, 63);
		contentPane.add(btnVortex);
		
		JButton btnVortexPorturi = new JButton("Vortex porturi");
		btnVortexPorturi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVortexPorturi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Vortex(new Porturi("Porturi"),"Vortex");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnVortexPorturi.setBounds(10, 151, 145, 63);
		contentPane.add(btnVortexPorturi);
		
		JButton btnVortexSursa = new JButton("Vortex sursa");
		btnVortexSursa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVortexSursa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Vortex(new Sursa("Sursa"),"Vortex");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnVortexSursa.setBounds(10, 239, 145, 63);
		contentPane.add(btnVortexSursa);
		
		JButton btnVortexDifuzor = new JButton("Vortex difuzor");
		btnVortexDifuzor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVortexDifuzor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Vortex(new Difuzor("Difuzor"),"Vortex");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnVortexDifuzor.setBounds(10, 332, 145, 63);
		contentPane.add(btnVortexDifuzor);
		
		JButton btnLgDisplay = new JButton("LG display");
		btnLgDisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLgDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new LG(new Display("Display"),"LG");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnLgDisplay.setBounds(179, 62, 145, 63);
		contentPane.add(btnLgDisplay);
		
		JButton btnLgPorturi = new JButton("LG porturi");
		btnLgPorturi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLgPorturi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new LG(new Porturi("Porturi"),"LG");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnLgPorturi.setBounds(179, 151, 145, 63);
		contentPane.add(btnLgPorturi);
		
		JButton btnLgSursa = new JButton("LG sursa");
		btnLgSursa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLgSursa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new LG(new Sursa("Sursa"),"LG");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnLgSursa.setBounds(179, 239, 145, 63);
		contentPane.add(btnLgSursa);
		
		JButton btnLgDifuzor = new JButton("LG difuzor");
		btnLgDifuzor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLgDifuzor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new LG(new Difuzor("Difuzor"),"LG");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnLgDifuzor.setBounds(179, 332, 145, 63);
		contentPane.add(btnLgDifuzor);
		
		JButton btnSamsungDisplay = new JButton("Samsung display");
		btnSamsungDisplay.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSamsungDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Samsung(new Display("Display"),"Samsung");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnSamsungDisplay.setBounds(355, 62, 145, 63);
		contentPane.add(btnSamsungDisplay);
		
		JButton btnSamsungPorturi = new JButton("Samsung porturi");
		btnSamsungPorturi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSamsungPorturi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Samsung(new Porturi("Porturi"),"Samsung");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnSamsungPorturi.setBounds(355, 151, 145, 63);
		contentPane.add(btnSamsungPorturi);
		
		JButton btnSamsungSursa = new JButton("Samsung sursa");
		btnSamsungSursa.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSamsungSursa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Samsung(new Sursa("Sursa"),"Samsung");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnSamsungSursa.setBounds(355, 239, 145, 63);
		contentPane.add(btnSamsungSursa);
		
		JButton btnSamsungDifuzor = new JButton("Samsung difuzor");
		btnSamsungDifuzor.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSamsungDifuzor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Televizoare t1=new Samsung(new Difuzor("Difuzor"),"Samsung");
				String s=String.valueOf("Costul reparatiei este " +t1.costReparatie1()+ " lei");
				textArea.setText(s);
				t1.afisareTelevizor();
				t1.costReparatie();
				System.out.println("\n"); 

			}
		});
		btnSamsungDifuzor.setBounds(355, 332, 145, 63);
		contentPane.add(btnSamsungDifuzor);
		
		JTextArea txtrServiciuDepnari = new JTextArea();
		txtrServiciuDepnari.setEditable(false);
		txtrServiciuDepnari.setBackground(SystemColor.menu);
		txtrServiciuDepnari.setForeground(SystemColor.desktop);
		txtrServiciuDepnari.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtrServiciuDepnari.setText("                         Serviciu depanari");
		txtrServiciuDepnari.setToolTipText("");
		txtrServiciuDepnari.setBounds(51, 10, 376, 33);
		contentPane.add(txtrServiciuDepnari);
		
	}

}
