package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    		
    		List<Goods> gList = new ArrayList<Goods>();
    		
    		int count = 0;
    		int sum = 0;
    		
    		System.out.println("상품을 입력해주세요(종료 q)");
    		while(true) {
    			
        		String content = sc.nextLine();
        		
        		//입력받는경우
        		String[] pinfo = content.split(",");
        		
        		//입력받은거 쪼개기
        		String name = pinfo[0];
        		int price = Integer.parseInt(pinfo[1]);
        		count = Integer.parseInt(pinfo[2]);
        		sum = sum + count;
        		
        		Goods pro = new Goods(name,price,count);
        		
        		gList.add(pro);
        		
        		if(content.equals("q")) {
        			System.out.println("[입력완료]");
        			System.out.println("==================");
 //       			for( Goods g : gList ) {
 //       				g.showinfo();
 //       			}
 //       			System.out.println("모든 상품의 갯수는 "+count+"개입니다.");
        			break;
        		}
    		}
    		
    		
       sc.close();
       
    	
    }

}
