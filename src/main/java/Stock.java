public class Stock {
    private String stockId;
    private String name;
    private int quantity;


    public Stock(String  stockId,String name, int quantity)
    {
        this.name=name;
        this. stockId=stockId;
        this.quantity=quantity;

    }
    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getTicker() {
        return name;
    }
}



