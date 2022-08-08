

public class Main {

    public static void main(String[] args) {
        // write your code here
        Weapon weapon = new Weapon("type","name");
        Boss boss = new Boss();
        boss.setAttackType("attack");
        boss.setDamage(50);
        boss.setHealth(200);
        boss.setWeapon(weapon);
        //boss.setWeapon(new Weapon("type","name"));
        System.out.println(boss.info());

    }
}