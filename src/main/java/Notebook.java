public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {

        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 900) {
            System.out.println("The price is good.");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight > 800 && this.weight < 1700) {
            System.out.println("The notebook is not very heavy.");
        } else if (this.weight > 1900) {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.year > 2020) {
            System.out.println("This notebook is not available yet.");
        } else if(this.year > 2017 && this.year < 2019) {
            System.out.println("This notebook is new.");
        } else if (this.year < 2016) {
            System.out.println("The notebook is old.");
        }
    }
}