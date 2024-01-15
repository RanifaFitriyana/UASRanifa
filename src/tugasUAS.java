import java.util.Scanner;

public class tugasUAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalLantai = 3;
        int kapasitasPerLantai = 100;

        int[] bebanLantai = {2000, 1800, 1500};


        while (true) {
            System.out.print("Masukkan besarnya kapasitas mesin: ");
            int kapasitasMesin = scanner.nextInt();

            int lantaiTujuan = tentukanLantai(kapasitasMesin);

            if (lantaiTujuan != -1) {
                if (cekKapasitasLantai(lantaiTujuan, kapasitasPerLantai)) {
                    System.out.println("Kendaraan ditempatkan di lantai " + lantaiTujuan);
                } else {
                    System.out.println("Maaf, lantai penuh. Coba lantai lain.");
                }
            } else {
                System.out.println("Maaf, kapasitas mesin tidak sesuai dengan ketentuan.");
            }

            System.out.print("Apakah ada kendaraan lain yang akan masuk? (ya/tidak): ");
            String jawaban = scanner.next().toLowerCase();

            if (jawaban.equals("tidak")) {
                break;
            }
        }

        System.out.println("Terima kasih telah parkir disini!");
    }

    private static int tentukanLantai(int kapasitasMesin) {
        if (kapasitasMesin >= 1000 && kapasitasMesin <= 1200) {
            return 3;
        } else if (kapasitasMesin >= 1500 && kapasitasMesin < 2500) {
            return 2;
        } else if (kapasitasMesin >= 2500) {
            return 1;
        } else {
            return -1;
        }
    }

    private static boolean cekKapasitasLantai(int lantai, int kapasitasPerLantai) {
        return true;
    }
}