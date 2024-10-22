
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GiangVien{
    private String ma,name,major;
    public static int stt=0;

    public GiangVien() {
    }

    public GiangVien(String name, String major) {
        stt++;
        this.ma="GV"+String.format("%02d",stt);
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getTen(){
        String[] a=getName().split("\\s+");
        return a[a.length-1];
    }
    public String getMajor() {
        String[] a=this.major.toUpperCase().split("\\s+");
        String res="";
        for(String x: a){
            res+=Character.toString(x.charAt(0));
        }
        return res;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return ma + " " + name + " " + getMajor();
    }
    
}
public class J05025_SAP_XEP_DS_GIANG_VIEN {
    public static Scanner sc=new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<GiangVien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String name=sc.nextLine();
            String major=sc.nextLine();
            GiangVien gv=new GiangVien(name,major);
            list.add(gv);
        }
        Collections.sort(list, new Comparator<GiangVien>(){
            @Override
            public int compare(GiangVien a,GiangVien b){
                return a.getTen().compareTo(b.getTen());
            }
        });
        for(GiangVien x: list){
            System.out.println(x);
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin.