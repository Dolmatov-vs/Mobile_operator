public class Main {
    public static void main(String[] args) {
        int Account = 10000; // В копейках
        int Admission = 110000; // В копейках
        if (Admission < 100000){
            Account = (Account + Admission) / 100;
            System.out.println(Account);
        }
        int Bonus = Admission / 10000;
        Account = Bonus + ((Account + Admission) / 100);
        System.out.println(Account);
    }
}
