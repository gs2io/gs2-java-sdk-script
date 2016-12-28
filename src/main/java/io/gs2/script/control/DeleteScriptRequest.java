package io.gs2.script.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.script.Gs2Script;

/**
 * スクリプトの削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteScriptRequest extends Gs2BasicRequest<DeleteScriptRequest> {

	public static class Constant extends Gs2Script.Constant {
		public static final String FUNCTION = "DeleteScript";
	}
	
	/** スクリプト名 */
	String scriptName;
	
	/**
	 * スクリプト名を取得。
	 * 
	 * @return スクリプト名
	 */
	public String getScriptName() {
		return scriptName;
	}
	
	/**
	 * スクリプト名を設定。
	 * 
	 * @param scriptName スクリプト名
	 */
	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}
	
	/**
	 * スクリプト名を設定。
	 * 
	 * @param scriptName スクリプト名
	 * @return this
	 */
	public DeleteScriptRequest withScriptName(String scriptName) {
		setScriptName(scriptName);
		return this;
	}
}
