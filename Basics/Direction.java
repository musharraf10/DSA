public class Direction {
    public static float getShortestPath(String path){
        int x = 0 , y = 0;                        // N y++
        for(int i = 0 ; i < path.length(); i++){     ↑
            char dir = path.charAt(i);               | 
            //South                                  |
            if(dir == 'S'){           //x-- W < -----|----- > E x++
                y--;                                 |
            }                                        |
            //North                                  ↓
            else if(dir == 'N'){                  // S y--
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        System.out.println(getShortestPath(s));
    }
}
