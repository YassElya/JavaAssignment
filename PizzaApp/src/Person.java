import java.util.Scanner;

public class Person {
    private String name;
    private double age;
    private Pizza pizza;
    
    public Person(String n, double a){
        this.name=n;
        this.age=a;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setAge(double a){
        this.age=a;
    }
    public void setPizza(Pizza pizza){
        this.pizza=pizza;
    }
    public String getName(){
        return this.name;
    }
    public double getAge(){
        return this.age;
    }
    public Pizza getPizza(){
        return this.pizza;
    }
    public void Order(){
        String a="";
        while(a!="yes"){
            System.out.println("Please input the name of the pizza you want to order");
            System.out.println("with the three toppings you wish to have on your pizza.");
            Scanner input=new Scanner(System.in);
            String nm=input.nextLine();
            String top1=input.nextLine();
            String top2=input.nextLine();
            String top3=input.nextLine();
            Pizza pz=new Pizza(nm,top1,top2,top3);
            System.out.println(pz);
            System.out.println("Are you sure that this is the pizza you want?");
            a=input.nextLine();
            input.close();
         }
    }
}
