package Singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /*Fix serialization problem for singleton*/

  /*  protected Object readResolve() {
        return getInstance();
    }*/

}
