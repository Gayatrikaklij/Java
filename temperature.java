import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("temperature in fahrenheit ");
         double fahrenheit=sc.nextDouble();

        double celcius=(5.0/9* fahrenheit-32 ); 
        System.out.println("Temperature in Celcius is "+ celcius );
    }
    
}
