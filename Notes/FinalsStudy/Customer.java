public class Customer {
    private String name, ssn;
    private int age;
    public Customer(String n, String num, int a) {
        name=n;
        ssn=num;
        age=a;
        
    }
   
    public boolean equals(Object o) {
        if(o instanceof Customer) {
            Customer c=(Customer) o;
            if(ssn==c.ssn) {
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public String toString() {
        return ssn+", "+age+", "+name;
    }
    public static void main(String[] args) {
        Customer c1=new Customer("Bob", "4894167", 48);
        Customer c2=new Customer("fue", "4894167", 89);
        System.out.println(c1.equals(c2));
    }
}