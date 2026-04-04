// Last updated: 04/04/2026, 23:31:58
class Solution {
    private boolean isLeap(int year) {
        return (year%4 == 0 && year%100 != 0) || (year%400 == 0);
    }
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totDays = 0;
        for(int i=1971; i<year;i++) {
            totDays += isLeap(i) ? 366 : 365;
        }
        for(int i=0;i<month-1;i++) {
            totDays += daysInMonth[i];
            if(i==1 && isLeap(year)) totDays++;
        }
        totDays += day;
        return days[(totDays+4)%7];
    }
}