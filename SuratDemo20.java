import java.util.Scanner;
public class SuratDemo20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat20 stack = new StackSurat20(10);
        int pilih;

        do {
            System.out.println("\n=== Menu Pengelolaan Surat Izin Mahasiswa ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt(); scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat     : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas         : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = scan.nextInt(); scan.nextLine();

                    Surat20 surat = new Surat20(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat20 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat sedang diproses:");
                        diproses.tampil();
                    }
                    break;
                case 3:
                    Surat20 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        terakhir.tampil();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat ditemukan.");
                    } else {
                        System.out.println("Surat tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);
        scan.close();
    }
}
