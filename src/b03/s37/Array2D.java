package b03.s37;

public class Array2D {
    public static void main(String[] args) {
        int[][] array2d = new int[4][5];

        int value = array2d[2][3];
        
        array2d[2][3] = 8;
      
        System.out.println(array2d[2][3]);
        value = array2d[2][3]*8;
        System.out.println(array2d[2][3] + ", " + value);
        System.out.println(array2d[3][4]);
    }
}
