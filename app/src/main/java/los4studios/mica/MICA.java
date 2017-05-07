package los4studios.mica;

import android.app.Application;

import com.google.firebase.database.FirebaseDatabase;


/**
 * Created by root on 04/05/17.
 */

public class MICA extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
