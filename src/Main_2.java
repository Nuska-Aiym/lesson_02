public class Main_2 {
    public static void main(String[] args) {
        int numOfStudents = 25, temperature = 22;
        boolean isRainy = true;

        if (temperature > 15 && temperature < 40) { // true; Логический оператор && - "И";
            System.out.println("Идем в парк.");
        }

        if (temperature < 10 && isRainy) { // false
            System.out.println("Идем в кино.");
        }

        if (numOfStudents > 20 || temperature < 0) { // true; Логический оператор "ИЛИ";
            System.out.println("Идем в кофейню.");
        }

        if (temperature <= 10 || numOfStudents == 10) { //false
            System.out.println("Играем в боулинг.");
        }

        if (temperature > 30 && temperature < 45 || numOfStudents> 20 && isRainy) {
            System.out.println("Едем в горы.");
        }

        if (isRainy) {
            System.out.println("Возьмите зонт.");
        }

        if (!isRainy) { //Логический оператор отрицания "Не".
            System.out.println("Идем купаться.");
        }
    }
}
