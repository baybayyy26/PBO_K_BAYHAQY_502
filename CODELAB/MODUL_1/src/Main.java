// Import library yang dibutuhkan
import java.util.Scanner; // Untuk input dari user
import java.time.LocalDate; // Untuk mendapatkan tahun saat ini

public class Main { // Nama kelas harus "Main" biar sesuai struktur IntelliJ
    public static void main(String[] args) {
        // Buat Scanner untuk baca input dari user
        Scanner scanner = new Scanner(System.in);

        // === Ambil input dari pengguna ===
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine(); // Baca nama (String)

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0); // Baca satu karakter saja

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt(); // Baca tahun lahir (int)

        // === Hitung umur berdasarkan tahun lahir ===
        int tahunSekarang = LocalDate.now().getYear(); // Ambil tahun saat ini otomatis
        int umur = tahunSekarang - tahunLahir; // Hitung umur

        // === Cek jenis kelamin ===
        String jenisKelaminString = ""; // Variabel untuk menyimpan jenis kelamin yang sudah dikonversi
        if (jenisKelamin == 'L' || jenisKelamin == 'l') { // Jika input 'L' atau 'l'
            jenisKelaminString = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') { // Jika input 'P' atau 'p'
            jenisKelaminString = "Perempuan";
        } else {
            jenisKelaminString = "Tidak Valid"; // Kalau inputnya aneh-aneh, kasih tanda tidak valid
        }

        // === Tampilkan output ===
        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminString);
        System.out.println("Umur: " + umur + " tahun");

        // Tutup Scanner biar nggak boros resource
        scanner.close();
    }
}
