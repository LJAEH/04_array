package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    /* �ǽ����� 1
    ���̰� 9�� �迭�� ���� �� �Ҵ��ϰ�, 1���� 9������ ���� �ݺ����� �̿��Ͽ�
    ������� �迭�� �� �ε��� ��ҿ� �����ϰ� ����� ��
    ¦�� ��° �ε��� ���� ���� ����ϼ���. (0 ��° �ε����� ¦���� ���)
    */
    public void practice1() {
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");

            if (i % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("\n¦�� ��° �ε��� �� : " + sum);
    }

    /* �ǽ����� 2
    ���̰� 9�� �迭�� ���� �� �Ҵ��ϰ�, 9���� 1������ ���� �ݺ����� �̿��Ͽ�
    ������� �迭�� �� �ε��� ��ҿ� �����ϰ� ����� ��
    Ȧ�� ��° �ε��� ���� ���� ����ϼ���. (0 ��° �ε����� ¦���� ���)
     */
    public void practice2() {
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
            System.out.print(arr[i] + " ");

            if (i % 2 == 1) {
                sum += arr[i];
            }
        }

        System.out.println("\nȦ�� ��° �ε��� �� : " + sum);
    }

    /* �ǽ����� 3
    ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
    1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
    */
    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("���� ���� : ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }

    /*�ǽ����� 4
    ���� 5���� �Է� �޾� �迭�� �ʱ�ȭ �ϰ�
    �˻��� ������ �ϳ� �Է� �޾� �迭���� ���� ���� �ִ� �ε����� ã�� ���.
    �迭�� ���� ���� ���� ��� ����ġ�ϴ� ���� �������� �ʽ��ϴ١� ���
     */
    public void practice4() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("�Է� %d : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("�˻��� �� : ");
        int search = sc.nextInt();

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("�ε��� : " + i);
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
    }


    /* �ǽ����� 5
    ���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ� �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
    ������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���.
    ex.
    ���ڿ� : application
    ���� : i
    application�� i�� �����ϴ� ��ġ(�ε���) : 4 8
    i ���� : 2
    */
    public void practice5() {
        // 1. ����ڿ��� ���ڿ��� ���� �Է¹ޱ�
        Scanner sc = new Scanner(System.in);

        System.out.print("���ڿ� : ");
        String str = sc.nextLine();


        // 2. ����ڰ� �Է��� ���ڿ�(str)�� ���� �ϳ��ϳ��� char�迭�� �ֱ�

        // ���� ����ڰ� �Է��� ���ڿ� ���̸�ŭ�� char�迭�� �Ҵ�
        char[] arr = new char[str.length()];

        // �ݺ����� ���� str.charAt(i) ���� arr[i] �� ��� ����
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        System.out.print("���� : ");
        char ch = sc.nextLine().charAt(0);

        // 3. �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ��� �ε����� �ִ��� �ľ�

        int count = 0;    // �˻��� ���ڰ� ���ڿ��� ��� ����ִ����� ������ ����
        // ���ڿ����� ������ ���ڰ� �߻��� ������ 1�� ����

        // �ݺ��� ������ ���ڿ� ���
        System.out.print(str + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");

        // �ε������� �����ϱ� ���� �ݺ��� ���
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) { // �ش� �ε��� ���� �˻��� ���ڿ� ���� ���
                System.out.print(i + " ");    // �ش� �ε��� �̾ ���

                count++;    // �׸��� count 1����
            }
        }

        // ������ print()�� ����߱� ������ ������ �Ǿ����� ����
        System.out.println();    // �ٹٲ�

        System.out.println(ch + "���� : " + count);

    }


    /* �ǽ����� 6
    ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
    �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
    �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
     */
    public void practice6() {
        // 1. ����ڿ��� ���� �Է¹ް� �� ����ŭ�� �迭 ���� �� �Ҵ�
        Scanner sc = new Scanner(System.in);

        System.out.print("���� : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        // 2. �� �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ
        for (int i = 0; i < arr.length; i++) {
            System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
            arr[i] = sc.nextInt();
        }


        // 3. ��ü �� ���� �� �� �� ���
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println();
        System.out.println("�� �� : " + sum);
    }

    /* �ǽ����� 7
    �ֹε�Ϲ�ȣ�� �Է� �޾� char �迭�� ������ �� ����ϼ���.
    ��, char �迭 ���� �� ������ ��Ÿ���� ���� ���ĺ��� *�� �����ϼ���.
    [���� ȭ��]
    �ֹε�Ϲ�ȣ(-����) : 123456-1234567
    123456-1******
    */
    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
        String input = sc.next();

        char[] arr = new char[input.length()];

        for (int i = 0; i < arr.length; i++) {

            if (i <= 7) { // 7�� �ε��� ����(�������, - , ����)
                arr[i] = input.charAt(i);
            } else { // 8�� �ε��� �̻���ʹ� *
                arr[i] = '*';
            }
            System.out.print(arr[i]);
        }
    }

    /* �ǽ����� 8
    3�̻��� Ȧ���� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
    �߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
    ��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
    �ٽ� ������ �޵��� �ϼ���.
    [���� ȭ��]
    ���� : 4
    �ٽ� �Է��ϼ���.
    ���� : -6
    �ٽ� �Է��ϼ���.
    ���� : 5
    1, 2, 3, 2, 1
    */
    public void practice8() {

        Scanner sc = new Scanner(System.in);

        while (true) { // 3 �̻��� ���� �Է� �� �� ���� ���� �ݺ�
            // -> 3 �̻��� �ԷµǸ� break������ ����

            System.out.print("���� : ");
            int input = sc.nextInt();

            if (input < 3 || input % 2 == 0) { // 3 �̸� �Ǵ� ¦���� ��� -> �ݺ�
                System.out.println("�ٽ� �Է��ϼ���.");

            } else {
                // �Է� ���� ���� ��ŭ�� ũ�⸦ ������ �迭 ����
                int[] arr = new int[input];

                int num = 0; // arr �迭�� ���Ե� ��

                for (int i = 0; i < arr.length; i++) {
                    if (i <= arr.length / 2) { // �߰� ���� ���� -> ����
                        arr[i] = ++num;

                    } else { // �߰� ���� -> ����
                        arr[i] = --num;
                    }

                    // ��� �� , �߰� (��, ������ ����)
                    if (i == arr.length - 1) { // ������ ����
                        System.out.print(arr[i]);

                    } else {
                        System.out.print(arr[i] + ", ");
                    }

                }
                break; // while �ݺ� ����
            }
        }
    }

    /* �ǽ����� 9
    10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�,
    1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
    [���� ȭ��]
    �߻��� ���� : 9 7 6 2 5 10 7 2 9 6
    */
    public void practice9(){
        int[] arr = new int[10];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }

        System.out.print("�߻��� ���� : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    /* �ǽ����� 10
    10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�,
    1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
    �迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���.
    [���� ȭ��]
    �߻��� ���� : 5 3 2 7 4 8 6 10 9 10
    �ִ밪 : 10
    �ּҰ� : 2
    */
    public void practice10(){
// 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
        int[] arr = new int[10];

        // 2. �� �ε����� 1���� 10 ������ ������ �߻����� �ʱ�ȭ �� ���
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);

            System.out.print(arr[i] + " ");
        }

        System.out.println(); // ����

        // 3. �ݺ����� ���� �ִ밪 �ּҰ� �˾Ƴ���
        int max = 1;  // �ּҰ��� ����� ����
        int min = 10; // �ִ밪�� ����� ����

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > max) { // �ش� �ε����� ���� max ���� ū ���
                max = arr[i]; // �ش� ���� max ������ �����
            }

            if(arr[i] < min) { // �ش� �ε�����  ���� min ���� ���� ���
                min = arr[i]; // �ش� ���� min ������ �����
            }
        }

        System.out.println("�ִ밪 : " + max);
        System.out.println("�ּҰ� : " + min);
    }

    /* �ǽ����� 11
    10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
    1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���.
    */
    public void practice11(){
        // 1. 10���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
        int[] arr = new int[10];

        // 2. �� �ε��� ���� 1���� 10 ������ ������ �߻���Ű�µ� �̶� �ߺ��� ������
        for(int i=0; i<arr.length; i++) {

            arr[i] = (int)(Math.random() * 10 + 1);

            for(int j=0; j<i; j++) { // �ߺ� ����
                if(arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        // 3. ���
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* �ǽ����� 12
    �ζ� ��ȣ �ڵ� ������ ���α׷��� �����.
    (�ߺ� �� ���� ������������ �����Ͽ� ����ϼ���.)
    [���� ȭ��]
    3 4 15 17 28 40
    */
    public void practice12(){
        // 1. ũ�Ⱑ 6�� ������ �迭 ���� �� �Ҵ�
        int[] lotto = new int[6];

        // 2. �迭�� �ߺ������� 1���� 45������ ���� �ʱ�ȭ
        for(int i=0; i<lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 45 + 1);

            for(int j=0; j<i; j++) { // �ߺ� ����
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        // 3. �������� ����(��������)
        for(int i=0; i<lotto.length-1; i++) { // �� ��ü
            for(int j=i+1; j<lotto.length; j++) { // �� ���
                if(lotto[i] > lotto[j]) { // �� ��ü�� �� ��󺸴� ū ��� ���� �ٲ���ߵ�

                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        // 4. ���
        for(int i=0; i<lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }

    /* �ǽ����� 13
    ���ڿ��� �Է� �޾� ���ڿ��� � ���ڰ� ������ �迭�� �����ϰ�
    ������ ������ �Բ� ����ϼ���. (�ߺ� ����)
    [���� ȭ��]
    ���ڿ� : application
    ���ڿ��� �ִ� ���� : a, p, l, i, c, t, o, n
    ���� ���� : 8
    */
    public void practice13(){
        // 1. ����ڿ��� ���ڿ� �Է¹ޱ�
        Scanner sc = new Scanner(System.in);

        System.out.print("���ڿ� : ");
        String str = sc.nextLine();

        // 2. �ش� ���ڿ��� ���ڵ��� char[]�� ���
        char[] arr = new char[str.length()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        // 3. char�迭���� �ߺ��� ������ ��� ���X,
        int count = 0; // ���� ���� ī��Ʈ

        System.out.print("���ڿ��� �ִ� ���� : ");

        for(int i=0; i<arr.length; i++) {

            boolean flag = true; // �ߺ� üũ�� flag

            for(int j=0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    flag = false; // �ߺ��̹߻����� ��
                    break;
                }
            }

            if(flag) { // �ߺ��� �߻����� �ʾ��� ���

                if(i == 0) {
                    System.out.print(arr[i]);
                }else {
                    System.out.print(", " + arr[i]);
                }

                count++;
            }
        }

        System.out.println();
        System.out.println("���� ���� : " + count);
    }

    /* �ǽ����� 14
    ����ڰ� �Է��� �迭�� ���̸�ŭ�� String �迭�� ���� �� �Ҵ��ϰ�
    �迭�� �ε����� ���� �� ���� ����ڰ� �Է��Ͽ� �ʱ�ȭ �ϼ���.
    ��, ����ڿ��� �迭�� ���� �� ������ ����� �� ���� �� �Է��� ����,
    �ø� ���� � �����͸� ���� ������ ��������.
    ����ڰ� �� �̻� �Է����� �ʰڴٰ� �ϸ� �迭 ��ü ���� ����ϼ���.
     */
    public void practice14(){

        // 1. ù �迭 ũ�� ����
        Scanner sc= new Scanner(System.in);

        System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        // 2. ù �迭�� ������ ���ڿ� �Է� �ޱ�
        for(int i=0; i<arr.length ; i++) {
            System.out.print((i+1) + "��° ���ڿ� : ");
            arr[i] = sc.nextLine();
        }

        // 3. �ݺ��� ���۵Ǵ� �������� ���ѷ����� �ۼ��Ͽ� ���ο� ���� ������ ����� break
        while(true) {
            System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
            char ch = sc.nextLine().charAt(0);

            // 4. ���� �� �Է��� ���
            if(ch == 'y' || ch == 'Y') {

                // 5. �� �Է¹��� ���� �Է� �ޱ�
                System.out.print("�� �Է��ϰ� ���� ���� : ");
                int addSize = sc.nextInt();
                sc.nextLine();

                // 6. ���� ���� �Է� ���� �迭 ���� --> ���� �迭 ũ�� + �߰� �Է� ����
                String[] newArr = new String[arr.length + addSize];

                // 7. �迭 ���� + ���ο� ���ڿ� �Է� �ޱ�
                for(int i=0; i<newArr.length ; i++) {
                    if(i<arr.length) { // �ε����� ũ�Ⱑ ���� �迭���� ���� ��� ���� �迭�� ����
                        newArr[i] = arr[i];
                    }else { // �ε����� ũ�Ⱑ ���� �迭���� Ŭ ��� ���ο� ���ڿ� �Է� �ޱ�
                        System.out.print((i+1) + "��° ���ڿ� : ");
                        newArr[i] = sc.nextLine();
                    }
                }

                // 8. ���� �迭������ �����ϴ� ���� arr�� ���ο� �迭 ������ �ּ� newArr ����
                arr = newArr;

            }else if(ch == 'n' || ch == 'N'){ // 9. ���� �� �Է����� ���� ���
                break; // �ݺ��� ����
            }else { // �߸� �Է��� ���
                System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
            }
        }

        // 10. �迭�� ��� ���
        System.out.println(Arrays.toString(arr));
    }
}