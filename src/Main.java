public class Main {

    public static void main(String[] args) {
        try {
            Calculadora calculadora = new Calculadora();
            String exp = "20/";
            String res = calculadora.Calculo(exp);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
