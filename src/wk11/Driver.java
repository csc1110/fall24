package wk11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Drawable> stuffToDraw = new LinkedList<>();
        System.out.println(Drawable.bad);
        StringBuilder stuff = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stuffToDraw.add(Math.random()<0.5 ? new Person() : new Parrot());
            stuff.append("1");
        }
        for (Drawable drawMe : stuffToDraw) {
            drawMe.draw();
        }


    }
}
