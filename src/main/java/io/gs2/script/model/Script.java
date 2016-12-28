package io.gs2.script.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * スクリプト
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Script implements Serializable {

	/** スクリプトID */
	String scriptId;
	/** オーナーID */
	String ownerId;
	/** スクリプト名 */
	String name;
	/** 説明文 */
	String description;
	/** Luaスクリプト */
	String script;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * スクリプトIDを取得
	 * 
	 * @return スクリプトID
	 */
	public String getScriptId() {
		return scriptId;
	}
	
	/**
	 * スクリプトIDを設定
	 * 
	 * @param scriptId スクリプトID
	 */
	public void setScriptId(String scriptId) {
		this.scriptId = scriptId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * スクリプト名を取得
	 * 
	 * @return スクリプト名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * スクリプト名を設定
	 * 
	 * @param name スクリプト名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 説明文を取得
	 * 
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * 説明文を設定
	 * 
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Luaスクリプトを取得
	 * 
	 * @return Luaスクリプト
	 */
	public String getScript() {
		return script;
	}
	
	/**
	 * 連携用URLを設定
	 * 
	 * @param script 連携用URL
	 */
	public void setScript(String script) {
		this.script = script;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}
