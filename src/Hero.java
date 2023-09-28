public abstract class Hero implements HavingSuperAbility {
    private int heal;
    private int damage;
    private String superAbilityType;

    public String getSuperAbilityType() {
        return superAbilityType;
    }

    public void setSuperAbilityType(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Hero(int heal, int damage, String superAbilityType) {
        this.heal = heal;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    public Hero() {
    }
    public abstract void superAbilityType();

    public void printSuperAbility() {
        System.out.println(getClass().getName() + " применил " + getSuperAbilityType());
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }
}
