public class LeitorDeAnotacao {
    public static void main(String[] args) {
        Class<ClasseDaAnotacao> classeAlvo = ClasseDaAnotacao.class;

        if (classeAlvo.isAnnotationPresent(Anotacao.class)) {
            Anotacao instancia = classeAlvo.getAnnotation(Anotacao.class);
            String[] valores = instancia.anotacao();
            if (valores.length > 0) {
                System.out.println("Conteúdo da anotação: " + valores[0]);
            }
        } else {
            System.out.println("A anotação não foi encontrada na classe.");
        }
    }
}
