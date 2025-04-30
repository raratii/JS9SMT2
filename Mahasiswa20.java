public class Mahasiswa20 {
    String nim, nama, kelas;
    int nilai;

    public Mahasiswa20(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.nilai = -1; 
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai : " + nilai);
    }
}
