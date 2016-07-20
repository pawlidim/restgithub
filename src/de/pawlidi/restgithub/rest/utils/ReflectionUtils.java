package de.pawlidi.restgithub.rest.utils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectionUtils {

	public static Class getCollectionElementType(Type collectionType) {
		if (!(collectionType instanceof ParameterizedType)) {
			return null;
		}
		Type[] typeArguments = ((ParameterizedType) collectionType).getActualTypeArguments();
		if (typeArguments.length == 0) {
			return null;
		}
		Type typeArgument = typeArguments.length == 1 ? typeArguments[0] : typeArguments[1];
		if (typeArgument instanceof ParameterizedType) {
			typeArgument = ((ParameterizedType) typeArgument).getRawType();
		}
		if (!(typeArgument instanceof Class)) {
			return null;
		}
		return (Class) typeArgument;
	}
}
