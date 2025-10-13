class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 550.50);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 700.00);
        b1.display();
        b2.display();
    }
}
