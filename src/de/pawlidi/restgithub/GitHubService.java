package de.pawlidi.restgithub;

import java.io.Serializable;

import de.pawlidi.restgithub.rest.converter.GsonConverter;
import retrofit2.Retrofit;

public class GitHubService implements Serializable {

	private Retrofit retrofit;

	public GitHubService() {
		super();
		retrofit = new Retrofit.Builder().baseUrl("https://api.github.com").addConverterFactory(new GsonConverter())
				.build();
	}

	public void release() {
		// TODO Auto-generated method stub

	}

	public void getRepositories() {
		// TODO Auto-generated method stub

	}

}
