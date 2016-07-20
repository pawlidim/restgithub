package de.pawlidi.restgithub;

import java.io.Serializable;
import java.util.UUID;

public abstract class GitHubObject implements Serializable {

	protected String uuid;
	protected GitHub gitHub;

	protected GitHubObject(GitHub gitHub) {
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
