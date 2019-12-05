package me.pipinipip.adventofcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileutil {
    public static String[] readFile(String fileName) {
        Scanner in = null;
        List<String> out = new ArrayList<>();
        try {
            in = new Scanner(new File(fileName));

            while(in.hasNextLine()) {
                out.add(in.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return out.toArray(new String[0]);
    }
}