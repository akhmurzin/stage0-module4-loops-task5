package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int spaces = 0;
        int stars = height;
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= spaces; col++) {
                System.out.print(' ');
            }
            for (int col = 1; col <= stars; col++) {
                System.out.print('8');
            }
            for (int col = 1; col <= spaces; col++) {
                System.out.print(' ');
            }
            if (height % 2 == 0) {
                if (row < height/2) {
                    stars -= 2;
                    spaces++;
                } else if (row > height/2) {
                    stars += 2;
                    spaces--;
                }
            } else {
                if (row <= height/2) {
                    stars = stars - 2;
                    spaces++;
                } else {
                    stars = stars + 2;
                    spaces--;
                }
            }
            System.out.print("\n");
        }

    }
}
