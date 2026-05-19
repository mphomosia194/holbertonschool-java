public class MiddleEarthCharacterFactory extends CharacterFactory {

    @Override
    public Character createCharacter(CharacterType type, String name) {

        switch (type) {

            case MAGE:
                return new Mage(name, 10, 2, 5, 3, 4);

            case THIEF:
                return new Thief(name, 2, 6, 8, 5, 10);

            case WARRIOR:
                return new Warrior(name, 1, 8, 5, 10, 6);

            default:
                return null;
        }
    }
}
