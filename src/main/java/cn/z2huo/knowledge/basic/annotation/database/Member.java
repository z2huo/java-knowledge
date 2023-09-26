package cn.z2huo.knowledge.basic.annotation.database;

@DBTable(name = "MEMBER")
public class Member {
	@SQLString(30) String firstName;
	@SQLString(50) String lastName;
//	@SQLString("hhh") String lastName;	//����ǲ��Եģ���������û��ָ��ֵ�ļ�����Ĭ�ϼ���value��
	@SQLInteger Integer age;
	@SQLString(value = 30, constraints = @Constraints(primaryKey = true)) String handle;
	
	static int memberCount;
	public String getHandle() {
		return handle;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String toString() {
		return handle;
	}
	public Integer getAge() {
		return age;
	}
}
