package ders09;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class form extends JFrame {
	int x,y;

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
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Image imgr = new ImageIcon(this.getClass().getResource("/tankAr.png")).getImage();
		Image imgl = new ImageIcon(this.getClass().getResource("/tankAl.png")).getImage();
		Image imgu = new ImageIcon(this.getClass().getResource("/tankAu.png")).getImage();
		Image imgd = new ImageIcon(this.getClass().getResource("/tankAd.png")).getImage();

		
		JLabel tank = new JLabel("");
		tank.setIcon(new ImageIcon(imgr));
		tank.setBounds(114, 158, 103, 50);
		contentPane.add(tank);

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
					x = (int) tank.getBounds().getX();
					y = (int) tank.getBounds().getY();
					tank.setIcon(new ImageIcon(imgr));
					if(x<380) x += 5;
					tank.setBounds(x,y,103,50);
				}
				if(e.getKeyCode()==KeyEvent.VK_LEFT) {
					x = (int) tank.getBounds().getX();
					y = (int) tank.getBounds().getY();
					tank.setIcon(new ImageIcon(imgl));
					if(x<380) x -= 5;
					tank.setBounds(x,y,103,50);
				}
				if(e.getKeyCode()==KeyEvent.VK_UP) {
					x = (int) tank.getBounds().getX();
					y = (int) tank.getBounds().getY();
					tank.setIcon(new ImageIcon(imgu));
					if(y>0) y -= 5;
					tank.setBounds(x,y,50,103);
				}
				if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					x = (int) tank.getBounds().getX();
					y = (int) tank.getBounds().getY();
					tank.setIcon(new ImageIcon(imgd));
					if(y<350) y += 5;
					tank.setBounds(x,y,50,103);
				}
			}
		});

	}

}
