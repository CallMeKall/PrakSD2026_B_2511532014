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

import java.util.LinkedList;
import java.util.Queue;

public class MergeSortGUI_2511532014 extends JFrame {

	private static final long serialVersionUID = 1L;
	private int[] array_2014;
	private JLabel[] labelArray_2014;
	private JButton stepButton_2014, resetButton_2014, setButton_2014;
	private JTextField inputField_2014;
	private JPanel panelArray_2014;
	private JTextArea stepArea_2014;

	private Queue<int[]> mergeQueue_2014 = new LinkedList<>();
	private int stepCount_2014 = 1;
	private boolean isMerging_2014 = false;
	private boolean copying_2014 = false;

	private int[] temp_2014;
	private int left_2014, mid_2014, right_2014;
	private int i_2014, j_2014, k_2014;

	public MergeSortGUI_2511532014() {
		setTitle("Merge Sort Langkah per Langkah");
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
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka dengan koma!",
					"Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		labelArray_2014 = new JLabel[array_2014.length];
		panelArray_2014.removeAll();
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

		mergeQueue_2014.clear();
		generateMergeSteps_2014(0, array_2014.length - 1);
		stepButton_2014.setEnabled(true);
		stepArea_2014.setText("");
		stepCount_2014 = 1;
		isMerging_2014 = false;

		panelArray_2014.revalidate();
		panelArray_2014.repaint();
	}

	private void generateMergeSteps_2014(int left, int right) {
		if (left >= right) return;
		int mid = (left + right) / 2;
		generateMergeSteps_2014(left, mid);
		generateMergeSteps_2014(mid + 1, right);
		mergeQueue_2014.add(new int[]{left, mid, right});
	}

	private void performStep_2014() {
		resetHighlights_2014();

		if (!isMerging_2014 && !mergeQueue_2014.isEmpty()) {
			int[] range_2014 = mergeQueue_2014.poll();
			left_2014 = range_2014[0];
			mid_2014 = range_2014[1];
			right_2014 = range_2014[2];
			temp_2014 = new int[right_2014 - left_2014 + 1];
			i_2014 = left_2014;
			j_2014 = mid_2014 + 1;
			k_2014 = 0;
			copying_2014 = false;
			isMerging_2014 = true;
			stepArea_2014.append("Langkah " + stepCount_2014++ +
					": Mulai merge dari " + left_2014 + " ke " + right_2014 + "\n");
			return;
		}

		if (isMerging_2014 && !copying_2014) {
			if (i_2014 <= mid_2014 && j_2014 <= right_2014) {
				labelArray_2014[i_2014].setBackground(Color.CYAN);
				labelArray_2014[j_2014].setBackground(Color.CYAN);
				if (array_2014[i_2014] <= array_2014[j_2014]) {
					temp_2014[k_2014++] = array_2014[i_2014++];
				} else {
					temp_2014[k_2014++] = array_2014[j_2014++];
				}
				stepArea_2014.append("Langkah " + stepCount_2014++ + ": Bandingkan dan salin elemen\n");
				return;
			} else if (i_2014 <= mid_2014) {
				temp_2014[k_2014++] = array_2014[i_2014++];
				stepArea_2014.append("Langkah " + stepCount_2014++ + ": Salin sisa kiri\n");
				return;
			} else if (j_2014 <= right_2014) {
				temp_2014[k_2014++] = array_2014[j_2014++];
				stepArea_2014.append("Langkah " + stepCount_2014++ + ": Salin sisa kanan\n");
				return;
			} else {
				copying_2014 = true;
				k_2014 = 0;
				return;
			}
		}

		if (copying_2014 && k_2014 < temp_2014.length) {
			array_2014[left_2014 + k_2014] = temp_2014[k_2014];
			labelArray_2014[left_2014 + k_2014].setText(String.valueOf(temp_2014[k_2014]));
			labelArray_2014[left_2014 + k_2014].setBackground(Color.GREEN);
			k_2014++;
			stepArea_2014.append("Langkah " + stepCount_2014++ + ": Tempelkan ke array utama\n");
			return;
		}

		if (copying_2014 && k_2014 == temp_2014.length) {
			isMerging_2014 = false;
			copying_2014 = false;
		}

		if (mergeQueue_2014.isEmpty() && !isMerging_2014) {
			stepArea_2014.append("Selesai.\n");
			stepButton_2014.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
		}
	}

	private void resetHighlights_2014() {
		if (labelArray_2014 == null) return;
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
		mergeQueue_2014.clear();
		isMerging_2014 = false;
		stepCount_2014 = 1;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			MergeSortGUI_2511532014 gui = new MergeSortGUI_2511532014();
			gui.setVisible(true);
		});
	}
}