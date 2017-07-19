package datastructures.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by taemi on 2017-07-19.
 * https://www.hackerrank.com/challenges/java-comparator?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        if (p2.score == p1.score) {
            return p1.name.compareTo(p2.name);
        } else {
            return p1.score > p2.score ? -1 : 1;
        }
    }
}

class Player {
    String name;
    int score;
    public Player() {
    }
    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
