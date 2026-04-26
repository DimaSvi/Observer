import java.util.*;

class StockExchange implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    private int maxObservers = 5; // 🔥 ліміт

    public void setStockPrice(String stockName, double newPrice) {
        this.stockName = stockName;
        this.stockPrice = newPrice;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        if (observers.size() >= maxObservers) {
            System.out.println("Ліміт підписників досягнуто!");
            return;
        }
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);
        }
    }
}