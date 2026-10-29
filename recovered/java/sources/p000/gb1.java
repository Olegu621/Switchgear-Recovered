            package p000;

            import android.os.Looper;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.ServiceConfigurationError;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class gb1 {

                /* JADX INFO: renamed from: a */
                public static final kt0 f8531a;

                static {
                    String property;
/* 3 */             int i = ik2.f9695a;
/* 5 */             Object next = null;
                    try {
/* 6 */                 property = System.getProperty("kotlinx.coroutines.fast.service.loader");
                    } catch (SecurityException unused) {
/* 11 */                property = null;
                    }
/* 12 */            if (property != null) {
/* 14 */                Boolean.parseBoolean(property);
                    }
                    try {
/* 42 */                Iterator it = w92.m9488b(u92.m8981a(Arrays.asList(new C0010a8()).iterator())).iterator();
/* 50 */                if (it.hasNext()) {
/* 53 */                    next = it.next();
/* 61 */                    if (it.hasNext()) {
/* 67 */                        ((C0010a8) next).getClass();
/* 83 */                        do {
/* 76 */                            ((C0010a8) it.next()).getClass();
/* 83 */                        } while (it.hasNext());
                            }
                        }
/* 87 */                if (((C0010a8) next) == null) {
/* 116 */                   f42.m3656l("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
/* 119 */                   return;
                        }
/* 89 */                Looper mainLooper = Looper.getMainLooper();
/* 93 */                if (mainLooper != null) {
/* 105 */                   f8531a = new kt0(lt0.m6537a(mainLooper), false);
                        } else {
/* 110 */                   f42.m3656l("The main looper is not available");
                        }
                    } catch (Throwable th) {
/* 130 */               throw new ServiceConfigurationError(th.getMessage(), th);
                    }
                }
            }
