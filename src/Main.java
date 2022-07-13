import java.math.BigDecimal;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        //Задача 1 Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).
        //Целочисленные
        byte b = 1;
        short s = 2;
        int i = 4;
        long l = 8L;
        //С плавающей точкой
        float f = 1.123f;
        double d = 2.456789;
        //Символьные
        char c = 'C';
        //Логические
        boolean boo = true;

        //Задача 2.**
        //В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться, что боксеры соответствуют своей весовой категории, и бой будет честным.
        //Вес одного боксера – 78,2 кг
        //Вес второго боксера – 82,7 кг
        // Подсчитайте и выведите в консоль общий вес двух бойцов.
        // Подсчитайте и выведите в консоль разницу между весами бойцов.
        float firstBoxerWeight = 78.2f;         //Вес одного боксера – 78,2 кг
        float secondBoxerWeight = 82.7f;        //Вес второго боксера – 82,7 кг
        float sumBoxersWeight = firstBoxerWeight + secondBoxerWeight;       //общий векс боксёров
        float diffBoxersWeight = abs(firstBoxerWeight - secondBoxerWeight);      //разница в весе боксёров по модулю
        System.out.println("Задача №2:");
        System.out.println("Общий вес двух бойцов " + sumBoxersWeight + " кг.");
        System.out.println("Разница между весом бойцов " + diffBoxersWeight + "кг.");

        //### **Задача 3.**
        //– Бананы – 5 штук (1 банан - 80 грамм);
        //– Молоко – 200 мл (100 мл = 105 грамм);
        //– Мороженое пломбир – 2 брикета по 100 грамм;
        //– Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        int bananaWeight = 80;      //вес одного банана
        int milkVol = 105;          //вес 100 мл молока
        int icecreamWeight = 100;   //вес одного брикета мороженного
        int eggsWeight = 70;        //вес одного яйца
        float mixWeight = (bananaWeight * 5) + (milkVol * 2) + (icecreamWeight * 2) + (eggsWeight * 4);  //смешиваем микс
        System.out.println("Задача №3:");
        System.out.println("Вес спорт завтрака: " + mixWeight + " грамм (" + (mixWeight/1000) + " килограмм)");

        //### **Задача 4.**
        //Правила соревнований обновились, и теперь нашему спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
        //Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
        //Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм и сколько, если каждый день будет худеть на 500 грамм.
        //Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
        int weightToReduce = 7;     //целевой вес в КГ
        int minWeightReducePerDay = 250;        //минимальный вариант сброса веса в граммах
        int maxWeightReducePerDay = 500;        //максимальный вариант сброса веса в граммах
        int daysToPoint1 = weightToReduce * 1000 / minWeightReducePerDay;       //вычисляем кол-во дней по мин сценарию сброс веса в КГ
        int daysToPoint2 = weightToReduce * 1000 / maxWeightReducePerDay;       //вычисляем кол-во дней по макс сценарию сброс веса в КГ
        System.out.println("Задача №4:");
        System.out.println("Дней до похудения: " + daysToPoint1 + " при потере 250 грамм в день.");
        System.out.println("Дней до похудения: " + daysToPoint2 + " при потере 500 грамм в день.");
        System.out.println("В среднем потребуется " + (daysToPoint1 + daysToPoint2)/2 + " день(дней) для похудения");

        //### **Задача 5.**
        //Отойдем от спорта и представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //Маша получает 67 760 рублей в месяц
        //Денис получает 83 690 рублей в месяц
        //Кристина получает 76 230 рублей в месяц
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения. Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //Выведите в консоль информацию по каждому сотруднику.
        //Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
        float mariaSalaryPerMonth = 67_760f; //зп Марии до повышения
        float denSalaryPerMonth = 83_690f;
        float krisSalaryPerMonth = 76_230f;
        float mariaSalaryPerMonthNew = mariaSalaryPerMonth * 110; // повышаенм ЗП Марии на 10% и повышаем разрядность для дальнейшего округления и выход на точность 2х знаков после запятой
        float denSalaryPerMonthNew = denSalaryPerMonth * 110;
        float krisSalaryPerMonthNew = krisSalaryPerMonth * 110;
        float mariaSalaryDiffPerMonth = (mariaSalaryPerMonthNew - mariaSalaryPerMonth * 100); // вычисляем разницу в ЗП новой и старой
        //округление и "обрезка" до копеек у Марии
        int mariaSalaryDiffPerMonthRound = (int)Math.round(mariaSalaryDiffPerMonth);        //для данного примера может быть избыточно, но если будут копейки в ЗП, то будет полезно
        float mariaSalaryDiffPerMonth2Digits = (float) mariaSalaryDiffPerMonthRound / 100;
        //округление и "обрезка" до копеек у Дениса
        float denSalaryDiffPerMonth = (denSalaryPerMonthNew - denSalaryPerMonth * 100);
        int denSalaryDiffPerMonthRound = (int)Math.round(denSalaryDiffPerMonth);
        float denSalaryDiffPerMonth2Digits = (float) denSalaryDiffPerMonthRound / 100;
        //округление и "обрезка" до копеек у Кристины
        float krisSalaryDiffPerMonth = (krisSalaryPerMonthNew - krisSalaryPerMonth * 100);
        int krisSalaryDiffPerMonthRound = (int)Math.round(krisSalaryDiffPerMonth);
        float krisSalaryDiffPerMonth2Digits = (float) krisSalaryDiffPerMonthRound / 100;


       System.out.println("Задача №5:");
       System.out.println("Маша теперь получает " + mariaSalaryPerMonthNew/100 + " рублей." + " Годовой доход вырос на " + (mariaSalaryDiffPerMonth2Digits * 12)  + " рублей.");
       System.out.println("Денис теперь получает " + denSalaryPerMonthNew/100 + " рублей." + " Годовой доход вырос на " + (denSalaryDiffPerMonth2Digits * 12)  + " рублей.");
       System.out.println("Кристина теперь получает " + krisSalaryPerMonthNew/100 + " рублей." + " Годовой доход вырос на " + (krisSalaryDiffPerMonth2Digits * 12)  + " рублей.");

       //p.s. нагуглил, что ЗП лучше считать через BigDecimal но пока не очень понятен синтаксис, поэтому сделал по "простому" варианту с округлением.
        // Понимаю, что дальше будет понятнее как это упростить и не писать 3 раза один и тотже алгоритм "округления", но это уже ООП, до которого дойдём попозже.

    }
}