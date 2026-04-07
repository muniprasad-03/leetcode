// Last updated: 07/04/2026, 22:15:25
1class Point {
2    int x;
3    int y;
4    String dir;
5    Point(int x, int y, String dir) {
6        this.x = x;
7        this.y = y;
8        this.dir = dir;
9    }
10}
11class Robot {
12    Point[] pos;
13    int idx = 0;
14    public Robot(int width, int height) {
15        int size = 2 * (width + height) - 4;
16        pos = new Point[size];
17        int i=0;
18        for(int j=0; j<width;j++) {
19            pos[i++] = new Point(j, 0, "East");
20        }
21        for(int j=1; j<height;j++) {
22            pos[i++] = new Point(width-1, j, "North");
23        }
24        for(int j=width-2; j>= 0;j--) {
25            pos[i++] = new Point(j, height-1, "West");
26        }
27        for(int j=height-2; j>=1; j--) {
28            pos[i++] = new Point(0, j, "South");
29        }
30    }
31    
32    public void step(int num) {
33        idx = (idx + num) % (pos.length);
34        if(idx == 0 && num > 0) {
35            pos[0].dir = "South";
36        }
37    }
38    
39    public int[] getPos() {
40        return new int[]{pos[idx].x, pos[idx].y};
41    }
42    
43    public String getDir() {
44        return pos[idx].dir;
45    }
46}
47
48/**
49 * Your Robot object will be instantiated and called as such:
50 * Robot obj = new Robot(width, height);
51 * obj.step(num);
52 * int[] param_2 = obj.getPos();
53 * String param_3 = obj.getDir();
54 */