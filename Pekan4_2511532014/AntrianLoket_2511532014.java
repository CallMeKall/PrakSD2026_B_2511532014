package Pekan4_2511532014;

import java.util.Scanner;

public class AntrianLoket_2511532014 {

    String queue_2014[];
    int front_2014, rear_2014, max_2014;

    // Constructor
    public AntrianLoket_2511532014(int max_2014) {
        this.max_2014 = max_2014;
        queue_2014 = new String[max_2014];
        front_2014 = -1;
        rear_2014 = -1;
    }

    // Cek kosong
    public boolean isEmpty_2014() {
        return front_2014 == -1;
    }

    // Cek penuh
    public boolean isFull_2014() {
        return rear_2014 == max_2014 - 1;
    }

    // Enqueue
    public void enqueue_2014(String data_2014) {
        if (isFull_2014()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_2014()) {
                front_2014 = 0;
            }
            rear_2014++;
            queue_2014[rear_2014] = data_2014;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Dequeue
    public void dequeue_2014() {
        if (isEmpty_2014()) {
            System.out.println("Antrian kosong!");
        } else {
            String data_2014 = queue_2014[front_2014];
            System.out.println(data_2014 + " telah dilayani");

            if (front_2014 == rear_2014) {
                front_2014 = rear_2014 = -1;
            } else {
                front_2014++;
            }
        }
    }

    // Display
    public void display_2014() {
        if (isEmpty_2014()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int no_2014 = 1;
            for (int i_2014 = front_2014; i_2014 <= rear_2014; i_2014++) {
                System.out.println(no_2014 + ". " + queue_2014[i_2014]);
                no_2014++;
            }
        }
    }

    // Reverse
    public void reverse_2014() {
        if (isEmpty_2014()) {
            System.out.println("Antrian kosong!");
        } else {
            int start_2014 = front_2014;
            int end_2014 = rear_2014;

            while (start_2014 < end_2014) {
                String temp_2014 = queue_2014[start_2014];
                queue_2014[start_2014] = queue_2014[end_2014];
                queue_2014[end_2014] = temp_2014;

                start_2014++;
                end_2014--;
            }

            System.out.println("Antrian berhasil dibalik!");
        }
    }

    // Main Program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AntrianLoket_2511532014 antrian_2014 = new AntrianLoket_2511532014(10);

        int pilihan_2014;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_2014 = input.nextInt();
            input.nextLine();

            switch (pilihan_2014) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_2014 = input.nextLine();
                    antrian_2014.enqueue_2014(nama_2014);
                    break;

                case 2:
                    antrian_2014.dequeue_2014();
                    break;

                case 3:
                    antrian_2014.display_2014();
                    break;

                case 4:
                    antrian_2014.reverse_2014();
                    antrian_2014.display_2014();
                    break;

                case 5:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan_2014 != 5);

        input.close();
    }
}