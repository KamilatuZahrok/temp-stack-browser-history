package com.github.affandes.kuliah.pm;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private Stack<String> history = new Stack<>();

    public void browse(String website) {
        history.push(website);
        System.out.println("Membuka website: " + website);
    }

    public void back() {
        if (history.isEmpty()) {
            System.out.println("Tidak ada history untuk kembali.");
        } else {
            System.out.println("Back dari: " + history.pop());
            if (!history.isEmpty())
                System.out.println("Sekarang berada di: " + history.peek());
            else
                System.out.println("History kosong.");
        }
    }

    public void view() {
        if (history.isEmpty()) {
            System.out.println("History masih kosong.");
        } else {
            System.out.println("=== HISTORY TERBARU ===");
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println(history.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Main bh = new Main();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Browse  2. Back  3. View  4. Exit");
            System.out.print("Pilihan: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan website: ");
                bh.browse(sc.nextLine());
            }
            else if (pilih == 2) {
                bh.back();
            }
            else if (pilih == 3) {
                bh.view();
            }
            else if (pilih == 4) {
                System.out.println("Keluar...");
                break;
            }
            else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
//cobacoba