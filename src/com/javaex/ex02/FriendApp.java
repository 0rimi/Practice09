package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    		System.out.println("친구를 3명 등록해주세요");
    		
    		List<Friend> fList = new ArrayList<Friend>();
    		
    		//문자열받고 공백으로 나누고 값을 넣어주기
    		
    		for(int i=0; i<3; i++) {		
    			String finfo = sc.nextLine();
    			String[] fcon = finfo.split(" ");
    			Friend f = new Friend(fcon[0],fcon[1],fcon[2]);
    			fList.add(f);
    		}
    		

    		for( Friend f : fList ) {
    			f.showinfo();
    		}
    		
    	
    	sc.close();
    	
    }

}
