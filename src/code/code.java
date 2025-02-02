
package code;

public class code {
   private String first_name;
   private String last_name;
   private String address;
   private String telephone_number;

    public code(String first_name, String last_name, String address, String telephone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.telephone_number = telephone_number;
    }

    public code() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }

}
