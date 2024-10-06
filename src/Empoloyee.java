import java.io.IOException;
import java.io.Serializable;

public class Empoloyee implements Serializable {
    private String empName;
    private String mobileNo;
    private String email;
    private String designation;

    public Empoloyee(String empName, String mobileNo, String email, String designation) {
        this.empName = empName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.designation = designation;
    }

    
    public String getEmpName() {
        return empName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

   
    public void display() {
        System.out.println("Name: " + empName + ", Mobile No: " + mobileNo + ", Email: " + email + ", Designation: " + designation);
    }


    public Empoloyee readObject() {
      
        throw new UnsupportedOperationException("Unimplemented method 'readObject'");
    }


}

