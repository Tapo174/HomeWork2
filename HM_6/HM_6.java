package HM_6;
import java.util.LinkedList;
//import java.util.Map;
import java.util.Queue;

public class HM_6 {
    public static void main(String[] args) {

        var the_map = new Map();
        
        new Printing();
        System.out.println(Printing.print_map(the_map.get_map()));

        var start = new Wave(the_map.get_map());
        start.wave_alg(new Start(1, 1));
 
        //System.out.println(Printing.print_map(the_map.get_map()));


    }
}
class Map {
int[][] map;

    public Map() {
        int[][] map = {
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
        this.map = map;
    }

    public int[][] get_map() {
        return map;
    }
}
class Wave{
    int[][] map;

    public Wave(int[][] map){
        this.map = map;
    }

    public void wave_alg(Start start_point) {

        Queue<Start> queue = new LinkedList<Start>();
        queue.add(start_point);
        map[start_point.x][start_point.y] = 1;

        while (queue.size() != 0){
            Start cur_pos = queue.remove();

            if(map[cur_pos.x -1][cur_pos.y] == 0){
                queue.add(new Start(cur_pos.y -1, cur_pos.y));
                map[cur_pos.x - 1][cur_pos.y] = map[cur_pos.x][cur_pos.y] + 1;
            }
            if (map[cur_pos.x][cur_pos.y - 1] == 0) {
                queue.add(new Start(cur_pos.y, cur_pos.y - 1));
                map[cur_pos.x][cur_pos.y - 1] = map[cur_pos.x][cur_pos.y] + 1;
            }
            if (map[cur_pos.x + 1][cur_pos.y] == 0) {
                queue.add(new Start(cur_pos.y + 1, cur_pos.y));
                map[cur_pos.x + 1][cur_pos.y] = map[cur_pos.x][cur_pos.y] + 1;
            }
            if (map[cur_pos.x][cur_pos.y + 1] == 0) {
                queue.add(new Start(cur_pos.y, cur_pos.y + 1));
                map[cur_pos.x][cur_pos.y + 1] = map[cur_pos.x][cur_pos.y] + 1;
            }
        }
    }
}
class Start{
int x, y;

    public Start(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int X() {
        return x;
    }

    public int Y(){
        return y;
    }
    @Override
    public String toString() {
    return String.format("x: %d  y: %d", x, y);
    }
}
class Printing{

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