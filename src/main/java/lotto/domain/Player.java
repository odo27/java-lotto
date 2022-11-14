package lotto.domain;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public static int getMoney() {
        System.out.println("구입금액을 입력해 주세요.");
        return getNumber();
    }

    public static List<Integer> getWinningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
        return getNumbers();
    }

    public static int getBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        return getNumber();
    }

    private static void isNumber(String word) {
        for (int index = 0; index < word.length(); index++) {
            char letter = word.charAt(index);
            if (index == 0 && letter == '0') {
                throw new IllegalArgumentException();
            }
            if (!Character.isDigit(letter)) {
                throw new IllegalArgumentException();
            }
        }
    }

    private static int getNumber() {
        String line = Console.readLine();
        try {
            isNumber(line);
        } catch (Exception e) {
            System.out.println("[ERROR] 숫자가 아닌 값이 있습니다");
        }
        return Integer.parseInt(line);
    }

    private static List<Integer> getNumbers() {
        String line = Console.readLine();
        String[] components = line.split(",");
        List<Integer> numbers = new ArrayList<>();
        for (String component : components) {
            try {
                isNumber(component);
            } catch (Exception e) {
                System.out.println("[ERROR] 숫자가 아닌 값이 있습니다");
            }
            int number = Integer.parseInt(component);
            numbers.add(number);
        }
        return numbers;
    }
}
