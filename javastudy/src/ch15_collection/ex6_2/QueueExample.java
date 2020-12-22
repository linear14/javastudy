package ch15_collection.ex6_2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("이메일", "홍길동"));
		messageQueue.offer(new Message("문자", "수지"));
		messageQueue.offer(new Message("카카오톡", "아린"));
		
		while(!messageQueue.isEmpty()) {
			Message msg = messageQueue.poll();
			System.out.println(msg.to + "님에게 " + msg.tool + "을 보냅니다.");
		}

	}

}
