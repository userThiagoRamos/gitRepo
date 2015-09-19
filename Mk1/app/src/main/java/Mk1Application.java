import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by casa on 17/09/2015.
 */
public class Mk1Application extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initDataBase();
    }

    /**
     * Initiate the data base for the app.
     */
    private void initDataBase() {
        ActiveAndroid.initialize(this);
    }
}
