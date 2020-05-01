public class Main {
    public static void main(String[] args) {
        int account = 10000; // В копейках
        int admission = 110000; // В копейках
        if (admission < 100000){
            account = (account + admission) / 100;
            System.out.println(account);
        }
        else {
            int bonus = admission / 10000;
            account = bonus + ((account + admission) / 100);
            System.out.println(account);
        }
    }
}
