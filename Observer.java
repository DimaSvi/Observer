interface Observer {
    void update(String stockName, double newPrice);
}

interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}