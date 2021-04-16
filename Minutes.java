import java.util.Scanner;
public class Minutes{

public static void main(String args[]){
Scanner obj=new Scanner(System.in);
System.out.println("enter the number of minutes : ");
int mins=obj.nextInt();
int years=mins/525600 ;
int c=years*365;
int d=mins/1440;
int extradays=d-c;
System.out.println("the entered minutes in years is : " + years+" years and " +extradays+ " days");

}
}
