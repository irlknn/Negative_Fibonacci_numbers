/**
 * Клас, що зберігає значення числа Фібоначчі
 */
public class Fibonacci{
    private int position;
    private long value;
    /**
     * Конструктор
     */
    public Fibonacci(int position, long value){
        this.position = position;
        this.value = value;
    }
    /**
     * Метод доступу до змінної position
     * @return position
     */
    public int getPosition(){return position;}
    /**
     * Метод доступу до змінної value
     * @return value
     */
    public long getValue(){return value;}
    /**
     * Сетер для змінної position
     * @param position порядковий номер числа
     */
    public void setPosition(int position){this.position = position;}
    /**
     * Сетер для змінної value
     * @param value значення числа
     */
    public void setValue(long value){this.value = value;}

}