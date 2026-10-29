            package p000;

            import com.google.android.gms.tasks.OnFailureListener;
            import java.util.concurrent.atomic.AtomicLong;
            
            /* JADX INFO: renamed from: bu */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 11 */    public final class C0193bu implements OnFailureListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2604a;

                /* JADX INFO: renamed from: b */
                public long f2605b;

                /* JADX INFO: renamed from: c */
                public Object f2606c;

                public C0193bu(xt0 xt0Var) {
/* 2 */             this.f2604a = 2;
/* 7 */             kb1.m6061n(xt0Var);
/* 10 */            this.f2606c = xt0Var;
                }

                /* JADX INFO: renamed from: a */
                public void m1433a(int i) {
/* 3 */             if (i < 64) {
/* 23 */                this.f2605b &= ~(1 << i);
/* 25 */                return;
                    }
/* 7 */             C0193bu c0193bu = (C0193bu) this.f2606c;
/* 9 */             if (c0193bu != null) {
/* 12 */                c0193bu.m1433a(i - 64);
                    }
                }

                /* JADX INFO: renamed from: b */
                public int m1434b(int i) {
/* 3 */             C0193bu c0193bu = (C0193bu) this.f2606c;
/* 9 */             if (c0193bu == null) {
/* 11 */                long j = this.f2605b;
                        return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
                    }
/* 29 */            if (i < 64) {
/* 37 */                return Long.bitCount(((1 << i) - 1) & this.f2605b);
                    }
/* 53 */            return Long.bitCount(this.f2605b) + c0193bu.m1434b(i - 64);
                }

                /* JADX INFO: renamed from: c */
                public void m1435c() {
/* 5 */             if (((C0193bu) this.f2606c) == null) {
/* 12 */                this.f2606c = new C0193bu();
                    }
                }

                /* JADX INFO: renamed from: d */
                public boolean m1436d(int i) {
/* 3 */             if (i < 64) {
                        return ((1 << i) & this.f2605b) != 0;
                    }
/* 5 */             m1435c();
/* 13 */            return ((C0193bu) this.f2606c).m1436d(i - 64);
                }

                /* JADX INFO: renamed from: e */
                public void m1437e(int i, boolean z) {
/* 3 */             if (i >= 64) {
/* 5 */                 m1435c();
/* 13 */                ((C0193bu) this.f2606c).m1437e(i - 64, z);
/* 16 */                return;
                    }
/* 17 */            long j = this.f2605b;
/* 32 */            boolean z2 = (Long.MIN_VALUE & j) != 0;
/* 37 */            long j2 = (1 << i) - 1;
/* 44 */            this.f2605b = ((j & (~j2)) << 1) | (j & j2);
/* 46 */            if (z) {
/* 48 */                m1440h(i);
                    } else {
/* 52 */                m1433a(i);
                    }
/* 55 */            if (z2 || ((C0193bu) this.f2606c) != null) {
/* 65 */                m1435c();
/* 72 */                ((C0193bu) this.f2606c).m1437e(0, z2);
                    }
                }

                /* JADX INFO: renamed from: f */
                public boolean m1438f(int i) {
/* 3 */             if (i >= 64) {
/* 5 */                 m1435c();
/* 13 */                return ((C0193bu) this.f2606c).m1438f(i - 64);
                    }
/* 20 */            long j = 1 << i;
/* 22 */            long j2 = this.f2605b;
/* 36 */            boolean z = (j2 & j) != 0;
/* 38 */            long j3 = j2 & (~j);
/* 39 */            this.f2605b = j3;
/* 41 */            long j4 = j - 1;
/* 51 */            this.f2605b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
/* 55 */            C0193bu c0193bu = (C0193bu) this.f2606c;
/* 57 */            if (c0193bu != null) {
/* 63 */                if (c0193bu.m1436d(0)) {
/* 67 */                    m1440h(63);
                        }
/* 74 */                ((C0193bu) this.f2606c).m1438f(0);
                    }
/* 77 */            return z;
                }

                /* JADX INFO: renamed from: g */
                public void m1439g() {
/* 3 */             this.f2605b = 0L;
/* 7 */             C0193bu c0193bu = (C0193bu) this.f2606c;
/* 9 */             if (c0193bu != null) {
/* 11 */                c0193bu.m1439g();
                    }
                }

                /* JADX INFO: renamed from: h */
                public void m1440h(int i) {
/* 3 */             if (i < 64) {
/* 23 */                this.f2605b |= 1 << i;
                    } else {
/* 5 */                 m1435c();
/* 13 */                ((C0193bu) this.f2606c).m1440h(i - 64);
                    }
                }

                @Override // com.google.android.gms.tasks.OnFailureListener
                public /* synthetic */ void onFailure(Exception exc) {
/* 3 */             ac1 ac1Var = (ac1) this.f2606c;
/* 11 */            ((AtomicLong) ac1Var.f179d).set(this.f2605b);
                }

                public String toString() {
                    switch (this.f2604a) {
                        case 0:
/* 15 */                    if (((C0193bu) this.f2606c) == null) {
/* 19 */                        return Long.toBinaryString(this.f2605b);
                            }
/* 54 */                    return ((C0193bu) this.f2606c).toString() + "xx" + Long.toBinaryString(this.f2605b);
                        default:
/* 6 */                     return super.toString();
                    }
                }

/* 12 */        public /* synthetic */ C0193bu(ac1 ac1Var, long j) {
                    this.f2604a = 1;
                    this.f2606c = ac1Var;
                    this.f2605b = j;
                }

/* 13 */        public C0193bu() {
                    this.f2604a = 0;
/* 15 */            this.f2605b = 0L;
                }
            }
