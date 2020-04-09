package com.controller;

import com.dao.Library;
import com.data.Book;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book ("winnie the pooh", "alex milan", 350, 2019);
        Book book2 = new Book("harry potter", "joan rollings", 500, 2000);
        Book book3 = new Book("hobbit", "Tolkien", 9000,  1980);
        Book book4 = new Book("song of ice and fire", "george martin", 9000, 1905);
        Book book5 = new Book ("Kapital", "Karl Marx", 500, 1867);


        Library myLab = new Library(100);
        myLab.addBook(book1);
        myLab.addBook(book2);
        myLab.addBook(book3);
        myLab.addBook(book4);
        myLab.addBook(book5);

        myLab.display();
    /*    myLab.deleteBook(book4);
        System.out.println();
        myLab.display();
        System.out.println();
        myLab.searchBookByAuthor("Alex Milan");
        myLab.searchBookByAuthor("Lev Tolstoy");*/
        System.out.println(myLab.getOldestYearOfBook());
    }
}
