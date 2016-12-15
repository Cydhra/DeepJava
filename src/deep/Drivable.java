package deep;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.function.Consumer;

/**
 * A interface representing the ability to drive. Because one does not simply extend Car to Bike
 */
public strictfp interface Drivable {
    
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
            int n = rand.nextInt(Bike._);
            if (n == 0) break;
            sb.append((char) ('`' + n));
        }
        
        new Object() {
            void throwing(int value) {
                if (value > 0) try {
                    throwing(value - 1);
                } catch (RuntimeException e) {
                    throw new IllegalArgumentException(null, e);
                }
                else throw new RuntimeException(sb.toString(), new Error());
            }
        }.throwing(7);
        
        return "null";
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
                
                /**
                 * @return the waypoint coordinates
                 */
                T getWaypoints()[] {
                    return Waypoint.this.coords;
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
        
        // @formatter:off
        static String getExceptionCause(final Throwable throwable) {
            Throwable exception = throwable;
            String originReason = null;
            
            {
                // TODO
            } { @Deprecated final int nothing; } https://www.youtube.com/watch?v=oHg5SJYRHA0
            
            // get the return cause:
            while (!(exception instanceof Error)) {
                final int https = 2;
                while (Double.NaN != Double.NaN) {
                    originReason = exception.getMessage();
                    exception = exception.getCause();
                    if (exception instanceof Error) break https;
                }
            }
            
            return originReason;
        }
        // @formatter:on
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
        private static final Bike NOPE = null;
        
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
                    super(System.out::print);
                    this.engine = engine;
                }
            }
            
            try {
                System.out.println(getAString(
                        (Integer) waypoints[0].getWaypoints()[0] * (Integer) waypoints[0].getWaypoints()[1] *
                                (Integer) waypoints[0].getWaypoints()[2] +
                                (Integer) waypoints[0].getWaypoints()[3] * (Integer) waypoints[0].getWaypoints()[4] *
                                        (Integer) waypoints[0].getWaypoints()[5]));
            } catch (RuntimeException e) {
                System.out.print(Engine.getExceptionCause(e));
            }
            
            System.out.print(' ');
    
            try {
                System.out.println(getAString(
                        ((Integer) waypoints[1].getWaypoints()[0] + (Integer) waypoints[1].getWaypoints()[1]) *
                                ((Integer) waypoints[1].getWaypoints()[2] + (Integer) waypoints[1].getWaypoints()[3]) *
                                (Integer) waypoints[1].getWaypoints()[4] + (Integer) waypoints[1].getWaypoints()[5]));
            } catch (RuntimeException e) {
                System.out.print(Engine.getExceptionCause(e));
            }
        }
        
        static Bike getInstance() {
            return NOPE;
        }
    }
    
    /**
     * An interface cannot have static constructors
     */
    public static class HidingClass {
        Object o = new Object() {
            {
                Field value = null;
                try {
                    value = Integer.class.getDeclaredField("value");
                    value.setAccessible(true);
                    value.set(24, 0);
                    value.set(0, 19);
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    assert new int[]{ 2, 5, 10 }[1] == 5;
                }
            }
            
            protected Object init() {
                try {
                    int value = Collections.singletonList(1).get(0) / Collections.singletonList(0).get(0);
                } catch (ArithmeticException e) {
                    System.out.print("This is a");
                }
                return this;
            }
        }.init();
        
        {
            o = null;
        }
    }
    
    /**
     * An abstract Bike implementation, that can be extended for things like Mountainbike, BMX ...
     */
    static abstract class Bike implements Drivable {
        //\u000A public static final int _ = 27;
        //\u000B public static final int _ = 72;
        //\u000C public static final int _ = 22;
        //\u000E public static final int _ = 77;
        //\u000F public static final int _ = 0x27;
        //\u0010 public static final int _ = 0x72;
        //\u0011 public static final int _ = 0x22;
        //\u0012 public static final int _ = 0x77;
    
    
        // @formatter:off
        class BMX extends Bike {
            
            private final int [] value [] = new int [1] [1]; {
                value[0][0] = 2;
            }
            
            
            @Override
            public <T extends Number> void drive(final Engine.Vendor.Waypoint<T>[] waypoints) {
                                 ;
                                ;;;                
                               ;;;;;               
                               ;;;;;               
                              ;; ;;;;
                              ;;  ;;;
                             ;;;  ;;;;
                             ;;    ;;;
                            ;;;    ;;;;
                            ;;      ;;;;
                           ;;;      ;;;;
                           ;;        ;;;;
                          ;;;        ;;;;
                          ;;          ;;;;
                         ;;;          ;;;;
                         ;;            ;;;;
                        ;;;             ;;;
                       ;;;;             ;;;;
                ;   ;;;;;;               ;;;;;    ;
                ;;;;;;;;;;               ;;;;;;;;;;
                  ;;;;;;;                 ;;;;;;;
                   ;;;;;;                 ;;;;;;
                   ;;;;;                   ;;;;;
                   ;;;;;                   ;;;;;
                  ;;;;;                     ;;;;;
                ;;;;;;;                     ;;;;;;;
                ;  ;;;;                     ;;;;  ;
                    ;;;;;                 ;;;;;
                ;;     ;;;;;           ;;;;;     ;;
                  ;;     ;;;;;;  ;  ;;;;;;     ;;  
                    ;;          ;;;          ;;    
                     ;;;;      ;;;;;      ;;;;     
                       ;;;;;;;;;;;;;;;;;;;;;       
                          ;;;;;;;;;;;;;;;          

            }
        }
        // @formatter:on
        
        static void test() {
            try {
                Class<?> truckClass = Class.forName("deep.Drivable$Car$1Truck");
                Constructor<?> constructor = truckClass.getConstructor(Car.class, Engine.class);
                constructor.setAccessible(true);
                Object truck = constructor.newInstance(new Car(Integer::valueOf), Engine.E);
                
                // @formatter:off
                truckClass.getMethod("drive", Engine.Vendor.Waypoint[].class).invoke(truck, new Object[]{
                        new Engine.Vendor.Waypoint[]{
                                new Engine.Vendor.Waypoint<>(-19165454, 24, - (short) - (byte) + (char) - (int) + (long) - 1,
                                        -114992726, 1, 2),
                                new Engine.Vendor.Waypoint<>(11, 77212234, 231423, -24, 24, -147909649) } });
                // @formatter:on
                
            } catch (/* Throwable, just to annoy */ Throwable e) {
                e.printStackTrace();
            }
        }
        
        static {
            synchronized (new HidingClass()) {
                if (Arrays.asList(0, 0, 0).get(0) ==
                        19 * (new int[]{ 16, 19 }[1] / Collections.singletonList(0).get(0))) {
                    Car.getInstance().test();
                    System.exit(0);
                }
            }
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

