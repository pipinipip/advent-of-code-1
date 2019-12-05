package me.pipinipip.adventofcode;

public class Day1 {

    public static void main(String[] args) {

        String[] input = fileutil.readFile("day1.txt");
        int Summa = 0;

        for(String ln : input) {
            int n = Integer.parseInt(ln);

            Summa += Math.floor(n/3.-2);;
        }

        System.out.println(Summa);
    }
}
