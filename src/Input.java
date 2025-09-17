// import org.apache.commons.lang3.ArrayUtils;

class Car {
    int wheels_num;
    int highest_speed;
}

public class Input {
    public static boolean test(Car car) {
        // if (val == 0) {
        //     return false;
        // }
        // return true;
        // return ArrayUtils.contains(arr, val);
        if (car == null) {
            return false;
        }
        if (car.wheels_num == 4) {
            if (car.highest_speed > 200) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // test(new int[]{1,2,3}, 2);
        Car car = new Car();
        car.wheels_num = 4;
        car.highest_speed = 250;
        test(car);
        System.out.println("Hello World");
    }
}