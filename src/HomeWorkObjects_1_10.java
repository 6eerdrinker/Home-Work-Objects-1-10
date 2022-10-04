public class HomeWorkObjects_1_10 {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book annaKarenina = new Book("Анна Каренина", levTolstoy, 1878);
        System.out.println(annaKarenina);
        annaKarenina.setPublicationYear(1875);
        System.out.println("Год начала журнальной публикации - " + annaKarenina.getPublicationYear());
        System.out.println();
        Author danteAliguery = new Author("Данте", "Алигьери");
        Book theDivinComedy = new Book("Божественная комедия", danteAliguery, 1472);
        System.out.println(theDivinComedy);
        theDivinComedy.setPublicationYear(1481);
        System.out.println("Год второго варианта издания - " + theDivinComedy.getPublicationYear());

    }
}
