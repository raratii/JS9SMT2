import java.util.Scanner;

public class MahasiswaDemo20 {
    public static void main(String[] args) {
        StackTugasMahasiswa20 stack = new StackTugasMahasiswa20(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== Menu Stack Mahasiswa ===");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Tugas paling atas");
            System.out.println("4. Tampilkan Daftar tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt(); 
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = scan.nextLine();
                    System.out.print("Nama  : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    Mahasiswa20 mhs = new Mahasiswa20(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa20 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Menilai tugas dari "+ dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa20 lihat = stack.peek();
                    if (lihat != null){
                        System.out.println("Tugas terakhit dikumpulkan oleh " +lihat.nama);
                    }
                    break;
                case 4:
                System.out.println("Daftar semua tugas");
                System.out.println(" Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                System.out.println("Pilihan tidak valid");
                }
        } while (pilih >= 1 && pilih <= 4);
    }
}

