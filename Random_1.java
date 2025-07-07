import java.util.*;
import java.util.Random;
public class Random_1 {
    public static void main(String[] args) {
        // 0 FOR STONE
        // 1 FOR PAPER
        //2 FOR SCISSOR
        Scanner sc= new Scanner(System.in);
        System.out.println(" ENTER  0 FOR STONE, 1 FOR PAPER ,2 FOR SCISSOR");
        int user= sc.nextInt();
        Random ra = new Random();
        int computer = ra.nextInt(3);
         if(user==computer){
             System.out.println(" DRAWN ");
         }
         else if(user==0 && computer==2 || user ==1 && computer ==0){
             System.out.println(" USER WON");
         }
         else{
             System.out.println(" COMPUTER WON ");
         }
    }
}
