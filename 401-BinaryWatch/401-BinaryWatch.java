// Last updated: 04/04/2026, 23:34:34
class Solution {
    HashSet<String> ans;
    boolean[] space;
    int turnedOn;
    private void help(int idx, int cnt) {
        if(idx==10) {
            if(cnt == turnedOn) {
                StringBuilder time = new StringBuilder();
                StringBuilder hrs = new StringBuilder();
                for(int i=0;i<4;i++) {
                    hrs.append(space[i] ? '1' : '0');
                }
                StringBuilder mins = new StringBuilder();
                for(int i=4;i<10;i++) {
                    mins.append(space[i] ? '1' : '0');
                }
                int h = Integer.parseInt(hrs.toString(), 2);
                int m = Integer.parseInt(mins.toString(), 2);
                if(h<12 && m<60) {
                    time.append(h+":");
                    if(m==0) time.append("00");
                    else if(m>=1 && m<=9) time.append("0"+m);
                    else time.append(m);
                    ans.add(time.toString());
                }
            }
            return;
        }
        if(cnt > turnedOn) return;
        space[idx] = true;
        help(idx+1, cnt+1);
        space[idx] = false;
        help(idx+1, cnt);
    }
    public List<String> readBinaryWatch(int turnedOn) {
        this.turnedOn = turnedOn;
        ans = new HashSet<>();
        space = new boolean[10];
        help(0, 0);
        return new ArrayList<>(ans);
    }
}