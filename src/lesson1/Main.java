package lesson1;

public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");

        Author aleksandrPushkin = new Author("Александр", "Пушкин");
        System.out.println(aleksandrPushkin);

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1863);
        System.out.println(warAndPeace);

        Book evgenyOnegin = new Book("Евгений Онегин", aleksandrPushkin, 1834);

        evgenyOnegin.setYear(1833);
    }
}
