public class TrainTicketLux extends BaseTrainTicket{

    boolean coffee, wifi;

    public TrainTicketLux(String number, String date, String price, String timeOfDeparture,
                          String arrivalTime, String departurePoin, String placeOfArrival,
                          String seat, String fName, String lName, boolean coffee, boolean wifi) {
        super(number, date, price, timeOfDeparture, arrivalTime,
                departurePoin, placeOfArrival, seat, fName, lName);
        this.coffee = coffee;
        this.wifi = wifi;
    }
    @Override
    public String preparedTicket(){ //метод наследуемый от интерфейса
        return toString();
    }

    public boolean getCoffee() {
        return coffee;
    }

    public void setCoffee(boolean coffe) {
        this.coffee = coffe;
    }

    public boolean getWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return  "\nБилет на поезд класса Lux" +
                "\nНомер билета: " + number+ "\nДата: " + date + "\nЦена: "+ price +
                "\nВремя отправления: " +timeOfDeparture + "\nВремя прибытия: " + arrivalTime +
                "\nМесто отправления: " + departurePoin + "\nМесто прибытия: " + placeOfArrival +
                "\nПосадочное место: " + seat + "\nИмя: " + fName + "\nФамилия: " + lName +
                "\nКофе: " + coffee + "\nИнтернет: " + wifi;
    }
}
