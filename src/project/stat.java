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
						out = new BufferedWriter(new FileWriter("NewTrafficStat2017.txt")); //���ο� newdata.txt�� ���
						
						String data = in.readLine();  //������ ������� �׻� �Ҿ����ؼ� �׻� try catch ó��(����) �������
						String[] array = data.split(",");
											
							while(data != null) { //���ǹ��� �־������. �׸��� ������Ʈ�� �ʿ���(�� �о����)
							
							for (int i=0; i<array.length;i++) {
									System.out.println(array[i]); 
								
							out.write(data);
							
							out.newLine(); //���ο� ���� �߰�(����Ű �ݿ�). �׸��� �������� ĥ �� ���� 2�� ġ��
							
							System.out.println(data); //�ܼ�â ���
							
							data = in.readLine();
							
							out.flush(); //������ �ս� ������ ���ؼ� �������� ������ ��� ����
							}
						}
					
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							in.close();  //����ߴ� �ý��� �ڿ� ��ȯ. �ٵ� ����ó��
							out.close(); //out���� �߰��ؾ���
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

	}

}
