package employeeadress;

public class EmployessAddress {
    private Integer addressId;
    private String city;
    private String street;
    private int postCode;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public EmployessAddress(Integer addressId, String city, String street, int postCode) {
        this.addressId = addressId;
        this.city = city;
        this.street = street;
        this.postCode = postCode;
    }
}
