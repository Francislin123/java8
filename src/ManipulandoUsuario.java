import java.util.ArrayList;
import java.util.List;

public class ManipulandoUsuario {

    public static void main(String[] args) {

        Usuario frans = new Usuario("Paulo Silveira", 150);
        Usuario silvestre = new Usuario("Rodrigo Turini", 120);
        Usuario arnold = new Usuario("Guilherme Silveira", 90);

        List<Usuario> usuarios = new ArrayList();

        usuarios.add(frans);
        usuarios.add(silvestre);
        usuarios.add(arnold);

        usuarios
                .stream()
                .filter(u -> u.getPontos() >= 90)
                .forEach(System.out::println);

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
