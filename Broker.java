class Broker implements Observer {
    private String name;
    private String interestedStock;

    public Broker(String name, String interestedStock) {
        this.name = name;
        this.interestedStock = interestedStock;
    }

    @Override
    public void update(String stockName, double newPrice) {
        if (interestedStock.equalsIgnoreCase(stockName)) {
            System.out.println("Брокер " + name +
                    " реагує: " + stockName + " нова ціна " + newPrice);
        }
    }
}