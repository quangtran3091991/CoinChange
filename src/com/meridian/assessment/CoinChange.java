package com.meridian.assessment;

public class CoinChange {

	public static int count(int coinVal) throws Exception {
		if (coinVal <= 7489) {
			int[][] table = new int[coinVal + 2][6];
			for (int i = 1; i < coinVal + 2; i++) {
				table[i][0] = i - 1;
			}
			table[0][1] = 1;
			table[0][2] = 5;
			table[0][3] = 10;
			table[0][4] = 25;
			table[0][5] = 50;
			for (int j = 1; j < 6; j++)
				table[1][j] = 1;
			for (int i = 1; i <= coinVal + 1; i++)
				table[i][1] = 1;
			for (int j = 2; j < 6; j++) {
				for (int i = 2; i < coinVal + 2; i++) {
					if (table[0][j] > table[i][0]) {
						table[i][j] = table[i][j - 1];
					} else {
						table[i][j] = table[i][j - 1]
								+ table[i - table[0][j]][j];
					}
				}
			}
			return table[coinVal + 1][5];

		} else
			throw new Exception("Unable to handle more than 7689 cents");
	}

	public static void main(String args[]) throws Exception {

		System.out.println(CoinChange.count(15));
	}

}
