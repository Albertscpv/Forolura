package albert.dev.forohub.ForoHub.services;

public interface IConvertData {
    <T> T getData(String json, Class<T> type);
}
