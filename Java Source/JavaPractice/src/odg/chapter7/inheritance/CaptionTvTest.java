package odg.chapter7.inheritance;

public class CaptionTvTest {

	public static void main(String[] args) {
		CaptionTv captionTv = new CaptionTv();
		
		String str = "sqe";
		
		str.equals("11");
		
		captionTv.channel = 10;
		captionTv.channelup();
		System.out.println(captionTv.channel);
		captionTv.caption = true;
		captionTv.displayCaption("������");

	}

}
