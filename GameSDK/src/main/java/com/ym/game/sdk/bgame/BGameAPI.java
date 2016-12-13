package com.ym.game.sdk.bgame;

import android.webkit.ValueCallback;

import com.ym.game.sdk.agame.AGameAPI;

import org.json.JSONObject;

import bridge.IGameAPI;


/**
 * 项目名称：SDKLessenDemo
 * 类描述：
 * 创建人：wengyiming
 * 创建时间：16/6/14 下午11:19
 * 修改人：wengyiming
 * 修改时间：16/6/14 下午11:19
 * 修改备注：
 */
    public class BGameAPI implements IGameAPI {

        public static AGameAPI getAPI () {
            return BGameAPI.APIHolder.single;
        }

        public BGameAPI () {

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
