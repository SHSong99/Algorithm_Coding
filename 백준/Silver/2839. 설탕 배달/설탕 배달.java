
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 3 || N == 6 || N == 9 || N == 12) {
            System.out.println(N / 3);
            return;
        } else if (N % 5 ==0) {
            System.out.println(N / 5);
            return;
        }

        int result = 0;

        while (true) {
            N -= 5;
            result++;
            if (N == 3 || N == 6 || N == 9 || N == 12) {
                N /= 3;
                result += N;
                System.out.println(result);
                break;
            } else if (N <= 3) {
                System.out.println(-1);
                break;
            }
        }


    }
}
