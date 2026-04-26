class Investor implements Observer {
    private String name;
    private String interestedStock; // 🔥 фільтр

    public Investor(String name, String interestedStock) {
        this.name = name;
        this.interestedStock = interestedStock;
    }

    @Override
    public void update(String stockName, double newPrice) {
        if (interestedStock.equalsIgnoreCase(stockName)) {
            System.out.println("Інвестор " + name +
                    " отримав: " + stockName + " = " + newPrice);
        }
    }
}