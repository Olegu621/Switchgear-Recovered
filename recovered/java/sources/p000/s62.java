            package p000;

            import android.os.Bundle;
            import java.util.Map;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class s62 implements w62 {

                /* JADX INFO: renamed from: a */
                public final x62 f16450a;

                /* JADX INFO: renamed from: b */
                public boolean f16451b;

                /* JADX INFO: renamed from: c */
                public Bundle f16452c;

                /* JADX INFO: renamed from: d */
                public final hk2 f16453d;

                public s62(x62 x62Var, u33 u33Var) {
/* 1 */             x62Var.getClass();
/* 7 */             this.f16450a = x62Var;
/* 20 */            this.f16453d = r51.m8065b(new C0908f8(u33Var, 8));
                }

                @Override // p000.w62
                /* JADX INFO: renamed from: a */
                public final Bundle mo671a() {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             Bundle bundle2 = this.f16452c;
/* 8 */             if (bundle2 != null) {
/* 10 */                bundle.putAll(bundle2);
                    }
/* 35 */            for (Map.Entry entry : ((t62) this.f16453d.getValue()).f16930d.entrySet()) {
/* 47 */                String str = (String) entry.getKey();
/* 57 */                Bundle bundleMo671a = ((n62) entry.getValue()).f14149e.mo671a();
/* 67 */                if (!Intrinsics.m6216a(bundleMo671a, Bundle.EMPTY)) {
/* 69 */                    bundle.putBundle(str, bundleMo671a);
                        }
                    }
/* 74 */            this.f16451b = false;
/* 76 */            return bundle;
                }

                /* JADX INFO: renamed from: b */
                public final void m8416b() {
/* 3 */             if (this.f16451b) {
/* 43 */                return;
                    }
/* 9 */             Bundle bundleM9722a = this.f16450a.m9722a("androidx.lifecycle.internal.SavedStateHandlesProvider");
/* 15 */            Bundle bundle = new Bundle();
/* 18 */            Bundle bundle2 = this.f16452c;
/* 20 */            if (bundle2 != null) {
/* 22 */                bundle.putAll(bundle2);
                    }
/* 25 */            if (bundleM9722a != null) {
/* 27 */                bundle.putAll(bundleM9722a);
                    }
/* 30 */            this.f16452c = bundle;
/* 33 */            this.f16451b = true;
                }
            }
