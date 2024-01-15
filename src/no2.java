import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class no2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> data = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input jumlah data yang akan di proses : ");
        int jum_data = Integer.parseInt(reader.readLine());

        for (int index = 0; index < jum_data; index++) {
            System.out.print("Masukkan Nama " + (index + 1) + " : ");
            String name = reader.readLine();
            System.out.print("Huruf yang akan dihitung : ");
            char hasil = reader.readLine().charAt(0);
            int count = CountWords(name, hasil);
            data.add(count);
        }

        for (int akhir : data) {
            System.out.print(akhir + " huruf, ");
        }
    }

    private static int CountWords(String name, char targetChar) {
        // Implementasikan logika perhitungan huruf di sini
        int count = 0;
        for (char c : name.toCharArray()) {
            if (c == targetChar) {
                count++;
            }
        }
        return count;
    }
}
