package walid.djebbouri.demo.dto;

public class UserWithFatherDto {

    private String childName;
    private String fatherName;

    public UserWithFatherDto(String childName, String fatherName) {
        this.childName = childName;
        this.fatherName = fatherName;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }
}
