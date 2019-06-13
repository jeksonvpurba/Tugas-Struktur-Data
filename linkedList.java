/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author jekson viktory purba
 */
import java.util.LinkedList;
import java.util.Scanner;
 
class Node{
    String nama,nim;
    Node next;
}

public class linkedList {
    
    private Node pointer;

    public linkedList() {
        pointer = null;
    }


    
    public void buatNode(String nama,String nim) {
        Node nodeBaru = new Node();
        nodeBaru.nama = nama;
        nodeBaru.nim=nim;
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    } 
    
    public void awal(String nama,String nim) {
        Node awal = new Node();
        awal.nama = nama;
        awal.nim=nim;
        awal.next = pointer;
        pointer = awal;
    }
    
    public void akhir(String nama,String nim){
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.nama = nama;
        baru.nim=nim;
        baru.next = null;
        while(pAkhir != null){
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next; 
        }
        pSblAkhir.next = baru;
    }
    
    public Node depan(){
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus;          
    }
    
    public void belakang(){
        Node hapus = pointer;
        Node belakang=new Node();
        while(hapus.next.next!=null){
            hapus=hapus.next;
        }
        belakang=hapus.next;
        hapus.next=null;
        
    }
    
    public void cetak(String kom) {
        System.out.println(kom+"\n");
        System.out.println("<nama>\t<nim>");
        Node n = pointer;
        while (n!= null) {
            System.out.println(n.nama+"\t"+n.nim);
            n = n.next;
        }

    }
    
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int menu=0,pilih;
        String nama,nim;
        
        linkedList x=new linkedList();
        
        System.out.print("Tekan 'enter' untuk membuat data baru");
        in.nextLine();
        System.out.print("Nama: "); 
        nama=in.nextLine();
        System.out.print("NIM: "); 
        nim=in.nextLine();
        
        x.buatNode(nama, nim);
        System.out.println();
        
        while(menu==0){
            
            System.out.print("Menu\n1.Tambah data di awal\n2.Tambah data di "
                    + "akhir\n3.Menghapus data di awal\n4.Menghapus data di "
                    + "akhir\n5.Cetak data\n0.Keluar\nPilihan: ");
            
            pilih=in.nextInt();
            
            switch(pilih){
                
                case 1:
                    in.nextLine();
                    System.out.print("Masukkan nama: ");
                    nama=in.nextLine();
                    System.out.print("Masukkan NIM: ");
                    nim=in.nextLine();
                    x.awal(nama,nim);
                    System.out.println();
                    break;
                    
                case 2:
                    in.nextLine();
                    System.out.print("Masukkan nama: ");
                    nama=in.nextLine();
                    System.out.print("Masukkan NIM: ");
                    nim=in.nextLine();
                    x.akhir(nama,nim);
                    System.out.println();
                    break;
                    
                case 3:
                    x.depan();
                    System.out.println("Data paling depan sudah dihapus");
                    System.out.println();
                    break;
                    
                case 4:
                    x.belakang();
                    System.out.println("Data paling belakang sudah dihapus");
                    System.out.println();
                    break;
                    
                case 5:
                    x.cetak("Cetak data");
                    System.out.println();
                    break;
                    
                case 0:
                    System.exit(0);
                    
                default:
                    System.out.println("Tidak ada pada pilihan");
                    System.out.println();
                    break;
                    
            }
            
        }
        
    }
}
