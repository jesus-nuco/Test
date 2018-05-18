
import org.aion.api.IAionAPI;
import org.aion.api.type.ApiMsg;
import org.aion.api.type.BlockDetails;
//////llll7777
public class DemoApplication {
	IAionAPI aionApi = null;

	public static void main(String[] args) {
		

		 new DemoApplication();
	}

	public DemoApplication() {

		System.out.println("WWWWWWWWWWWWWWWWWWWWW");

		// 8547 2 aionv2user aionv2pws 0 13
		
		// DemoBlockNumber() ;
		System.out.println("A");

		ApiMsg apiMsg = new ApiMsg();
		System.out.println("B");

		aionApi = IAionAPI.init();
		apiMsg = new ApiMsg();

		apiMsg.set(aionApi.connect("tcp://127.0.0.1:8547"));
		if (apiMsg.isError()) {
			System.out.println("Aion api connection could not be established.");
			closeApi();
		}

		
		// aionApi.connect(config.getNodeAddress(0));
		System.out.println("F");
		System.out.println("WWWWWWWWWWWWWWWWWWWWW:" + aionApi.getAccount().toString());
		System.out.println("WWWWWWWWWWWWWWWWWWWWW:" + aionApi.getWallet().getMinerAccount().getObject().toString());
		closeApi();
	}

	private void closeApi() {
		if (aionApi != null)
			aionApi.destroyApi();
	}

	 
}
