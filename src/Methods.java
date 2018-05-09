import java.awt.geom.Point2D;

import static java.lang.StrictMath.sqrt;

public class Methods {
    /**
     * @param x
     * @param y
     * @return
     */
    public int sumTwoNumbers(int x, int y) {
        int Sum = x + y;
        return Sum;
    }

    public int minNumbers(int x, int y) {
        if (x > y) {
            return y;
        } else
            return x;
    }



    /**
     * 1 task
     */
    public int factorial(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * 2 task
     */
    public static double distance(double x1, double y1, double x2, double y2) {
        double distance = Point2D.distance(3.0, 4.0, 5.0, 6.0);
        return distance;
    }

    /**
     * 3 task: Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают
     * длину стороны для треугольника и возвращает правда или ложь (может ли существовать
     * треугольник с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не
     * должна быть длиннее суммы двух других
     */

    public boolean isTriangle(int a, int b, int c) {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            return false;
        }
        boolean checkOne = (a + b) > c;
        boolean checkTwo = (a + c) > b;
        boolean checkThree = (b + c) > a;
        if (checkOne && checkTwo && checkThree) {
            return true;
        } else
            return false;
    }

    /**
     * 4  task: Почитать про вложенный цикл и вывести треугольник из нулей на экран
     */

    public void printTriangle(int count) {
        for (int i = 0; i < count; ++i) {
            for (int j = 0; j < i; ++j)
                System.out.print("0");
            System.out.println();
        }
    }

    /**
     * 5 task: Задача для тех кто следить за фигурой))) Написать программу которая вычисляет индекс массы
     * тела
     */

    public double mass(int m, double h) {

        double I = (m / (h * h));
        return I;
    }

    /**
     * 6 task
     */


    /**
     * 7 task: написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн Примает на
     * вход 3 величины глубину длину и ширину бассейна. Определить перед решением что принимает
     * на вход и что возвращает
     */

    public int poolVolume(int a, int b, int c){
        /**
         * a = long
         * b = width
         * c = height
         */
        int V = (a * b * c) * 1000;
        return V;
    }

    /**
     *8 task: При поступлении в вуз абитуриенты, получившие &quot;двойку&quot; на первом экзамене, ко второму не
     * допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
     * Подсчитать, сколько человек не допущено ко второму экзамену.
     */


    /**
     * 9 task: У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-
     * продажи в банках города. В городе N банков. Составьте программу, определяющую, какой банк
     * выбрать, чтобы выгодно обменять доллары на рубли.
     */




    public double triangle(int side1) {
        double s;
        if (isTriangle(side1, side1, side1)) {
            double p = side1 + side1 + side1;
            s = sqrt(p / 2 * (p / 2 - side1) * (p / 2 - side1) * (p / 2 - side1));
        } else s = -1;
        return s;
    }



    /**
     * 10 Вывести на экран строку S указанное количество раз N
     */

    // first variant
    public static String printS() {
        for (int i = 0; i < 5; ++i) {
            System.out.println("s");
        }
        return null;
    }

    //second variant

    public void printString(int n, String s) {
        for (int i = 0; i < n; ++i) {
            System.out.print(s + " ");
            System.out.println("");
        }
    }

    /**
     * 11 task: Написать программу нахождения суммы большего и меньшего из 3-х чисел.
     */

    public boolean isSameNumbers(int x) {
        int Hundrets = x / 100;
        int ThirdNumber = x % 10;
        int SecondNumber = (x % 100) / 10;
        if ((Hundrets == ThirdNumber) || (Hundrets == SecondNumber) || (ThirdNumber == SecondNumber)) {
            return true;
        } else
            return false;
    }



    /**
     * 12 task: Вычислить площадь треугольника
     */

    public double triangle(int side1, int side2, int side3)
    // S = sqrt (P/2 (P/2 - side1) (P/2 - side2) (P/2 - side3))
    {
        double s;
        if (isTriangle(side1, side2, side3)) {
            double p = side1 + side2 + side3;
            s = sqrt(p / 2 * (p / 2 - side1) * (p / 2 - side2) * (p / 2 - side3));
        } else s = -1;
        return s;
    }



    /**
     * 13 task: Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
     * вычисления площади треугольника
     */

    public double hexagon(int side1) {
        double s;
        s = triangle(side1) * 6;
        return s;
    }

    /**
     * 14 task: Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9.
     */


    public int factOddNumber(int n) {
        int result = 1;
        if (((n % 2) == 0)) {
            result = 2;
            return result;
        } else {
            return factorial(n);
        }
    }
}


    /**
     *   15 task: Написать программу которая возвращает стоимость покупки с учетом дисконта
     *   Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
     *   скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
     */




