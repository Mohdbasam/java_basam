import java.util.Scanner;

public class matrixadd{

public static void main(String[] args){

Scanner Scanner = new Scanner(System.in);

System.out.println("Enter no.of rows : ");
int row = Scanner.nextInt();
System.out.println("Enter no.of cols : ");
int cols = Scanner.nextInt();

int[][] matrix1 = new int[row][cols];
int[][] matrix2 = new int[row][cols];
int i,j;
int[][] result = new int[row][cols];

System.out.println("Enter first matrix : ");
for(i=0;i<row;i++){
for(j=0;j<cols;j++){
matrix1[i][j] = Scanner.nextInt();
}
}

System.out.println("Enter second matrix : ");
for(i=0;i<row;i++){
for(j=0;j<cols;j++){
matrix2[i][j] = Scanner.nextInt();
}
}

for(i=0;i<row;i++){
for(j=0;j<cols;j++){

result[i][j] = matrix1[i][j]+matrix2[i][j];
}
}

System.out.println("Matrix addition is : \n");
for(i=0;i<row;i++){
for(j=0;j<cols;j++){
System.out.print(result[i][j]+" ");

}
System.out.println();
}
}
}



