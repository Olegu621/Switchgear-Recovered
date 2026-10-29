            package com.google.android.gms.internal.measurement;

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
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzly {
                public static zzlq zzb(Class cls) {
                    String strM7489l;
/* 3 */             ClassLoader classLoader = zzly.class.getClassLoader();
/* 14 */            if (cls.equals(zzlq.class)) {
/* 16 */                strM7489l = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
                    } else {
/* 31 */                if (!cls.getPackage().equals(zzly.class.getPackage())) {
/* 251 */                   C1951n4.m6859j(cls.getName());
/* 13 */                    return null;
                        }
/* 49 */                strM7489l = pm2.m7489l(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
                    }
                    try {
                        try {
                            try {
                                try {
/* 76 */                            return (zzlq) cls.cast(((zzly) Class.forName(strM7489l, true, classLoader).getConstructor(null).newInstance(null)).zza());
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
/* 115 */               Iterator it = ServiceLoader.load(zzly.class, classLoader).iterator();
/* 121 */               ArrayList arrayList = new ArrayList();
/* 128 */               while (it.hasNext()) {
                            try {
/* 146 */                       arrayList.add((zzlq) cls.cast(((zzly) it.next()).zza()));
                            } catch (ServiceConfigurationError e5) {
/* 178 */                       Logger.getLogger(zzll.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e5);
                            }
                        }
/* 186 */               if (arrayList.size() == 1) {
/* 193 */                   return (zzlq) arrayList.get(0);
                        }
/* 200 */               if (arrayList.size() == 0) {
/* 13 */                    return null;
                        }
                        try {
/* 223 */                   return (zzlq) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
                        } catch (IllegalAccessException e6) {
/* 239 */                   C1697u2.m5439o(e6);
/* 13 */                    return null;
                        } catch (NoSuchMethodException e7) {
/* 243 */                   C1697u2.m5439o(e7);
/* 13 */                    return null;
                        } catch (InvocationTargetException e8) {
/* 235 */                   C1697u2.m5439o(e8);
/* 13 */                    return null;
                        }
                    }
                }

                public abstract zzlq zza();
            }
