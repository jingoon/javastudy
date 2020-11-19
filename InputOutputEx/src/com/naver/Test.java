package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Test {
	public void me1() {
		// byte stream에서 입력과 관련된 최상위 부모클래스는 InputStream
		// byte stream에서 출력과 관련된 최상위 부모클래스는 OutputStream
		// InputStream, OutputStream 추상클래스이다
		// 객체 만들지마
		// I/O 객체는 반드시 개발자가 메모리를 해제시켜야 한다
//		<I/O 객체 만들기>
//		1. stream을 선언만 한다.
//		2. try ~catch ~finally 구조를 만듬
//		3. ~f 안에 t~c
//		4. f 안에 있는 try에 close() 호출,(in과 out에 if) c에 예외처리
//		5. 원 try catch에 예외처리
//		6. 원래 try를 코딩 : 객체선언

		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("C:" + File.separator + "test.jpg");
			out = new FileOutputStream("c:" + File.separator + "test_copy.jpg");

			// 파일 처음부터 끝까지 데이터를 1byte씩 읽어 온다
			// 몇 번의 반복문을 사용해야 하는지 모르기에 while문을 사용
			while (true) {
				int what = in.read();
				if (what == -1) { // 더이상 줄게 없으면 -1을 넘겨준다.
					break;
				}

				out.write(what);
			}
			System.out.println("file copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void me2() {
		InputStream in = null;
		BufferedInputStream bis = null;

		OutputStream out = null;
		BufferedOutputStream bos = null;

		try {
			in = new FileInputStream("c:" + File.separator + "test.jpg");
			bis = new BufferedInputStream(in);

			out = new FileOutputStream("c:" + File.separator + "test_copy2.jpg");
			bos = new BufferedOutputStream(out);

			int what = -1;
			while (true) {
				what = bis.read();
				if (what == -1) {
					break;
				}
				bos.write(what);
			}
			System.out.println("copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) { // 필터 먼저 close
					bis.close();
				}
				if (in != null) { // 노드스트림이 필터보다 나중에 close
					in.close();
				}

				if (bos != null) {
					bos.close();
				}

				if (out != null) {
					out.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me3() {
		InputStream in = null;
		OutputStream out = null;
		try {

			in = new FileInputStream("c:" + File.separator + "test.jpg");
			out = new FileOutputStream("c:" + File.separator + "test_copy.jpg");

			byte[] arr = new byte[1024]; // what대신, 배열로 더 빨리
			int length = -1;
			while (true) {
				length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			System.out.println("copy end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public void me4() {

		InputStream in = null;
		OutputStream out = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {

			in = new FileInputStream("c:" + File.separator + "test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("c:" + File.separator + "test_copy2.jpg");
			bos = new BufferedOutputStream(out);

			byte[] arr = new byte[1024];
			int length = -1;
			while (true) {
				length = bis.read(arr);
				if (length == -1) {
					break;
				}
				bos.write(arr, 0, length);
			}
			System.out.println("end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos != null) {
					bos.close();
				}
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me5() {

		InputStream in = null;
		OutputStream out = null;
		byte[] arr = new byte[1024];

		try {
			in = new FileInputStream("c:" + File.separator + "test.jpg");
			out = new FileOutputStream(
					"." + File.separator + "src" + File.separator + "upload" + File.separator + "test_copy2.jpg");

			int length = -1;
			while (true) {
				length = in.read(arr);
				if (length == -1) {
					break;
				}
				out.write(arr, 0, length);
			}
			System.out.println("end");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void me6() {
		// 오브젝트인풋아웃풋 스트림
		//DTO(데이터저장을 위한 클레스)
	
		MemberDTO dto = new MemberDTO("m001", "kim", 10);
		// 데이터저장을 위한 객체 DTO클레스 직렬화해야함
		//implements Serializable , UID값마다 직렬화 방법이 바뀐다
		//UID값이 같아야 저장과 출력시 같은 데이터값을 얻을 수 있다.

		OutputStream out = null;
		ObjectOutputStream oos = null;

		InputStream in = null;
		ObjectInputStream ois = null;

		try {
			out = new FileOutputStream("obj.txt");// 텍스트 파일에 쓴다 (만든다)
			oos = new ObjectOutputStream(out);	// 텍스트파일에 데이터 입력할 객체

			oos.writeObject(dto);				// 오브젝트형(참조자료형)으로 데이터를 입력한다
			System.out.println(":::::::::::");

			in = new FileInputStream("obj.txt"); // 데이터를 읽어온다
			ois = new ObjectInputStream(in);	//오브젝트인풋스트림을 거쳐 읽어온다
			Object obj = ois.readObject();		//리드오브젝트로 참조자료형으로 읽어온다

			if (obj instanceof MemberDTO) {		//데이터의 형식이 참조자료형과 같은지 검사
				MemberDTO mDTO = (MemberDTO) obj; // 가저온 오브젝트를 참조자료형으로 형변환한다
				System.out.println(mDTO.getId()); // 각 데이터를 출력한다. 참조자료형 데이터를 저장 출력 하기위해 직렬화가 필요하다.
				System.out.println(mDTO.getAge());
				System.out.println(mDTO.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (in != null) {
					in.close();
				}
				if (ois != null) {
					ois.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
