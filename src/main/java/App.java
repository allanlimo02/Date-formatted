import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) {
       Date dinput=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat ("mm' minutes past ' h");

        //System.out.println("This application was made on "+dinput);

        System.out.println("The time now is "+sdf.format(dinput));
    }
}
