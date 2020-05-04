package NiuKeWebsite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AliTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] matrix = new int[n+1][m+1];
        int[][] query = new int[q][2];
        int count = 0 ;
        int[][] algbra = new int[3][4];
        for(int i = 1; i < n+1; i++){
            for(int j = 0; j < m+1; j++){
                matrix[i][j] = sc.nextInt();
                if(count < 3 && matrix[i][j] != 0){
                    algbra[0][count] = 1;
                    algbra[1][count] = i;
                    algbra[2][count] = j;
                    algbra[3][count] = matrix[i][j];
                    count ++;
                }
            }
        }
        for(int i = 0 ;i < 6; i++){
            for(int j=0 ;j < 2; j++){
                query[i][j] = sc.nextInt();
            }
        }


        if(count == 3){

        }
        else{
            for(int i = 0 ;i < 6; i++){
                int x = query[i][0];
                int y = query[i][1];
                if(matrix[x][y] != 0){
                    System.out.println(matrix[x][y]);
                }
                else {
                    System.out.println("Unknown");
                }
            }

        }

    }

}

