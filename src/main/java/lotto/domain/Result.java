package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private static final int THREE_PRIZE = 5_000;
    private static final int FOUR_PRIZE = 50_000;
    private static final int FIVE_PRIZE = 1_500_000;
    private static final int FIVE_BONUS_PRIZE = 30_000_000;
    private static final int SIX_PRIZE = 2_000_000_000;
    private int three;
    private int four;
    private int five;
    private int fiveBonus;
    private int six;

    public Result() {
        three = 0;
        four = 0;
        five = 0;
        fiveBonus = 0;
        six = 0;
    }

    public List<Integer> getStatus() {
        List<Integer> status = new ArrayList<>();
        status.add(three);
        status.add(four);
        status.add(five);
        status.add(fiveBonus);
        status.add(six);
        return status;
    }

    public double getRevenue() {
        double revenue = 0;
        revenue += three * THREE_PRIZE;
        revenue += four * FOUR_PRIZE;
        revenue += five * FIVE_PRIZE;
        revenue += fiveBonus * FIVE_BONUS_PRIZE;
        revenue += six * SIX_PRIZE;
        return revenue;
    }

    public void add(int count) {
        if (count == 3) {
            three++;
            return;
        }
        if (count == 4) {
            four++;
            return;
        }
        if (count == 5) {
            five++;
            return;
        }
        if (count == 6) {
            six++;
        }
    }

    public void addFiveBonus() {
        fiveBonus++;
    }
}
