public class App {
    public static void main(String[] args) throws Exception {
        Person p1=new Person("Yassine",20);
        Person p2=new Person("Ahmed",24);
        Person p3=new Person("Grandpa",55);
        System.out.println("the first person's order");
        p1.Order();
        p1.getPizza();
        p1.toString();
        System.out.println("the second person's order");
        p2.Order();
        p2.getPizza();
        p2.toString();
        System.out.println("the third person's order");
        p3.Order();
        p3.getPizza();
        p3.toString();
    }
}
