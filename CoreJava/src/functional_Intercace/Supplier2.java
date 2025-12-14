package functional_Intercace;

import java.util.function.Supplier;

record Player(String name, Integer score) {

}

public class Supplier2 {
	void main() {
		Supplier<Player> player = () -> new Player("sonu", 56);
		IO.print(player.get());
	}
}
