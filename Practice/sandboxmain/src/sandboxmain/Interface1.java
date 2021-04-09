package sandboxmain;
@FunctionalInterface
public interface Interface1 {
public Integer sqr(int a);

default String sqr (String a) {
	return a+a;
}
}


