            package io.sentry;

            import io.sentry.util.C1702a;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            
            /* JADX INFO: renamed from: io.sentry.i0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1486i0 {

                /* JADX INFO: renamed from: i */
                public static final HashMap f11000i;

                /* JADX INFO: renamed from: a */
                public final HashMap f11001a = new HashMap();

                /* JADX INFO: renamed from: b */
                public final ArrayList f11002b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final C1702a f11003c = new C1702a();

                /* JADX INFO: renamed from: d */
                public C1154a f11004d = null;

                /* JADX INFO: renamed from: e */
                public C1154a f11005e = null;

                /* JADX INFO: renamed from: f */
                public C1154a f11006f = null;

                /* JADX INFO: renamed from: g */
                public C1154a f11007g = null;

                /* JADX INFO: renamed from: h */
                public C1745x3 f11008h = null;

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             f11000i = map;
/* 12 */            map.put("boolean", Boolean.class);
/* 19 */            map.put("char", Character.class);
/* 26 */            map.put("byte", Byte.class);
/* 33 */            map.put("short", Short.class);
/* 40 */            map.put("int", Integer.class);
/* 47 */            map.put("long", Long.class);
/* 54 */            map.put("float", Float.class);
/* 61 */            map.put("double", Double.class);
                }

                /* JADX INFO: renamed from: a */
                public final void m5272a() {
/* 1 */             C1702a c1702a = this.f11003c;
/* 3 */             c1702a.m5443c();
                    try {
/* 12 */                Iterator it = this.f11001a.entrySet().iterator();
/* 20 */                while (it.hasNext()) {
/* 26 */                    Map.Entry entry = (Map.Entry) it.next();
/* 32 */                    if (entry.getKey() == null || !((String) entry.getKey()).startsWith("sentry:")) {
/* 51 */                        it.remove();
                            }
                        }
/* 55 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 59 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 64 */                    th.addSuppressed(th2);
                        }
/* 67 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final Object m5273b(String str) {
/* 1 */             C1702a c1702a = this.f11003c;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 Object obj = this.f11001a.get(str);
/* 12 */                c1702a.close();
/* 15 */                return obj;
                    } catch (Throwable th) {
                        try {
/* 17 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 22 */                    th.addSuppressed(th2);
                        }
/* 25 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final Object m5274c(Class cls, String str) {
/* 1 */             C1702a c1702a = this.f11003c;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 Object obj = this.f11001a.get(str);
/* 16 */                if (cls.isInstance(obj)) {
/* 18 */                    c1702a.close();
/* 21 */                    return obj;
                        }
/* 32 */                Class cls2 = (Class) f11000i.get(cls.getCanonicalName());
/* 34 */                if (obj == null || !cls.isPrimitive() || cls2 == null || !cls2.isInstance(obj)) {
/* 54 */                    c1702a.close();
/* 57 */                    return null;
                        }
/* 50 */                c1702a.close();
/* 53 */                return obj;
                    } catch (Throwable th) {
                        try {
/* 60 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 65 */                    th.addSuppressed(th2);
                        }
/* 68 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m5275d(Object obj, String str) {
/* 1 */             C1702a c1702a = this.f11003c;
/* 3 */             c1702a.m5443c();
                    try {
/* 8 */                 this.f11001a.put(str, obj);
/* 11 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 16 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 21 */                    th.addSuppressed(th2);
                        }
/* 24 */                throw th;
                    }
                }
            }
