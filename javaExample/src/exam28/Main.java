package exam28;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<ProductDTO> productList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

//		int[] num = new int[4];
//		System.out.println(num);
		int i = 1;

		while (i != 0) {
			System.out.print("(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제): ");
			i = sc.nextInt();
			String i1 = sc.nextLine();

			if (i == 1) {
				int hab= 0;
				for(int j=0; j<productList.size(); j++) {
					productList.get(j).display();
					hab+= productList.get(j).getTotal();
				}
				System.out.println("============================");
				System.out.println("합계 : "+ hab);
			} else if (i == 2) {
				System.out.print("등록할 이름 : ");
				String productName = sc.nextLine();
				System.out.println("상품 가격 : ");
				String productPrice_ = sc.nextLine();
				int productPrice = Integer.parseInt(productPrice_);
				System.out.println("구매 수량 : ");
				String buyCounter_ = sc.nextLine();
				int buyCounter = Integer.parseInt(buyCounter_);

				ProductDTO dto = new ProductDTO(productName, productPrice, buyCounter);
				productList.add(dto);

//					String msg = productName + "/" + productPrice+"/";
//					msg += buyCounter_+"/"+total;
//					System.out.println(msg);
			} else if (i == 3) {
				System.out.println("3.수정되었습니다.");
			} else if (i == 4) {
				System.out.println("4.삭제되었습니다.");
			} else if (i == 0) {
				break;
			} else {
				System.out.println("잘못선택하셨습니다 다시 골라주세요");
			}
		}
		System.out.println("===프로그램 종료====");

	}

}// i++ --> i=i+1
/*
 * 선택 ( 0종료 1 목록 2 등록 3수정 4삭제) 돌아가게
 */