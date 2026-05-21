package pekan7_2511532014;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class sortingGUI_2511532014 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNama_2014;
	private JTextField txtNim_2014;
	private JTextField txtProdi_2014;
	
	private JButton btnTambah_2014;
	private JButton btnHapus_2014;
	private JButton btnSorting_2014;
	
	private JComboBox<String> comboSorting_2014;
	
	private JTable table_2014;
	private DefaultTableModel model_2014;
	
	private JTextArea areaProses_2014;
	
	private ArrayList<Mahasiswa_2511532014> listMahasiswa_2014;

	/**
	 * Create the frame.
	 */
	public sortingGUI_2511532014() {
		setTitle("Sorting Mahasiswa - 2511532014");
		setSize(900, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		listMahasiswa_2014 = new ArrayList<>();
		
		// judul
		JLabel lblJudul_2014 = new JLabel("PROGRAM SORTING DATA MAHASISWA", SwingConstants.CENTER);
		
		lblJudul_2014.setFont(new Font("Arial", Font.BOLD, 22));
		lblJudul_2014.setOpaque(true);
		lblJudul_2014.setBackground(new Color(30, 144, 255));
		lblJudul_2014.setForeground(Color.WHITE);
		lblJudul_2014.setPreferredSize(new Dimension(100, 50));
		
		add(lblJudul_2014, BorderLayout.NORTH);
        
        //Panel input
		JPanel panelInput_2014 = new JPanel(new GridLayout(5, 2, 10, 10));
		panelInput_2014.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));
		
		panelInput_2014.add(new JLabel("Nama Mahasiswa"));
		txtNama_2014 = new JTextField();
		panelInput_2014.add(txtNama_2014);
		
		panelInput_2014.add(new JLabel("NIM"));
		txtNim_2014 = new JTextField();
		panelInput_2014.add(txtNim_2014);
		
		panelInput_2014.add(new JLabel("Program Studi"));
		txtProdi_2014 = new JTextField();
		panelInput_2014.add(txtProdi_2014);
		
		panelInput_2014.add(new JLabel("Pilih Sorting"));
		comboSorting_2014 = new JComboBox<>();
		comboSorting_2014.addItem("Insertion Sort");
		comboSorting_2014.addItem("Selection Sort");
		comboSorting_2014.addItem("Bubble Sort");
		
		panelInput_2014.add(comboSorting_2014);

		btnTambah_2014 = new JButton("Tambah Data");
		btnHapus_2014 = new JButton("Hapus Data");
		btnSorting_2014 = new JButton("Mulai Sorting");

		panelInput_2014.add(btnTambah_2014);
		panelInput_2014.add(btnHapus_2014);
		
		add(panelInput_2014, BorderLayout.WEST);
		
		// Tabel
		model_2014 = new DefaultTableModel();
		model_2014.addColumn("Nama");
		model_2014.addColumn("NIM");
		model_2014.addColumn("Program Studi");

		table_2014 = new JTable(model_2014);

		// Tabel
		JScrollPane scrollTable_2014 = new JScrollPane(table_2014);
		scrollTable_2014.setBorder(BorderFactory.createTitledBorder("Data Mahasiswa"));

		// Area Proses  ← INI YANG HILANG, tambahkan di sini
		areaProses_2014 = new JTextArea();
		areaProses_2014.setEditable(false);
		areaProses_2014.setFont(new Font("Monospaced", Font.PLAIN, 13));

		JScrollPane scrollArea_2014 = new JScrollPane(areaProses_2014);
		scrollArea_2014.setBorder(BorderFactory.createTitledBorder("Proses Sorting"));

		// Panel Proses
		JPanel panelProses_2014 = new JPanel(new BorderLayout(5, 5));
		panelProses_2014.add(btnSorting_2014, BorderLayout.NORTH);
		panelProses_2014.add(scrollArea_2014, BorderLayout.CENTER); // ← bukan scrollTable!

		// JSplitPane
		JSplitPane splitPane_2014 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scrollTable_2014, panelProses_2014);
		splitPane_2014.setDividerLocation(280);
		splitPane_2014.setResizeWeight(0.55);
		splitPane_2014.setOneTouchExpandable(true);
		add(splitPane_2014, BorderLayout.CENTER);
		
		// Action Button
		btnTambah_2014.addActionListener(e -> tambahData_2014());
		btnHapus_2014.addActionListener(e -> hapusData_2014());
		btnSorting_2014.addActionListener(e -> mulaiSorting_2014());
		
	}
	
	// method tambah data
	private void tambahData_2014() {
		String nama_2014 = txtNama_2014.getText();
		String nim_2014 = txtNim_2014.getText();
		String prodi_2014 = txtProdi_2014.getText();
		if (nama_2014.isEmpty() || nim_2014.isEmpty() || prodi_2014.isEmpty()) {
			JOptionPane.showMessageDialog(this,"Semua data wajib diisi!");
            return;
        }
		Mahasiswa_2511532014 mhs_2014 = new Mahasiswa_2511532014(nama_2014, nim_2014, prodi_2014);
		listMahasiswa_2014.add(mhs_2014);
		model_2014.addRow(new Object[]{nama_2014, nim_2014, prodi_2014});

		txtNama_2014.setText("");
		txtNim_2014.setText("");
		txtProdi_2014.setText("");
	}
	
	// method hapus data
	private void hapusData_2014() {
		int baris_2014 = table_2014.getSelectedRow();
		if (baris_2014 == -1) {
			JOptionPane.showMessageDialog(this, "Pilih data yang ingin dihapus!");
			return;
		}

		listMahasiswa_2014.remove(baris_2014);
		model_2014.removeRow(baris_2014);
		JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
	}
	
	//method sorting
	private void mulaiSorting_2014() {
		areaProses_2014.setText("");
		String pilihan_2014 = comboSorting_2014.getSelectedItem().toString();
		ArrayList<Mahasiswa_2511532014> temp_2014 = new ArrayList<>(listMahasiswa_2014);
		if (pilihan_2014.equals("Insertion Sort")) {
			insertionSort_2014(temp_2014);
		} else if (pilihan_2014.equals("Selection Sort")) {
			selectionSort_2014(temp_2014);
		} else {
			bubbleSort_2014(temp_2014);
	    }
		tampilkanTabel_2014(temp_2014);
	}
	
	//Insertion Sort
	private void insertionSort_2014(ArrayList<Mahasiswa_2511532014> list_2014) {
		areaProses_2014.append("== INSERTION SORT ==\n\n");
		for (int i_2014 = 1; i_2014 < list_2014.size(); i_2014++) {
			Mahasiswa_2511532014 key_2014 = list_2014.get(i_2014);
			int j_2014 = i_2014 - 1;
			while (j_2014 >= 0 && list_2014.get(j_2014).getNama_2014().compareToIgnoreCase(key_2014.getNama_2014()) > 0) {
				list_2014.set(j_2014 + 1,list_2014.get(j_2014));
				j_2014--;
			}
			list_2014.set(j_2014 + 1, key_2014);
			areaProses_2014.append("Langkah " + i_2014 + " : "+ tampilNama_2014(list_2014) + "\n");
		}
	}
	
	// SelectionSort
	private void selectionSort_2014(ArrayList<Mahasiswa_2511532014> list_2014) {
		areaProses_2014.append("=== SELECTION SORT ===\n\n");
		for (int i_2014 = 0; i_2014 < list_2014.size() - 1; i_2014++) {
			int min_2014 = i_2014;
			for (int j_2014 = i_2014 + 1; j_2014 < list_2014.size(); j_2014++) {
				if (list_2014.get(j_2014).getNama_2014().compareToIgnoreCase(list_2014.get(min_2014).getNama_2014()) < 0) {
					min_2014 = j_2014;
				}
			}
			Mahasiswa_2511532014 temp_2014 = list_2014.get(min_2014);
			list_2014.set(min_2014, list_2014.get(i_2014));
			list_2014.set(i_2014, temp_2014);
			areaProses_2014.append("Pass " + (i_2014 + 1) + " : " + tampilNama_2014(list_2014) + "\n");
		}
	}
	
	// BubbleSort
	private void bubbleSort_2014(ArrayList<Mahasiswa_2511532014> list_2014) {
		areaProses_2014.append("=== BUBBLE SORT ===\n\n");
        for (int i_2014 = 0; i_2014 < list_2014.size() - 1; i_2014++) {
        	for (int j_2014 = 0; j_2014 < list_2014.size() - i_2014 - 1; j_2014++) {
        		if (list_2014.get(j_2014).getNama_2014().compareToIgnoreCase(list_2014.get(j_2014 + 1).getNama_2014()) > 0) {
        			Mahasiswa_2511532014 temp_2014 = list_2014.get(j_2014);
        			list_2014.set(j_2014, list_2014.get(j_2014 + 1));
                    list_2014.set(j_2014 + 1, temp_2014);
        		}
            }
        	areaProses_2014.append("Pass " + (i_2014 + 1) + " : " + tampilNama_2014(list_2014) + "\n");
        }
	}
	
	// method tampil nama
	private String tampilNama_2014(ArrayList<Mahasiswa_2511532014> list_2014) {
		String hasil_2014 = "[";
		for (int i_2014 = 0; i_2014 < list_2014.size(); i_2014++) {
			hasil_2014 += list_2014.get(i_2014).getNama_2014();
			if (i_2014 != list_2014.size() - 1) {
				hasil_2014 += ", ";
			}
		}
		hasil_2014 += "]";
		return hasil_2014;
	}
	
	//update table
	private void tampilkanTabel_2014(ArrayList<Mahasiswa_2511532014> list_2014) {
		model_2014.setRowCount(0);
		for (Mahasiswa_2511532014 mhs_2014 : list_2014) {
			model_2014.addRow(new Object[]{mhs_2014.getNama_2014(), mhs_2014.getNim_2014(), mhs_2014.getProdi_2014()});
		}
	}
	
	//main
	public static void main(String[] args) {
		new sortingGUI_2511532014().setVisible(true);
	}

}
