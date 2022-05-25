package com.tk.functionalprogramming.chapter10.service;

import com.tk.functionalprogramming.chapter10.model.User;

public class VerifyYourEmailAddressEmailProvider implements EmailProvider {

	@Override
	public String getEmail(User user) {
		return "'Verify Your Email Address' email for " + user.getName();
	}

}
