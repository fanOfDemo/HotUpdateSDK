package com.ym.game.sdk.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.ValueCallback;

import com.yw.game.sdk.demo.R;

import org.json.JSONObject;

import bridge.IGameAPI;
import zeus.plugin.PluginConfig;
import zeus.plugin.PluginManager;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        String className = PluginManager.getPlugin (PluginConfig.PLUGIN_TEST).getPluginMeta ()
                .mainClass;
        PluginManager.loadLastVersionPlugin (PluginConfig.PLUGIN_TEST);
        try {
            Class cl = PluginManager.mNowClassLoader.loadClass (className);
            IGameAPI gameAPI = (IGameAPI) cl.newInstance ();

            gameAPI.init (null, new ValueCallback<JSONObject> () {
                @Override
                public void onReceiveValue (JSONObject value) {

                }
            });

            gameAPI.login (null, new ValueCallback<JSONObject> () {
                @Override
                public void onReceiveValue (JSONObject value) {

                }
            });
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        } catch (InstantiationException e) {
            e.printStackTrace ();
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        }
    }
}
