import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ManipulandoUsuario {

    public static void main(String[] args) {

        Usuario frans = new Usuario("Frans", 3, true);
        Usuario silvestre = new Usuario("Silvestre", 1, true);
        Usuario arnold = new Usuario("Arnold", 2, true);

        Predicate<Usuario> predicado = new Predicate<Usuario>() {
            public boolean test(Usuario u) {
                return u.getNome().equals("Frans");
            }
        };

        List<Usuario> usuarios = new ArrayList();

        usuarios.add(frans);
        usuarios.add(silvestre);
        usuarios.add(arnold);

        usuarios.removeIf(predicado);
//        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
//        usuarios.sort(Comparator.comparing(Usuario::getNome));
        usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
        usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
//        usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));


    }
}
