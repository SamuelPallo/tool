package test.test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.BorderLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class window {

	private JFrame frame;
	private JFileChooser fc;
	private File excelFile1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window window = new window();
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
	public window() {
		fc = new JFileChooser();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Open file 1");
		btnNewButton.addActionListener(buttonFile1);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(327, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(btnNewButton)
					.addContainerGap(219, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
	}

	private ActionListener buttonFile1 = new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			int returnVal = fc.showOpenDialog(null);
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel files", "xls", "xlsx", "xlsm");
			fc.addChoosableFileFilter(filter);
			
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				excelFile1 = fc.getSelectedFile();
				System.out.println(excelFile1.getName());
			}
		}
	};
	
	
	public JFrame getFrame() {
		return frame;
	}
}
