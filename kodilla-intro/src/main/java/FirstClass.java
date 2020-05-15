
public class FirstClass {
    public static void main(String[] args) {{
        Notebook notebook = new Notebook("600g",600, 600, 2000,2);
        System.out.println(notebook.weight + " " + notebook.price + " YEAR " +notebook.year+ notebook.average);
        notebook.checkPrice();
        notebook.checkWeight2();
        notebook.average();

        Notebook heavyNotebook = new Notebook("2200g", 800, 2200, 2010);
        System.out.println(heavyNotebook.weight +" "+ heavyNotebook.price + " YEAR " +heavyNotebook.year );
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight2();

        Notebook oldNotebook = new Notebook("1200g", 2000 , 1200, 2020);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " YEAR "+ oldNotebook.year );
        oldNotebook.checkPrice();
        oldNotebook.checkWeight2();



    }


}}

