import java.util.Scanner; // Import Scanner buat input user

public class Main {
    public static void main(String[] args) {
        // Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan login ke user
        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");

        int pilihan = scanner.nextInt(); // Baca input pilihan
        scanner.nextLine(); // Buat konsumsi newline biar nggak ganggu input selanjutnya

        // Percabangan untuk menentukan login sebagai Admin atau Mahasiswa
        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();

            // Cek apakah username dan password sesuai dengan yang seharusnya
            if (username.equals("Admin502") && password.equals("Password502")) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM Mahasiswa: ");
            String nim = scanner.nextLine();

            // Cek apakah Nama dan NIM sesuai
            if (nama.equals("ADITIYA AL BAYHAQY") && nim.equals("202410370110502")) {
                System.out.println("Login Mahasiswa berhasil!  ");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            // Kalau user salah input, muncul pesan ini
            System.out.println("Pilihan tidak valid.");
        }

        // Tutup scanner setelah selesai
        scanner.close();
    }
}
