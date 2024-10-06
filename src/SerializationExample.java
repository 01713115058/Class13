import java.io.*;

public class SerializationExample implements Serializable {
    private String empName;
    private String mobileNo;
    private String email;
    private String designation;

    public SerializationExample(String empName, String mobileNo, String email, String designation) {
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

    public static void main(String[] args) {
        
        SerializationExample emp = new SerializationExample("John Doe", "1234567890", "john@example.com", "Developer");
        emp.display();
    }}

       