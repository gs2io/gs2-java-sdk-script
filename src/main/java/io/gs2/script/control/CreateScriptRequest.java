package io.gs2.script.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.script.Gs2Script;

/**
 * スクリプトの作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateScriptRequest extends Gs2BasicRequest<CreateScriptRequest> {

	public static class Constant extends Gs2Script.Constant {
		public static final String FUNCTION = "CreateScript";
	}
	
	/** スクリプト名 */
	String name;
	/** 説明文 */
	String description;
	/** Luaスクリプト */
	String script;
	
	/**
	 * スクリプト名を取得。
	 * 
	 * @return スクリプト名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * スクリプト名を設定。
	 * 
	 * @param name スクリプト名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * スクリプト名を設定。
	 * 
	 * @param name スクリプト名
	 * @return this
	 */
	public CreateScriptRequest withName(String name) {
		setName(name);
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
	public CreateScriptRequest withDescription(String description) {
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
	public CreateScriptRequest withScript(String script) {
		setScript(script);
		return this;
	}
}
