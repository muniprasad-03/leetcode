// Last updated: 07/04/2026, 22:37:01
1class Robot {
2    private int[][] pos;
3    private int idx = 0;
4    private boolean moved = false;
5    public Robot(int width, int height) {
6        int size = 2 *(width + height)-4;
7        pos = new int[size][3];
8        int i = 0;
9        for(int j = 0;j<width;j++) {
10            pos[i++] = new int[]{j, 0, 0};
11        }
12        for(int j = 1;j<height;j++) {
13            pos[i++] = new int[]{width-1, j, 1};
14        }
15        for(int j = width-2;j>=0;j--) {
16            pos[i++] = new int[]{j, height-1, 2};
17        }
18        for(int j = height-2;j>=1;j--) {
19            pos[i++] = new int[]{0, j, 3};
20        }
21    }
22    public void step(int num) {
23        moved = true;
24        idx = (idx + num) % pos.length;
25    }
26    public int[] getPos() {
27        return new int[]{pos[idx][0], pos[idx][1]};
28    }
29    public String getDir() {
30        if(idx == 0 && moved) {
31            return "South";
32        }
33        return switch(pos[idx][2]) {
34            case 0 -> "East";
35            case 1 -> "North";
36            case 2 -> "West";
37            case 3 -> "South";
38            default -> "";
39        };
40    }
41}