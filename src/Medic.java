public  class Medic extends Hero{
private String superAbilityType;
    public Medic() {
    }

    public Medic(int heal, int damage, String superAbilityType) {
        super(heal, damage, superAbilityType);

    }

    public Medic(String superAbilityType) {
        this.superAbilityType = superAbilityType;
    }
    public void superAbilityType(){
        System.out.println("Медик применил" + getSuperAbilityType());
    }


    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("медик применил" + superAbilityType);
    }
}
