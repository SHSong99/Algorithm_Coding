import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 2) {
            System.out.println(1);
            return;
        } else if (N == 4) {
            System.out.println(2);
            return;
        }

        if (N % 5 == 0) {
            System.out.println(N / 5);
            return;
        } else if (N % 5 == 2) {
            System.out.println((N / 5) + 1);
            return;
        } else if (N % 5 == 4) {
            System.out.println((N / 5) + 2);
            return;
        }

        int count = 0;

        while (true) {
            if (N == 6) {
                System.out.println(count + 3);
                return;
            } else if (N == 8) {
                System.out.println(count + 4);
                return;
            } else if (N <= 0) {
                System.out.println(-1);
                return;
            }
            N -= 5;
            count++;
        }
    }
}
