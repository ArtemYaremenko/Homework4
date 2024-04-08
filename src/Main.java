public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("\nTask 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task 2
        System.out.println("\nTask 2");
        int outdoorTemperature = 19;
        if (outdoorTemperature < 5) {
            System.out.println("На улице " + outdoorTemperature + " градусов, нужно одеть шапку");
        } else {
            System.out.println("На улице " + outdoorTemperature + " градусов, можно идти без шапки");
        }

        //Task 3
        System.out.println("\nTsak 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость \" + speed + \" , то можно ездить спокойно");
        }

        //Task 4
        System.out.println("\nTask 4");
        if (age > 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

        //Task 5
        System.out.println("\nTask 5");
        int babyAge = 7;
        if (babyAge < 5) {
            System.out.println("Если возраст ребенка равен " + babyAge + ", то он не может кататься на аттракционе");
        } else if (babyAge > 5 && babyAge < 14) {
            System.out.println("Если возраст ребенка равен " + babyAge + ", то он может кататься только в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + babyAge + ", то он может кататься без сопровождения взрослого");
        }
        //Task 6

        System.out.println("\nTask 6");
        int totalCarCapacity = 102;
        int carSeats = 60;
        int carStanding = totalCarCapacity - carSeats;
        int passengers = 23;
        int freeSeats;
        int freeStands;
        int passengersOut;
        if (passengers <= totalCarCapacity) {
            if (passengers <= carSeats) {
                freeSeats = carSeats - passengers;
                System.out.println("В вагоне осталось " + freeSeats + " сидячих мест и " + carStanding + " стоячих мест");
            } else {
                freeStands = carStanding - (passengers - carSeats);
                if (freeStands != 0) {
                    System.out.println("В вагоне не осталось сидячих мест, но осталось " + freeStands + " стоячих мест");
                }
                else {
                    System.out.println("Вагон полный");
                }
            }
        }
        else {
            passengersOut = passengers - totalCarCapacity;
            System.out.println("Вагон полный, не хватило места " + passengersOut + " пассажирам");
        }

        //Task 7
        System.out.println("\nTask 7");
        //Даны три числа:
        //
        //int one;
        //int two;
        //int three;
        //
        //С помощью условного оператора и конструкции else напишите программу, которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.
        int one = 1;
        int two = 3;
        int three = 2;
        if (one > two && one > three) {
            System.out.println(one);
        }
        else if (two > one && two > three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}