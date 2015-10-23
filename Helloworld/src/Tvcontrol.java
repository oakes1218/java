import java.nio.channels.*;


public class Tvcontrol {
	public static void main (String [] agre){
		todochannel1();
		todochannel2();
		todochannel3();
	}
	static void todochannel1() {
		Channel1 channel1 = new Channel1();
		channel1.setcolor("red");
		channel1.getcolor();
		channel1.setnumber(12);
		channel1.getnumber();
		System.out.print(channel1.getcolor() + " " + channel1.getnumber()+ " ");
		channel1.cha();
		channel1.change();
		
	}
	
	static void todochannel2() {
		Channel2 channel2 = new Channel2();
		channel2.setcolor("yellow");
		channel2.getcolor();
		channel2.setnumber(10);
		channel2.getnumber();
		System.out.print(channel2.getcolor() + " " + channel2.getnumber() + " ");
		channel2.cha();
		channel2.change();
		
	}
	static void todochannel3() {
		Channel3 channel3 = new Channel3();
		channel3.setcolor("buld");
		//channel3.getcolor();
		channel3.setnumber(8);
		//channel3.getnumber();
		System.out.print(channel3.getcolor() + " " + channel3.getnumber() + " ");
		channel3.cha();
		channel3.change();
		
	}
}
