package de.pawlidi.restgithub;

import java.nio.charset.Charset;
import java.util.Base64;
import java.util.UUID;

import de.pawlidi.restgithub.rest.converter.EnumConverter;
import de.pawlidi.restgithub.rest.converter.GsonConverter;
import de.pawlidi.restgithub.rest.converter.PrimitiveConverter;
import retrofit2.Retrofit;

public abstract class TestUtils {

	public static final String NEW_EMAIL = "";
	public static final String USERNAME = "";
	public static final String PASSWORD = "";
	public static final String CLIENT_ID = "";
	public static final String CLIENT_SECRET = "";
	public static final String TOKEN = "";

	public static final String LOGIN = String.format("Basic %s", Base64.getEncoder().encode(String.format("%s:%s", USERNAME, PASSWORD).getBytes(Charset.forName("UTF-8"))));

	public static final String LOGIN_TOKEN = String.format("token %s", TOKEN);

	public static Retrofit createRetrofit() {
		return new Retrofit.Builder().baseUrl("https://api.github.com").addConverterFactory(new PrimitiveConverter())
				.addConverterFactory(new EnumConverter()).addConverterFactory(new GsonConverter()).build();

	}

	public static String createRandomString() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
