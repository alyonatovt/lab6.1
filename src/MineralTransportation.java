public class MineralTransportation {
    public static void main(String[] args) {
     NameOfMineral nameOfMineral = new NameOfMineral("diamond","blue",2.3);
     Price a = new Price(5.0,3.0,2.0);
     PriceForTransportation b = new PriceForTransportation(6.2,8.7,10.0);

        System.out.println("name:" + nameOfMineral.name);
        System.out.println("Price:" + a.calculateAmount());
        System.out.println("Price for transportation:" + b.calculateAmount());
    }
}