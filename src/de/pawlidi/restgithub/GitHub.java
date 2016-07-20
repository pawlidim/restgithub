package de.pawlidi.restgithub;

import java.io.Serializable;

import de.pawlidi.restgithub.rest.utils.RetrofitFactory;
import de.pawlidi.restgithub.security.SecurityManager;
import retrofit2.Retrofit;

public final class GitHub implements Serializable {

	public static final String GIT_HUB_API = "https://api.github.com";
	private SecurityManager securityManager;
	private Retrofit retrofit;
	private GitHubUser gitHubUser;

	private GitHub() {
		super();
		retrofit = RetrofitFactory.createRetrofit(GIT_HUB_API);
	}

	public GitHub(final String username, final String password) {
		this();
		this.securityManager = new SecurityManager(username, password);
	}

	public GitHub(final String token) {
		this();
		this.securityManager = new SecurityManager(token);
	}

	protected SecurityManager getSecurityManager() {
		return securityManager;
	}

	protected Retrofit getRetrofit() {
		return retrofit;
	}

	public GitHubUser getGitHubUser() {
		if (gitHubUser == null) {
			gitHubUser = new GitHubUser(this);
		}
		return gitHubUser;
	}
}
