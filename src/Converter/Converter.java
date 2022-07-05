package Converter;

public interface Converter<T,R> {
    R convert(T obj);
}
