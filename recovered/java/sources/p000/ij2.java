            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class ij2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ lj2 f9635a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f9636b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f9637c;

                public /* synthetic */ ij2(lj2 lj2Var, int i, int i2) {
/* 4 */             this.f9635a = lj2Var;
/* 6 */             this.f9636b = i;
/* 8 */             this.f9637c = i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
/* 1 */             lj2 lj2Var = this.f9635a;
/* 3 */             int i = lj2Var.f13326i;
/* 5 */             int i2 = this.f9636b;
/* 7 */             boolean z2 = true;
/* 8 */             if (i != i2) {
/* 10 */                lj2Var.f13326i = i2;
/* 12 */                z = true;
                    } else {
/* 14 */                z = false;
                    }
/* 15 */            int i3 = lj2Var.f13325h;
/* 17 */            int i4 = this.f9637c;
/* 19 */            if (i3 != i4) {
/* 21 */                lj2Var.f13325h = i4;
                    } else {
/* 24 */                z2 = z;
                    }
/* 25 */            if (z2) {
/* 27 */                lj2Var.m6465e();
                    }
                }
            }
