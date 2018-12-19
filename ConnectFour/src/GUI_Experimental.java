import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class GUI_Experimental {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Experimental window = new GUI_Experimental();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Experimental() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 757, 543);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnA = new JButton("◼︎");
		btnA.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnA.setBackground(Color.YELLOW);
		btnA.setForeground(Color.YELLOW);
		btnA.setBounds(48, 410, 75, 75);
		panel.add(btnA);
		
		JButton button = new JButton("◼︎");
		button.setForeground(Color.YELLOW);
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button.setBackground(Color.YELLOW);
		button.setBounds(156, 410, 75, 75);
		panel.add(button);
		
		JButton button_1 = new JButton("◼︎");
		button_1.setForeground(Color.YELLOW);
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_1.setBackground(Color.YELLOW);
		button_1.setBounds(269, 410, 75, 75);
		panel.add(button_1);
		
		JButton button_2 = new JButton("◼︎");
		button_2.setForeground(Color.YELLOW);
		button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_2.setBackground(Color.YELLOW);
		button_2.setBounds(376, 410, 75, 75);
		panel.add(button_2);
		
		JButton button_3 = new JButton("◼︎");
		button_3.setForeground(Color.YELLOW);
		button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_3.setBackground(Color.YELLOW);
		button_3.setBounds(481, 410, 75, 75);
		panel.add(button_3);
		
		JButton button_4 = new JButton("◼︎");
		button_4.setForeground(Color.YELLOW);
		button_4.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_4.setBackground(Color.YELLOW);
		button_4.setBounds(577, 410, 75, 75);
		panel.add(button_4);
		
		JButton button_5 = new JButton("◼︎");
		button_5.setForeground(Color.YELLOW);
		button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_5.setBackground(Color.YELLOW);
		button_5.setBounds(664, 410, 75, 75);
		panel.add(button_5);
		
		JButton button_6 = new JButton("◼︎");
		button_6.setForeground(Color.YELLOW);
		button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_6.setBackground(Color.YELLOW);
		button_6.setBounds(48, 311, 75, 75);
		panel.add(button_6);
		
		JButton button_7 = new JButton("◼︎");
		button_7.setForeground(Color.YELLOW);
		button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_7.setBackground(Color.YELLOW);
		button_7.setBounds(156, 311, 75, 75);
		panel.add(button_7);
		
		JButton button_8 = new JButton("◼︎");
		button_8.setForeground(Color.YELLOW);
		button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_8.setBackground(Color.YELLOW);
		button_8.setBounds(269, 311, 75, 75);
		panel.add(button_8);
		
		JButton button_9 = new JButton("◼︎");
		button_9.setForeground(Color.YELLOW);
		button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_9.setBackground(Color.YELLOW);
		button_9.setBounds(376, 311, 75, 75);
		panel.add(button_9);
		
		JButton button_10 = new JButton("◼︎");
		button_10.setForeground(Color.YELLOW);
		button_10.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_10.setBackground(Color.YELLOW);
		button_10.setBounds(481, 311, 75, 75);
		panel.add(button_10);
		
		JButton button_11 = new JButton("◼︎");
		button_11.setForeground(Color.YELLOW);
		button_11.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_11.setBackground(Color.YELLOW);
		button_11.setBounds(577, 311, 75, 75);
		panel.add(button_11);
		
		JButton button_12 = new JButton("◼︎");
		button_12.setForeground(Color.YELLOW);
		button_12.setFont(new Font("Lucida Grande", Font.PLAIN, 63));
		button_12.setBackground(Color.YELLOW);
		button_12.setBounds(664, 311, 75, 75);
		panel.add(button_12);
	}
}
