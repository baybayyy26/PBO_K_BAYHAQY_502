public class RekeningBank {
    String narek;
    String norek;
    double saldo;

    // Konstruktor untuk inisialisasi data saat objek dibuat
    public RekeningBank(String norek, String narek, double saldo) {
        this.norek = norek;
        this.narek = narek;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("========== Info Saldo ==========");
        System.out.println("Nomor Rekening: " + norek);
        System.out.println("Nama Rekening: " + narek);
        System.out.println("Saldo: Rp. " + saldo);
    }

    void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println(narek + " menyetor Rp. " + jumlah + " Saldo sekarang Rp. " + saldo);
        }
    }

    void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(narek + " menarik Rp. " + jumlah + " (Berhasil) Saldo saat ini Rp. " + saldo);
        } else {
            System.out.println(narek + " menarik Rp. " + jumlah + " (Gagal) Saldo sekarang Rp. " + saldo);
        }
    }
}
