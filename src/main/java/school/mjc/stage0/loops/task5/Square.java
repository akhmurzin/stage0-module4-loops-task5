package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        for (int row = 0; row < sideLength; row++) {
            for (int col = 0; col < sideLength; col++) {
                if (row == 0 || row == sideLength - 1 || col == 0 || col == sideLength - 1) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print("\n");
        }
    }
}
