//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend - 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var summaryWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Суммарная масса двух бойцов " + summaryWeight);
        System.out.println("Разность веса двух бойцов " + Math.abs(firstBoxerWeight - secondBoxerWeight));

        // Задача 7
        var differenceOfWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления веса " + differenceOfWeight);

        // Задача 8.1
        var summaryHours = 640;
        var hoursPerWorker = 8;
        var quantityOfWorkers = summaryHours / 8;
        System.out.println("Всего работников в компании — " + quantityOfWorkers + " человек");

        // Задача 8.2
        quantityOfWorkers = quantityOfWorkers + 94;
        hoursPerWorker = summaryHours / quantityOfWorkers;
        System.out.println("Если в компании работает " + quantityOfWorkers + " человек, то всего " + hoursPerWorker + " часов работы может быть поделено между сотрудниками");
    }
}