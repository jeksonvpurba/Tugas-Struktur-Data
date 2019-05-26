import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        String key;
        String [] data={"secant","biseksi"};
        String hasil="Data tidak ditemukan";
        
        System.out.println("kata kunci: \n-Secant\n-Biseksi");
        System.out.print("Masukkan kata kunci yang dicari :");
        key=input.next();
        
        for (int i=0;i<=1;i++){
            if (cari(data[i],key.toLowerCase())==true){
                hasil="Data ditemukan";
            }
        }
        System.out.println("kata kunci yang dicari : "+key);
        System.out.println(hasil);     
    }
    
    
    
    public static boolean cari(String data,String key) {
        int a=key.compareTo("secant");
        int b=key.compareTo("biseksi");
        boolean ada=false;
        
        if (a==0||b==0){
            ada=true;
        }
        return ada;
    }
}
