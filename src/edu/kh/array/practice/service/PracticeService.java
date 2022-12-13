package edu.kh.array.practice.service;

import java.util.Arrays;


import java.util.Scanner;


public class PracticeService {
	
	Scanner sc = new Scanner(System.in);

	
	public void practice1() {
		/*길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		*/
		
		int[] arr = new int[9];
		int sum = 0;
		
		for( int i = 0; i < arr.length; i++) {
			
			arr[i] = (i+1);
			if (i%2 == 0) {
				sum += (i);
			}
			
			// 01 23 45 67 89 
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("짝수 번째 인덱스 합 : " + sum);
		
	}
	
	public void practice2() {
		/*길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		   */
		int[] arr = new int[9];
		int sum = 0;
		
		for( int i = 0; i < arr.length; i++) {
			
			arr[i] = (arr.length-i);
			if (i%2 != 0) {
				sum += (arr.length-i);
			}
			
			// 18 36 54 72			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("홀수 번째 인덱스의 합 : " + sum);
		
		
	}
	
	public void practice3() {
		
		/*사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		  1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	     */
		
		System.out.print("양의 정수 입력: ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i+1);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public void practice4() {
		/* 
		 * 정수 5개를 입력 받아 배열을 초기화 하고
		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		*/
		
		int[] arr = new int[5];
		
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.print("입력" + i + " : ");
			int x = sc.nextInt();
			
			arr[i] = x;
		}
		
		System.out.print("검색할 값 : ");
		int y = sc.nextInt();
		int count = 0;
		
		for( int i = 0; i < arr.length; i++) {
			if (arr[i] == y) {
				System.out.println("index :" + i);
				count++;
			} 
		}
		
		if ( count == 0 ) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}
	}
	
	public void practice5() {
		/* 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		*/
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for( int i = 0; i < arr.length; i++) {
			arr[i]=str.charAt(i);
		}
		
		System.out.print("확인 할 문자 : ");
		char alp = sc.next().charAt(0);
		int count = 0;
		
		System.out.print(str+"에 i가 존재하는 위치(인덱스) : ");
		for( int i = 0; i < arr.length; i++) {
			if( arr[i] == alp ) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		
		System.out.println(alp + "개수 : " + count);
		
	}
	
	public void practice6() {
		/* 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		*/
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : " , i);
			int a = sc.nextInt();
			
			arr[i] = a;
			
			sum += a;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("총합 : " + sum);
		
	}
	
	public void practice7() {

		// 주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 
		// 이후부터 *로 가리고 출력하세요.
		
		
		System.out.print("주민등록번호(-포함) : ");
		
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for( int i = 0; i < arr.length; i++) {
			if( i <= 7 ) {
				arr[i] = str.charAt(i);
			} else {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}
		
	}
	
	public void practice8() {
		/* 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.
		*/
		
		for ( int re = 1; re >= 1; re++) {
		System.out.print("홀수 : ");
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		if(a%2 != 0) {
		
			for ( int i = 0; i < arr.length; i++) {
				if ( i < (arr.length/2+1)) {
					arr[i] = i+1;
				} else {
					arr[i] = arr.length-i;
				}
				
			}
		
			System.out.println(Arrays.toString(arr));
			
			break;
			
		} else {
			System.out.println("다시 입력하세요.");
		}
		
		
	}
	
	}
	
	public void practice9() {
		
		/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		*/
		
		int[] ten = new int[10];
		
		for(int i = 0; i < ten.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			
			ten[i] = random;
			
		}
		
		System.out.println("발생한 난수: " + Arrays.toString(ten));
		
		
		
	}
	
	public void practice10() {
		/*10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		1~10 사이의 난수를 발생시켜 배열에 초기화 후
		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.

		[실행 화면]
		발생한 난수 : 5 3 2 7 4 8 6 10 9 10
		최대값 : 10
		최소값 : 2
		*/
		
		int[] ten = new int[10];
		
		for(int i = 0; i < ten.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			
			ten[i] = random;
			
		}
		
		System.out.println("발생한 난수: " + Arrays.toString(ten));
		
		int max = ten[0];
		
		int min = ten[0];
		
		for ( int a = 0; a < ten.length; a++) {
			if( ten[a] > max ) {
				max = ten[a];
			}
			if( ten[a] < min) {
				min = ten[a];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}
	
	public void practice11() {
		/* 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		*/
		
		int[] ten = new int[10];
		
		for(int i = 0; i < ten.length; i++) {
			
			int random = (int)(Math.random()*10+1);
			
			ten[i] = random;
			
			for(int x = 0; x <i; x++) {
				if(random == ten[x]) {
					i--;
					
					break;
					
				}
			}
			
		}
		
		System.out.println("발생한 난수: " + Arrays.toString(ten));
	}
	
	public void practice12() {
		
		/*로또 번호 자동 생성기 프로그램을 만들기.
		(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		*/
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			
			int random = (int)(Math.random()*45+1);
			
			lotto[i]= random;
			
			for(int a = 0; a < i; a++) {
				
				if( random == lotto[a]) {
					i--;
					
					break;
				}
				
			}
			
		}
		
		Arrays.sort(lotto);
		
		System.out.println(Arrays.toString(lotto));
	}
	
	public void practice13() {
		
		/* 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		문자의 개수와 함께 출력하세요.
		*/
		
		System.out.print("문자를 입력하세여 : ");
		
		String str = sc.nextLine();
		
		int sum = 0;
		
		for (int a = 0; a < str.length(); a++ ) {
			for( int b = 0; b < str.length(); b++) {
				int count = 0;
				if (a != b ) {
					
					if( str.charAt(a) == str.charAt(b)) {
						count++;
					}
				}
				sum += count;
			}
			
		}
		
		int length = str.length()-sum;
		
		System.out.println(length);
		
		/*System.out.println("문자열에 있는 문자 : " + Arrays.toString(arr));
		
		System.out.println("문자 개수 : " + arr.length);
		
		*/
	}
	
}
