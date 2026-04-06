// Last updated: 06/04/2026, 20:40:57
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int maxDist = 0;
        int[] pos = new int[]{0, 0};
        int[] d = new int[]{0, 1};
        for (int cmd : commands) {
            if (cmd == -2) {
                d = turnLeft(d);
            } else if (cmd == -1) {
                d = turnRight(d);
            } else {
                for (int i = 0; i < cmd; i++) {
                    int[] nextPos = new int[]{pos[0] + d[0], pos[1] + d[1]};
                    if (isObstacle(nextPos, obstacles)) {
                        break;
                    }
                    pos = nextPos;
                    maxDist = Math.max(maxDist, pos[0] * pos[0] + pos[1] * pos[1]);
                }
            }
        }
        return maxDist;
    }

    private boolean isObstacle(int[] pos, int[][] obstacles) {
        for (int[] obstacle : obstacles) {
            if (pos[0] == obstacle[0] && pos[1] == obstacle[1]) {
                return true;
            }
        }
        return false;
    }

    private int[] turnLeft(int[] d) {
        return new int[]{-1 * d[1], d[0]};
    }

    private int[] turnRight(int[] d) {
        return new int[]{d[1], d[0] * -1};
    }

    // [0, 1] -> [1, 0]
    // [1, 0] -> [0, -1]

    // [0, 1] -> [-1, 0]
    // [-1, 0] -> [0, -1]
    // [0, -1] -> [1, 0]
    // [1, 0] -> [0, 1]
}