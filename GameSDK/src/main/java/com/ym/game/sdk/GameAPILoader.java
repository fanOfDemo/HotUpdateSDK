package com.ym.game.sdk;

import android.webkit.ValueCallback;

import com.ym.game.sdk.agame.AGameAPI;
import com.ym.game.sdk.bgame.BGameAPI;

import org.json.JSONObject;

import bridge.IGameAPI;

/**
 * 项目名称：SDKLessenDemo
 * 类描述：
 * 创建人：wengyiming
 * 创建时间：2016/10/22 上午1:54
 * 修改人：wengyiming
 * 修改时间：2016/10/22 上午1:54
 * 修改备注：
 */

    public class GameAPILoader implements IGameAPI {

        public static IGameAPI loadGameAPI () {
            switch (readChannel ()) {
                case 1:
                    mAPI = AGameAPI.getAPI ();
                    break;
                case 2:
                    mAPI = BGameAPI.getAPI ();
                    break;
            }

            return mAPI;
        }

        private static int readChannel () {
            return 1;
        }

        private static IGameAPI mAPI;


        @Override
        public void init (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {

        }

        @Override
        public void login (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {

        }

        @Override
        public void pay (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {

        }

        @Override
        public void logout (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {

        }
    }
