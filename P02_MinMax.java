import java.util.Scanner;

public class P02_MinMax {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            int[] inp = new int[5];

            System.out.print("Enter Elements: ");
            
            for(int i = 0; i< inp.length ; i++){
                inp[i] = sc.nextInt();
            }

            int min = inp[0],max = inp[0];
           

            for(int i = 1 ; i<inp.length ; i++){
                if(inp[i] < min){
                    min = inp[i];
                }
                if(inp[i]> max){
                    max = inp[i];
                }
            }


            System.out.println("Min: "+min+" And "+"Max: "+max);
    }
}

