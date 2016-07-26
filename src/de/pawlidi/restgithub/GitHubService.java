package de.pawlidi.restgithub;

import java.io.Serializable;
import java.util.UUID;

public abstract class GitHubService implements Serializable {

	protected String uuid;
	protected GitHub gitHub;

	protected GitHubService(GitHub gitHub) {
		super();
		this.uuid = UUID.randomUUID().toString();
		this.gitHub = gitHub;
	}

	/**
	 * @return the uuid
	 */
	public String getUuid() {
		return uuid;
	}

}
