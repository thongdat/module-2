package ss4.thuc_hanh;

public class BacSi {
    private int id;
    private String name;

    public BacSi(int id, String name) {
        this.id = id;
        this.name = name;
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
    public void khamBenh (BenhNhan benhNhan){
        benhNhan.setStatus("Đã được khám");
    }
}
