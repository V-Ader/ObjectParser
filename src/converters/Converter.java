package converters;

public interface Converter<T,R> {
    R convert(T obj);
}
