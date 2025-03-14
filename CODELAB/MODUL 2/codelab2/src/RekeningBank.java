public class RekeningBank {
        // Attribute
        String norek;
        String narek;
        double saldo;

        // Method untuk menampilkan informasi rekening
        void tampilkanInfo() {
            System.out.println("Nomor Rekening: " + norek);
            System.out.println("Nama Pemilik: " + narek);
            System.out.println("Saldo: Rp" + saldo);
        }

        // Method untuk setor uang
        void setorUang(double jumlah) {
            if (jumlah > 0) {
                saldo += jumlah;
                System.out.println("Setoran berhasil! Saldo sekarang: Rp" + saldo);
            } else {
                System.out.println("Jumlah setoran tidak valid.");
            }
        }

        // Method untuk tarik uang
        void tarikUang(double jumlah) {
            if (jumlah > 0 && saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Penarikan berhasil! Saldo sekarang: Rp" + saldo);
            } else {
                System.out.println("Saldo tidak cukup atau jumlah tidak valid.");
            }
        }

        // Method untuk transfer uang
        void transferUang(RekeningBank penerima, double jumlah) {
            if (jumlah > 0 && saldo >= jumlah) {
                saldo -= jumlah;
                penerima.saldo += jumlah;
                System.out.println("Transfer berhasil!");
            } else {
                System.out.println("Transfer gagal! Saldo tidak mencukupi.");
            }
        }
    }
