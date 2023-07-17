package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int mid = sideLength/2 + 1;
        for (int row = 1; row <= sideLength; row++) {
            for (int col = 1; col <= sideLength; col++) {
                if (col == mid || row == mid) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }

    }
}
