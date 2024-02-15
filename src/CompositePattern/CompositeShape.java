package CompositePattern;

import java.util.ArrayList;

public class CompositeShape implements Shape{
    ArrayList<Shape>Shapes=new ArrayList<>();
    public void AddShape(Shape obj){
        Shapes.add(obj);
    }
    @Override
    public void Draw() {
        for(var Shape:Shapes){
            Shape.Draw();
        }
    }
}
