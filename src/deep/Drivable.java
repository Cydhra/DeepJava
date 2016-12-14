package deep;

import java.lang.reflect.Constructor;

/**
 *
 */
public interface Drivable {

    /**
     * Truck engine enumeration
     */
    enum Engine {
        OTTO(Vendor.BENZ), DIESEL(Vendor.BMW), E(Vendor.TESLA), RASPBERRY_JUICE(Vendor.FLIWATUET);

        enum Vendor {
            BENZ, VW, BMW, TESLA, FLIWATUET;

            class Waypoint<T extends Number> {

                private volatile T[] coords;

                /**
                 * A n dimensional waypoint of bounded generic type
                 * @param coords
                 */
                public Waypoint(final T... coords) {
                    this.coords = coords;
                }
            }
        }

        private final Vendor vendor;

        Engine(final Vendor vendor) {
            this.vendor = vendor;
        }
    }

    /**
     * Don't drink and drive!
     */
    <T extends Number> void drive(Engine.Vendor.Waypoint<T>... waypoints);

    /**
     *
     */
    public class Car implements Drivable {
        @Override
        public <T extends Number> void drive(final Engine.Vendor.Waypoint<T>... waypoints) {
            System.out.println(this.getClass().getName());
            class Truck extends Car {

                private final Engine engine;

                public Truck(Engine engine) {
                    this.engine = engine;
                }
            }
        }
    }

    static abstract class Bike implements Drivable {
        public void test() {
            try {
                Class<?> truckClass = Class.forName("Drivable$Car$1Truck");
                Constructor<?> constructor = truckClass.getConstructor(Engine.class);
                constructor.setAccessible(true);
                Object truck = constructor.newInstance(Engine.E);
                truckClass.getMethod("drive").invoke(truck);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }

        /**
         * Main Entry Point
         * @param args
         */
        public static void main(String[] args) {
            new Bike() {
                @Override
                public <T extends Number> void drive(Engine.Vendor.Waypoint<T>... doubles) {
                    System.out.println("We are anonymous!");
                }
            }.test();
        }
    }

}

