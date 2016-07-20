package de.pawlidi.restgithub.security;

import java.io.Serializable;
import java.nio.charset.Charset;

import javax.xml.bind.DatatypeConverter;

/**
 * 
 * @author PAWLIDIM
 *
 */
public final class SecurityManager implements Serializable {

	private String username;
	private String password;
	private String token;
	private boolean isBasic;
	private boolean isToken;

	private SecurityManager() {
		super();
	}

	/**
	 * Constructor to construct new security manager for given token.
	 * 
	 * @param token
	 */
	public SecurityManager(String token) {
		this();
		this.token = token;
		this.isToken = true;
	}

	/**
	 * Constructor to construct new security manager for given username and
	 * password
	 * 
	 * @param username
	 * @param password
	 */
	public SecurityManager(String username, String password) {
		this();
		this.username = username;
		this.password = password;
		this.isBasic = true;
	}

	/**
	 * Returns login string.
	 * 
	 * @return
	 */
	public String getLogin() {
		if (isToken) {
			return getStringForToken();
		}
		return getStringForBasic();
	}

	private String getStringForToken() {
		return String.format("token %s", token);
	}

	private String getStringForBasic() {
		return String.format("Basic %s", DatatypeConverter
				.printBase64Binary(String.format("%s:%s", username, password).getBytes(Charset.forName("UTF-8"))));
	}

	public boolean isBasic() {
		return isBasic;
	}

	public boolean isToken() {
		return isToken;
	}

}
