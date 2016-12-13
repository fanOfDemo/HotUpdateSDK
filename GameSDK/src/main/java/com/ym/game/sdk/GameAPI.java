package com.ym.game.sdk;

import android.webkit.ValueCallback;

import org.json.JSONObject;

import bridge.IGameAPI;

/**
 * 项目名称：SDKLessenDemo
 * 类描述：
 * 创建人：wengyiming
 * 创建时间：16/6/14 下午11:20
 * 修改人：wengyiming
 * 修改时间：16/6/14 下午11:20
 * 修改备注：
 */
    public class GameAPI implements IGameAPI {
        private IGameAPI mAPI;

        public GameAPI () {
            mAPI = GameAPILoader.loadGameAPI ();
        }

        @Override
        public void init (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {
            mAPI.init (jsonObject, valueCallback);
        }

        @Override
        public void login (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {
            mAPI.login (jsonObject, valueCallback);
        }

        @Override
        public void pay (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {
            mAPI.pay (jsonObject, valueCallback);
        }

        @Override
        public void logout (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback) {
            mAPI.logout (jsonObject, valueCallback);
        }
    }
