public class EgovService {

    public static void main(String[] args) {
        System.out.println("Welcome to E-Governance System");

        EgovService service = new EgovService();
        service.applyBirthCertificate("Citizen");
    }

    public void applyBirthCertificate(String name) {
        System.out.println("Birth Certificate applied successfully for " + name);
    }
}
