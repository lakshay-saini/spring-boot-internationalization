package com.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Translator {

	private static ReloadableResourceBundleMessageSource messageSource;

	@Autowired
	Translator(ReloadableResourceBundleMessageSource messageSource) {
		Translator.messageSource = messageSource;
	}

	public static String toLocale(String msg) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(msg, null, locale);
	}
}
