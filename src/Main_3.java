public class Main_3 {

    public static void duration() {
        System.out.println("Процесс приготовления чая занял 7 минут.");
    }

    public static void main(String[] args) {
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

//        addition();
//        calculatePerimeter(lengt: 3.5f, width: 4.5f, room: "Аудитория №3");


    }

    public static void calculatePerimeter(float length, float width, String room) {
        float perimeter = (length + width) *2;
        System.out.println("Периметр комнаты" + room + " = " + perimeter);
    }

    //Возвращаемый метод с входящими параметрами.
    public static int calculateArea(float length, float width) {
        int area = Math.round(length * width);
        return area;
    }

    //Невозвращаемый метод с входящими параметрами
    public static void addition (int num1, int num2, String phrase) {
        System.out.println(phrase + (num1 + num2));
    }

    public static void makeTea() {
        //Невозвращаемый метод без входящих параметров.
        System.out.println("Вскипятить воду.");
        System.out.println("Насыпать заварку.");
        System.out.println("Залить кипятком.");
        System.out.println("Дать настояться.");
        System.out.println("Налить в кружку.");
        System.out.println("Добавить сахар/лимон.");
        duration();
    }
}
