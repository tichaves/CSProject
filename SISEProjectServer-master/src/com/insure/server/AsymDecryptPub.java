package com.insure.server;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class AsymDecryptPub {
	private Cipher cipher;

	public AsymDecryptPub() throws NoSuchAlgorithmException, NoSuchPaddingException {
		this.cipher = Cipher.getInstance("RSA");
	}

	public PublicKey getPublic(String filename) throws Exception {
		byte[] keyBytes = Files.readAllBytes(new File(filename).toPath());
		X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		return kf.generatePublic(spec);
	}

	public String decryptText(String msg, Key key)
			throws InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		this.cipher.init(Cipher.DECRYPT_MODE, key);
		return new String(this.cipher.doFinal(Base64.getDecoder().decode(msg)), "UTF-8");
	}
}
