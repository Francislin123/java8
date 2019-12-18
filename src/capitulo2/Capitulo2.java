package capitulo2;

public class Capitulo2 {

    public static void main(String[] args) {

        ValidadorDeCEP<String> validadorDeCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

//        boolean resposta = validadorDeCEP.validaCEP("03317-000");
//
//        System.out.println(resposta);

//        Runnable o = () -> {
//            System.out.println("O que sou? ");
//        };
//
//        System.out.println(o);
//        System.out.println(o.getClass());

        int numb = 8;

        new Thread(()->{
            System.out.println(numb);
        }).start();
    }
}
