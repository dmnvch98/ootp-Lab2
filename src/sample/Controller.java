package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javafx.event.ActionEvent;

import java.util.Arrays;
import java.util.HashMap;

public class Controller {
    int BookForBookingId;
    Book BookForBooking;
    Library library = new Library();
    ObservableList<Book> booksList = FXCollections.observableArrayList();
    ObservableList<Reader> readerList = FXCollections.observableArrayList();
    DaysPrice chosenDuration;

    @FXML
    private TextField author;

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private TextField year;

    @FXML
    void addBook() {
        Book book = new Book(name.getText(), Integer.parseInt(year.getText()), author.getText(), Integer.parseInt(price.getText()));
        library.newBook(book);
        clearFields();
        booksList.add(book);
        booksMenu.setItems(booksList);
    }

    @FXML
    private ComboBox<Book> booksMenu;

    @FXML
    private ComboBox<Reader> readersMenu;

    @FXML
    private Text totalPrice;

    @FXML
    private ComboBox<DaysPrice> duration;

    @FXML
    private Text status;

    @FXML
    void addBooking() {
        booksList.remove(getSelectedBook());
    }

    @FXML
    void calculate() {
        totalPrice.setText((getSelectedBook().getPrice() + getSelectedDuration().getPrice()) + "р.");
    }

    @FXML
    void initialize() {
        //booksMenu.setOnAction(this::getSelectedBook);
        duration.getItems().setAll((DaysPrice.values()));
        //duration.setOnAction(this::getSelectedDuration);
    }

//    private void getSelectedBook(ActionEvent actionEvent) {
//        try {
//            BookForBookingId = booksMenu.getSelectionModel().getSelectedItem().getId();
//            BookForBooking = library.searchBook(BookForBookingId);
//        } catch (NullPointerException ignored){}
//    }

    private Book getSelectedBook() {
        try {
            return booksMenu.getSelectionModel().getSelectedItem();
        } catch (NullPointerException ignored){}
        return null;
    }

//    private void getSelectedDuration(ActionEvent actionEvent) {
//        try {
//            chosenDuration = duration.getSelectionModel().getSelectedItem();
//        } catch (NullPointerException ignored){}
//    }

    private DaysPrice getSelectedDuration() {
        try {
            return duration.getSelectionModel().getSelectedItem();
        } catch (NullPointerException ignored){}
        return null;
    }

    void clearFields(){
        name.clear();
        year.clear();
        author.clear();
        price.clear();
        balance.clear();
        FIO.clear();
    }

    @FXML
    private TextField balance;

    @FXML
    private TextField FIO;

    @FXML
    void addReader() {
        Reader reader = new Reader(FIO.getText(), Integer.parseInt(balance.getText()));
        library.newReader(reader);
        clearFields();
        readerList.add(reader);
        readersMenu.setItems(readerList);
    }












}
