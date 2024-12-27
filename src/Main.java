public class Main {
    public static void main(String[] args) {
        // Задача 1: Присвоение значений переменным и вывод в консоль
        double dog = 8.0;
        double cat = 3.6;
        int paper = 763789;

        System.out.println("Значение переменной dog: " + dog);
        System.out.println("Значение переменной cat: " + cat);
        System.out.println("Значение переменной paper: " + paper);

        // Задача 2: Увеличение значений переменных на 4 и вывод в консоль
        var newDog = dog;
        var newCat = cat;
        var newPaper = paper;

        newDog += 4;
        newCat += 4;
        newPaper += 4;

        System.out.println("Новое значение переменной newDog: " + newDog);
        System.out.println("Новое значение переменной newCat: " + newCat);
        System.out.println("Новое значение переменной newPaper: " + newPaper);

        // Задача 3: Уменьшение значений переменных и вывод в консоль
        var updatedDog = dog - 3.5;
        var updatedCat = cat - 1.6;
        var updatedPaper = paper - 7639;

        System.out.println("Новое значение переменной updatedDog: " + updatedDog);
        System.out.println("Новое значение переменной updatedCat: " + updatedCat);
        System.out.println("Новое значение переменной updatedPaper: " + updatedPaper);

        // Задача 4: Работа с переменной friend (увеличение и деление)
        var friend = 19;

        System.out.println("Начальное значение переменной friend: " + friend);

        friend += 2;
        System.out.println("Значение после увеличения на 2: " + friend);

        friend /= 7;
        System.out.println("Значение после деления на 7: " + friend);

        // Задача 5: Работа с переменной frog (увеличение, деление и добавление)
        var frog = 3.5;

        System.out.println("Начальное значение переменной frog: " + frog);

        frog *= 10;
        System.out.println("Значение после увеличения в 10 раз: " + frog);

        frog /= 3.5;
        System.out.println("Значение после деления на 3.5: " + frog);

        frog += 4;
        System.out.println("Значение после добавления 4: " + frog);

        // Задача 6: Расчет общей массы и разницы масс боксеров
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;

        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");

        // Задача 7: Остаток от деления масс боксеров
        var remainder = boxer2Weight % boxer1Weight;

        System.out.println("Остаток от деления массы второго боксера на массу первого: " + remainder + " кг");

        // Задача 8: Расчет количества сотрудников и распределение часов
        var totalHours = 640;
        var hoursPerEmployee = 8;

        var numberOfEmployees = totalHours / hoursPerEmployee;

        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");

        var newNumberOfEmployees = numberOfEmployees + 94;
        var newTotalHours = newNumberOfEmployees * hoursPerEmployee;

        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}