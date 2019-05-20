/**
 * <h1>Shipping Address</h1> Represents a shipping address
 */
public class ShippingAddress {
	//TODO
    String name;
    String address;
    String city;
    String state;
    int zipCode;

    public ShippingAddress() {
        name = "";
        address = "";
        state = "";
        zipCode = 0;
    }

    ShippingAddress(String name, String address, String city, String state, int zipCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getzipCode() {
        return zipCode;
    }

    public void setzipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}