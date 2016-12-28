package io.gs2.script.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.script.model.Script;

/**
 * スクリプト取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetScriptResult {

	/** スクリプト */
	Script item;
	
	/**
	 * 取得したスクリプトを取得。
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
}
