//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Задание 1
        System.out.println("Задание 1");
        int [] A = new int[]{1, 2, 3};
        double [] B = {1.57, 7.654, 9.986};
        int [] C = {7, 8, 9};

        // Задание 2
        System.out.println("Задание 2");
        for (int i = 0; i < A.length; i++) {
            if (i <= 1) {
                System.out.print(A[i] + ", ");
            } else {
                System.out.print(A[i]);
            }
        }
        System.out.println(" ");
        for (int i = 0; i < B.length; i++) {
            if (i <= 1) {
                System.out.print(B[i] + ", ");
            } else {
                System.out.print(B[i]);
            }
        }
        System.out.println(" ");
        for (int i = 0; i < C.length; i++) {
            if (i <= 1) {
                System.out.print(C[i] + ", ");
            } else {
                System.out.print(C[i]);
            }
        }
        System.out.println(" ");

        // Задание 3
        System.out.println("Задание 3");
        for (int i = 2; i < A.length; i--) {
            if (i >= 1) {
                System.out.print(A[i] + ", ");
            } else if (i == 0) {
                System.out.print(A[i]);
            }
        }
        System.out.println(" ");
        for (int i = 2; i < B.length; i--) {
            if (i >= 1) {
                System.out.print(B[i] + ", ");
            } else if (i == 0) {
                System.out.print(B[i]);
            }
        }
        System.out.println(" ");
        for (int i = 2; i < C.length; i--) {
            if (i >= 1) {
                System.out.print(C[i] + ", ");
            } else if (i == 0) {
                System.out.print(C[i]);
            }
        }
        System.out.println(" ");
        // Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                A[i] = A[i] + 1;
            }
            System.out.println(A[i]);
        }
    }
}