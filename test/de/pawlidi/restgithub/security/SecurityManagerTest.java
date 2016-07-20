package de.pawlidi.restgithub.security;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.pawlidi.restgithub.TestUtils;

public class SecurityManagerTest {

	private SecurityManager securityManager;

	@Before
	public void setUp() throws Exception {
		securityManager = new SecurityManager(TestUtils.USERNAME, TestUtils.PASSWORD);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsBasic() throws Exception {
		assertTrue(securityManager.isBasic());
	}

	@Test
	public void testGetLogin() throws Exception {
		assertNotNull(securityManager.getLogin());
	}

}
