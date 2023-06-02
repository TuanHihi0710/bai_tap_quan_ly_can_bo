public class NhanVien extends CanBo{
    private String task;
    public NhanVien(){
    }
    public NhanVien(String inputFullName, String inputDate, String inputGender, String inputAddress, String inputTask){
        super(inputFullName,inputDate,inputGender,inputAddress);
        task=inputTask;
    }
    public String getTask(){
        return task;
    }
    public void setTask(String inputTask){
        task=inputTask;
    }
    public void HienThiThongTinNhanVien(){
        System.out.println("Ho va ten: "+getFullName());
        System.out.println("Ngay thang nam sinh: "+getDate());
        System.out.println("Gioi tinh: "+getGender());
        System.out.println("Dia chi: "+getAddress());
        System.out.println("Cong vien: "+getTask());
    }
}
