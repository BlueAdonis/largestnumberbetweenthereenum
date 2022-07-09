import java.util.*;
public class largestnumberbetweenthereenum
{
    public static void main(String[] args)
    {
        Scanner getNumber=new Scanner(System.in);
        System.out.print("Enter first Number=");
        int firstNumber=getNumber.nextInt();
        System.out.print("Enter second Number=");
        int secondNumber=getNumber.nextInt();
        System.out.print("Enter third Number=");
        int thirdNumber=getNumber.nextInt();
        if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
        {
            System.out.print(firstNumber+ "   largest number");
        }
        else if(secondNumber>=firstNumber && secondNumber>=thirdNumber)
        {
            System.out.print(secondNumber+    " largest number");
        }
        else
        {
            System.out.print(thirdNumber+    " largest number");
        }
    }
}