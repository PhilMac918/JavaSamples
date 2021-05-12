import java.util.HashSet;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] graph = { { 1, 3 }, { 0, 2 }, { 1, 3 }, { 0, 2 } };

        System.out.println(canSplit(graph));

    }

    public static boolean canSplit(int[][] graph) {

        HashSet<Integer> resultSet1 = new HashSet<>();
        HashSet<Integer> resultSet2 = new HashSet<>();

        HashSet<Integer> node0 = new HashSet<>();
        HashSet<Integer> node1 = new HashSet<>();
        HashSet<Integer> node2 = new HashSet<>();
        HashSet<Integer> node3 = new HashSet<>();

        node0.add(Integer.valueOf(graph[0][0]));
        node0.add(Integer.valueOf(graph[0][1]));

        node1.add(Integer.valueOf(graph[1][0]));
        node1.add(Integer.valueOf(graph[1][1]));

        node2.add(Integer.valueOf(graph[2][0]));
        node2.add(Integer.valueOf(graph[2][1]));

        node3.add(Integer.valueOf(graph[3][0]));
        node3.add(Integer.valueOf(graph[3][1]));

        if (node0.equals(node1)) {
            resultSet1.add(0);
            resultSet1.add(1);
        } else {
            resultSet1.add(0);
            resultSet2.add(1);
        }

        if (node0.equals(node2)) {
            resultSet1.add(0);
            resultSet1.add(2);
        } else {
            resultSet1.add(0);
            resultSet2.add(2);
        }

        if (node0.equals(node3)) {
            resultSet1.add(0);
            resultSet1.add(3);
        } else {
            resultSet1.add(0);
            resultSet2.add(3);
        }

        System.out.println(resultSet1);
        System.out.println(resultSet2);
        if (resultSet1.size() == 2 && resultSet2.size() == 2 && !(resultSet1.equals(resultSet2))) {
            return true;
        } else {
            return false;
        }
    }
}
