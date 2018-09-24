abstract class CommonTicket implements Ticket {
    //поля класса
    String number, date, price;

    //конструктор класса
    public CommonTicket(String number, String date, String price) {
        this.number = number;
        this.date = date;
        this.price = price;
    }
    @Override
    public String preparedTicket(){ //метод наследуемый от интерфейса
        return toString();
    }

    //сеттеры и геттеры
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Номер билета: " + number+ "\nДата: " + date + "\nЦена: "+ price;
    }


}
