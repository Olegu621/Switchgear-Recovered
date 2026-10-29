            package p000;

            import android.content.Context;
            import android.net.ConnectivityManager;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ps0 implements ct0 {

                /* JADX INFO: renamed from: e */
                public static ps0 f15271e;

                /* JADX INFO: renamed from: a */
                public Context f15272a;

                /* JADX INFO: renamed from: b */
                public zb0 f15273b;

                /* JADX INFO: renamed from: c */
                public Set f15274c;

                /* JADX INFO: renamed from: d */
                public et0 f15275d;

                /* JADX INFO: renamed from: b */
                public static ps0 m7548b(Context context) {
/* 3 */             if (f15271e == null) {
/* 7 */                 ps0 ps0Var = new ps0();
/* 19 */                ps0Var.f15274c = Collections.synchronizedSet(new LinkedHashSet());
/* 21 */                ps0Var.f15272a = context;
/* 30 */                ps0Var.f15273b = new zb0(11);
/* 32 */                f15271e = ps0Var;
                    }
/* 34 */            return f15271e;
                }

                @Override // p000.ct0
                /* JADX INFO: renamed from: a */
                public final void mo2886a() {
/* 1 */             Set set = this.f15274c;
/* 7 */             if (set.isEmpty()) {
/* 30 */                return;
                    }
/* 10 */            Iterator it = set.iterator();
/* 18 */            while (it.hasNext()) {
/* 26 */                ((ct0) it.next()).mo2886a();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m7549c() {
/* 3 */             if (this.f15275d == null) {
/* 5 */                 zb0 zb0Var = this.f15273b;
/* 7 */                 Context context = this.f15272a;
/* 9 */                 zb0Var.getClass();
/* 14 */                et0 et0Var = new et0();
/* 17 */                et0Var.f7870a = context;
/* 19 */                this.f15275d = et0Var;
                    }
/* 21 */            et0 et0Var2 = this.f15275d;
/* 23 */            et0Var2.f7871b = this;
/* 25 */            ConnectivityManager connectivityManagerM3598a = et0Var2.m3598a();
/* 29 */            if (connectivityManagerM3598a != null) {
                        try {
/* 31 */                    connectivityManagerM3598a.registerDefaultNetworkCallback(et0Var2);
                        } catch (Exception e) {
/* 40 */                    xe2.m9777o("AboveNConnectvtManager", "Exception while registering network callback", e);
                        }
                    }
/* 43 */            ConnectivityManager connectivityManagerM3598a2 = et0Var2.m3598a();
/* 47 */            if (connectivityManagerM3598a2 == null || connectivityManagerM3598a2.getActiveNetwork() != null) {
/* 59 */                return;
                    }
/* 56 */            mo2887e();
                }

                @Override // p000.ct0
                /* JADX INFO: renamed from: e */
                public final void mo2887e() {
/* 1 */             Set set = this.f15274c;
/* 7 */             if (set.isEmpty()) {
/* 30 */                return;
                    }
/* 10 */            Iterator it = set.iterator();
/* 18 */            while (it.hasNext()) {
/* 26 */                ((ct0) it.next()).mo2887e();
                    }
                }
            }
