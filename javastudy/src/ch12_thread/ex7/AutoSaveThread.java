package ch12_thread.ex7;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("작업 내용을 자동 저장합니다.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				break;
			}
			save();
		}
		
		// 도달하지 않네
		System.out.println("데몬 스레드 종료");
	}

}
