package DI_reference;

public class Mobile {
private String colour;//index0
private String Camera;//index1
private Sim sim ;

public Mobile(String colour, String camera, Sim sim) {
	super();
	this.colour = colour;
	Camera = camera;
	this.sim = sim;
}

@Override
public String toString() {
	return "Mobile [colour=" + colour + ", Camera=" + Camera + ", sim=" + sim + "]";
}
	
}

