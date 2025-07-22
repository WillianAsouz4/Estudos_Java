package tesk;

import java.util.Scanner;

public class tesk2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero?");
        int N = sc.nextInt();

        if (N % 2 == 0){
            System.out.print("Par");
        }
        else {
            System.out.print("Impar");
        }

        sc.close();
    }
}




