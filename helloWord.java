public class helloWord {
    public static void main(String [] args) {
        String apresentacao = args[0];
        if (apresentacao.equals("HelloWord")) {
            System.out.println("Apresentação recebida!");
        } else {
            System.out.println("Erro");
        }
    }    
}
