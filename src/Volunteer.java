public class Volunteer {
    private String name;
    private String email;
    private String phone;
    private String address;

    public Volunteer(String name, String email, String phone, String address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    // Display volunteer info
    public String getDetails() {
        return "Name: " + name + " | Email: " + email + " | Phone: " + phone + " | Address: " + address;
    }
}
