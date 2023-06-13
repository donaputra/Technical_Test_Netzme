import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int sum = 0;

        // Menambahkan angka 1-9 ke dalam list
        for (int i = 1; i <= 9; i++) {
            numbers.add(i);
        }

        // Mengacak urutan angka dalam list
        Collections.shuffle(numbers);

        // Memastikan jumlah total angka random adalah 15
        while (sum != 15) {
            Collections.shuffle(numbers);
            sum = numbers.get(0) + numbers.get(1) + numbers.get(2);
        }

        // Menampilkan angka puzzle yang dihasilkan
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}