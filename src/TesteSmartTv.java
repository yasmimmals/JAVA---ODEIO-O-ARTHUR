public class TesteSmartTv {
    public static void main(String[] args){
        SmartTv obj1 = new SmartTv();

        obj1.setVolume(120); // não vai dar certo
        obj1.setVolume(30); // vai dar certo

        System.out.println("Volume " + obj1.getVolume());
        SmartTv obj2 = new SmartTv("Samsung","QLed 32", 0);
    }
}
