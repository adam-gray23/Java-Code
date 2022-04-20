import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        //scan the len
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        //initialise array
        int array[] = new int[num];
        System.out.print("Enter " + num + " numbers: ");
        //build array
        for(int i = 0; i < num; i++){
            array[i] = in.nextInt();
        }
        in.close();
        //print array in reverse
        System.out.print("The numbers reversed are: ");
        for(int j = num - 1; j >= 0; j--){
            System.out.print(array[j] + " ");
        }
    }
}
