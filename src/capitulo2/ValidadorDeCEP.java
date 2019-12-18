package capitulo2;

@FunctionalInterface
public interface ValidadorDeCEP<T> {
    boolean validaCEP(T t);
}
