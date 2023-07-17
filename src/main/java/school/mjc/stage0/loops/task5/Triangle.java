package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int col = 1; col <= cathetusLength; col++) {
                if (col <= row) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }
    }
}
