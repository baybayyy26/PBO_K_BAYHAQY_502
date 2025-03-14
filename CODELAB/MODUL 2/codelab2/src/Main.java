
// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank();
        rekening1.norek = "202410370110502";
        rekening1.narek = "Bayhaqy";
        rekening1.saldo = 100000;

        RekeningBank rekening2 = new RekeningBank();
        rekening2.norek = "202410370110508";
        rekening2.narek = "Nanda Gace";
        rekening2.saldo = 200000;

        System.out.println("\n=== Info Awal Rekening ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.println("\n=== Transaksi Setor Uang ===");
        rekening1.setorUang(50000);

        System.out.println("\n=== Transaksi Tarik Uang ===");
        rekening2.tarikUang(100000);

        System.out.println("\n=== Transaksi Transfer Uang ===");
        rekening1.transferUang(rekening2, 30000);

        System.out.println("\n=== Info Akhir Rekening ===");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
