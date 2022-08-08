

public class Weapon {
    private String typeWeapon;
    private String nameOfWeapon;

    public Weapon(String typeWeapon, String nameOfWeapon) {
        this.typeWeapon = typeWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public String getTypeWeapon() {
        return typeWeapon;
    }

    public void setTypeWeapon(String typeWeapon) {
        this.typeWeapon = typeWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}
