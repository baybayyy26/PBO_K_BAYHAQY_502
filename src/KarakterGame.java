public class KarakterGame {
    // 1. Atribut privat nama dan kesehatan
    private String nama;
    private int kesehatan;

    // 2. Getter dan setter untuk atribut nama dan kesehatan
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // 3. Method serang yang akan di-override oleh subclass
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama());
    }

    // 4. Constructor yang menerima nama dan kesehatan sebagai parameter
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }
}

// PENJELASAN:

//Bayangkan kita sedang membuat sebuah game sederhana di mana terdapat beberapa karakter yang bisa saling bertarung. Dalam game ini,
// setiap karakter memiliki nama dan poin kesehatan.Untuk mengelola hal tersebut, kita membuat sebuah kelas induk bernama KarakterGame.
// Kelas ini menyimpan dua informasi penting, yaitu:

// 1. Atribut Privat:
//nama: Berfungsi untuk menyimpan nama karakter.
//kesehatan: Menyimpan jumlah poin kesehatan karakter tersebut.

// 2. Getter dan Setter:
//Untuk memastikan bahwa data yang tersimpan dapat diakses dan diperbarui dengan benar, kita menyediakan metode getter dan setter untuk kedua atribut tersebut.
//Ini memastikan bahwa jika kita ingin mengetahui atau mengubah nama atau kesehatan, kita harus melalui metode ini sehingga data yang tersimpan tetap terkontrol.

// 3. Method serang():
//Kelas KarakterGame juga memiliki sebuah metode bernama serang() yang dirancang untuk melakukan aksi serangan terhadap karakter lain.
// Metode ini belum memiliki logika serangan khusus karena nantinya akan di-overwrite (ditimpa) oleh kelas turunan.
// Jadi, metode ini hanya mencetak pesan dasar yang menunjukkan bahwa suatu karakter menyerang karakter lain.

// 4. Constructor:
//Saat kita membuat sebuah objek dari kelas KarakterGame, kita harus memberikan nilai untuk nama dan kesehatan.
// Constructor ini bertugas menginisialisasi kedua atribut tersebut sehingga setiap objek yang dibuat sudah memiliki identitas dan kondisi kesehatan awal.
