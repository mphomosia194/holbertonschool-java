public class NanoBotsDecorator extends SpacecraftDecorator {

    public NanoBotsDecorator(Spacecraft spacecraft) {

        super(spacecraft);
    }

    @Override
    public int getAttack() {

        return super.getAttack() + 25;
    }
}
