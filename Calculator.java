import org.omg.CORBA.DynAnyPackage.InvalidValue;
import org.omg.CORBA.UserException;

/**
 Класс реализует калькулятор.
 */
public class Calculator{
    /**
     Результат вычисления.
     */
    private int result;

    /**
     * Суммируем аргументы.
     * @param params Аргументы суммирования.
     * @throws UserException упадет, если нет аргументов
     */
    public void add(final int ... params) throws UserException{
        if (params.length > 0) {
            for (Integer param : params){
                this.result += param;
            }
        } else {
            throw new InvalidValue("Error. You should enter minimum two args!");
        }

    }

    /**
     * Вычитание аргументов.
     * @param paramsDif Аргументы разницы.
     * @throws UserException упадет, если нет аргументов
     */
    public void difference(final int ... paramsDif) throws UserException{
        if(paramsDif.length > 0) {
            this.result += paramsDif[0];
            this.result -= paramsDif[1];
        } else {
            throw new InvalidValue("Error. You should enter minimum two args!");
        }

    }

    /**
     * Умножение аргументов.
     * @param paramsMulti Аргументы умножения.
     * @throws UserException упадет, если нет аргументов
     */
    public void multiplication(final int ... paramsMulti) throws UserException {

        if (paramsMulti.length > 0) {
            int multi = paramsMulti[0] * paramsMulti[1];
            this.result += multi;
        } else {
            throw new InvalidValue("Error. You should enter minimum two args!");
        }

    }

    /**
     * Деление аргументов.
     * @param args Входящие аргументы
     * @throws UserException упадет, если аргументов нет или деление на ноль
     */
    public void div(final int ... args) throws UserException{
        if (args.length > 0) {
            this.result = args[0];
            for (int index = 1; index != args.length; ++index) {
                if (args[index] != 0) {
                    this.result /= args[index];
                } else {
                    throw new InvalidValue("Error, You try to div on 0");

                }
            }
        } else {
            throw new InvalidValue("Error. You should enter minimum two args!");
        }
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