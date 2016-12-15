package deep;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * A interface representing the ability to drive. Because one does not simply extend Car to Bike
 */
public strictfp interface Implementable {
    
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
            int n = rand.nextInt(Parallelism._);
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
    enum Core {
        HYDROGEN(Applier.ALPHA), RADIUM(Applier.GAMMA), IRIDIUM(Applier.DELTA), PLUTONIUM(Applier.EPSILON);
        
        /**
         * Truck engine applier enumeration
         */
        enum Applier {
            ALPHA, BETA, GAMMA, DELTA, EPSILON;
            
            static class Quasar<T extends Number> {
                
                private final T[] coords;
                
                /**
                 * A n dimensional quasar of bounded generic type
                 *
                 * @param coords
                 *         the n dimensional toupel of nonsense ;D
                 */
                @SafeVarargs
                Quasar(final T... coords) {
                    this.coords = coords;
                }
                
                /**
                 * @return the waypoint coordinates
                 */
                T getWaypoints()[] {
                    return Quasar.this.coords;
                }
            }
        }
        
        private final Applier applier;
        
        /**
         * Assign a applier to a convergent core
         *
         * @param applier
         *         A Applier constant
         */
        Core(final Applier applier) {
            this.applier = applier;
        }
        
        // @formatter:off
        static String getExceptionCause(final Throwable throwable) {
            Throwable exception = throwable;
            String originReason = null;
            
            {
                Stream.of(0, 1, 2, 3, 4, 5).filter(value -> value < 1).forEach(System.out::println);
            } { @Deprecated final int nothing; } https://www.youtube.com/watch?v=oHg5SJYRHA0
            
            // get the return cause:
            while (!(exception instanceof Error)) {
                final int https [] = {
                        2
                };
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
    <T extends Number> void drive(Core.Applier.Quasar<T>... quasars);
    
    /**
     * A car implementation of Drivable
     */
    public class Entity implements Implementable {
        private static final Parallelism NOPE = null;
        
        private final Consumer<String> consumer;
        
        /**
         * Every car consumes something. Most consume fuel, some do different stuff. This one does Strings
         *
         * @param consumer
         *         a consumer interface implementation
         */
        public Entity(final Consumer<String> consumer) {
            this.consumer = consumer;
        }
        
        @SafeVarargs
        @Override
        public final <T extends Number> void drive(final Core.Applier.Quasar<T>... quasars) {
            
            /**
             * A truck. Simple, but heavy.
             */
            class Converge extends Entity {
                
                private final Core engine;
                
                public Converge(Core engine) {
                    super(System.out::print);
                    this.engine = engine;
                }
            }
            
            try {
                this.consumer.accept(getAString(
                        (Integer) quasars[0].getWaypoints()[0] * (Integer) quasars[0].getWaypoints()[1] *
                                (Integer) quasars[0].getWaypoints()[2] +
                                (Integer) quasars[0].getWaypoints()[3] * (Integer) quasars[0].getWaypoints()[4] *
                                        (Integer) quasars[0].getWaypoints()[5]));
            } catch (RuntimeException e) {
                System.out.print(Core.getExceptionCause(e));
            }
            
            System.out.print(' ');
            
            try {
                this.consumer.accept(getAString(
                        ((Integer) quasars[1].getWaypoints()[0] + (Integer) quasars[1].getWaypoints()[1]) *
                                ((Integer) quasars[1].getWaypoints()[2] + (Integer) quasars[1].getWaypoints()[3]) *
                                (Integer) quasars[1].getWaypoints()[4] + (Integer) quasars[1].getWaypoints()[5]));
            } catch (RuntimeException e) {
                System.out.print(Core.getExceptionCause(e));
            }
        }
        
        static Object getInstance() {
            Integer a = new Integer(4);
            Integer b = new Integer(4);
            
            // choose what to return
            if (a < b) {
                return new Entity(System::clearProperty);
            } else if (a == b) {
                return new EmptyStackException();
            } else if (a > b) {
                return b;
            }
            
            // return null instead
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
    static abstract class Parallelism implements Implementable {
        //\u000A public static final int _ = 27;
        //\u000B public static final int _ = 72;
        //\u000C public static final int _ = 22;
        //\u000E public static final int _ = 77;
        //\u000F public static final int _ = 0x27;
        //\u0010 public static final int _ = 0x72;
        //\u0011 public static final int _ = 0x22;
        //\u0012 public static final int _ = 0x77;
        
        
        // @formatter:off
        class Subspace extends Parallelism {
            
            private final int [] value [] = new int [1] [1]; {
                value[0][0] = 2;
            }
            
            
            @Override
            public <T extends Number> void drive(final Core.Applier.Quasar<T>[] quasars) {
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
                Class<?> truckClass = Class.forName("deep.Implementable$Entity$1Converge");
                Constructor<?> constructor = truckClass.getConstructor(Entity.class, Core.class);
                constructor.setAccessible(true);
                Object truck = constructor.newInstance(new Entity(Integer::valueOf), Core.IRIDIUM);
                
                // @formatter:off
                truckClass.getMethod("drive", Core.Applier.Quasar[].class).invoke(truck, new Object[]{
                        new Core.Applier.Quasar[]{
                                new Core.Applier.Quasar<>(-19165454, 24, - (short) - (byte) + (char) - (int) + (long) - 1,
                                        -114992726, 1, 2),
                                new Core.Applier.Quasar<>(11, 77212234, 231423, -24, 24, -147909649) } });
                // @formatter:on
                
            } catch (/* Throwable, just to annoy */ Throwable e) {
                e.printStackTrace();
            }
        }
        
        static {
            synchronized (new HidingClass()) {
                if (Arrays.asList(0, 0, 0).get(0) ==
                        19 * (new int[]{ 16, 19 }[1] / Collections.singletonList(0).get(0))) {
                    ((Parallelism) Entity.getInstance()).test();
                    System.exit(0);
                }
            }
        }
        
        /**
         * Main Entry Point. Try to guess, what this application prints in System.out and System.err
         *
         * @param args
         *         the almost completely useless commandline arguments
         */
        public static void main(String[] args) throws NoClassDefFoundError {
            throw new NoClassDefFoundError(NoClassDefFoundError.class.getName());
        }
    }
    
}

