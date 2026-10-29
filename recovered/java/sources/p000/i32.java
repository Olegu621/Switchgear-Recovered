            package p000;

            import android.app.Activity;
            import android.app.FragmentManager;
            import android.os.Build;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class i32 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public static void m4461a(Activity activity, t61 t61Var) {
/* 1 */             activity.getClass();
/* 4 */             t61Var.getClass();
/* 9 */             if (activity instanceof g71) {
/* 13 */                v61 lifecycle = ((g71) activity).getLifecycle();
/* 19 */                if (lifecycle instanceof i71) {
/* 23 */                    ((i71) lifecycle).m4487e(t61Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static void m4462b(Activity activity) {
/* 1 */             activity.getClass();
/* 8 */             if (Build.VERSION.SDK_INT >= 29) {
/* 12 */                k32.C1817a.Companion.getClass();
/* 1 */                 activity.registerActivityLifecycleCallbacks(new k32.C1817a());
                    }
/* 23 */            FragmentManager fragmentManager = activity.getFragmentManager();
/* 33 */            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
/* 48 */                fragmentManager.beginTransaction().add(new k32(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
/* 51 */                fragmentManager.executePendingTransactions();
                    }
                }
            }
