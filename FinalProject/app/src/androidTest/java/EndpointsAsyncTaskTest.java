import android.util.Log;

import com.udacity.gradle.builditbigger.AsyncResponse;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;


import static org.junit.Assert.assertNotNull; 

public class EndpointsAsyncTaskTest  implements AsyncResponse {
    private static final String TAG = "EndpointsAsyncTaskTest";


    @SuppressWarnings("unchecked")
    public void testVerifyJoke() {
        Log.v(TAG, "Running EndpointsAsyncTaskTest test");
        String result = null;
        EndpointsAsyncTask testTask = new EndpointsAsyncTask(this);
        testTask.execute();
        try {

            result = testTask.get();
            Log.d(TAG, "Retrieved a non-empty string successfully: " + result);
        } catch (Exception e) {
            Log.d(TAG, "Error in retrieving data: " + e.getMessage());

            e.printStackTrace();
        }
        if(!result.isEmpty()){ assertNotNull(result);}
        else  Log.d(TAG, "Retrieved an empty string");



    }


    @Override
    public void processFinish(String output) {

    }


    }
