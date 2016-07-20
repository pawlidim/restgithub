package de.pawlidi.restgithub.rest.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class RestUtils {

	public static Map<String, List<String>> extractParametersFromUrl(String url) {
		if (url == null) {
			return Collections.EMPTY_MAP;
		}

		Map<String, List<String>> parameters = new HashMap<String, List<String>>();

		String[] urlParts = url.split("\\?");

		if (urlParts.length > 1) {
			String query = urlParts[1];

			for (String param : query.split("&")) {
				String[] pair = param.split("=");
				String key = urlDecode(pair[0]);
				String value = "";

				if (pair.length > 1) {
					value = urlDecode(pair[1]);
				}

				List<String> values = parameters.get(key);

				if (values == null) {
					values = new ArrayList<String>();
					parameters.put(key, values);
				}

				values.add(value);
			}
		}

		return parameters;
	}

	/**
	 * URL-decodes a string.
	 * <p>
	 * Assumes {@code string} is in {@value #ENCODING_CHARSET} format.
	 * 
	 * @param string
	 *            The string to URL-decode.
	 * @return The URL-decoded version of the input string, or {@code null} if
	 *         {@code string} is {@code null}.
	 * @throws IllegalStateException
	 *             If unable to URL-decode because the JVM doesn't support
	 *             {@value #ENCODING_CHARSET}.
	 * @since 1.6.5
	 */
	public static String urlDecode(String string) {
		if (string == null) {
			return null;
		}
		try {
			return URLDecoder.decode(string, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException("Find unsupported encoding for UTF-8", e);
		}
	}

	/**
	 * URL-encodes a string.
	 * <p>
	 * Assumes {@code string} is in {@value #ENCODING_CHARSET} format.
	 * 
	 * @param string
	 *            The string to URL-encode.
	 * @return The URL-encoded version of the input string, or {@code null} if
	 *         {@code string} is {@code null}.
	 * @throws IllegalStateException
	 *             If unable to URL-encode because the JVM doesn't support
	 *             {@value #ENCODING_CHARSET}.
	 */
	public static String urlEncode(String string) {
		if (string == null) {
			return null;
		}
		try {
			return URLEncoder.encode(string, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalStateException("Find unsupported encoding for UTF-8", e);
		}
	}
}
