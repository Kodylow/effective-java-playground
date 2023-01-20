import java.util.Map;
import java.util.HashMap;
import java.util.Objects;

public class Favorites { 
    private Map<Class<?>, Object> favorites = new HashMap<>();
    
    public <T, S> void putFavorite(Class<T> type, S instance) {
        favorites.put(type, type.cast(instance));
    }

    public <T> T getFavorite(Class<T> type) {
        
        return type.cast(favorites.get(type));
    }
}