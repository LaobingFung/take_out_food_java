public abstract class Promotion {
    private String type;

    public Promotion(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public abstract double computeDiscount(Order order);
}
