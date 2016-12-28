package io.gs2.script;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.script.control.CreateScriptRequest;
import io.gs2.script.control.CreateScriptResult;
import io.gs2.script.control.DeleteScriptRequest;
import io.gs2.script.control.DescribeScriptRequest;
import io.gs2.script.control.DescribeScriptResult;
import io.gs2.script.control.GetScriptRequest;
import io.gs2.script.control.GetScriptResult;
import io.gs2.script.control.UpdateScriptRequest;
import io.gs2.script.control.UpdateScriptResult;

/**
 * GS2 Script API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2ScriptClient extends AbstractGs2Client<Gs2ScriptClient> {

	public static String ENDPOINT = "script";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2ScriptClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * スクリプトを作成。<br>
	 * <br>
	 * Lua言語で記述したスクリプトを定義できます。<br>
	 * 結果は result 変数に代入してください。<br>
	 * <br>
	 * GS2-Script は GS2-Variable との強力な連携機能があります。<br>
	 * set('変数名', 値, ttl) - (ttl = 変数の保持期間。3600(1時間)までの整数値) で GS2-Variable に記録し、<br>
	 * get('変数名') で GS2-Variable に記録した変数を取り出すことが出来ます。<br>
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateScriptResult createScript(CreateScriptRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName())
				.put("description", request.getDescription())
				.put("script", request.getScript());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/script", 
				credential, 
				ENDPOINT,
				CreateScriptRequest.Constant.MODULE, 
				CreateScriptRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateScriptResult.class);
	}
	
	/**
	 * スクリプト一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return スクリプト一覧
	 */
	public DescribeScriptResult describeScript(DescribeScriptRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/script";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeScriptRequest.Constant.MODULE, 
				DescribeScriptRequest.Constant.FUNCTION);
		return doRequest(get, DescribeScriptResult.class);
	}

	/**
	 * スクリプトを取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return スクリプト
	 */
	public GetScriptResult getScript(GetScriptRequest request) {
		HttpGet get = createHttpGet(
				Gs2Constant.ENDPOINT_HOST + "/script/" + request.getScriptName(), 
				credential, 
				ENDPOINT,
				GetScriptRequest.Constant.MODULE, 
				GetScriptRequest.Constant.FUNCTION);
		return doRequest(get, GetScriptResult.class);
	}

	/**
	 * スクリプトを更新。
	 * 
	 * @param request リクエストパラメータ
	 * @return 更新結果
	 */
	public UpdateScriptResult updateScript(UpdateScriptRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("description", request.getDescription())
				.put("script", request.getScript());
		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/script/" + request.getScriptName(), 
				credential, 
				ENDPOINT,
				UpdateScriptRequest.Constant.MODULE, 
				UpdateScriptRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(put, UpdateScriptResult.class);
	}

	/**
	 * スクリプトを削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteScript(DeleteScriptRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/script/" + request.getScriptName(), 
				credential, 
				ENDPOINT,
				DeleteScriptRequest.Constant.MODULE, 
				DeleteScriptRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

}
