package io.gs2.script.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.script.model.Script;

/**
 * スクリプト一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeScriptResult {

	/** スクリプト一覧 */
	List<Script> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得したスクリプト数を取得。
	 * 
	 * @return 取得したスクリプト数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得したスクリプト一覧を取得。
	 * 
	 * @return スクリプト一覧
	 */
	public List<Script> getItems() {
		return items;
	}
	
	/**
	 * スクリプト一覧を設定。
	 * 
	 * @param items スクリプト一覧
	 */
	public void setItems(List<Script> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeScriptRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
