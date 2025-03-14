import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hewan hwn1 = new Hewan(); //untuk membuat object hwn1 dan hwn2
        Hewan hwn2 = new Hewan();

        hwn1.inputDataHewan(input); //untuk memanggil method di class Hewan untuk meminta input dari user dari objek hwn1
        System.out.println();
        hwn2.inputDataHewan(input); //untuk memanggil method di class Hewan untuk meminta input dari user dari objek hwn2

        System.out.println("\n======== Info Hewan =======");
        hwn1.tampilkanInfo(); //untuk memanggil method di class hewan untuk menampilkan data dari hwn1
        hwn2.tampilkanInfo();//untuk memanggil method di class hewan untuk menampilkan data dari hwn2
        input.close();
    }
}