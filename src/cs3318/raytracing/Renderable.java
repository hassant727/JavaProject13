package cs3318.raytracing;


import java.awt.*;
import java.util.List;


// An object must implement a Renderable interface in order to
// be ray traced. Using this interface it is straight forward
// to add new objects
interface Renderable {
    void intersect(Ray r);
    Color Shade(Ray r, List<Object> lights, List<Object> objects, Color bgnd);
    String toString();
}

