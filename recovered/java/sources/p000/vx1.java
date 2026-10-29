            package p000;

            import androidx.lifecycle.DefaultLifecycleObserver;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vx1 implements DefaultLifecycleObserver {

                /* JADX INFO: renamed from: a */
                public static final ec0 f18384a = new ec0(24);

                /* JADX INFO: renamed from: b */
                public static int f18385b = 1;

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onStart(g71 g71Var) {
/* 1 */             g71Var.getClass();
/* 4 */             super.onStart(g71Var);
/* 14 */            k50.m5968e("vx1", "App enter foreground", new Object[0]);
                    try {
/* 19 */                HashMap map = new HashMap();
/* 26 */                map.put("isForeground", Boolean.TRUE);
/* 31 */                xn1.m10006b("SnowplowLifecycleTracking", map);
                    } catch (Exception e) {
/* 42 */                k50.m5980q("vx1", "Method onEnterForeground raised an exception: %s", e);
                    }
                }

                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public final void onStop(g71 g71Var) {
/* 1 */             g71Var.getClass();
/* 4 */             super.onStop(g71Var);
/* 14 */            k50.m5968e("vx1", "App enter background", new Object[0]);
                    try {
/* 19 */                HashMap map = new HashMap();
/* 26 */                map.put("isForeground", Boolean.FALSE);
/* 31 */                xn1.m10006b("SnowplowLifecycleTracking", map);
                    } catch (Exception e) {
/* 42 */                k50.m5980q("vx1", "Method onEnterBackground raised an exception: %s", e);
                    }
                }
            }
