package org.example;

public class book {
    private String title;
    private String publisher;
    private int year;

    public book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String Title() {
        return title;
    }

    public String Publisher() {
        return publisher;
    }

    public int Year() {
        return year;
    }

    @Override
    public String toString() {
        return "book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}
