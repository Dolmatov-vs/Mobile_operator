public class Main {
    public static void main(String[] args) {
        int account = 10000; // В копейках
        int admission = 10000; // В копейках
        if (admission >= 100000){
            int bonus = admission / 10000;
            account = bonus + ((account + admission) / 100);
            System.out.println(account);
        }   else {
            account = (account + admission) / 100;
            System.out.println(account);
        }
    }
}
