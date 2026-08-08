public class storyBook {
    String title;
    String author;
    int pages;

    public Book(String t, String a, int p) {
        this.title = t;
        this.author = a;
        this.pages = p;
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages);
    }

      public static void main(String[] args) {
    Book b1 = new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 309);

    Book b2 = new Book("The Hobbit", "J.R.R. Tolkien", 310);

    Book b3 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1178);

    Book b4 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 200);
}
    
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
