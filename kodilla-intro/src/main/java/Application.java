public class Application {

    String name;
    double age;
    double heigt;

    public Application (String name, double age, double heigt) {
        this.name = name;
        this.age = age;
        this.heigt = heigt;
    }
    public String getName()
    {
        return name;
    }

    public double getAge() {
        return age;
    }

    public double getHeigt() {
        return heigt;
    }

    public static void main(String[] args) {

        Application adam = new Application("Adam", 20.5, 178);
        System.out.println(adam.name + adam.heigt + adam.age);
        adam.Application();

    }
    public void Application() {
        if (this.age > 30 && this.heigt > 160) {
            System.out.println("User is older than 30 and higher then 160cm");
        } else {
            System.out.println("User is younger than 30 or lower than 160cm");


        }
    }



}

