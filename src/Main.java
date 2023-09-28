public class Main {
    public static void main(String[] args) {
       Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Hero [] names = {magic,medic,warrior};
        String [] ability = {"луч солнца","сила лечения","сила меча"};
        for (int i = 0; i < names.length; i++) {
            names[i].applySuperAbility(ability[i]);

        }

    }
}