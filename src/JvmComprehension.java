public class JvmComprehension {

    public static void main(String[] args) {
        int i = 1; // 1
        /*
        Создание примитивной переменной i типа int в стеке. В стеке создается новый фрейм для метода main,
        и в нем размещается переменная i со значением 1. Это происходит в области памяти стэка.
         */
        Object o = new Object();        // 2
        /*
        Создание нового объекта класса Object в куче (хипе). Для этого используется ключевое слово new,
        которое вызывает конструктор класса Object. В стеке создается ссылка на объект o, которая
        указывает на объект в куче.
         */
        Integer ii = 2;                 // 3
        /*
        Cоздание объекта класса Integer в куче. Однако, поскольку значение 2 находится в диапазоне кэша
        автoboxing (-128 до 127), JVM использует уже созданный объект Integer из кэша, а не создает новый.
        В стеке создается ссылка на объект ii, которая указывает на объект в куче.
         */
        printAll(o, i, ii);             // 4
        /*
        Происходит вызов метода printAll с тремя аргументами: o, i и ii. В стеке создается новый фрейм для
        метода printAll, и в нем размещаются переменные o, i и ii. Происходит передача управления
        в метод printAll.
         */
        System.out.println("finished"); // 7
        /*
        В JVM происходит вывод строки "finished" в консоль с помощью метода println(). В стеке создается новый
        фрейм для метода println и в него передается строка "finished"  После выполнения метода main происходит
        завершение программы.
        */
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   // 5
        /*
        Cоздание объекта класса Integer в куче. В стеке создается ссылка на объект uselessVar, которая
        указывает на объект в куче.
         */
        System.out.println(o.toString() + i + ii);  // 6
        /*
        Происходит вызов метода toString() объекта o, который возвращает строковое представление объекта. Потом
        конкатенация строки с значениями i и ii. Результат выводится в консоль с помощью метода println().
        Затем возврат управления в метод main.
         */
        
    }
}