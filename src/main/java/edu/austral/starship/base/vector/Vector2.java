package edu.austral.starship.base.vector;

import static java.lang.Math.*;

public class Vector2 {
    private  float x;
    private  float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Vector2 add(Vector2 other) {return new Vector2(x + other.x, y + other.y);}

    public Vector2 substract(Vector2 other) {return new Vector2(x - other.x, y - other.y);}

    public Vector2 multiply(Float scalar) {return new Vector2(x * scalar, y * scalar);}

    public Vector2 rotate(float angle) {
        return new Vector2((float) (x * cos(angle) - y * sin(angle)), (float) (x * sin(angle) + y * cos(angle)));
    }

    public float module() { return (float) Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);}

    public Vector2 unitary() {
        final float module = module();
        return new Vector2(x / module, y / module);
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    float angle() {return (float) (atan2(y, x) - atan2(0, 1));}

    public Vector2 divide(float scalar){
        return new Vector2(x/scalar,y/scalar);
    }

    public static Vector2 vector(float x, float y) {return new Vector2(x, y);}

    public static Vector2 vectorFromModule(float module, float angle) {
        return new Vector2((float) (module * cos(angle)), (float) (module * sin(angle)));
    }
}
