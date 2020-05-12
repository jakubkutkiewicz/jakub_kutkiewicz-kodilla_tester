public class SimpleArray {
    public static void main(String[] args) {
        String[] zwierzeta = new String[6];{
            zwierzeta[0] = "kot";
            zwierzeta[1] = "pies";
            zwierzeta[2] = "lew";
            zwierzeta[3] = "tygrys";
            zwierzeta[4] = "puma";
            zwierzeta[5] = "słon";
        }
        String zwierze = zwierzeta[3];
        System.out.println (zwierzeta[3]);
        int numberOfElements = zwierzeta.length;
        System.out.println("W mojej tablicy jest: "+zwierzeta.length +" elementów.");
    }}
