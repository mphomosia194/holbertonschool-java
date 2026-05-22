public class LaserDecorator extends SpacecraftDecorator {

    public LaserDecorator(Spacecraft spacecraft) {

        super(spacecraft);
    }

    @Override
    public int getAttack() {

        return super.getAttack() + 40;
    }
}
