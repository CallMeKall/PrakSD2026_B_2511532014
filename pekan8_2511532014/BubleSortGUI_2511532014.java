package pekan8_2511532014;

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

public class BubleSortGUI_2511532014 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2014;
	private JLabel[] labelArray_2014;
	private JButton stepButton_2014, resetButton_2014, setButton_2014;
	private JTextField inputField_2014;
	private JPanel panelArray_2014;
	private JTextArea stepArea_2014;

	private int i_2014 = 0, j_2014 = 0;
	private boolean sorting_2014 = false;
	private int stepCount_2014 = 1;

	public BubleSortGUI_2511532014() {
		setTitle("Buble Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// panel input
		JPanel inputPanel_2014 = new JPanel(new FlowLayout());
		inputField_2014 = new JTextField(30);
		setButton_2014 = new JButton("Set Array");
		inputPanel_2014.add(new JLabel("Masukan angka (pisahkan dengan koma)"));
		inputPanel_2014.add(inputField_2014);
		inputPanel_2014.add(setButton_2014);

		// panel array visual
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
			for (int k = 0; k < parts_2014.length; k++) {
				array_2014[k] = Integer.parseInt(parts_2014[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
					+ "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		i_2014 = 0;
		j_2014 = 0;
		stepCount_2014 = 1;
		sorting_2014 = true;
		stepButton_2014.setEnabled(true);
		stepArea_2014.setText("");
		panelArray_2014.removeAll();
		labelArray_2014 = new JLabel[array_2014.length];
		for (int k = 0; k < array_2014.length; k++) {
			labelArray_2014[k] = new JLabel(String.valueOf(array_2014[k]));
			labelArray_2014[k].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_2014[k].setOpaque(true);
			labelArray_2014[k].setBackground(Color.WHITE);
			labelArray_2014[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2014[k].setPreferredSize(new Dimension(50, 50));
			labelArray_2014[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2014.add(labelArray_2014[k]);
		}

		panelArray_2014.revalidate();
		panelArray_2014.repaint();
	}

	private void performStep_2014() {
		if (!sorting_2014 || i_2014 >= array_2014.length - 1) {
			sorting_2014 = false;
			stepButton_2014.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
			return;
		}

		resetHighlights_2014();
		StringBuilder stepLog_2014 = new StringBuilder();

		labelArray_2014[j_2014].setBackground(Color.CYAN);
		labelArray_2014[j_2014 + 1].setBackground(Color.CYAN);

		if (array_2014[j_2014] > array_2014[j_2014 + 1]) {
			// Swap
			int temp_2014 = array_2014[j_2014];
			array_2014[j_2014] = array_2014[j_2014 + 1];
			array_2014[j_2014 + 1] = temp_2014;
			labelArray_2014[j_2014].setBackground(Color.RED);
			labelArray_2014[j_2014 + 1].setBackground(Color.RED);
			stepLog_2014.append("Langkah ").append(stepCount_2014).append(": Menukar elemen ke-")
					.append(j_2014).append(" (").append(array_2014[j_2014 + 1]).append(") dengan ke-")
					.append(j_2014 + 1).append(" (").append(array_2014[j_2014]).append(")\n");
		} else {
			stepLog_2014.append("Langkah ").append(stepCount_2014).append(": Tidak ada pertukaran antara ke-")
					.append(j_2014).append(" dan ke-").append(j_2014 + 1).append("\n");
		}

		stepLog_2014.append("Hasil: ").append(arrayToString_2014(array_2014)).append("\n\n");
		stepArea_2014.append(stepLog_2014.toString());
		updateLabels_2014();

		j_2014++;
		if (j_2014 >= array_2014.length - i_2014 - 1) {
			j_2014 = 0;
			i_2014++;
		}
		stepCount_2014++;

		if (i_2014 >= array_2014.length - 1) {
			sorting_2014 = false;
			stepButton_2014.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
		}
	}

	private void updateLabels_2014() {
		for (int k = 0; k < array_2014.length; k++) {
			labelArray_2014[k].setText(String.valueOf(array_2014[k]));
		}
	}

	private void resetHighlights_2014() {
		for (JLabel label : labelArray_2014) {
			label.setBackground(Color.WHITE);
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
		i_2014 = 0;
		j_2014 = 0;
		stepCount_2014 = 1;
	}

	private String arrayToString_2014(int[] arr) {
		StringBuilder sb_2014 = new StringBuilder();
		for (int k = 0; k < arr.length; k++) {
			sb_2014.append(arr[k]);
			if (k < arr.length - 1) sb_2014.append(", ");
		}
		return sb_2014.toString();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			BubleSortGUI_2511532014 gui = new BubleSortGUI_2511532014();
			gui.setVisible(true);
		});
	}
}