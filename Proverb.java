package sec04;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Proverb {
	public static void main(String[] args) {
		String word = "Empty vessels make the most sound.";
		System.out.println("입력 : "+word);
		StringTokenizer st = new StringTokenizer(word, " ");
		int n = st.countTokens();	
		int i =0;
		String[] arr = new String[n];
		while(st.hasMoreTokens()) {
				arr[i] = st.nextToken();
				i++;
			}
			System.out.println("단어개수 : "+i);
			System.out.println("정렬 전:" +Arrays.toString(arr));
			Arrays.sort(arr);
			System.out.println("정렬 후 :" +Arrays.toString(arr));
			for(String j : arr) {
				System.out.print(j+", ");
			}
			
		}
	}

