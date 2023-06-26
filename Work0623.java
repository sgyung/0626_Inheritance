package day0626;

/**
 * 학생의 점수를 처리하는 프로그램 작성.
 * @author USER
 */
public class Work0623 {

	/**
	 * 학생의 총점을 구하는 일
	 * @param score 점수를 저장한 1차원 배열  
	 * @return 1차원 배열의 누적합
	 */
	public int studentTotal(int[] score) {
		int totalScore = 0;
		for (int i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		return totalScore;
	}
	
	/**
	 * 점수를 구하는 일
	 */
	public void scoreProcess() {
		String[] names = {"김선경","김주민","박상준","서효민","송지하","오호수"};
		int[][] score = { {84,87,79}, {91,100,97}, {75,79,79}, {63,66,62}, {99,99,99}, {82,86,83} };
		
		System.out.println("============================================================");
		System.out.println("번호\t이름\t자바\t오라클\tJDBC\t총점\t평균");
		System.out.println("============================================================");
		int total = 0;
		
		for (int i = 0; i < score.length; i++) {
		
			System.out.printf("%d\t%s\t", i+1, names[i]);
			
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t", score[i][j]);
				System.out.printf("");
				}
			total = studentTotal(score[i]);
			
			System.out.printf("%d\n", total);
		}	
			
		System.out.println("============================================================");
		// 자바,오라클, JDBC, 전체 총점
		System.out.printf("총점\t");
		// 자바,오라클, JDBC, 전체 평균
		System.out.printf("평균\t");
		// 1등 학생의 이름과 번호를 출력
		TopStudentVO tsVO= topStudentProcess(score, names);
		System.out.printf("평균 1등 이름 [%s] 번호 [%d]", tsVO.getName(), tsVO.getNum());
	}
		/**
		 * 입력된 점수 데이터와 이름데이터를 가지고 최고 학생의 번호와 이름을 얻는 일
		 * @param score 점수 데이터
		 * @param names 이름 데이터
		 * @return 점수와 이름 가지고 있는 VO객체
		 */
		public TopStudentVO topStudentProcess(int[][] score, String[] names) {
			TopStudentVO tsVO =null;
			int tempTop = 0;
			int total = 0;
			int num = 0;
			String name = "";
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					total+=score[i][j]; //학생의 점수를 합산하고
				}
				if (tempTop < total) {// 합산 점수로 최고 점수를 비교
					tempTop = total; // 1등 학생의 점수로 최고점을 변경
					num = i+1;
					name = names[i];
				}
				total = 0; //총점을 초기화
			}
			// 처리된 데이터로 객체를 생성한 후
			tsVO = new TopStudentVO(num,name);
			return tsVO;
		}
	

	public static void main(String[] args) {
		new Work0623().scoreProcess();
	}

}
