            package p000;

            import android.os.Build;
            import java.lang.reflect.Method;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class rj1 {

                /* JADX INFO: renamed from: a */
                public Method f16118a;

                /* JADX INFO: renamed from: b */
                public Method f16119b;

                /* JADX INFO: renamed from: c */
                public Method f16120c;

                public rj1(Method method, Method method2, Method method3) {
/* 4 */             this.f16118a = method;
/* 6 */             this.f16119b = method2;
/* 8 */             this.f16120c = method3;
                }

                /* JADX INFO: renamed from: a */
                public static void m8189a() {
/* 5 */             if (Build.VERSION.SDK_INT >= 29) {
/* 15 */                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
                    }
                }
            }
