package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

import com.me.MemberDAO2;
import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test dao = new Test();
		MemberDAO dao2 = new MemberDAO();
		
//		testMe1(dao);
		//�Է�
//		insert(dao2);
		//����
//		delete(dao2, "m007");
		//����
//		MemberDTO odto = selectBymid(dao2, "m005");// ���� ������ ��������
//		MemberDTO dto = new MemberDTO("m005", "lee", odto.getJob(), odto.getBirth()); // ���� ���� ���� ���� ���������ͷ� �Է�
//		dao2.update(dto);
		//��ȸ
//		selectList(dao2);

		
		MemberDAO2 dao3 = new MemberDAO2();
		//�Է�
		MemberDTO dto = new MemberDTO("m007", "jin", "a", new Date(Calendar.getInstance().getTimeInMillis()));
		dao3.insert(dto);
		//����
		dto = dao3.selectBymid("m007");
		MemberDTO dto2 = new MemberDTO("m007", "gong", dto.getJob(), dto.getBirth());
		dao3.update(dto2);
		//����
		dao3.delete(new MemberDTO("m007", null, null, null));
		//��ȸ
		List<MemberDTO> list2= dao3.select();
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}
	
	public static void testMe1(Test dao) {
		dao.me1();
	}
	public static void insert(MemberDAO dao2) {
		MemberDTO dto = new MemberDTO("m007", "jin", "a", new Date(Calendar.getInstance().getTimeInMillis()));
		dao2.insert(dto);
	}
	public static void delete(MemberDAO dao2, String mid) {
		dao2.delete(new MemberDTO(mid, null, null, null));
	}
//	public static void update(MemberDTO dao2, MemberDTO odto) {
//		MemberDTO dto = new MemberDTO("m005", "lee", odto.getJob(), odto.getBirth()); // ���� ���� ���� ���� ���������ͷ� �Է�
//		dao2.update(dto); // ���� .. �ذ��ؾ���
//	}
	public static MemberDTO selectBymid(MemberDAO dao2, String mid) {
		MemberDTO odto= dao2.selectBymid(mid); // ���� ������ ��������
		return odto;
	}
	
	public static void selectList(MemberDAO dao2) {
		List<MemberDTO> list =dao2.select();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
