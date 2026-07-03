package Laptrinhonline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Demdothicon {
    public static void main(String[] args) throws IOException {
        // Tối ưu hóa I/O giống như ios_base::sync_with_stdio(0); cin.tie(NULL);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // Đọc dòng đầu tiên chứa N và M
        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // Khởi tạo danh sách kề (ArrayList trong ArrayList)
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Đọc các cạnh của đồ thị
        for (int i = 0; i < m; i++) {
            line = br.readLine();
            // Xử lý trường hợp dòng trống hoặc dư thừa
            while (line != null && line.trim().isEmpty()) {
                line = br.readLine();
            }
            if (line == null) break;
            
            st = new StringTokenizer(line);
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            u--; v--; // Chuyển về index 0, 1, 2... giống u--, v--
            
            adj.get(u).add(v);
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        long res = 0; // Dùng kiểu long để tránh tràn số khi res tăng lớn

        // Duyệt đồ thị theo logic của bạn
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> neighbors = adj.get(i);
            
            for (int j = 0; j < neighbors.size(); j++) {
                int nextNode = neighbors.get(j);
                ArrayList<Integer> nextNeighbors = adj.get(nextNode);
                
                for (int k = 0; k < nextNeighbors.size(); k++) {
                    int targetNode = nextNeighbors.get(k);
                    mp.put(targetNode, mp.getOrDefault(targetNode, 0) + 1);
                }
            }

            // Tính kết quả tổ hợp chập 2 từ tần suất xuất hiện
            for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
                long count = x.getValue();
                res += count * (count - 1) / 2;
            }
            
            mp.clear(); // Xóa map sau mỗi vòng lặp đỉnh i
        }

        System.out.print(res);
    }
}