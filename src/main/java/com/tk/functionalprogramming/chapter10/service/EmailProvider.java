package com.tk.functionalprogramming.chapter10.service;

import com.tk.functionalprogramming.chapter10.model.User;

public interface EmailProvider {
	String getEmail(User user);
}
