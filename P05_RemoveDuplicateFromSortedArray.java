import java.util.Scanner;

public class P05_RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inp = new int[5];

        System.out.print("Enter Elements: ");

        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
        }

        int j =0;

        //1, 1, 1, 2, 2, 3

        for(int i = 1 ; i< inp.length ; i++){
            if(inp[i] != inp[j]){
                j++;
                inp[j] = inp[i];
                
            }
        }

        for(int k = j+1; k < inp.length; k++){
            inp[k] = -1;
        }

     for (int i = 0; i < inp.length; i++) {
         System.out.print(inp[i]+" ");
     }
       
    }
}
