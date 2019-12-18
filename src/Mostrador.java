import java.util.function.Consumer;

class Mostrador implements Consumer<Usuario> {

    @Override
    public void accept(Usuario usuario) {

        System.out.println(usuario.getNome());

    }

    @Override
    public Consumer<Usuario> andThen(Consumer<? super Usuario> after) {

        return null;
    }
}
