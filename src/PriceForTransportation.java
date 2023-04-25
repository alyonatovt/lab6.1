public class PriceForTransportation {

    public double es;//from earth to space

    public double se;//from space to earth

    public double ost;//from 1 station to 2 station(one station two)

    public PriceForTransportation(double es, double se, double ost) {
        this.es = es;
        this.se = se;
        this.ost = ost;
    }
    public  double calculateAmount(){
        return es + se + ost;
    }
}
