package deep;

import java.lang.reflect.Constructor;
import java.util.Random;
import java.util.function.Consumer;

/**
 * A interface representing the ability to drive. Because one does not simply extend Car to Bike
 */
public interface Drivable {
    
    /**
     * @param value
     *         A seed
     *
     * @return A string
     */
    default String getAString(int value) {
        Random rand = new Random(value);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; ; i++) {
            int n = rand.nextInt(27);
            if (n == 0) break;
            sb.append((char) ('`' + n));
        }
        return sb.toString();
    }
    
    /**
     * Truck engine enumeration
     */
    enum Engine {
        OTTO(Vendor.BENZ), DIESEL(Vendor.BMW), E(Vendor.TESLA), RASPBERRY_JUICE(Vendor.FLIWATUET);
        
        /**
         * Truck engine vendor enumeration
         */
        enum Vendor {
            BENZ, VW, BMW, TESLA, FLIWATUET;
            
            static class Waypoint<T extends Number> {
                
                private final T[] coords;
                
                /**
                 * A n dimensional waypoint of bounded generic type
                 *
                 * @param coords
                 *         the n dimensional toupel of coordinates
                 */
                @SafeVarargs
                Waypoint(final T... coords) {
                    this.coords = coords;
                }
            }
        }
        
        private final Vendor vendor;
        
        /**
         * Assign a vendor to a truck engine
         *
         * @param vendor
         *         A Vendor constant
         */
        Engine(final Vendor vendor) {
            this.vendor = vendor;
        }
    }
    
    /**
     * Don't drink and drive!
     */
    @SuppressWarnings("unchecked")
    <T extends Number> void drive(Engine.Vendor.Waypoint<T>... waypoints);
    
    /**
     * A car implementation of Drivable
     */
    public class Car implements Drivable {
        
        private final Consumer<String> consumer;
        
        public Car(final Consumer<String> consumer) {
            this.consumer = consumer;
        }
        
        @SafeVarargs
        @Override
        public final <T extends Number> void drive(final Engine.Vendor.Waypoint<T>... waypoints) {
    
            /**
             * A truck. Simple, but heavy.
             */
            class Truck extends Car {
                
                private final Engine engine;
                
                public Truck(Engine engine) {
                    super(System.out::println);
                    // @formatter:off
                    http://github.com/Cydhra/DeepJava
                    // @formatter:on
                    this.engine = engine;
                }
            }
            
            consumer.accept(getAString(-229985452) + ' ' + getAString(-147909649));
        }
    }
    
    /**
     * An abstract Bike implementation, that can be extended for things like Mountainbike, BMX ...
     */
    static abstract class Bike implements Drivable {
        private static final Bike NOPE = null;
        
        static void test() {
            try {
                Class<?> truckClass = Class.forName("deep.Drivable$Car$1Truck");
                Constructor<?> constructor = truckClass.getConstructor(Car.class, Engine.class);
                constructor.setAccessible(true);
                Object truck = constructor.newInstance(new Car(Integer::valueOf), Engine.E);
                
                // do not confuse the variadic arguments: explicitly create an object array, which explicitly creates a waypoint array
                // @formatter:off
                truckClass.getMethod("drive", Engine.Vendor.Waypoint[].class).invoke(truck, new Object[]{
                        new Engine.Vendor.Waypoint[]{
                                new Engine.Vendor.Waypoint<>(3, 53, (byte) + (char) - (int) + (long) -1, 525, 23, 11),
                                new Engine.Vendor.Waypoint<>(-74, 2, 2, 1616, 999E9, -221) } });
                // @formatter:on
                
            } catch (/* Throwable, just to be sure :P */ Throwable e) {
                e.printStackTrace();
            }
        }
        
        static {
            Bike.getInstance().test();
            System.exit(0);
        }
        
        static Bike getInstance() {
            return NOPE;
        }
        
        /**
         * Main Entry Point
         *
         * @param args
         *         the almost completely useless commandline arguments
         */
        public static void main(String[] args) throws NoClassDefFoundError {
            throw new NoClassDefFoundError(NoClassDefFoundError.class.getName());
        }
    }
    
}

