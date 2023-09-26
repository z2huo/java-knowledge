package cn.z2huo.knowledge.basic.annotation.useCaseAnno;

public class PasswordUtils {
	@UseCase(id = 47, description = "password must contain at least one numeric")
	public boolean validatePassword(String password) {
		return (password.matches("\\w*\\d\\w*"));
	}
	@UseCase(id = 48)
	public String encryptPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
}
