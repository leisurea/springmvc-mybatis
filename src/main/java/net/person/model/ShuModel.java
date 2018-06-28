package net.person.model;

public class ShuModel {

    public long BookId;

    public String Name;

    public int Number;

    public ShuModel() {
        super();
    }

    public ShuModel(long bookId, String name, int number) {
        super();
        BookId = bookId;
        Name = name;
        this.Number = number;
    }

    public long getBookId() {
        return BookId;
    }

    public void setBookId(long bookId) {
        BookId = bookId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        this.Number = number;
    }
}
