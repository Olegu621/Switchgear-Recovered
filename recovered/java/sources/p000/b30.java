            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class b30 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2192a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f2193b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Bundle f2194c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ d30 f2195d;

                public b30(d30 d30Var, int i, int i2, Bundle bundle) {
/* 4 */             this.f2195d = d30Var;
/* 6 */             this.f2192a = i;
/* 8 */             this.f2193b = i2;
/* 10 */            this.f2194c = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 11 */            this.f2195d.f6966b.onActivityResized(this.f2192a, this.f2193b, this.f2194c);
                }
            }
