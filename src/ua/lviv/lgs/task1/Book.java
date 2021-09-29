package ua.lviv.lgs.task1;

import java.util.Objects;

public class Book {
    @MyAnnotation (purpose = "This is the name of the book")
    private String nameOfBook;
    @MyAnnotation (purpose = "This is author name of this book")
    private String authorName;
    private int numberOfPages;
    private int yearOfPublishing;

    public Book (String nameOfBook, String authorName, int numberOfPages, int yearOfPublishing) {
        this.nameOfBook = nameOfBook;
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
        this.yearOfPublishing = yearOfPublishing;
    }

    public void setNameOfBook ( String nameOfBook ) {
        this.nameOfBook = nameOfBook;
    }

    public void setAuthorName ( String authorName ) {
        this.authorName = authorName;
    }

    public void setNumberOfPages ( int numberOfPages ) {
        this.numberOfPages = numberOfPages;
    }

    public void setYearOfPublishing ( int yearOfPublishing ) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getNameOfBook ( ) {
        return nameOfBook;
    }

    public String getAuthorName ( ) {
        return authorName;
    }

    public int getNumberOfPages ( ) {
        return numberOfPages;
    }

    public int getYearOfPublishing ( ) {
        return yearOfPublishing;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages
               && yearOfPublishing == book.yearOfPublishing
               && nameOfBook.equals ( book.nameOfBook )
               && authorName.equals ( book.authorName );
    }

    @Override
    public int hashCode ( ) {
        return Objects.hash ( nameOfBook , authorName , numberOfPages , yearOfPublishing );
    }

    @Override
    public String toString ( ) {
        return "Book{" +
               "nameOfBook='" + nameOfBook + '\'' +
               ", authorName='" + authorName + '\'' +
               ", numberOfPages=" + numberOfPages +
               ", yearOfPublishing=" + yearOfPublishing +
               '}';
    }
}
