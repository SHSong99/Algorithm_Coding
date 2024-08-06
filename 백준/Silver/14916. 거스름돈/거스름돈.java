import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mon = Integer.parseInt(br.readLine());

        int count = 0;

        while (true) {
            if (mon % 5 == 0) {
                count += mon / 5;
                System.out.println(count);
                break;
            } else {
                mon -= 2;
                count++;
                if (mon == 0) {
                    System.out.println(count);
                    break;
                } else if (mon <= -1) {
                    System.out.println("-1");
                    break;
                }
            }
        }

    }
}