package io.gs2.script.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.script.model.Script;

/**
 * スクリプトの作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateScriptResult {
	
	Script item;
	
	/**
	 * スクリプトを取得。
	 * 
	 * @return スクリプト
	 */
	public Script getItem() {
		return item;
	}
	
	/**
	 * スクリプトを設定。
	 * 
	 * @param item スクリプト
	 */
	public void setItem(Script item) {
		this.item = item;
	}
	
	/**
	 * スクリプトを設定。
	 * 
	 * @param item スクリプト
	 * @return this
	 */
	public CreateScriptResult withItem(Script item) {
		setItem(item);
		return this;
	}
}
