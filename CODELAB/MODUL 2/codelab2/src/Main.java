import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RekeningBank rekening1 = new RekeningBank("202410370110502", "Bayhaqy", 100000);
        RekeningBank rekening2 = new RekeningBank("202410370110508", "Nanda gace", 200000);

        while (true) {
            System.out.println("============= Menu Transaksi ===========");
            System.out.println("1. Setor Uang\n2. Tarik Tunai\n3. Transfer Uang\n4. Keluar");
            System.out.print("Pilihan transaksi: ");
            int pilihan = input.nextInt();

            if (pilihan == 4) break;

            if (pilihan == 3) {
                System.out.print("Pilih Rekening Pengirim (1) " + rekening1.narek + " / (2) " + rekening2.narek + ": ");
                int pengirimChoice = input.nextInt();
                if (pengirimChoice != 1 && pengirimChoice != 2) {
                    System.out.println("Pilihan rekening pengirim tidak valid.");
                    continue;
                }
                RekeningBank pengirim = (pengirimChoice == 1) ? rekening1 : rekening2;

                System.out.print("Pilih Rekening Penerima (1) " + rekening1.narek + " / (2) " + rekening2.narek + ": ");
                int penerimaChoice = input.nextInt();
                if (penerimaChoice != 1 && penerimaChoice != 2) {
                    System.out.println("Pilihan rekening penerima tidak valid.");
                    continue;
                }
                RekeningBank penerima = (penerimaChoice == 1) ? rekening1 : rekening2;

                System.out.print("Masukkan Nominal Transfer: ");
                double transfer = input.nextDouble();
                if (pengirim.saldo >= transfer) {
                    pengirim.tarikUang(transfer);
                    penerima.setorUang(transfer);
                    System.out.println("Transfer Berhasil dari " + pengirim.narek + " ke " + penerima.narek + ".");
                } else {
                    System.out.println("Saldo tidak mencukupi untuk transfer.");
                }
            } else {
                System.out.print("Pilih Rekening (1) " + rekening1.narek + " / (2) " + rekening2.narek + ": ");
                int choice = input.nextInt();
                if (choice != 1 && choice != 2) {
                    System.out.println("Pilihan rekening tidak valid.");
                    continue;
                }
                RekeningBank rekening = (choice == 1) ? rekening1 : rekening2;

                if (pilihan == 1) {
                    System.out.print("Masukkan Nominal Setor: ");
                    rekening.setorUang(input.nextDouble());
                } else if (pilihan == 2) {
                    System.out.print("Masukkan Nominal Tarik: ");
                    rekening.tarikUang(input.nextDouble());
                } else {
                    System.out.println("Pilihan Transaksi Tidak Valid");
                }
            }
        }

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
        input.close();
    }
}
