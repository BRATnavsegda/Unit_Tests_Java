package seminars.five.number;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumberModule {
    public ArrayList<Integer> generateList(int i) {
        Random rand = new Random();
        ArrayList<Integer> someList = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            someList.add(rand.nextInt(11));
        }
        if (i <= 0) throw new IllegalArgumentException("Incorrect argument.");
        return someList;
    }


}
