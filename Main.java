
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void SelectionSort(int arr[], int n){
     for(int i=0;i<n-1;i++){
      int min=i;
		  for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min]) min=j;
		  }
		  int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
	   }
  }
  static void BubbleSort(int a[],int n){
    for(int i=0;i<n;i++){
      for(int j=0;j<n-1;j++){
        if(a[j]>a[j+1]){
          int temp = a[j];
          a[j] = a[j+1];
          a[j+1] = temp;
        }
      }
    }
  }
  static void InsetrtionSort(int a[],int n){
    for(int i = 1;i<n;i++){
      int key = a[i];
      int j = i-1;
      while (j>=0 && a[j]> key) {
        a[j+1] =a[j];
        j--;
      }
      a[j+1] = key;
    }
  }
  static void Tai_Xiu(){
    Scanner sc = new Scanner(System.in);
    int t=-1;
    while(t != 0){
    Random rd = new Random();
    int xx1 = rd.nextInt(6)+1;
    int xx2 = rd.nextInt(6)+1;
    int xx3 = rd.nextInt(6)+1;
    int kq =xx1+xx2+xx3;
    System.out.println("chon cuoc (1: tai, 2: xiu)");
    int chon =sc.nextInt();
    if(kq >=11 && kq <= 17 && chon == 1){
        System.out.println("lac ra: "+xx1+" "+xx2+" "+xx3);
        System.out.println("lum tien !");
    }
    else if(kq >=4 && kq<=10 && chon == 2){
        System.out.println("lac ra: "+xx1+" "+xx2+" "+xx3);
        System.out.println("lum tien !");
    }
    else{
        System.out.println("lac ra: "+xx1+" "+xx2+" "+xx3);
        System.out.println("bay tien !");
    }
    System.out.println("99% con bac bo cuoc truoc khi thang lon !\n Ban co muon tiep tuc (1: toi dong tinh, 0: toi khong dong tinh)");
    t = sc.nextInt();
    }
  }
  static void oan_tu_ti(){
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int t = -1;
    while (t!=0) {
      int tay = rd.nextInt(3)+1;
      System.out.println("oan tu ti ra cai gi ra cai nay (1: keo, 2: bua, 3: bao)");
      int nguoi_choi = sc.nextInt();
      if(tay == 1 && nguoi_choi == 2){
        System.out.println("may ra keo\nban ra bua\nBan thang !");
      }
      else if(tay == 2 && nguoi_choi == 3){
        System.out.println("may ra bua\nban ra bao\nBan thang !");
      }
      else if(tay == 3 && nguoi_choi == 1){
        System.out.println("may ra bao\nban ra keo\nBan thang !");
      }
      else if(tay == nguoi_choi){
        System.out.println("Hoa !");
      }
      else{
        System.out.print("ban thua !");
      }
      System.out.println("ban co muon choi tiep khong (1: choi tiep, 0: bo choi)");
      t =sc.nextInt();
    }

  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calendar cal = Calendar.getInstance();
    int Y = cal.get(Calendar.YEAR);
    int M = cal.get(Calendar.MONTH);
    int D = cal.get(Calendar.DATE);
    System.out.println((M+1)+"/"+D+"/"+Y);
    int chon = -1;
    while(chon != 0){
      System.out.println("========tro choi========");
      System.out.print("1: Tai xiu\n2: Oan tu ti\nchon tro choi: ");
      chon = sc.nextInt();
      switch (chon) {
        case 1:
          Tai_Xiu();
          break;
        case 2:
          oan_tu_ti();
          break;
        default:
          break;
      }
    }
    // int nam = cal.get(Calendar.YEAR);
    // System.out.println(nam);
    // int n =sc.nextInt();
    // int[] a = new int[n];
    // for(int i =0;i<n;i++){
    //   a[i] = sc.nextInt();
    // }
    // for (int i = 0; i < n; i++) {
    //         System.out.print(a[i] + " ");
    //     }
    // SelectionSort(a, n);
    //     System.out.println("\nMang sau khi sap xep:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(a[i] + " ");
    //     }
    // int[] b = new int[n];
    // for(int i =0;i<n;i++){
    //   b[i] = sc.nextInt();
    // }
    // for(int i = 0;i<n;i++){
    //   System.out.print(b[i]+" ");
    // }
    // BubbleSort(b,n);
    // System.out.println("\nMang sau khi sap xep:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(b[i] + " ");
    //     }
    // int d[] = {1,5,6,-9,4,0,-5,4};
    // int l = d.length;
    // InsetrtionSort(d, l);
    // System.out.println("\nMang sau khi sap xep:");
    //     for (int i = 0; i < l; i++) {
    //         System.out.print(d[i] + " ");
    //     }
    sc.close();
  }
}


