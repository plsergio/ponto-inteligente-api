package br.jus.tjdft.pontointeligente.api.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtilsTest {

	private static final String SENHA = "123456";
	private final BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
	
	@Test
	public void testSenhaNula() throws Exception{
		assertNull(PasswordUtils.gerarBCcrypt(null));
	}
	
	@Test
	public void testGeeraHashSenha() throws Exception{
		String hash = PasswordUtils.gerarBCcrypt(SENHA);
		assertTrue(bCryptEncoder.matches(SENHA, hash));
	}

}
