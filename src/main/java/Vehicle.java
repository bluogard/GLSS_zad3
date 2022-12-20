public  class Vehicle {
    private int v_max;
    private String producer;
    private Type type;
    enum Type{
        CAR,
        SHIP,
        PLANE,
        BICYCLE

    }

    public Vehicle(String producer,int v_max,Type type) {
        this.producer = producer;
        this.v_max = v_max;
        this.type=type;
    }

    public int getV_max() {
        return v_max;
    }

    public void setV_max(int v_max) {
        this.v_max = v_max;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
