class BaseBusTicket extends CommonTicket {

    String timeOfDeparture, arrivalTime, departurePoin,
            placeOfArrival;

    public BaseBusTicket(String number, String date, String price, String timeOfDeparture,
                         String arrivalTime, String departurePoin, String placeOfArrival) {
        super(number, date, price);
        this.timeOfDeparture = timeOfDeparture;
        this.arrivalTime = arrivalTime;
        this.departurePoin = departurePoin;
        this.placeOfArrival = placeOfArrival;
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

    @Override
    public String toString() {
        return  "\nБилет на автобус" +
                "\nНомер билета: " + number+ "\nДата: " + date + "\nЦена: "+ price +
                "\nВремя отправления: " +timeOfDeparture + "\nВремя прибытия: " + arrivalTime +
                "\nМесто отправления: " + departurePoin + "\nМесто прибытия: " + placeOfArrival ;


    }
}
