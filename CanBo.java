public class CanBo {
    private String fullName;
    private String date;
    private String gender;
    private String address;
    public CanBo(){
    }
    public CanBo(String inputFullName, String inputDate, String inputGender, String inputAddress) {
        fullName = inputFullName;
        date = inputDate;
        gender = inputGender;
        address = inputAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String inputFullName) {
        fullName = inputFullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String inputDate) {
        date = inputDate;
    }

    public String getGender() {
        return gender;
    }

    public void setSex(String inputGender) {
        gender = inputGender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String inputAddress) {
        address = inputAddress;
    }
}
