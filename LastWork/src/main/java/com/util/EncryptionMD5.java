package com.util;

import java.security.MessageDigest;
import java.util.Base64;

public class EncryptionMD5 {
		
	/**
	 * 对密码进行MD5加密后修改为Base64编码。
	 * @param oldPassword
	 * @return newPassword（Bse64）
	 */
	public static String toMD5(String oldPassword) {
		byte[] oldBytes = oldPassword.getBytes();
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] newBytes = md.digest(oldBytes);
			
			String newPassword = Base64.getEncoder().encodeToString(newBytes);
			return newPassword;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

}
