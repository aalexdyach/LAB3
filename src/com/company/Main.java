package com.company;

public class Main {

    public static void main(String[] args) {
	Everyone everyone = new Everyone();
	Tunnel tunnel = new Tunnel("тоннел");
	Znayka znayka = new Znayka();
	Realtraveller traveller = new Realtraveller("путешественник");
	Ice ice = new Ice("лед");
	Rope rope = new Rope();
	Klepka klepka = new Klepka();
	Alpenstok alpenstok = new Alpenstok();
	This tthis = new This();

	everyone.move(everyone.getName(), Place.FURTHER);
	tunnel.come(Time.SOON, tunnel.getName());
	tunnel.notice(tunnel.getName(), Place.UNDER);
	znayka.order(znayka.getName(), traveller.getName(), "велел", Place.NONE);
	rope.link(rope.getName());
	ice.go(ice.getName());
	ice.make(Time.INTIME);
	tthis.was(tthis.getName(), Time.INTIME);
	rope.fix(Place.BELTS, rope.getName());
	klepka.slip(klepka.getName(), Place.INFRONT);
	ice.ice();
	klepka.fall(Place.DOWN, Place.NONE);
	rope.stretch(rope.getName(), Time.IMMEDIATELY);
	traveller.pull(traveller.getName());
	everyone.stress(everyone.getName());
	alpenstok.stress(alpenstok.getName(), ice.getName());
	tthis.stop(tthis.getName());
	klepka.allow(rope.getName(), klepka.getName());
	znayka.order(znayka.getName(), " ", " распорядился", Place.BEHIND);
	znayka.climb(everyone.getName(), Place.INFRONT);
    }
}
