import org.omg.CORBA.DynAnyPackage.InvalidValue;
import org.omg.CORBA.UserException;

import java.util.Scanner;
/**
 Класс для запуска калькулятора. Работает с параметрами запуска программы.
 */
public class ArgRunner{
    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        try{
            Calculator calc = new Calculator();
            String exit = "no";
            String operation = "sum";
            String cleanResult = "yes";
            while(!exit.equals("yes")){
                System.out.println("Change operation : sum/dif/multi ");
                operation = reader.next();
                try {
                    if (operation.equals("sum")){
                        calc.add(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                    } else if (operation.equals("dif")){
                        calc.difference(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                    } else if (operation.equals("multi")){
                        calc.multiplication(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                    } else if (operation.equals("div")){
                        calc.div(Integer.valueOf(arg[0]), Integer.valueOf(arg[1]));
                    } else {
                        System.out.println("Not supported operation");
                        continue;
                    }
                } catch (ArrayIndexOutOfBoundsException indexOut) {
                    System.out.println("Error. You should enter minimum two args!");
                    break;
                } catch (UserException userExept){
                    System.out.println(userExept.getMessage());
                    break;
                }
                System.out.println("Result : " + calc.getResult());
                System.out.println("Clear : yes/no ");
                cleanResult = reader.next();
                if (cleanResult.equals("yes")){
                    calc.cleanResult();
                }

                System.out.println("Exit : yes/no ");
                exit = reader.next();
            }
        } finally{
            reader.close();
        }

    }
}