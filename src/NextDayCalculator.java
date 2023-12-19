public class NextDayCalculator {
    int dayCurrent;
    int monthCurrent;
    int yearCurrent;

    public NextDayCalculator() {
    }

    public NextDayCalculator(int dayCurrent, int monthCurrent, int yearCurrent) {
        this.dayCurrent = dayCurrent;
        this.monthCurrent = monthCurrent;
        this.yearCurrent = yearCurrent;
    }

    public int getDayCurrent() {
        return dayCurrent;
    }

    public void setDayCurrent(int dayCurrent) {
        this.dayCurrent = dayCurrent;
    }

    public int getMonthCurrent() {
        return monthCurrent;
    }

    public void setMonthCurrent(int monthCurrent) {
        this.monthCurrent = monthCurrent;
    }

    public int getYearCurrent() {
        return yearCurrent;
    }

    public void setYearCurrent(int yearCurrent) {
        this.yearCurrent = yearCurrent;
    }
}
