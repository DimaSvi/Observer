public class Main {
    public static void main(String[] args) {

        StockExchange exchange = new StockExchange();

        Observer inv1 = new Investor("Олександр", "Apple");
        Observer inv2 = new Investor("Марія", "Google");
        Observer broker1 = new Broker("TradeMax", "Apple");

        exchange.attach(inv1);
        exchange.attach(inv2);
        exchange.attach(broker1);

        System.out.println("📈 Зміна цін:");

        exchange.setStockPrice("Apple", 150);
        exchange.setStockPrice("Google", 2700);

        exchange.detach(inv2);

        System.out.println("\n❌ Після видалення Марії:");

        exchange.setStockPrice("Google", 2800);
    }
}