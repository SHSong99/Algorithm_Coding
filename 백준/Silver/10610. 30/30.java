import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // 30의 배수가 되는 가장 큰 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        int total = 0;
        List<Integer> made30 = new ArrayList<>();

        // 각 자리 숫자를 리스트에 추가하고, 합계를 구함
        for (int i = 0; i < N.length(); i++) {
            int digit = N.charAt(i) - '0';  // char를 int로 변환
            made30.add(digit);
            total += digit;
        }

        // 30의 배수 조건 확인
        if (!made30.contains(0)) {
            System.out.println(-1);
            return;
        }
        if (total % 3 != 0) {
            System.out.println(-1);
            return;
        }

        // 리스트 정렬
        made30.sort(Collections.reverseOrder());

        // 정렬된 리스트를 출력하여 가장 큰 수를 만듦
        StringBuilder sb = new StringBuilder();
        for (Integer digit : made30) {
            sb.append(digit);
        }
        System.out.println(sb.toString());
    }
}
