import java.util.Scanner;

/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner{
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			String operation = "sum";
			String cleanResult = "yes";
			while(!exit.equals("yes")){
				System.out.println("Enter first agr : ");
				String first = reader.next();
				System.out.println("Enter second agr : ");
				String second = reader.next();
				System.out.println("Change operation : sum/dif/multi ");
				operation = reader.next();
				if (operation.equals("sum")){
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : " + calc.getResult());
				} else if (operation.equals("dif")){
					calc.difference(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : " + calc.getResult());
				} else if (operation.equals("multi")){
					calc.multiplication(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : " + calc.getResult());
				}
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