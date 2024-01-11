package com.throwkeyword;

import java.io.IOException;

public class CheckedException {

	void method1() throws IOException {
		throw new IOException("Input error.... ");
	}

	void method2() throws IOException {
		method1();
	}

	void method3() {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CheckedException obj1 = new CheckedException();

		obj1.method3();
	}
}
