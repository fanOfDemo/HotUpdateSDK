package com.ym.game.sdk.agame;

import android.webkit.ValueCallback;

import org.json.JSONObject;

import bridge.IGameAPI;


/**
 * 项目名称：SDKLessenDemo
 * 类描述：
 * 创建人：wengyiming
 * 创建时间：16/6/14 下午11:18
 * 修改人：wengyiming
 * 修改时间：16/6/14 下午11:18
 * 修改备注：
 */
    public class AGameAPI implements IGameAPI {

        public static AGameAPI getAPI () {
            return APIHolder.single;
        }

        public AGameAPI () {

        }

        static class APIHolder {
            static AGameAPI single = new AGameAPI ();
        }

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
