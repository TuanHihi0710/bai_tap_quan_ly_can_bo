import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 4 để chọn Menu:");
                System.out.println("1: Nhập thông tin mới cho cán bộ");
                System.out.println("2: Tìm kiếm theo họ tên");
                System.out.println("3: Hiển thị thông tin về danh sách các cán bộ");
                System.out.println("4: Xuat thong tin tat ca cac can bo.");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 5) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhập thông tin mới cho cán bộ");
                    System.out.println("1: Nhập thông tin mới cho công nhan");
                    System.out.println("2: Nhập thông tin mới cho kỹ sư");
                    System.out.println("3: Nhập thông tin mới cho nhân viên");
                    int chon = sc.nextInt();
                    if (chon < 1 || chon > 3) {
                        System.out.println("Nhap sai gia tri vui long nhap lai");
                    } else if (chon == 1) {
                        System.out.println("Nhập thông tin mới cho công nhan");
                        System.out.println("Nhập vào họ và tên");
                        Scanner scName = new Scanner(System.in);
                        String inputFullName = scName.nextLine();
                        System.out.println("Nhập vào ngày sinh");
                        Scanner scDate = new Scanner(System.in);
                        String inputDate = scDate.nextLine();
                        System.out.println("Nhập vào giới tinh");
                        Scanner scGender = new Scanner(System.in);
                        String inputGender = scGender.nextLine();
                        System.out.println("Nhập vào địa chỉ");
                        Scanner scAddress = new Scanner(System.in);
                        String inputAddress = scAddress.nextLine();
                        System.out.println("Nhập vào cấp bậc");
                        Scanner scLevel = new Scanner(System.in);
                        String inputLevel = scLevel.nextLine();
                        quanLyCanBo.NhapThongTinCongNhan(inputFullName, inputDate, inputGender, inputAddress, inputLevel);
                    } else if (chon == 2) {
                        System.out.println("Nhập thông tin mới cho kỹ sư");
                        System.out.println("Nhập vào họ và tên");
                        Scanner scName = new Scanner(System.in);
                        String inputFullName = scName.nextLine();
                        System.out.println("Nhập vào ngày sinh");
                        Scanner scDate = new Scanner(System.in);
                        String inputDate = scDate.nextLine();
                        System.out.println("Nhập vào giới tinh");
                        Scanner scGender = new Scanner(System.in);
                        String inputGender = scGender.nextLine();
                        System.out.println("Nhập vào địa chỉ");
                        Scanner scAddress = new Scanner(System.in);
                        String inputAddress = scAddress.nextLine();
                        System.out.println("Nhập vào ngành đào tạo");
                        Scanner scBranch = new Scanner(System.in);
                        String inputBranch = scBranch.nextLine();
                        System.out.println("Nhập vào loại bằng");
                        Scanner scDegree = new Scanner(System.in);
                        String inputDegree = scDegree.nextLine();
                        quanLyCanBo.NhapThongTinKySu(inputFullName, inputDate, inputGender, inputAddress, inputBranch,inputDegree);
                    } else if (chon == 3) {
                        System.out.println("Nhập thông tin mới cho nhân viên");
                        System.out.println("Nhập vào họ và tên");
                        Scanner scName = new Scanner(System.in);
                        String inputFullName = scName.nextLine();
                        System.out.println("Nhập vào ngay sinh");
                        Scanner scDate = new Scanner(System.in);
                        String inputDate = scDate.nextLine();
                        System.out.println("Nhập vào giới tinh");
                        Scanner scGender = new Scanner(System.in);
                        String inputGender = scGender.nextLine();
                        System.out.println("Nhập vào địa chỉ");
                        Scanner scAddress = new Scanner(System.in);
                        String inputAddress = scAddress.nextLine();
                        System.out.println("Nhập vào công việc");
                        Scanner scTask = new Scanner(System.in);
                        String inputTask = scTask.nextLine();
                        quanLyCanBo.NhapThongTinNhanVien(inputFullName, inputDate, inputGender, inputAddress, inputTask);
                    }
                } else if (nhap == 2) {
                    System.out.println("Tìm kiếm theo họ tên");
                    System.out.println("Nhập tên cán bộ");
                    Scanner scName = new Scanner(System.in);
                    String inputName = scName.nextLine();
                    quanLyCanBo.TimKiemThongTinTheoTen(inputName);
                } else if (nhap == 3) {
                    System.out.println("Xuất thông tin cán bộ");
                    System.out.println("1: Xuất thông tin công nhân");
                    System.out.println("2: Xuất thông tin kỹ sư");
                    System.out.println("3: Xuất thông tin nhân viên");
                    int nhapGiaTri = sc.nextInt();
                    if (nhapGiaTri < 1 || nhapGiaTri > 3) {
                        System.out.println("Nhap sai gia tri vui long nhap lai");
                    } else if (nhapGiaTri == 1) {
                        System.out.println("Xuất thông tin công nhân");
                        quanLyCanBo.XuatThongTinDanhSachCongNhan();
                    } else if (nhapGiaTri == 2) {
                        System.out.println("Xuất thông tin kỹ sư");
                        quanLyCanBo.XuatThongTinDanhSachKySu();
                    } else if (nhapGiaTri == 3) {
                        System.out.println("Xuất thông tin nhân viên");
                        quanLyCanBo.XuatThongTinDanhSachNhanVien();
                    }
                } else if (nhap==4) {
                    System.out.println("Xuat thong tin tat ca danh sach cac can bo");
                    quanLyCanBo.XuatThongtinTatCaCacCanBo();
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 5);

        String thongTinCanBo = quanLyCanBo.XuatThongtinTatCaCacCanBo();
        System.out.println("");
        System.out.println(thongTinCanBo);
        try {
            File file = new File("sample1.txt");

            boolean value = file.exists();
            if (value) {
                System.out.println("File có tồn tại");
            } else {
                System.out.println("file không tồn tại");
            }
            String date = thongTinCanBo;
            File file1 = new File("sample1.txt");
            FileWriter fileWriter = new FileWriter(file1.getAbsoluteFile(), false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(date);
            System.out.println("Ghi de thanh cong");
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception ex) {
            System.out.println("Doc file that bai");
        }
    }
}