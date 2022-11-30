
public class A /*implements Runnable*/ {

	public static void main(String[] args) {
		A a1 = new A();
		/*Thread t1  = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+": "+ i);
				}
			}
			
		});*/
		/*Thread t1 = new Thread(()->{
			for(int i=0;i<10;i++) {
				System.out.println(Thread.currentThread().getName()+": "+ i);
			}
		});*/
		Thread t1 = new Thread(A::show);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+": "+ i);
		}
	}

	/*@Override
	public void run() {
	for(int i=0;i<10;i++) {
		System.out.println(Thread.currentThread().getName()+": "+ i);
	}*/
	
	public static void show() {
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+": "+ i);
		}
	}

}
