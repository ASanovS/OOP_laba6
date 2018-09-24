public class BaseTrainTicket extends CommonTicket {

    String timeOfDeparture, arrivalTime, departurePoin,
            placeOfArrival, seat,fName,lName;

    public BaseTrainTicket(String number, String date, String price, String timeOfDeparture,
                           String arrivalTime, String departurePoin, String placeOfArrival,
                           String seat, String fName, String lName) {
        super(number, date, price);
        this.timeOfDeparture = timeOfDeparture;
        this.arrivalTime = arrivalTime;
        this.departurePoin = departurePoin;
        this.placeOfArrival = placeOfArrival;
        this.seat = seat;
        this.fName = fName;
        this.lName = lName;
    }
    @Override
    public String preparedTicket(){ //метод наследуемый от интерфейса
        return toString();
    }


    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDeparturePoin() {
        return departurePoin;
    }

    public void setDeparturePoin(String departurePoin) {
        this.departurePoin = departurePoin;
    }

    public String getPlaceOfArrival() {
        return placeOfArrival;
    }

    public void setPlaceOfArrival(String placeOfArrival) {
        this.placeOfArrival = placeOfArrival;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return  "\nБилет на поезд" +
                "\nНомер билета: " + number+ "\nДата: " + date + "\nЦена: "+ price +
                "\nВремя отправления: " +timeOfDeparture + "\nВремя прибытия: " + arrivalTime +
                "\nМесто отправления: " + departurePoin + "\nМесто прибытия: " + placeOfArrival +
                "\nПосадочное место: " + seat + "\nИмя: " + fName + "\nФамилия: " + lName;

    }
}
