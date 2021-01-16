public class main {
    public main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        long amount = 1000_60;
        boolean registered = false;
        long expected;
        expected = 30;
        long actual = service.calculate(amount,registered);
        boolean passed = expected == actual;
        System.out.println(passed);

}
}



