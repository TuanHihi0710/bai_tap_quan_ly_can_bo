public class KySu extends CanBo{
    private String branch;
    private String degree;
    public KySu(){
    }
    public KySu(String inputFullName, String inputDate, String inputGender, String inputAddress, String inputBranch, String inputDegree){
        super(inputFullName,inputDate,inputGender,inputAddress);
        branch=inputBranch;
        degree=inputDegree;
    }
    public String getBranch(){
        return branch;
    }
    public String getDegree(){
        return degree;
    }
    public void setBranch(String inputBranch){
        branch=inputBranch;
    }
    public void setDegree(String inputDegree){
        degree=inputDegree;
    }
    public void HienThiThongTinKySu(){
        System.out.println("Ho va ten: "+getFullName());
        System.out.println("Ngay thang nam sinh: "+getDate());
        System.out.println("Gioi tinh: "+getGender());
        System.out.println("Dia chi: "+getAddress());
        System.out.println("Nganh dao tao: "+getBranch());
        System.out.println("Loai bang: "+getDegree());
    }
}
