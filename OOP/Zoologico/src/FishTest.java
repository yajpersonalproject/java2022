public class FishTest {
    public static void main(String[] args) {
        Fish kanye = new Fish("Mr West", 1977, 'Y');
        System.out.println(kanye);
        kanye.setSeaWater('N');
        System.out.println(kanye);
        kanye.setSeaWater(true);
        System.out.println(kanye);
        Fish cartman = new Fish("Cartman", 1990, false);
        System.out.println(cartman);
    }
}
