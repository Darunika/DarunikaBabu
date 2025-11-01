import java.util.*;
public class odd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int a=sc.nextInt();
        int count;

        if(a%2==0){
            count=a-1;
        }
        else{
            count=a;
        }
        System.out.print("Output:");
        int num=1;
        for(int i=0;i<count;i++){
            System.out.print(num);
            if(i<count-1){
                System.out.print(",");
            }
            num+=2;
        }
        sc.close();
    }
}
