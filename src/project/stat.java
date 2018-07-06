package project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class stat {

	public static void main(String[] args) {
				
					BufferedReader in = null;
					BufferedWriter out = null;   
								
					try {
						in = new BufferedReader(new FileReader("TrafficStat2017.csv"));
						out = new BufferedWriter(new FileWriter("NewTrafficStat2017.txt")); //새로운 newdata.txt에 출력
						
						String data = in.readLine();  //yyyyyy데이터 입출력은 항상 불안정해서 항상 try catch 처리(예외) 해줘야함
						String[] array = data.split(",");
											
							while(data != null) { //조건문을 넣어야하지. 그리고 업데이트가 필요함(또 읽어야지)
							
							for (int i=0; i<array.length;i++) {
									System.out.println(array[i]); 
								
							out.write(data);
							
							out.newLine(); //새로운 라인 추가(엔터키 반영). 그리고 마지막꺼 칠 때 엔터 2번 치기
							
							System.out.println(data); //콘솔창 출력
							
							data = in.readLine();
							
							out.flush(); //데이터 손실 방지를 위해서 목적지에 데이터 출력 보장
							}
						}
					
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							in.close();  //사용했던 시스템 자원 반환. 근데 예외처리
							out.close(); //out에서 추가해야함
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

	}

}
