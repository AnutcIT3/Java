package Laptrinhonline;
import java.util.*;

public class GiaoHang {
    static class MonHang {
        int v, t;
        MonHang(int v, int t) {
            this.v = v;
            this.t = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        List<MonHang> ds = new ArrayList<>();
        int maxTime = 0;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();
            ds.add(new MonHang(v, t));
            if (t > maxTime) maxTime = t;
        }

        // Sắp xếp món hàng theo thời hạn t giảm dần
        ds.sort((a, b) -> b.t - a.t);

        // Max Heap để lấy tiền thưởng cao nhất
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        long tongThuong = 0;
        int index = 0;

        // Duyệt ngược từ thời gian tối đa về 1
        for (int time = maxTime; time >= 1; time--) {
            // Thêm tất cả món hàng có deadline >= time vào Heap
            while (index < n && ds.get(index).t >= time) {
                pq.add(ds.get(index).v);
                index++;
            }

            // Mỗi đơn vị thời gian giao 1 món có thưởng cao nhất trong Heap
            if (!pq.isEmpty()) {
                tongThuong += pq.poll();
            }
        }

        System.out.println(tongThuong);
    }
}
