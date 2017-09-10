package devpekka.flushdemy;

import android.content.Context;

import com.android.volley.RequestQueue;


public class MySingleton {
    private static MySingleton mInstance;
    private static Context context;
    private RequestQueue requestQueue;

    private MySingleton(Context context){
        this.context = context;
        requestQueue = getRequestQueue();
    }

    private RequestQueue
}
