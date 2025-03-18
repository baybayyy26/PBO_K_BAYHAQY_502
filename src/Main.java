public class Main {
    public static void main(String[] args) {
        // 1. Membuat tiga objek:
        //    a. KarakterGame bernama "Karakter Umum" dengan 100 kesehatan.
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        //    b. Pahlawan bernama "Brimstone" dengan 150 kesehatan.
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        //    c. Musuh bernama "Viper" dengan 200 kesehatan.
        Musuh viper = new Musuh("Viper", 200);

        // 2. Menampilkan status awal kesehatan Pahlawan dan Musuh.
        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());
        System.out.println();

        // 3. Memanggil method serang() untuk mensimulasikan pertarungan:
        //    a. Brimstone menyerang Viper menggunakan Orbital Strike.
        brimstone.serang(viper);
        System.out.println();

        //    b. Viper menyerang Brimstone menggunakan Snake Bite.
        viper.serang(brimstone);
    }
}

//Lalu di kelas Main ini, program kita mulai berjalan. Dalam metode main(), kita membuat tiga objek, yaitu:

//1. KarakterGame: Objek ini dinamai "Karakter Umum" dengan 100 poin kesehatan. Objek ini bisa kita anggap sebagai objek dasar yang tidak memiliki aksi serangan khusus.
//2. Pahlawan: Objek ini bernama "Brimstone" dengan 150 poin kesehatan. Brimstone adalah pahlawan yang memiliki kemampuan serangan khusus menggunakan Orbital Strike.
//3. Musuh: Objek ini bernama "Viper" dengan 200 poin kesehatan. Viper adalah musuh yang memiliki serangan khusus dengan teknik Snake Bite.

//Setelah objek-objek tersebut dibuat, program menampilkan status awal dari Brimstone dan Viper, sehingga kita bisa melihat kesehatan awal mereka.
//Selanjutnya, program mensimulasikan pertarungan dengan cara:

//1. Brimstone menyerang Viper: Brimstone, sebagai pahlawan, menggunakan metode serang() yang di-overridden untuk menyerang Viper dengan menggunakan Orbital Strike.
//                              Akibatnya, kesehatan Viper berkurang sebanyak 20 poin dan pesan serangan serta kesehatan terbaru Viper ditampilkan.
//2. Viper menyerang Brimstone: Setelah itu, Viper, sebagai musuh, menyerang Brimstone dengan metode serang() miliknya yang juga di-overridden.
//                              Kali ini, Viper menggunakan Snake Bite yang mengurangi kesehatan Brimstone sebanyak 15 poin, dan informasi kesehatan Brimstone diperbarui dan ditampilkan.

//                                                                                      KESIMPULAN:

//Secara keseluruhan, program ini tidak hanya memberikan contoh bagaimana cara menerapkan konsep inheritance dan method overriding dalam Java,
//tetapi juga menggambarkan perbedaan fungsi dari masing-masing subclass.
//Dengan menggunakan ini, kita bisa melihat bagaimana satu kelas dasar (KarakterGame) dapat di-extend untuk membuat karakter yang memiliki perilaku serangan berbeda (Pahlawan dan Musuh).
