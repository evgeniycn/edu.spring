package edu.spring;

/**
 * Created by Evgeniy on 16.09.2017.
 */
public class Client {

    private String id;

    private String fullName;

    private String greenting;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGreenting() {
        return greenting;
    }

    public void setGreenting(String greenting) {
        this.greenting = greenting;
    }

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public Client() {
    }
}
