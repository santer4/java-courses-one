/**
*Класс реализует калькулятор.
*/
public class Calculate {
	public static void main(String[] args){
		System.out.println("Calculate...");
		/**
		*Первый аргумент
		*/
		int first = Integer.valueOf(args[0]);
		
		/**
		*Второй аргумент
		*/
		int second = Integer.valueOf(args[1]);
		
		/**
		*Результат вычисления
		*/
		int summ = first + second;
		System.out.println("Sum " + summ);
	}
}