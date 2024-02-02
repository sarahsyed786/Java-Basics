class Laptop
{
    public String brand;
    public int price;
    public String toString() {
        return "Laptop [brand=" + brand + ", price=" + price + "]";
    }
  
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + price;
        return result;
    }
 
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    

    
}


public class HashCodes {

    public static void main(String[] args) {
        Laptop obj =  new Laptop();
        obj.brand = "Lenovo";
        obj.price = 2500;


        Laptop obj2 = new Laptop();
        obj2.brand = "Lenovo";
        obj2.price = 2500;

        obj.toString();
        System.out.println( obj.equals(obj2));
       

    }
    
}
