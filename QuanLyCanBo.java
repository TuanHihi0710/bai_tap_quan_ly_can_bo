import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo {
    private List<CongNhan> listWorker;
    private List<KySu> listEngineer;
    private List<NhanVien> listStaff;
    public QuanLyCanBo(){
        listWorker= new ArrayList<>();
        listEngineer= new ArrayList<>();
        listStaff = new ArrayList<>();
    }
    public void NhapThongTinCongNhan(String inputFullName, String inputDate, String inputGender, String inputAddress, String inputLevel){
        CongNhan worker = new CongNhan(inputFullName,inputDate,inputGender,inputAddress,inputLevel);
        listWorker.add(worker);
    }
    public void NhapThongTinKySu(String inputFullName, String inputDate, String inputGender, String inputAddress, String inputBranch, String inputDegree){
        KySu engineer = new KySu(inputFullName,inputDate,inputGender,inputAddress,inputBranch,inputDegree);
        listEngineer.add(engineer);
    }
    public void NhapThongTinNhanVien(String inputFullName, String inputDate, String inputGender, String inputAddress, String inputTask){
        NhanVien staff = new NhanVien(inputFullName,inputDate,inputGender,inputAddress,inputTask);
        listStaff.add(staff);
    }
    public void TimKiemThongTinTheoTen(String inputName){
        for (int i = 0; i < listWorker.size(); i++) {
            if (listWorker.get(i).getFullName().contains(inputName)){
                listWorker.get(i).HienThiThongTinCongNhan();
            }
        }
        for (int i = 0; i < listEngineer.size(); i++) {
            if (listEngineer.get(i).getFullName().contains(inputName)){
                listEngineer.get(i).HienThiThongTinKySu();
            }
        }
        for (int i = 0; i < listStaff.size(); i++) {
            if(listStaff.get(i).getFullName().contains(inputName)){
                listStaff.get(i).HienThiThongTinNhanVien();
            }
        }
    }
    public void XuatThongTinDanhSachCongNhan(){
        for (int i = 0; i < listWorker.size(); i++) {
            listWorker.get(i).HienThiThongTinCongNhan();
        }
    }
    public void XuatThongTinDanhSachKySu(){
        for (int i = 0; i < listEngineer.size(); i++) {
           listEngineer.get(i).HienThiThongTinKySu();
        }
    }
    public void XuatThongTinDanhSachNhanVien(){
        for (int i = 0; i < listStaff.size(); i++) {
            listStaff.get(i).HienThiThongTinNhanVien();
        }
    }
    public String XuatThongtinTatCaCacCanBo(){
        String thongTinCanBo = "";
        for (int i = 0; i < listWorker.size(); i++) {
            listWorker.get(i).HienThiThongTinCongNhan();
            thongTinCanBo = "Thong tin danh sach Cong Nhan: \n";
            listWorker.get(i).HienThiThongTinCongNhan();
        }
        for (int i = 0; i < listEngineer.size(); i++) {
            listEngineer.get(i).HienThiThongTinKySu();
            thongTinCanBo = "Thong tin danh sach Ky Su: \n";
            listEngineer.get(i).HienThiThongTinKySu();
        }
        for (int i = 0; i < listStaff.size(); i++) {
            listStaff.get(i).HienThiThongTinNhanVien();
            thongTinCanBo = "Thong tin danh sach Nhan Vien: \n";
            listStaff.get(i).HienThiThongTinNhanVien();
        }
        return thongTinCanBo;
    }
}
