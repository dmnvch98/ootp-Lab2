package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Library
{
    ArrayList<Reader> readers = new ArrayList<>();
//    ArrayList<Book> books = new ArrayList<>();
    HashMap<Integer, Book> booksMap = new HashMap<>();
    private ArrayList<Booking> bookings;
    private Double balance = 0.0;

    public Library()
    {

    }
    void newReader(Reader reader)
    {
        readers.add(reader);
    }

    void newBook(Book book)
    {
       // books.add(book);
        booksMap.put(book.getId(), book);
    }

    private Void newBooking()
    {
        return null;
    }

    Book searchBook(int bookID)
    {
        return booksMap.get(bookID);
    }

    private Reader searchReader(Long readerID)
    {
        return null;
    }

    private Booking searchBooking(Long bookingID)
    {
        return null;
    }

    private void getMoney(Long amount)
    {

    }

    public HashMap<Integer, Book> getBooks() {
        return booksMap;
    }

}
