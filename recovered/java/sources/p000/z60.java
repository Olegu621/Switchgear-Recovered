            package p000;

            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import java.lang.reflect.InvocationTargetException;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z60 extends py0 {

                /* JADX INFO: renamed from: k */
                public final Object f19951k;

                /* JADX INFO: renamed from: l */
                public final ExecutorService f19952l;

                /* JADX INFO: renamed from: m */
                public volatile Handler f19953m;

                public z60() {
/* 3 */             super(17);
/* 11 */            this.f19951k = new Object();
/* 24 */            this.f19952l = Executors.newFixedThreadPool(4, new ThreadFactoryC2302vp(1));
                }

                /* JADX INFO: renamed from: y0 */
                public static Handler m10276y0(Looper looper) {
/* 5 */             if (Build.VERSION.SDK_INT >= 28) {
/* 7 */                 return y60.m10107a(looper);
                    }
                    try {
/* 51 */                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                    } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
/* 62 */                return new Handler(looper);
                    } catch (InvocationTargetException unused2) {
/* 56 */                return new Handler(looper);
                    }
                }
            }
