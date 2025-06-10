import java.util.Scanner;

public class P04_MoveZerosToEnd {
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int[] inp = new int[5];

        System.out.print("Enter Elements: ");

        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }

        int j =0;

        //12,4,0,2,24
        for(int i = 0 ; i< inp.length; i++){

            if(inp[i] != 0){
                inp[j] = inp[i];
                j++;
            }
        }

        while(j < inp.length)
        {
           inp[j] = 0;
           j++;
        }

       for(int i =0 ; i<inp.length ; i++){
        System.out.print(inp[i] + " ");
       }
 }   
}
