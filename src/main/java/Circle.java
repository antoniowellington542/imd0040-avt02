class Circle {
    float radius;


    Circle(float radius) {
        this.radius = radius;
    }

    double area(){
        double areaValue = 3.14 * Math.pow(radius, 2);
        return  areaValue;
    }

    double circumference(){
        double circumferenceValue = 2 * radius;
        return circumferenceValue;
    }

}