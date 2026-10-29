            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class c30 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2673a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f2674b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f2675c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f2676d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f2677e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Bundle f2678f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ d30 f2679i;

                public c30(d30 d30Var, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
/* 4 */             this.f2679i = d30Var;
/* 6 */             this.f2673a = i;
/* 8 */             this.f2674b = i2;
/* 10 */            this.f2675c = i3;
/* 12 */            this.f2676d = i4;
/* 14 */            this.f2677e = i5;
/* 16 */            this.f2678f = bundle;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 17 */            this.f2679i.f6966b.onActivityLayout(this.f2673a, this.f2674b, this.f2675c, this.f2676d, this.f2677e, this.f2678f);
                }
            }
