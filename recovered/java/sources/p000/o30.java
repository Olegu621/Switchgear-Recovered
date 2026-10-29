            package p000;

            import android.content.ComponentName;
            import android.os.Bundle;
            import android.support.customtabs.ICustomTabsService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o30 {

                /* JADX INFO: renamed from: a */
                public final Object f14599a = new Object();

                /* JADX INFO: renamed from: b */
                public final ICustomTabsService f14600b;

                /* JADX INFO: renamed from: c */
                public final d30 f14601c;

                /* JADX INFO: renamed from: d */
                public final ComponentName f14602d;

                public o30(ICustomTabsService iCustomTabsService, d30 d30Var, ComponentName componentName) {
/* 11 */            this.f14600b = iCustomTabsService;
/* 13 */            this.f14601c = d30Var;
/* 15 */            this.f14602d = componentName;
                }

                /* JADX INFO: renamed from: a */
                public final Bundle m7093a(Bundle bundle) {
/* 3 */             Bundle bundle2 = new Bundle();
/* 6 */             if (bundle != null) {
/* 8 */                 bundle2.putAll(bundle);
                    }
/* 11 */            return bundle2;
                }
            }
