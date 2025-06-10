    import java.util.*;
    public class P01_ReverseArray{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] inp = new int[5];

            System.out.print("Enter Elements: ");
            
            for(int i = 0; i< inp.length ; i++){
                inp[i] = sc.nextInt();
            }

            int l = inp.length-1;
            int s = 0;
            int temp;
            while (l > s){
                temp = inp[s];
                inp[s] = inp[l];
                inp[l] = temp;

                l--;
                s++;
            }

            for(int i = 0; i< inp.length ; i++){
                System.out.print(inp[i] + " ");
            }
        }
    }   