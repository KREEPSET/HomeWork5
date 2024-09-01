public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int age1 = 14;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ты совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ты не достиг совершеннолетния, нужно немного подождать.");
        }
        System.out.println();
        System.out.println("Задание 2");

        int temperature1 = 18;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градусов" + ", нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature1 + " градусов" + ", можно идти без шапки.");
        }
        System.out.println();
        System.out.println("Задание 3");

        int speed1 = 76;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed1 + ", можно ездить спокойно.");
        }
        System.out.println();
        System.out.println("Задание 4");

        int ageOne = 28;
        if (ageOne >= 2 && ageOne <= 6) {
            System.out.println("Ваш возраст " + ageOne + " , Вы должны ходить в садик");
        }
        if (ageOne >= 7 && ageOne <= 18) {
            System.out.println("Ваш возраст " + ageOne + " , Вы должны ходить в школу");
        }
        if (ageOne > 18 && ageOne <= 24) {
            System.out.println("Ваш возраст " + ageOne + " , Вы должны ходить в университет");
        }
        if (ageOne > 24) {
            System.out.println("Ваш возраст " + ageOne + " , Вы должны ходить на работу");
        }
        System.out.println();
        System.out.println("Задание 5");

        int ageKid = 19;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , то ему нельзя кататься на аттракционе.");
        }
        if (ageKid > 5 && ageKid < 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , то ему можно кататься в сопровождении взрослого.");
        }
        if (ageKid >= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + " , то ему можно кататься без сопровождения взрослого.");
        }
        System.out.println();

        System.out.println("Задание 6");

        int people = 110;
        int carriageTrain = 102;
        int seating = 60;

        if (people < seating) {
            System.out.println("В вагоне есть сидячие места.");
        }
        if (people >= seating && people < carriageTrain) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (people >= carriageTrain) {
            System.out.println("Мест нет");
        }
        System.out.println();

        System.out.println("Задание 7");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Three is biggest");
        } else {
            if (two >= three) {
                System.out.println("Two biggest");
            } else {
                System.out.println("Three biggest");
            }
        }
    }
}













