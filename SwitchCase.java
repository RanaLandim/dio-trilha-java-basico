public class App {
    public static void main(String[] args) throws Exception {
        String plano = "T"; 

        switch (plano) {
            case "T":
                System.out.println("5gb YouTube");
                break;
            case "M":
                System.out.println("Whats e Instagram grátis");
                break;
            case "B":
                System.out.println("100 minutos de ligação");
                break;
        
            default:
                break;
        }
    }
}
