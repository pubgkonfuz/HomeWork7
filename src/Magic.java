public class Magic extends Hero {
private String superAbilityType;

    public Magic(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }

    public Magic() {
    }

    public Magic(int heal, int damage, String superAbilityType) {
        super(heal, damage, superAbilityType);
    }
    public void superAbilityType(){
        System.out.println("Маг применил" + getSuperAbilityType());
    }
    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Маг применил" + superAbilityType);
    }
}
