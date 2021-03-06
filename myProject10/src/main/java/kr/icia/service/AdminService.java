package kr.icia.service;

import java.util.List;

import kr.icia.domain.GoodsVO;
import kr.icia.domain.InquiryVO;
import kr.icia.domain.MemberVO;
import kr.icia.domain.OrderListVO;
import kr.icia.domain.OrderVO;
import kr.icia.domain.RefundDetailVO;

public interface AdminService {
	
	public void register(GoodsVO vo); // 등록
	public GoodsVO get(int gdsNum); // 읽기
	public boolean modify(GoodsVO vo); // 수정
	public boolean remove(int gdsNum); // 삭제
	public List<GoodsVO> getList(); // 목록
	
	public List<GoodsVO> getList1(); // SLR 카메라 목록
	public List<GoodsVO> getList2(); // 미러리스 카메라 목록
	public List<GoodsVO> getList3(); // 콤팩트 카메라 목록
	public List<GoodsVO> getList4(); // 렌즈 목록
	public List<GoodsVO> getList5(); // 액세서리 목록
	
	public List<GoodsVO> getCateCode();
	
	// 주문 목록
	public List<OrderVO> orderList();
	
	// 특정 주문 목록
	public List<OrderListVO> orderView(OrderVO order);
	
	// 배송 상태
	public void state(RefundDetailVO order);
	
	// 배송 중 클릭시 상품 수량 감소
	public void changeStock(GoodsVO goods);
	
	// best상품
	public List<GoodsVO> bestGdsN();
	
	// best상품 가져오기
	public GoodsVO getbest(GoodsVO goods);
	
	// 환불 목록
	public List<OrderListVO> refundList();
	
	// 환불 상세 목록
	public List<OrderListVO> refundView(OrderVO order);
	
	// 환불 완료 클릭시 상품 수량 증가
	public void changeStock2(GoodsVO goods);
	
	// 유저 목록
	public List<MemberVO> userList();
	
	// 유저 목록 권한 변경
	public void userAuth(MemberVO member);
	
	// 주문 상태 변경
	public void delivery(OrderVO order);

}
