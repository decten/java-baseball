package baseball;

import java.util.Arrays;

public class BaseballCount {
	public int ballCount = 0;
	public int strikeCount = 0;

	public BaseballCount(int[] userNums, int[] computerNums) {
		this.count(userNums, computerNums);
	}

	public void count(int[] userNums, int[] computerNums) {
		for (int i = 0; i < 3; i++) {
			if (userNums[i] == computerNums[i]) {
				strikeCount++;
				continue;
			}
			if (isInArray(userNums[i], computerNums)) {
				ballCount++;
			}
		}
	}

	public boolean isInArray(int num, int[] nums) {
		return Arrays.stream(nums)
			.anyMatch(arrayNum -> arrayNum == num);
	}
}