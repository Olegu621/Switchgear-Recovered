            package p000;

            import io.sentry.C1697u2;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class xn3 {

                /* JADX INFO: renamed from: a */
                public static final Logger f19290a = Logger.getLogger(kn3.class.getName());

                /* JADX INFO: renamed from: b */
                public static final String f19291b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

                /* JADX INFO: renamed from: a */
                public static on3 m10008a() {
                    String strM7489l;
/* 3 */             ClassLoader classLoader = xn3.class.getClassLoader();
/* 14 */            if (on3.class.equals(on3.class)) {
/* 59 */                strM7489l = f19291b;
                    } else {
/* 28 */                if (!on3.class.getPackage().equals(xn3.class.getPackage())) {
/* 34 */                    C1951n4.m6859j(on3.class.getName());
/* 13 */                    return null;
                        }
/* 54 */                strM7489l = pm2.m7489l(on3.class.getPackage().getName(), ".BlazeGenerated", on3.class.getSimpleName(), "Loader");
                    }
                    try {
                        try {
                            try {
/* 74 */                        pm2.m7490m(Class.forName(strM7489l, true, classLoader).getConstructor(null).newInstance(null));
/* 77 */                        throw null;
                            } catch (IllegalAccessException e) {
/* 97 */                        throw new IllegalStateException(e);
                            } catch (InstantiationException e2) {
/* 103 */                       throw new IllegalStateException(e2);
                            }
                        } catch (NoSuchMethodException e3) {
/* 109 */                   throw new IllegalStateException(e3);
                        } catch (InvocationTargetException e4) {
/* 91 */                    throw new IllegalStateException(e4);
                        }
                    } catch (ClassNotFoundException unused) {
                        try {
/* 117 */                   Iterator it = Arrays.asList(new xn3[0]).iterator();
/* 123 */                   ArrayList arrayList = new ArrayList();
/* 130 */                   while (it.hasNext()) {
                                try {
/* 197 */                           if (it.next() == null) {
/* 199 */                               throw null;
                                    }
/* 205 */                           throw new ClassCastException();
                                } catch (ServiceConfigurationError e5) {
/* 228 */                           f19290a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(on3.class.getSimpleName()), (Throwable) e5);
                                }
                            }
/* 136 */                   if (arrayList.size() == 1) {
/* 142 */                       return (on3) arrayList.get(0);
                            }
/* 149 */                   if (arrayList.size() == 0) {
/* 13 */                        return null;
                            }
                            try {
/* 172 */                       return (on3) on3.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                            } catch (IllegalAccessException e6) {
/* 185 */                       C1697u2.m5439o(e6);
/* 13 */                        return null;
                            } catch (NoSuchMethodException e7) {
/* 189 */                       C1697u2.m5439o(e7);
/* 13 */                        return null;
                            } catch (InvocationTargetException e8) {
/* 181 */                       C1697u2.m5439o(e8);
/* 13 */                        return null;
                            }
                        } catch (Throwable th) {
/* 242 */                   throw new ServiceConfigurationError(th.getMessage(), th);
                        }
                    }
                }
            }
