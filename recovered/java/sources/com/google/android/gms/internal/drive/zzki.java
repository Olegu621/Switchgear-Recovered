            package com.google.android.gms.internal.drive;

            import com.google.android.gms.internal.drive.zzjx;
            import io.sentry.C1697u2;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            import java.util.ServiceLoader;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.C1951n4;
            import p000.pm2;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzki<T extends zzjx> {
                private static final Logger logger = Logger.getLogger(zzjr.class.getName());
                private static String zzro = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

                public static <T extends zzjx> T zza(Class<T> cls) {
                    String strM7489l;
/* 3 */             ClassLoader classLoader = zzki.class.getClassLoader();
/* 14 */            if (cls.equals(zzjx.class)) {
/* 16 */                strM7489l = zzro;
                    } else {
/* 31 */                if (!cls.getPackage().equals(zzki.class.getPackage())) {
/* 257 */                   C1951n4.m6859j(cls.getName());
/* 13 */                    return null;
                        }
/* 49 */                strM7489l = pm2.m7489l(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
                    }
                    try {
                        try {
                            try {
                                try {
/* 72 */                            return cls.cast(((zzki) Class.forName(strM7489l, true, classLoader).getConstructor(null).newInstance(null)).zzcu());
                                } catch (InvocationTargetException e) {
/* 92 */                            throw new IllegalStateException(e);
                                }
                            } catch (NoSuchMethodException e2) {
/* 110 */                       throw new IllegalStateException(e2);
                            }
                        } catch (IllegalAccessException e3) {
/* 98 */                    throw new IllegalStateException(e3);
                        } catch (InstantiationException e4) {
/* 104 */                   throw new IllegalStateException(e4);
                        }
                    } catch (ClassNotFoundException unused) {
/* 115 */               Iterator it = ServiceLoader.load(zzki.class, classLoader).iterator();
/* 121 */               ArrayList arrayList = new ArrayList();
/* 128 */               while (it.hasNext()) {
                            try {
/* 146 */                       arrayList.add(cls.cast(((zzki) it.next()).zzcu()));
                            } catch (ServiceConfigurationError e5) {
/* 152 */                       Logger logger2 = logger;
/* 154 */                       Level level = Level.SEVERE;
/* 156 */                       String simpleName = cls.getSimpleName();
/* 184 */                       logger2.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e5);
                            }
                        }
/* 192 */               if (arrayList.size() == 1) {
/* 199 */                   return (T) arrayList.get(0);
                        }
/* 206 */               if (arrayList.size() == 0) {
/* 13 */                    return null;
                        }
                        try {
/* 229 */                   return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
                        } catch (IllegalAccessException e6) {
/* 245 */                   C1697u2.m5439o(e6);
/* 13 */                    return null;
                        } catch (NoSuchMethodException e7) {
/* 249 */                   C1697u2.m5439o(e7);
/* 13 */                    return null;
                        } catch (InvocationTargetException e8) {
/* 241 */                   C1697u2.m5439o(e8);
/* 13 */                    return null;
                        }
                    }
                }

                public abstract T zzcu();
            }
