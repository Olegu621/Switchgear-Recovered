            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class ze0 extends s10 {

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ int f20121f = 0;

                /* JADX INFO: renamed from: c */
                public long f20122c;

                /* JADX INFO: renamed from: d */
                public boolean f20123d;

                /* JADX INFO: renamed from: e */
                public C0840dd f20124e;

                @Override // p000.s10
                /* JADX INFO: renamed from: k */
                public final s10 mo1541k(int i) {
/* 2 */             j13.m5643c(1);
/* 5 */             return this;
                }

                /* JADX INFO: renamed from: l */
                public final void m10345l(boolean z) {
/* 13 */            long j = this.f20122c - (z ? 4294967296L : 1L);
/* 14 */            this.f20122c = j;
/* 20 */            if (j <= 0 && this.f20123d) {
/* 27 */                shutdown();
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m10346m(r80 r80Var) {
/* 1 */             C0840dd c0840dd = this.f20124e;
/* 3 */             if (c0840dd == null) {
/* 7 */                 c0840dd = new C0840dd();
/* 10 */                this.f20124e = c0840dd;
                    }
/* 12 */            c0840dd.addLast(r80Var);
                }

                /* JADX INFO: renamed from: n */
                public final void m10347n(boolean z) {
/* 14 */            this.f20122c = (z ? 4294967296L : 1L) + this.f20122c;
/* 16 */            if (z) {
/* 21 */                return;
                    }
/* 19 */            this.f20123d = true;
                }

                /* JADX INFO: renamed from: o */
                public abstract long mo3419o();

                /* JADX INFO: renamed from: p */
                public final boolean m10348p() {
/* 1 */             C0840dd c0840dd = this.f20124e;
/* 4 */             if (c0840dd == null) {
/* 3 */                 return false;
                    }
/* 19 */            r80 r80Var = (r80) (c0840dd.isEmpty() ? null : c0840dd.removeFirst());
/* 21 */            if (r80Var == null) {
/* 3 */                 return false;
                    }
/* 24 */            r80Var.run();
/* 27 */            return true;
                }

                public abstract void shutdown();
            }
