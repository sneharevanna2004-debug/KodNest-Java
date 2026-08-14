class Phone {

    void unlock(String password) {
        System.out.println("Phone unlocked using password");
    }

    void unlock(int fingerPrint) {
        System.out.println("Phone unlocked using fingerPrint");
    }

    void unlock(double face) {
        System.out.println("Phone unlocked using face");
    }
}

public class PhoneLock {

    public static void main(String[] args) {

        Phone p = new Phone();

        p.unlock("Sneha");
        p.unlock(1234);
        p.unlock(1.52);
    }
}