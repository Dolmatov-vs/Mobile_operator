public class Main {
    public static void main(String[] args) {
        int AccountInKopecks = 10000;
        int AdmissionInKopecks = 110000;
        if (AdmissionInKopecks < 100000){
            AccountInKopecks = (AccountInKopecks + AdmissionInKopecks) / 100;
            System.out.println(AccountInKopecks);
        }
        int Bonus = AdmissionInKopecks / 10000;
        AccountInKopecks = Bonus + ((AccountInKopecks + AdmissionInKopecks) / 100);
        System.out.println(AccountInKopecks);
    }
}
