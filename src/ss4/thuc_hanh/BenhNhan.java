package ss4.thuc_hanh;

public class BenhNhan {
    private int id;
    private String name;
    private String status;

    public BenhNhan(){}
    public BenhNhan(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    public int getId() {
        return id;

    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
