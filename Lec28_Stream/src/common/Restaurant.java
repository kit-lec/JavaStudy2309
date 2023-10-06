package common;


public class Restaurant {

    private Long id;
    private final String name;
    private String address;

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        return String.format("[id:%d name:%s address:%s]", id, name, address);
    }
}
