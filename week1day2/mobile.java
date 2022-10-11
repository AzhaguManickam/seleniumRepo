package week1day2;

public class mobile {
public void sendMessage() {
	System.out.println("Send Message");
}
public void shareDocument() {
	System.out.println("Share Message");
}
public void call() {
	System.out.println("call");
}
public static void main(String[] args) {
	mobile mob=new mobile();
	mob.sendMessage();
	mob.shareDocument();
	mob.call();
}
}
