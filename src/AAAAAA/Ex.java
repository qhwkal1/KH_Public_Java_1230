package AAAAAA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138","129","100"));
        pitches.sort(Comparator.naturalOrder());
        System.out.println(pitches);

    }
}