package SerializationTest;

public class Product {
    private int pid;
    private transient int qty;
    private String pname;
    private float price;


    public Product(int pid, int qty, String pname, float price) {
        this.pid = pid;
        this.qty = qty;
        this.pname = pname;
        this.price = price;
    }

    public Product(){

    }

    @Override
    public String toString(){
        return "[" + pid + pname + qty + price + "]";
    }

    public static void main(String[] args) {

    }

    public int getPid() {
        return pid;
    }

    public int getQty() {
        return qty;
    }

    public String getPname() {
        return pname;
    }

    public float getPrice() {
        return price;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
