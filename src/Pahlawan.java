public class Pahlawan extends KarakterGame {

    // 1. Mewarisi KarakterGame dan menggunakan super() dalam constructor
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // 2. Meng-override method serang(KarakterGame target) dengan efek:
    //    a. Menampilkan pesan: "<nama Pahlawan> menyerang <nama target> menggunakan Orbital Strike!"
    //    b. Mengurangi 20 poin kesehatan dari target.
    //    c. Menampilkan kesehatan terbaru target.
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

//Nah, Selanjutnya kita punya dua kelas turunan, yaitu Pahlawan dan Musuh, yang mewarisi semua sifat dan metode dari KarakterGame.
//Di sinilah konsep inheritance dan method overriding mulai bermain.

//Di kelas Pahlawan, yang merupakan subclass dari KarakterGame, kita menggunakan kata kunci extends untuk mewarisi semua atribut dan metode dari kelas induk.
//Saat membuat objek dari kelas Pahlawan, kita menggunakan constructor yang memanggil super() agar nilai nama dan
//kesehatan langsung diinisialisasi sesuai dengan apa yang sudah didefinisikan di kelas KarakterGame.

//yang membedakan Pahlawan adalah metode serang()-nya. Di sini, kita meng-override (menimpa) metode yang ada pada superclass.
//Pada metode ini, ketika seorang Pahlawan menyerang target, program akan menampilkan pesan dengan format:
//("<nama Pahlawan> menyerang <nama target> menggunakan Orbital Strike!")
//Selanjutnya, program mengurangi 20 poin kesehatan dari target dan kemudian menampilkan kesehatan terbaru target.
//Dengan begitu, aksi serangan Pahl
// awan bukan hanya sekadar menampilkan pesan, melainkan juga mempengaruhi kondisi kesehatan karakter lain.