package practice0911;

public class Practice08 {
	public static void main(String[] args) {
		int[][] score = { { 79, 80, 99 }, // A�л�
				  { 95, 85, 89 }, // B�л�
				  { 90, 65, 56 }, // C�л�
				  { 69, 78, 77 } }; // D�л�
			// ���� : a   b   c
int[] student = new int[4]; // �л� ���� �迭 ����
int[] subject = new int[3]; // ���� ���� �迭 ����
String[] stuName = {"A�л�", "B�л�", "C�л�", "D�л�"}; // �л��� �迭 ����
String[] subName = {"����", "����", "����"}; // ����� �迭 ����

for (int i = 0; i < student.length; i++) {
	for (int j = 0; j < subject.length; j++) {
		student[i] += score[i][j]; // �л��� ���� ���
	}
	System.out.println(stuName[i] + " ���� : " + student[i]);
}
System.out.println("-----------------");
for (int j = 0; j < subject.length; j++) {
	for (int i = 0; i < student.length; i++) {
		subject[j] += score[i][j]; // ���� ���� ���
	}
	System.out.println(subName[j]+" ���� : " + subject[j]);
}
}
}