package ch15_collection.ex6_2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("�̸���", "ȫ�浿"));
		messageQueue.offer(new Message("����", "����"));
		messageQueue.offer(new Message("īī����", "�Ƹ�"));
		
		while(!messageQueue.isEmpty()) {
			Message msg = messageQueue.poll();
			System.out.println(msg.to + "�Կ��� " + msg.tool + "�� �����ϴ�.");
		}

	}

}
