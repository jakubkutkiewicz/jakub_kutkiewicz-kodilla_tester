public class Notebook {
    String weight;
int price;
int weight2;
int year;


    public Notebook(String weight, int price, int weight2, int year) {
        this.weight = weight;
    this.price = price;
    this.weight2 = weight2;
    this.year = year;


    }
    public void checkPrice() {
        if (this.price < 600 || this.year < 2005) {
            System.out.println("This notebook is very cheap but can be old");
        } else if (this.price > 600 && this.price < 1000 || this.year >2005 && this.year <2015 ) {
    System.out.println("the price is good and laptop is quite fresh");
            }else if (this.price >1000 || this.year >2015  ){
            System.out.println("This notebook is expensive but is like brand new");
        }
            }
            public void checkWeight2() {
        if (this.weight2 < 1000) {
            System.out.println("this notebook is lite");
        }else if (this.weight2 > 1000 && this.weight2 <= 2000){
            System.out.println( "this notebook is medium heavy");
        }else if (this.weight2 > 2000){
                    System.out.println("this notebook is heavy");



        }}}


