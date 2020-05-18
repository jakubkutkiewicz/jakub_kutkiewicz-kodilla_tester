public class User {
    String name;
    double year;

    public User (String name, int year)
    {
        this.name = name;
        this.year = year;
    }
    public String getName()
    {
        return name;
    }

    public double getYear()
    {
        return year;
    }


    public static void main(String args[]) {

        User Anna = new User ("Anna", 30);
        User Jakub =new User ("Jakub",33 );
        User Joanna =new User ("Joanna", 10);
        User Norbi =new User ("Norbi", 20);

        User[] users = {Anna, Jakub, Joanna, Norbi};


            int sum = 0;
            for (int i = 0; i < users.length; i++)
            {
                sum += users[i].getYear();
            }

             double average =0;
            average = sum/ users.length;

            for (int i = 0; i < users.length; i++) {
                if (users[i].getYear() < average) {
                System.out.println(users[i].getName());

            }}}}




