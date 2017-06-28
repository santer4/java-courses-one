/**
	Класс реализует калькулятор.
*/
public class Calculator{
	/**
		Результат вычисления.
	*/
	private int result;
	
	/**
		Суммируем аргументы.
		@param params Аргументы суммирования.
	*/
	public void add(int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}
	
	/**
		Разница аргументов.
		@param paramsDif Аргументы разницы.
	*/
	public void difference(int ... paramsDif){
		this.result += paramsDif[0];
		this.result -= paramsDif[1];
		
	}
	
	/**
		Умножение аргументов.
		@param paramsMulti Аргументы умножения.
	*/
	public void multiplication(int ... paramsMulti){
		
		int multi = paramsMulti[0] * paramsMulti[1];
		this.result += multi;
	}
	
	/**
		Получить результат
		@return результат вычисления.
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
		Очистить результат вычисления.
	*/
	public void cleanResult(){
		this.result = 0;
	}
}