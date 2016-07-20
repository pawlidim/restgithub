package de.pawlidi.restgithub.dto;

import java.util.Date;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class OAuth extends RestDTO {

	private Long id;
	private String url;
	private List<Scope> scopes;
	@SerializedName("token")
	private String token;
	@SerializedName("token_last_eight")
	private String tokenLastEight;
	@SerializedName("hashed_token")
	private String hashedToken;
	private App app;
	private String note;
	@SerializedName("note_url")
	private String noteUrl;
	@SerializedName("updated_at")
	private Date updated;
	@SerializedName("created_at")
	private Date created;
	private String fingerprint;
	private User user;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 *            the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the scopes
	 */
	public List<Scope> getScopes() {
		return scopes;
	}

	/**
	 * @param scopes
	 *            the scopes to set
	 */
	public void setScopes(List<Scope> scopes) {
		this.scopes = scopes;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the tokenLastEight
	 */
	public String getTokenLastEight() {
		return tokenLastEight;
	}

	/**
	 * @param tokenLastEight
	 *            the tokenLastEight to set
	 */
	public void setTokenLastEight(String tokenLastEight) {
		this.tokenLastEight = tokenLastEight;
	}

	/**
	 * @return the hashedToken
	 */
	public String getHashedToken() {
		return hashedToken;
	}

	/**
	 * @param hashedToken
	 *            the hashedToken to set
	 */
	public void setHashedToken(String hashedToken) {
		this.hashedToken = hashedToken;
	}

	/**
	 * @return the app
	 */
	public App getApp() {
		return app;
	}

	/**
	 * @param app
	 *            the app to set
	 */
	public void setApp(App app) {
		this.app = app;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/**
	 * @return the noteUrl
	 */
	public String getNoteUrl() {
		return noteUrl;
	}

	/**
	 * @param noteUrl
	 *            the noteUrl to set
	 */
	public void setNoteUrl(String noteUrl) {
		this.noteUrl = noteUrl;
	}

	/**
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}

	/**
	 * @param updated
	 *            the updated to set
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created
	 *            the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the fingerprint
	 */
	public String getFingerprint() {
		return fingerprint;
	}

	/**
	 * @param fingerprint
	 *            the fingerprint to set
	 */
	public void setFingerprint(String fingerprint) {
		this.fingerprint = fingerprint;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

}
