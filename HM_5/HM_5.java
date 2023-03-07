package HM_5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HM_5 {
    public static void main(String[] args) {
        var map = the_map();
        System.out.println(print_map(map));
        int [] start = start(1, 1);
        wave_alg(map, start);
        System.out.println(print_map(map));
    }
    public static int[][] the_map() {
        return new int[][]{
            { -1, -1, -1, -1, -1, -1, -1, -1, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, -1 },
            { -1, 00, -1, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, -1, 00, 00, 00, 00, -1 },
            { -1, 00, 00, -1, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, -1, 00, 00, 00, -1 },
            { -1, 00, 00, 00, -1, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, -1, 00, 00, -1 },
            { -1, 00, 00, 00, 00, -1, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, 00, 00, 00, 00, -1, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, 00, 00, 00, 00, 00, 00, 00, -1 },
            { -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };
    }
    public static void wave_alg(int[][] map, int[] start) {

        Queue<int[]> queue = new LinkedList<int[]>();
        queue.add(start);
        map[start[0]][start[1]] = 1;

        while (queue.size() != 0){
            int[] cur_pos = queue.remove();
            int posX = cur_pos[0];
            int posY = cur_pos[1];

            if(map[posX -1][posY] == 0){
                int[] temp = new int[] {posX - 1, posY };
                queue.add(temp);
                map[posX - 1][posY] = map[posX][posY] + 1;
            }
            if (map[posX][posY - 1] == 0) {
                int[] temp = new int[] { posX, posY - 1 };
                queue.add(temp);
                map[posX][posY - 1] = map[posX][posY] + 1;
              }
              if (map[posX + 1][posY] == 0) {
                int[] temp = new int[] { posX + 1, posY };
                queue.add(temp);
                map[posX + 1][posY] = map[posX][posY] + 1;
              }
              if (map[posX][posY + 1] == 0) {
                int[] temp = new int[] { posX, posY + 1 };
                queue.add(temp);
                map[posX][posY + 1] = map[posX][posY] + 1;
              }
        }
    }
    public static int[] start(int x, int y) {
        return new int[] { x, y };
    }

    public static String print_map(int[][] map){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < map.length; i++){
            for (int j = 0; j < map[j].length; j++) {
                sb.append(String.format("%3d", map[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}