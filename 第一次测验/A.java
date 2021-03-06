import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 *
 */
class LDDD {
    public int u;// 起点的小岛
    public int v;// 终点的小岛
    public int w;// 使用的天数 也就是权重
    public LDDD(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }
}
public class cyy {
    // 存储每个点的根节点 下标表示该点 值表示该点的根节点
    // 默认每个点的根节点是当前点
    static int[] f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// 小岛的数量
        int m = sc.nextInt();// 桥的数量
        LDDD[] arr = new LDDD[m];// 存储输入的边
        f = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i] = new LDDD(sc.nextInt() - 1, sc.nextInt() - 1, sc.nextInt());
        }
        // 排序 按照使用的天数也就是权重进行从大到小排序
        Arrays.sort(arr, new Comparator<LDDD>() {
            @Override
            public int compare(LDDD o1, LDDD o2) {
                // o1.w > o2.w ? -1 : 1之前这样写没有返回0 然后网站一直报运行错误 看来必须要返回0了
                return o1.w == o2.w ? 0 : (o1.w > o2.w ? -1 : 1);
            }
        });
        // 初始化每个点的根节点 默认是自己
        for (int i = 0; i < n; i++) {
            f[i] = i;
        }
        // pre用来判断是不是今天
        // ans用来统计居民抗议的天数
        int pre = -1, ans = 0;
        // 遍历每一天 开始逆序生成最小生成树 (其实我觉得可以叫成最大生成树)
        for (int i = 0; i < m; i++) {
            // 判断出发点和终点是否已经连通了
            // 说白了就是判断两个点是否形成了回路
            boolean flag = merge(arr[i].u, arr[i].v);
            // 如果该点没有连通那么就说明这条边是必须要有的,如果没有居民就会抗议
            // 注意： 仔细看题如果同一天消失两条边 那么居民还是只会抗议这一天
            if (!flag && arr[i].w != pre) {
                ans++;// 居民抗议的天数加一
                pre = arr[i].w;
            }
        }
        System.out.println(ans);
    }
    // 并查集模板代码
    // 寻找x点的根节点
    public static int Find(int x) {
        if (f[x] == x) {
            return x;
        } else {
            return Find(f[x]);
        }
        // 也可以用三元运算符的写法
        // return f[x]==x?x:Find(f[x]);
    }
    // 判断v点和u点在最小生成树里面是不是连通的
    public static boolean merge(int v, int u) {
        v = Find(v);
        u = Find(u);
        // 判断这两个点是否是同一个根节点
        // 也就是说判断是否为回路(这句话不理解也没关系)
        if (v != u) {
            f[u] = v;
            return false;
        }
        return true;
    }
}