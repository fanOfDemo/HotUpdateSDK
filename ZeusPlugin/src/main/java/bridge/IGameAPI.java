package bridge;

import android.webkit.ValueCallback;

import org.json.JSONObject;

/**
 * 项目名称：SDKLessenDemo
 * 类描述：
 * 创建人：wengyiming
 * 创建时间：16/6/14 下午11:17
 * 修改人：wengyiming
 * 修改时间：16/6/14 下午11:17
 * 修改备注：
 */
public interface IGameAPI {

    void init (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback);;
    void login (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback);;
    void pay (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback);
    void logout (JSONObject jsonObject, ValueCallback<JSONObject> valueCallback);

}
