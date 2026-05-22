public class ArmorDecorator extends SpacecraftDecorator {

    public ArmorDecorator(Spacecraft spacecraft) {

        super(spacecraft);
    }

    @Override
    public int getHealth() {

        return super.getHealth() + 150;
    }
}
