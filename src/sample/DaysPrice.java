package sample;

public enum DaysPrice {
    A(15,0), B(30,5), C(45,10);

    private final int days;
    private final int price;

    DaysPrice(int days, int price) {
        this.days = days;
        this.price = price;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return days + " дней. Цена: " + price +"р.";
    }
}
