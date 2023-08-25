public class ZebraTest
{
    public static void main(String[] args)
    {
        Zebra nevensHorse = new Zebra("Stripey", 2012, "Savannah");
        System.out.println(nevensHorse);
        System.out.println(nevensHorse.getBirthYear());
        nevensHorse.talk();
        nevensHorse.eat();
    }
}
