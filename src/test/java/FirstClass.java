public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1200,2018);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
notebook.checkYear();
        Notebook heavyNotebook = new Notebook(2000, 1500,2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
heavyNotebook.checkYear();
        Notebook oldNotebook = new Notebook(1600, 500, 2021);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
oldNotebook.checkYear();
    }
}