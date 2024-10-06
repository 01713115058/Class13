import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PracticeProduct implements Serializable {
   
    private String name;
    private String category;
    private String brand;
    private int qpt;
    private int price;

    

public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
                                                                                 


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public int getQpt() {
        return qpt;
    }


    public void setQpt(int qpt) {
        this.qpt = qpt;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", category " + category + ", brand: " + brand + ",qpt: " + price);
    }
}
  
 

