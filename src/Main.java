public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Задача 1:");
        System.out.println("Значение переменной dog: " + dog);
        System.out.println("Значение переменной cat: " + cat);
        System.out.println("Значение переменной paper: " + paper);

        // Задача 2
        var newDog = dog;
        var newCat = cat;
        var newPaper = paper;

        newDog += 4;
        newCat += 4;
        newPaper += 4;

        System.out.println("\nЗадача 2:");
        System.out.println("Новое значение переменной newDog: " + newDog);
        System.out.println("Новое значение переменной newCat: " + newCat);
        System.out.println("Новое значение переменной newPaper: " + newPaper);

        // Задача 3
        var updatedDog = dog - 3.5;
        var updatedCat = cat - 1.6;
        var updatedPaper = paper - 7639;

        System.out.println("\nЗадача 3:");
        System.out.println("Новое значение переменной updatedDog: " + updatedDog);
        System.out.println("Новое значение переменной updatedCat: " + updatedCat);
        System.out.println("Новое значение переменной updatedPaper: " + updatedPaper);

        // Задача 4
        var friend = 19;

        System.out.println("\nЗадача 4:");
        System.out.println("Начальное значение переменной friend: " + friend);

        friend += 2;
        System.out.println("Значение после увеличения на 2: " + friend);

        friend /= 7;
        System.out.println("Значение после деления на 7: " + friend);

        // Задача 5
        var frog = 3.5;

        System.out.println("\nЗадача 5:");
        System.out.println("Начальное значение переменной frog: " + frog);

        frog *= 10;
        System.out.println("Значение после увеличения в 10 раз: " + frog);

        frog /= 3.5;
        System.out.println("Значение после деления на 3.5: " + frog);

        frog += 4;
        System.out.println("Значение после добавления 4: " + frog);

        // Задача 6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;

        System.out.println("\nЗадача 6:");
        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");

        // Задача 7
        var remainder = boxer2Weight % boxer1Weight;

        System.out.println("\nЗадача 7:");
        System.out.println("Остаток от деления массы второго боксера на массу первого: " + remainder + " кг");

        // Задача 8
        var totalHours = 640;
        var hoursPerEmployee = 8;

        var numberOfEmployees = totalHours / hoursPerEmployee;

        System.out.println("\nЗадача 8:");
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");

        var newNumberOfEmployees = numberOfEmployees + 94;
        var newTotalHours = newNumberOfEmployees * hoursPerEmployee;

        System.out.println("Если в компании работает " + newNumberOfEmployees + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}