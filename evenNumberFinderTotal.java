import java.util.Scanner;

public class evenNumberFinderTotal {
    public static void main(String[] args){
        int i=0, N, total=0;
        Scanner Input=new Scanner(System.in);

        do{
            System.out.println("enter a number:");
            N = Input.nextInt();
            if (N%4 ==0){
                total +=N;
            }
        }
        while (N%2 != 1);
        System.out.println("total 4x numbers are :" + total);
    }
}


