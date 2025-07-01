// https://school.programmers.co.kr/learn/courses/30/lessons/388353
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Point {
    public int x;
    public int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    public void bfs(String[][] warehouse, String target) {
        int warehouseHeight = warehouse.length;
        int warehouseWidth = warehouse[0].length;
        
        boolean[][] outsides = new boolean[warehouseHeight][warehouseWidth];
        boolean[][] visits = new boolean[warehouseHeight][warehouseWidth];
        int[] dx = new int[]{1, -1, 0, 0};
        int[] dy = new int[]{0, 0, 1, -1};
        
        Queue<Point> deleteList = new LinkedList<>();

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));

        while( !queue.isEmpty() ) {
            Point p = queue.poll();

            if( visits[p.y][p.x] ) {
                continue;
            }

            outsides[p.y][p.x] = true;
            visits[p.y][p.x] = true;

            for( int i = 0; i < 4; i++ ) {
                int nx = p.x + dx[i];
                int ny = p.y + dy[i];

                if( nx < 0 || nx >= outsides[0].length || ny < 0 || ny >= outsides.length ) {
                    continue;
                }
            
                if( target.equals(warehouse[ny][nx]) ) {
                    deleteList.offer(new Point(nx, ny));
                }
                
                if( visits[ny][nx] ) {
                    continue;
                } else if( !".".equals(warehouse[ny][nx]) ) {
                    continue;
                }

                queue.offer(new Point(nx, ny));
            }
        }
        
        while( !deleteList.isEmpty() ) {
            Point p = deleteList.poll();
            warehouse[p.y][p.x] = ".";
        }
    }

    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        
        int warehouseHeight = storage.length + 2;
        int warehouseWidth = storage[0].length() + 2;
        String[][] warehouse = new String[warehouseHeight][warehouseWidth];
        
        Arrays.fill(warehouse[0], ".");
        Arrays.fill(warehouse[warehouseHeight - 1], ".");
        for( int i = 0; i < storage.length; i++ ) {
            String[] containers = ("." + storage[i] + ".").split("");
            System.arraycopy(containers, 0, warehouse[i + 1], 0, warehouseWidth);
        }
        
        
        for( String request : requests ) {
            if( request.length() == 1 ) {
                this.bfs(warehouse, request);
            } else {
                String target = request.charAt(0) + "";
                for( int i = 1; i < warehouseHeight - 1; i++ ) {
                    for( int j = 1; j < warehouseWidth - 1; j++ ) {
                        if( !target.equals(warehouse[i][j]) ) {
                            continue;
                        }
                           
                        warehouse[i][j] = ".";
                    }
                }
            }
        }
        
        for( int i = 1; i < warehouseHeight - 1; i++ ) {
            for( int j = 1; j < warehouseWidth - 1; j++ ) {
                if( ".".equals(warehouse[i][j]) ) {
                    continue;
                }

                answer++;
            }
        }
        
        return answer;
    }
}