public class Main {

    public static void main(String[] args) {
        Person sarah = new Person("Sarah ", 30);
        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = " + sarah.getAge());
        Person john = new Person("John", 13);
        System.out.println("john.name = " + john.getName());
        System.out.println("john.age = " + john.getAge());
        sarah.setAge(31);
        System.out.println("sarah.getAge() = " + sarah.getAge());

        // Домашнее задание

        Author alexPushkin = new Author("Александр ","Пушкин ");
        Author marinaCvetaeva = new Author("Марина ", "Цветаева ");
        Book evgenyOnegin = new Book("Евгений Онегин ", alexPushkin, 1831);
        Book poems = new Book("Стихотворения ", marinaCvetaeva, 2022);
        System.out.println("Книга " + evgenyOnegin.getTitle() + "Автор " + evgenyOnegin.getAuthor().getFirstName() + evgenyOnegin.getAuthor().getLastName()+ "Год публикации " + evgenyOnegin.getYearOfPublication());
        System.out.println("Книга " + poems.getTitle() + "Автор " + poems.getAuthor().getFirstName() + poems.getAuthor().getLastName()+ "Год публикации " + poems.getYearOfPublication());
        evgenyOnegin.setYearOfPublication(2022);
        System.out.println("Книга " + evgenyOnegin.getTitle() + "Автор " + evgenyOnegin.getAuthor().getFirstName() + evgenyOnegin.getAuthor().getLastName()+ "Год публикации " + evgenyOnegin.getYearOfPublication());



    }

}