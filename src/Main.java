public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();

    }

    // Homework 1 Task 1
    // Продолжим работать с накоплениями. Продолжите работать с кодом, который вы написали в предыдущем уроке.
    // С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
    //при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
    // Результат программы должен быть выведен в консоль в формате "Месяц … , сумма накоплений
    // равна … рублей" с тем количеством месяцев, необходимым для накопления данной суммы.
    public static void task1() {
        System.out.println("Homework 1 Task 1");
        int contribution = 0;
        int total = 0;
        int i = 0;

        while (total < 2_459_000) {
            i++;
            total = total + 15000;
            total = total + total / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total + " рублей за " + i + " месяцев");
    }
    // Homework 1 Task 2
    // Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
    // На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.
    // Для обоих циклов можно использовать как одну общую переменную, так и в каждом цикле свою.
    // Не забудьте выполнить переход на новую строку между двумя циклами.
    // В результате программы вывод должен получиться следующий:
    // 1 2 3 4 5 6 7 8 9 10
    // 10 9 8 7 6 5 4 3 2 1

    public static void task2() {
        System.out.println("Homework 1 Task 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Homework 1 Task 3
    // В стране Y население равно 12 миллионам человек.
    // За год рождаемость составляет 17 человек на 1000 человек, смертность - 8 человек.
    // Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
    // что показатели рождаемости и смертности постоянны.
    // В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "

    public static void task3() {
        System.out.println("Homework 1 Task 3");
        double populationCount = 12_000_000;
        double totalPopulationCount = populationCount;

        for (int i = 1; i <= 10; i++) {
            populationCount = totalPopulationCount;
            double birthPopulationCount = populationCount * 17 / 1000;
            double deathPopulationCount = populationCount * 8 / 1000;
            totalPopulationCount = (populationCount + birthPopulationCount - deathPopulationCount);
            System.out.println("Год " + i + ", численность населения составляет " + totalPopulationCount);
        }
    }

    // Homework 2
    // Напишите программу, которая выводит в консоль сумму накоплений.
    // Василий решил положить деньги на накопительный счет, где каждый
    // месяц к сумме его вклада добавляется ещё 7%.
    //Первоначальная сумма вклада Василия составляет 15 тысяч рублей.
    // Homework 2 Task 1
    // Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить,
    // чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется,
    //а всегда равен 7%. Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.

    public static void task4() {
        System.out.println("Homework 2 Task 1");
        int contribution = 15000;
        int total = contribution;
        int i = 0;

        while (total < 12_000_000) {
            i++;
            total = total + total * 7 / 100;
            System.out.println("Месяц " + i + " сумма накоплений " + total);
        }
    }

    // Homework 2 Task 2
    // Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд,
    // а только каждый шестой. Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.

    public static void task5() {
        System.out.println("Homework 2 Task 2");
        int contribution = 15000;
        int total = contribution;
        int i = 0;

        while (total < 12_000_000) {
            i++;
            total = total + total * 7 / 100;

            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений " + total);
            }
        }
        System.out.println("За " + i + " месяцев будет накоплено " + total + " рублей");
    }

    // Homework 2 Task 3
    // Василий решил, что год копить деньги ближайшие 9 лет. И он хочет знать,
    // какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
    // Исходная сумма всё так же 15 тысяч рублей, проценты банка – 7% ежемесячно.
    // Напишите программу, которая будет выводить Василию сумму его накоплений
    // за следующие каждые полгода в течение 9 лет.
    public static void task6() {
        System.out.println("Homework 2 Task 3");
        int contribution = 15000;
        int total = contribution;

        for (int i = 1; i <= (9 * 12); i++) {

            total = total + total * 7 / 100;

            if (i % 6 == 0) {
                System.out.println("За " + i + " месяцев будет накоплено " + total + " рублей");
            }
        }
    }

    // Homework 2 Task 4
    // В вашей компании пятница является днем отчетным.
    // Нам нужно написать программу, которая считает дни месяца по датам, определяет,
    // какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
    //Условия задачи:
    // Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
    // Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
    // "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
    // В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями
    // по разным датам.

    public static void task7() {
        System.out.println("Homework 2 Task 4");
        int friday = 5;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }

    // Homework 3 Task 1
    // Мы решили написать астрономическое приложение, которое считает, когда над Землей
    // пролетают кометы и их можно будет увидеть. Для начала нам нужно посчитать траекторию движения кометы,
    // которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
    //Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и
    // когда мы увидим ее в следующий раз.
    //Условия задачи:
    // В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета,
    // а также следующий год ее появления.
    //Для вычисления периода можно создать две дополнительные переменные, которые содержат
    // год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и
    // 100 лет после в качестве завершения периода расчета.
    // В результате решения задачи в консоль должен вывестись следующий результат:
    // 1896

    // 1975

    // 2054

    public static void task8() {
        System.out.println("Homework 3 Task 1");
        int yearStart = 2022;
        int yearBefor = yearStart - 200;
        int yearAfter = yearStart + 100;

        for (yearStart = yearBefor; yearStart <= yearAfter; yearStart++) {

            if (yearStart % 79 == 0) {
                System.out.println(yearStart);
                System.out.println();
            }
        }
    }

    // Homework 3 Task 2
    // Напишите программу, которая выводит в консоль таблицу умножения на 2:
    // 2*1=2
    // 2*2=4
    // 2*3=6
    // 2*4=8
    // 2*5=10
    // 2*6=12
    // 2*7=14
    // 2*8=16
    // 2*9=18
    // 2*10=20
    // Критерии оценки: применен цикл for для решения задания

    public static void task9() {
        System.out.println("Homework 3 Task 2");
        int x = 2;

        for (int y = 1; y <= 10; y++) {
            int z = x * y;
            System.out.println(x + "*" + y + "=" + z);
        }
    }
}