package me.pipinipip.adventofcode;

public class Day1 {

    public static void main(String[] args) {

        String[] input = fileutil.readFile("day1.txt");
        int Summa = 0;

        for(String ln : input) {
            int n = Integer.parseInt(ln);

            double fuel = Math.floor(n/3.-2);
            Summa += fuel;

            System.out.println("Start fuel: " + fuel);
            while(fuel >= 1) {
                fuel = Math.floor(fuel/3.-2);

                if(fuel < 0) fuel = 0;

                Summa += fuel;

                System.out.println(fuel);
            }
        }

        System.out.println(Summa);


    }
}
