// Last updated: 04/05/2026, 23:30:57
class Solution {
    public String trafficSignal(int timer) {
        if(timer == 0) return "Green";
        else if(timer == 30) return "Orange";
        else if(30 < timer && timer <= 90) return "Red";
        return "Invalid";
    }
}