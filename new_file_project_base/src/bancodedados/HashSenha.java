package bancodedados;

public class HashSenha {
	public static String hashSenha(String senha) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hash = md.digest(senha.getBytes(StandardCharsets.UTF_8));
		StringBuilder hexString = new StringBuilder();
		for (byte b : hash) {
			hexString.append(String.format("%02x", b));
		}
		return hexString.toString();
	}
}
