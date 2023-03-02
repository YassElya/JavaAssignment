public class Pizza {
    private String name;
    private double price;
    private String topping1;
    private String topping2;
    private String topping3;

    public Pizza(String n,String t1,String t2, String t3){
        this.name=n;
        this.topping1=t1;
        this.topping2=t2;
        this.topping3=t3;
        if(topping1=="" && topping2=="" && topping3==""){
            setPrice(10);
        }
        if(topping1!="" && topping2!="" && topping3!=""){
            setPrice(22);
        }
        if(topping1!="" && topping2=="" && topping3==""){
            setPrice(15);
        }
        if(topping1!="" && topping2!="" && topping3==""){
            setPrice(17.5);
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setTopping1(String topping1){
        this.topping1=topping1;
    }
    public void setTopping2(String topping2){
        this.topping2=topping2;
    }
    public void setTopping3(String topping3){
        this.topping3=topping3;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public String getTopping1(){
        return this.topping1;
    }
    public String getTopping2(){
        return this.topping2;
    }
    public String getTopping3(){
        return this.topping3;
    }
    public String toString(){
        return "The pizza name: "+this.name+", topping 1: "+this.topping1+
        ", topping 2: "+this.topping2+", topping 3: "+this.topping3+", the price: "+this.price;
    }
}
