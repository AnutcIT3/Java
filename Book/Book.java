package Book;
public class Book implements Comparable<Book> {
    private String name;
    private int numOfPages;
    private double price;

    public Book() {
        this.name = null;
        this.numOfPages = 0;
        this.price = 0.0;
    }

    public Book(String name, int numOfPages, double price) {
        this.name = name;
        this.numOfPages = numOfPages;
        this.price = price;
    }

 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    @Override
    public String toString() {
        return String.format("%s\t%d\t%.2f", name, numOfPages, price);
    }

    
    @Override
    public int compareTo(Book that) {
        if (this.price < that.price) {
            return 1;
        } else if (this.price > that.price) {
            return -1; 
        }
        return 0;
    }
}
