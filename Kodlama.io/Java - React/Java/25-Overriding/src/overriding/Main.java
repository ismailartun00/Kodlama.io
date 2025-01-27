package overriding;

public class Main {

	public static void main(String[] args) {
		// final kelimesini metodu tanımlarken yazarsak override edilme özelliğini kaldırırız.
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager() };
		
		for(BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}
