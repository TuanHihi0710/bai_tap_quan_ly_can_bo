public class CongNhan extends CanBo{
    private String level;
    public CongNhan(){
    }
    public CongNhan(String inputFullName, String inputDate, String inputGender, String inputAddress, String inputLevel){
        super(inputFullName,inputDate,inputGender,inputAddress);
        level=inputLevel;
    }
    public String getLevel(){
        return level;
    }
    public void setLevel(String inputLevel){
        level=inputLevel;
    }
    public void HienThiThongTinCongNhan(){
        System.out.println("Ho va ten: "+getFullName());
        System.out.println("Ngay thang nam sinh: "+getDate());
        System.out.println("Gioi tinh: "+getGender());
        System.out.println("Dia chi: "+getAddress());
        System.out.println("Cap bac: "+getLevel());
    }
    public String InFileThongTinCongNhan() {
        System.out.println("Ho va ten: " + getFullName());
        System.out.println("Ngay thang nam sinh: " + getDate());
        System.out.println("Gioi tinh: " + getGender());
        System.out.println("Dia chi: " + getAddress());
        System.out.println("Cap bac: " + getLevel());
        return "";
    }
}
