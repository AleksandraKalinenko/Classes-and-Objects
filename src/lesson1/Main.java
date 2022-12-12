package lesson1;

public class Main {

    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
//        System.out.println(levTolstoy.getName() + " " + levTolstoy.getSurname());

        Author aleksandrPushkin = new Author("Александр", "Пушкин");
//        System.out.println(aleksandrPushkin.getName() + " " + aleksandrPushkin.getSurname());

        Book warAndPeace = new Book("Война и мир", levTolstoy, 1863);
        System.out.println(warAndPeace.getName() + "\n" + warAndPeace.getAuthor().getName() + " "
                + warAndPeace.getAuthor().getSurname() + "\n" + warAndPeace.getYear());

        Book evgenyOnegin = new Book("Евгений Онегин", aleksandrPushkin, 1834);
        System.out.println(evgenyOnegin.getName() + "\n" + evgenyOnegin.getAuthor().getName() + " "
                + evgenyOnegin.getAuthor().getSurname() + "\n" + evgenyOnegin.getYear());

        evgenyOnegin.setYear(1833);
        System.out.println("evgenyOnegin.getName = " + evgenyOnegin.getYear());
    }
}
