import java.util.*;

public class matrix {
    int row;
    int column;
    int[][] array = new int[10][10];

    public void getMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of matrix, row count: ");
        this.row = sc.nextInt();
        System.out.print("Enter size of matrix, column count: ");
        this.column = sc.nextInt();
        System.out.println("Enter matrix elements: ");
        for (int rc = 0; rc < this.row; rc++) {
            for (int cc = 0; cc < this.column; cc++) {
                this.array[rc][cc] = sc.nextInt();
            }
        }
    }

    public void isSymmetric() {
        // If the matrix is not square, it's not symmetric
        if (this.row != this.column) {
            System.out.println("Matrix is not symmetric because it's not square.");
            return;
        }

        // Check if the matrix is symmetric
        boolean isSymmetric = true;
        for (int rc = 0; rc < this.row; rc++) {
            for (int cc = 0; cc < this.column; cc++) {
                if (this.array[rc][cc] != this.array[cc][rc]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not symmetric");
        }
    }

    public static void main(String[] args) {
        matrix first = new matrix();
        first.getMatrix();
        first.isSymmetric();
        System.out.println("....END....");
    }
}
