public class Musuh extends KarakterGame {

    // 1. Mewarisi KarakterGame dan menggunakan super() dalam constructor
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // 2. Meng-override method serang(KarakterGame target) dengan efek:
    //    a. Menampilkan pesan: "<nama Musuh> menyerang <nama target> menggunakan Snake Bite!"
    //    b. Mengurangi 15 poin kesehatan dari target.
    //    c. Menampilkan kesehatan terbaru target.
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

//Nah, sebenernya sama halnya dengan Pahlawan, kelas Musuh juga merupakan subclass dari KarakterGame.
// Di kelas ini, kita juga menggunakan super() pada constructor untuk menginisialisasi nama dan kesehatan.

//Namun, perbedaan ada pada metode serang() yang di-overridden. Untuk kelas Musuh, ketika menyerang, pesan yang ditampilkan adalah:
//("<nama Musuh> menyerang <nama target> menggunakan Snake Bite!")
//Selain itu, serangan dari Musuh mengurangi 15 poin kesehatan dari target, dan kemudian kesehatan terbaru dari target ditampilkan.
//Ini menunjukkan bahwa setiap jenis karakter memiliki gaya serangan dan dampak yang berbeda, meskipun mereka semua mewarisi sifat dasar dari kelas KarakterGame.