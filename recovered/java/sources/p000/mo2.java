            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class mo2 extends p72 implements Runnable {

                /* JADX INFO: renamed from: i */
                public final long f13894i;

                public mo2(long j, c10 c10Var) {
/* 5 */             super(c10Var, c10Var.getContext());
/* 8 */             this.f13894i = j;
                }

                @Override // p000.z01
                /* JADX INFO: renamed from: F */
                public final String mo6717F() {
/* 28 */            return super.mo6717F() + "(timeMillis=" + this.f13894i + ')';
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 3 */             w11.m9440m(this.f9377e);
/* 32 */            m10251j(new lo2("Timed out waiting for " + this.f13894i + " ms", this));
                }
            }
