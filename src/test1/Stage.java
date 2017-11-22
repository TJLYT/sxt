package test1;

import java.util.stream.Stream;

public class Stage {
public static void main(String[] args) {
	Stream s =Stream.of("abc","sd");
	s.map(x->x+"1");
 }
}
