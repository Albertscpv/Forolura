package albert.dev.forohub.ForoHub.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public class ConvertData implements IConvertData {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> type) {
        try {
            return objectMapper.readValue(json,type);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

