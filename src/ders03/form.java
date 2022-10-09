package ders03;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;

public class form extends JFrame {
	static int x,y;
	static int hizx=2;
	static int hizy=10;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
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
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,500,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b = new JButton("");
		b.setBackground(Color.RED);
		b.setBounds(107, 83, 50, 50);
		contentPane.add(b);
		
		Timer t = new Timer();
		
		TimerTask g = new TimerTask() {
			
			@Override
			public void run() {
				 x = b.getBounds().x;
				 y = b.getBounds().y;
				 x += hizx;
				 y += hizy;
				 b.setBounds(x, y, 50, 50);
				 if(x>=445) hizx *= -1;
				 if(x<=0) hizx *=-1;
				 if(y>=405) hizy *= -1;
				 if(y<=0) hizy *=-1;
			}
		};
		
		t.schedule(g,0,10);
		
	}
}
