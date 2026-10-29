            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.Fragment;
            import java.util.Set;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class bn0 {

                /* JADX INFO: renamed from: a */
                public static final an0 f2547a = an0.f340c;

                /* JADX INFO: renamed from: a */
                public static an0 m1395a(Fragment fragment) {
/* 1 */             while (fragment != null) {
/* 7 */                 if (fragment.isAdded()) {
/* 13 */                    fragment.getParentFragmentManager().getClass();
                        }
/* 16 */                fragment = fragment.getParentFragment();
                    }
/* 21 */            return f2547a;
                }

                /* JADX INFO: renamed from: b */
                public static void m1396b(an0 an0Var, q53 q53Var) {
/* 1 */             Fragment fragment = q53Var.f15403a;
/* 7 */             String name = fragment.getClass().getName();
/* 11 */            Set set = an0Var.f341a;
/* 15 */            set.contains(zm0.f20251a);
/* 24 */            if (set.contains(zm0.f20252b)) {
/* 30 */                RunnableC1784j8 runnableC1784j8 = new RunnableC1784j8(26, name, q53Var);
/* 38 */                if (!fragment.isAdded()) {
/* 70 */                    runnableC1784j8.run();
/* 73 */                    throw null;
                        }
/* 46 */                Handler handler = fragment.getParentFragmentManager().f1512v.f14818c;
/* 60 */                if (Intrinsics.m6216a(handler.getLooper(), Looper.myLooper())) {
/* 66 */                    runnableC1784j8.run();
/* 69 */                    throw null;
                        }
/* 62 */                handler.post(runnableC1784j8);
                    }
                }

                /* JADX INFO: renamed from: c */
                public static void m1397c(q53 q53Var) {
/* 6 */             if (AbstractC0111w.m674K(3)) {
/* 10 */                q53Var.f15403a.getClass();
                    }
                }

                /* JADX INFO: renamed from: d */
                public static final void m1398d(Fragment fragment, String str) {
/* 1 */             fragment.getClass();
/* 4 */             str.getClass();
/* 31 */            ym0 ym0Var = new ym0(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
/* 34 */            m1397c(ym0Var);
/* 37 */            an0 an0VarM1395a = m1395a(fragment);
/* 49 */            if (an0VarM1395a.f341a.contains(zm0.f20253c) && m1399e(an0VarM1395a, fragment.getClass(), ym0.class)) {
/* 63 */                m1396b(an0VarM1395a, ym0Var);
                    }
                }

                /* JADX INFO: renamed from: e */
                public static boolean m1399e(an0 an0Var, Class cls, Class cls2) {
/* 11 */            Set set = (Set) an0Var.f342b.get(cls.getName());
/* 14 */            if (set == null) {
/* 13 */                return true;
                    }
/* 27 */            if (Intrinsics.m6216a(cls2.getSuperclass(), q53.class) || !CollectionsKt.m6197r(set, cls2.getSuperclass())) {
/* 45 */                return !set.contains(cls2);
                    }
/* 39 */            return false;
                }
            }
