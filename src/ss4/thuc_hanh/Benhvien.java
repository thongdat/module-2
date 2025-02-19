package ss4.thuc_hanh;

public class Benhvien {
    public static void main(String[] args) {

        BenhNhan benhNhan1 = new BenhNhan();
        benhNhan1.setId(1);
        benhNhan1.setName("Đạt");
        benhNhan1.setStatus("Chưa được khám");

        BenhNhan benhNhan2 = new BenhNhan();
        benhNhan2.setId(2);
        benhNhan2.setName("Nam");
        benhNhan2.setStatus("Chưa được khám");
        System.out.println("ID: " + benhNhan1.getId() +"Name: " + benhNhan1.getName() +"Status: " + benhNhan1.getStatus());
        System.out.println("ID: " + benhNhan2.getId() +"Name: " + benhNhan2.getName() +"Status: " + benhNhan2.getStatus());

        BacSi bacSi = new BacSi (1, "đạt");
        System.out.println("ID: " + bacSi.getId() +"Name " + bacSi.getName());

        bacSi.khamBenh(benhNhan1);
        System.out.println("ID: " + benhNhan1.getId() +"Name: " + benhNhan1.getName() +"Status: " + benhNhan1.getStatus());
        System.out.println("ID: " + benhNhan2.getId() +"Name: " + benhNhan2.getName() +"Status: " + benhNhan2.getStatus());

    }
}
