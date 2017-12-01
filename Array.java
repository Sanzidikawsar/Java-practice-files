public class Array {
    public static void main(String[] args){
        int[][] arr_2d = {
                {12, 14, 7},
                {11, 3, 17}
        };

        int[] arr_1d = new int[6];

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(arr_2d[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
