package Chap07_hwrk;

public class hwrk7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person = 10;

		InputData inData = new InputData();

		for (int i = 0; i < person; i++) {
			String name = "홍길" + i;
			int ko = (int) (Math.random() * 100);
			int en = (int) (Math.random() * 100);
			int ma = (int) (Math.random() * 100);
			inData.setData(i, name, ko, en, ma);
		}

		for (int i = 0; i < person; i++) {
			System.out.println("번호: " + i + " 이름: " + inData.name[i] + " 국어: " + inData.ko[i] + " 영어: " + inData.en[i]
					+ " 수학: " + inData.ma[i] + " 총점: " + inData.sum[i] + " 평균: " + inData.avg[i]);
		}

	}

}
