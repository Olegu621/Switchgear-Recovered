            package p000;

            import android.os.Bundle;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class el3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ String f7783a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f7784b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f7785c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Bundle f7786d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f7787e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f7788f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ boolean f7789i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ sl3 f7790v;

                public el3(sl3 sl3Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
/* 4 */             this.f7783a = str;
/* 6 */             this.f7784b = str2;
/* 8 */             this.f7785c = j;
/* 10 */            this.f7786d = bundle;
/* 12 */            this.f7787e = z;
/* 14 */            this.f7788f = z2;
/* 16 */            this.f7789i = z3;
/* 18 */            this.f7790v = sl3Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 17 */            this.f7790v.m8558I(this.f7783a, this.f7784b, this.f7785c, this.f7786d, this.f7787e, this.f7788f, this.f7789i);
                }
            }
