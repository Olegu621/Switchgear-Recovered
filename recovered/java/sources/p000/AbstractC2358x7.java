            package p000;
            
            /* JADX INFO: renamed from: x7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC2358x7 {

                /* JADX INFO: renamed from: a */
                public static final Class f18979a;

                /* JADX INFO: renamed from: b */
                public static final boolean f18980b;

                static {
                    Class<?> cls;
/* 3 */             Class<?> cls2 = null;
                    try {
/* 4 */                 cls = Class.forName("libcore.io.Memory");
                    } catch (Throwable unused) {
/* 9 */                 cls = null;
                    }
/* 10 */            f18979a = cls;
                    try {
/* 14 */                cls2 = Class.forName("org.robolectric.Robolectric");
                    } catch (Throwable unused2) {
                    }
/* 23 */            f18980b = cls2 != null;
                }

                /* JADX INFO: renamed from: a */
                public static boolean m9726a() {
                    return (f18979a == null || f18980b) ? false : true;
                }
            }
