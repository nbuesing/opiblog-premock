package com.objectpartners.buesing.premock;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PreMock {
	Class<?>[] value();
}
