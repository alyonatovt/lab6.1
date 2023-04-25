public class Price {

    public double tm;//treated mineral

    public double tg;//treated gemstone

    public double rm;//raw mineral

    public Price(double tm, double tg, double rm) {
        this.tm = tm;
        this.tg = tg;
        this.rm = rm;
    }
    public double calculateAmount(){
        return tm + tg + rm;
    }
}
