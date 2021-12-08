package com;

import java.util.List;
import java.util.stream.Collectors;

public class StringFeature {

	public static void main(String[] args) {
		String multilineString = "Ankur reads \n \n java11 \n to explore Java.";
		List<String> lines = multilineString.lines().filter(line -> !line.isBlank()).map(String::strip)
				.collect(Collectors.toList());
		System.out.println(lines);
	}
}
