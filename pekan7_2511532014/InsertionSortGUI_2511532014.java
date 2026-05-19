package pekan7_2511532014;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class InsertionSortGUI_2511532014 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2014;
	private JLabel[] labelArray_2014;
	private JButton stepButton_2014, resetButton_2014, setButton_2014;
	private JTextField inputField_2014;
	private JPanel panelArray_2014;
	private JTextArea stepArea_2014;
	
	private int i_2014 = 1, j_2014;
	private boolean sorting_2014 = false;
	private int stepCount_2014 = 1;

	/**
	 * Create the frame.
	 */
	public InsertionSortGUI_2511532014() {
		setTitle("Insertin sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		//panel input
		JPanel inputPanel_2014 = new JPanel(new FlowLayout());
		inputField_2014 = new JTextField(30);
		setButton_2014 = new JButton("set Array");
		inputPanel_2014.add(new JLabel ("Masukan angka (pisahkan dengan koma)"));
		inputPanel_2014.add(inputField_2014);
		inputPanel_2014.add(setButton_2014);
		
		//panel array visual
		panelArray_2014 = new JPanel();
		panelArray_2014.setLayout(new FlowLayout());
		
		// panel kontrol
		JPanel controlPanel_2014 = new JPanel();
		stepButton_2014 = new JButton("Langkah selanjutnya");
		resetButton_2014 = new JButton("Reset");
		controlPanel_2014.add(stepButton_2014);
		controlPanel_2014.add(resetButton_2014);
		
		// area text untuk log langkah langkah
		stepArea_2014 = new JTextArea(8, 60);
		stepArea_2014.setEditable(false);
		stepArea_2014.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_2014 = new JScrollPane(stepArea_2014);
		
		// tambahkan panel ke frame
		add(inputPanel_2014, BorderLayout.NORTH);
		add(panelArray_2014, BorderLayout.CENTER);
		add(controlPanel_2014, BorderLayout.SOUTH);
		add(scrollPane_2014, BorderLayout.EAST);
		
		// event set array
		setButton_2014.addActionListener(e -> setArrayFromInput_2014());
		
		// event selanjutnya
		stepButton_2014.addActionListener(e -> performStep_2014());
		
		// event reset
		resetButton_2014.addActionListener(e -> reset_2014());
	}
	
	private void setArrayFromInput_2014() {
		String text_2014 = inputField_2014.getText().trim();
		if (text_2014.isEmpty()) return;
		String[] parts_2014 = text_2014.split(",");
		array_2014 = new int[parts_2014.length];
		try {
			for (int k_2014 = 0; k_2014 < parts_2014.length; k_2014++) {
				array_2014[k_2014] = Integer.parseInt(parts_2014[k_2014].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan " 
					+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i_2014 = 1;
		sorting_2014 = true;
		stepButton_2014.setEnabled(true);
		stepArea_2014.setText("");
		panelArray_2014.removeAll();
		labelArray_2014 = new JLabel[array_2014.length];
		for (int k_2014 = 0; k_2014 < array_2014.length; k_2014++) {
			labelArray_2014[k_2014] = new JLabel(String.valueOf(array_2014[k_2014]));
			labelArray_2014[k_2014].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_2014[k_2014].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2014[k_2014].setPreferredSize(new Dimension(50, 50));
			labelArray_2014[k_2014].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2014.add(labelArray_2014[k_2014]);
		}
		panelArray_2014.revalidate();
		panelArray_2014.repaint();
	}
	
	private void performStep_2014() {
		if (i_2014 < array_2014.length && sorting_2014) {
			int key_2014 = array_2014[i_2014];
			j_2014 = i_2014 - 1;
			
			StringBuilder stepLog_2014 = new StringBuilder();
			stepLog_2014.append("Langkah ").append(stepCount_2014).
			append(": Memasukkan ").append(key_2014).append("\n");
			
			while(j_2014 >= 0 && array_2014[j_2014] > key_2014) {
				array_2014[j_2014 + 1] = array_2014[j_2014];
				j_2014--;
			}
			array_2014[j_2014 + 1] = key_2014;
			
			UpdateLabels_2014();
			stepLog_2014.append("Hasil: ").append(arrayToString(array_2014)).append("\n\n");
			stepArea_2014.append(stepLog_2014.toString());
			
			i_2014++;
			stepCount_2014++;
			
			if (i_2014 == array_2014.length) {
				sorting_2014 = false;
				stepButton_2014.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}
	
	private void UpdateLabels_2014() {
		for (int k_2014 = 0; k_2014 < array_2014.length; k_2014++) {
			labelArray_2014[k_2014].setText(String.valueOf(array_2014[k_2014]));
		}
	}
	
	private void reset_2014() {
		inputField_2014.setText("");
		panelArray_2014.removeAll();
		panelArray_2014.revalidate();
		panelArray_2014.repaint();
		stepArea_2014.setText("");
		stepButton_2014.setEnabled(false);
		sorting_2014 = false;
		i_2014 = 1;
		stepCount_2014 = 1;
	}
	private String arrayToString(int[] arr_2014) {
		StringBuilder sb_2014 = new StringBuilder();
		for (int k_2014 = 0; k_2014 < arr_2014.length; k_2014++) {
			sb_2014.append(arr_2014[k_2014]);
			if (k_2014 < arr_2014.length - 1) sb_2014.append(", ");
		}
		return sb_2014.toString();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			InsertionSortGUI_2511532014 gui = new InsertionSortGUI_2511532014();
			gui.setVisible(true);
		});
	}

}
