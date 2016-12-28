package io.gs2.script.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.script.Gs2Script;

/**
 * スクリプトの更新リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class UpdateScriptRequest extends Gs2BasicRequest<UpdateScriptRequest> {

	public static class Constant extends Gs2Script.Constant {
		public static final String FUNCTION = "UpdateScript";
	}

	/** スクリプト名 */
	String scriptName;
	/** 説明文 */
	String description;
	/** Luaスクリプト */
	String script;

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
	public UpdateScriptRequest withScriptName(String scriptName) {
		setScriptName(scriptName);
		return this;
	}
	
	/**
	 * 説明文を取得。
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * 説明文を設定。
	 * 
	 * @param description 説明文
	 * @return this
	 */
	public UpdateScriptRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

	/**
	 * Luaスクリプトを取得。
	 * 
	 * @return Luaスクリプト
	 */
	public String getScript() {
		return script;
	}
	
	/**
	 * Luaスクリプトを設定。
	 * 
	 * @param script Luaスクリプト
	 */
	public void setScript(String script) {
		this.script = script;
	}
	
	/**
	 * Luaスクリプトを設定。
	 * 
	 * @param script Luaスクリプト
	 * @return this
	 */
	public UpdateScriptRequest withScript(String script) {
		setScript(script);
		return this;
	}
}
