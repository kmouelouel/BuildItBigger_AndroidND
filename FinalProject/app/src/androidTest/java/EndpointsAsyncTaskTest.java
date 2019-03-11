import android.util.Log;

import com.udacity.gradle.builditbigger.AsyncResponse;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EndpointsAsyncTaskTest extends AndroidTestCase implements AsyncResponse {
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
            e.printStackTrace();
        }
        assertNotNull(result);

    }


    @Override
    public void processFinish(String output) {

    }


    }
