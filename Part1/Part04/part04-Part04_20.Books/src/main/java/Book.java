/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DENIS
 */
public class Book {
    private String title;
    private int pages;
    private int publicationYear;
    
    public Book(String name, int pages, int year){
        this.title = name;
        this.pages = pages;
        this.publicationYear = year;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getYear(){
        return this.publicationYear;
    }
    
    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear + "\n";
    }
}
