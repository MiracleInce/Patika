import java.util.Arrays;

public class TranszpoBulma {
    public static void main(String[] args) {
        int[][] matris={
                {1,2,3},
                {4,5,6}
        };
        int [][] transpoz=new int[matris[0].length][matris.length];
        for(int i=0;i< matris.length;i++){
            for (int j=0;j<matris[0].length;j++){
                transpoz[j][i]=matris[i][j];
            }
        }
        System.out.println("Girilen matrisin transpozu : \n");
        for (int[] val : transpoz) {
            for (int k : val) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}