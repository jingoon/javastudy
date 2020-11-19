package com.naver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.omg.CosNaming.BindingIteratorOperations;

public class Test2 {

	public void me1() {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			out = new FileOutputStream("c:"+File.separator+"test_copy.jpg");
			int what = -1;
			while(true) {
				what= in.read();
				if(what == -1) {
					break;
				}
				out.write(what);
			}
			System.out.println("FileStream copy end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
		BufferedOutputStream bos =null;
		
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("c:"+File.separator+"test2.jpg");
			bos = new BufferedOutputStream(out);
			
			int what = -1;
			while((what=bis.read()) != -1) {
				bos.write(what);
			}
			System.out.println("FileStream + BufferedStream test2 copy");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bis != null) {
					bis.close();
				}
				if (bos!= null) {
					bos.close();
				}
				if (in != null) {
					in.close();
				}
				if (out!= null) {
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
			
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			out = new FileOutputStream("c:"+File.separator+"test_copy.jpg");
			
			byte[] arr = new byte[1024];
			int length =-1;
			while((length=in.read(arr)) != -1) {
				out.write(arr,0,length);
			}
			System.out.println("FileStream + 배열 end");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (in !=null) {
					in.close();
				}
				if (out !=null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void me4() {
		InputStream in = null;
		BufferedInputStream bis = null;
		OutputStream out = null;
		BufferedOutputStream bos = null;
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");			
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("c:"+File.separator+"test_copy.jpg");
			bos = new BufferedOutputStream(out);
			byte[] arr = new byte[1024];
			int length = -1;
			while((length = bis.read(arr)) !=-1) {
				bos.write(arr, 0, length);
			}
			System.out.println("FileStream + BufferedStream + 배열 copyEnd");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (bis !=null) {
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
		// 상대경로를 이용해서 복사한 이미지를 저장
		// 배열을 사용해서 속도 업
		// 필터스트림인 BufferedStream을 사용해서 속도 업
		InputStream in = null;
		BufferedInputStream bis= null;
		OutputStream out = null;
		BufferedOutputStream bos =null;
		try {
			in = new FileInputStream("c:"+File.separator+"test.jpg");
			bis = new BufferedInputStream(in);
			out = new FileOutputStream("."+File.separator+"src"+File.separator+"upload"+File.separator+"test2.jpg");
			bos = new BufferedOutputStream(out);
			
			byte[] arr = new byte[1024];
			int length = -1;
			while ((length=bis.read(arr))!=-1) {
				bos.write(arr, 0, length);
			}
			System.out.println("4 + 상대주소 end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
				if (out !=null) {
					out.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();		
				}
		}
	}
	public void me6() {
		//ObjectStream
		// DB가 없으니 데이터저장클레스의 memberDTO의 데이터를 텍스트 문서로 만든다
		//텍스트 문서의 데이터를 읽어 출력한다.
		MemberDTO dto = new MemberDTO("m001", "철수", 18);
		OutputStream out = null;
		ObjectOutputStream oos = null;
		
		InputStream in = null;
		ObjectInputStream ois=null;
		try {
			
			out = new FileOutputStream("obj2.txt");
			oos = new ObjectOutputStream(out);
			
			oos.writeObject(dto);
			
			
			in = new FileInputStream("obj2.txt");
			ois = new ObjectInputStream(in);
			Object mdto = ois.readObject();
			if(mdto.getClass() == mdto.getClass()) {
				MemberDTO mmdto = (MemberDTO) mdto;
				System.out.println(mmdto.getAge());
				System.out.println(mmdto.getId());
				System.out.println(mmdto.getName());
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (oos != null) {
					oos.close();
				}
				if (ois != null) {
					ois.close();
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

	
	
	
	
	
	
	
	
	
	
	
	
	
}