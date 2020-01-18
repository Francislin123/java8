import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManipulandoUsuario {

    public static void main(String[] args) throws IOException {

        Usuario frans = new Usuario("Paulo Silveira", 150, true);
        Usuario silvestre = new Usuario("Rodrigo Turini", 120, true);
        Usuario lili = new Usuario("Guilherme Silveira", 90, true);
        Usuario bruce = new Usuario("Guilherme Silveira", 90);
        Usuario thigas = new Usuario("Guilherme Silveira", 90);
        Usuario fabio = new Usuario("Guilherme Silveira", 90);
        Usuario vans = new Usuario("Guilherme Silveira", 90);
        Usuario bento = new Usuario("Guilherme Silveira", 90);

//        List<Usuario> usuarios = new ArrayList();
//
//        usuarios.add(frans);
//        usuarios.add(silvestre);
//        usuarios.add(lili);
//        usuarios.add(bruce);
//        usuarios.add(thigas);
//        usuarios.add(fabio);
//        usuarios.add(vans);
//        usuarios.add(bento);

        List<Usuario> listUsers = Arrays.asList(frans, silvestre, lili, bruce, thigas, fabio, vans, bento);

        Map<Integer, List<Usuario>> pontuacao = listUsers
                .stream()
                .collect(Collectors.groupingBy(Usuario::getPontos));

//        Files.list(Paths.get("MacBook-Pro-de-Francisli:Apostilas/Java_8_Pratico_Lambdas_Streams_e_os_Novos_Recursos_da_Linguagem_-_Casa_do_Codigo"))
//                .filter(path -> path.toString().endsWith(".pdf"))
//                .forEach(System.out::println);

//        List<Usuario> users =  usuarios.stream().filter(usuario ->
//                usuario.getPontos() > 100)
//                .sorted(Comparator.comparing(Usuario::getNome))
//                .collect(Collectors.toList());

//        List<Usuario> maisQue100 = new ArrayList<>();
//
//        usuarios
//                .stream()
//                .filter(u -> u.getPontos() > 100)
//                .forEach(maisQue100::add);
//
//        maisQue100.stream()
//                .filter(u -> u.getPontos() > 100)
//                .collect(toSet());
//
//        maisQue100.forEach(usuario -> {
//            if (usuario.getNome().equals("Paulo Silveira")) {
//                usuario.setNome("Frans");
//            }
//        });
//
//        List<Integer> pontos = maisQue100
//                .stream()
//                .map(Usuario::getPontos)
//                .collect(Collectors.toList());


//        users.stream().forEach(usuario -> {
//            System.out.println("Pontos: " + usuario.getPontos());
//        });

//        System.out.println("Usuarios com mais de 100 pontos: " + maisQue100);

//        usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
//        usuarios.stream().filter(usuario -> usuario.getPontos() > 100);
//        usuarios.forEach(System.out::println);
//        usuarios.subList(0, 2).forEach(Usuario::tornaModerador);
//        usuarios.removeIf(predicado);
//        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
//        usuarios.sort(Comparator.comparing(Usuario::getNome));
//        usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
//        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
//        usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));


    }
}
