public class User {
    String name;
    int year;

    public User (String name, int year){
        this.name = name;
        this.year = year;
    }

    public static void main(String[] args) {

    User Anna = new User ("Anna", 30);
    User Jakub =new User ("Jakub",33 );
    User Joanna =new User ("Joanna", 10);
    User Norbi =new User ("Norbi", 20);

    User[] tab = {Anna, Jakub, Joanna, Norbi};

                int sum = 0;
                for (int i = 0; i < tab.length; i++) {
                    sum += tab[i].year;
                    double average = sum / tab.length;
                    if (tab[i].year < average) {
                        System.out.println("Ta osoba ma mniej lat niż średnia wieku " + tab[i].name);

}}}}
