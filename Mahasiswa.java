import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void printNama() {
        System.out.println("Nama: " + nama);
    }

    public void printNim() {
        System.out.println("NIM: " + nim);
    }

    public void printJurusan() {
        System.out.println("Jurusan: " + jurusan);
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Teknologi Malang"); // Ubah nama universitas di sini
    }

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama + ", NIM: " + nim + ", Jurusan: " + jurusan);
    }
}
