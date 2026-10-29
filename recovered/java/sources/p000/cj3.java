            package p000;

            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cj3 extends hj3 {

                /* JADX INFO: renamed from: b */
                public final kb1 f2965b;

                /* JADX INFO: renamed from: c */
                public final kb1 f2966c;

                /* JADX INFO: renamed from: d */
                public final int[] f2967d;

                /* JADX INFO: renamed from: e */
                public final int f2968e;

                /* JADX WARN: Code duplicated, block: B:25:0x0054  */
                public cj3(kb1 kb1Var, kb1 kb1Var2) {
/* 4 */             this.f2965b = kb1Var;
/* 6 */             this.f2966c = kb1Var2;
/* 8 */             int iMo3438X = kb1Var2.mo3438X();
/* 21 */            if (!(iMo3438X <= 28)) {
/* 99 */                C1951n4.m6859j("metadata size too large");
/* 103 */               throw null;
                    }
/* 23 */            int[] iArr = new int[iMo3438X];
/* 25 */            this.f2967d = iArr;
/* 27 */            long j = 0;
/* 29 */            int i = 0;
/* 30 */            int i2 = 0;
/* 31 */            while (i < iMo3438X) {
/* 33 */                ph3 ph3VarM1712d = m1712d(i);
/* 39 */                long j2 = ph3VarM1712d.f15135e | j;
/* 42 */                if (j2 == j) {
/* 44 */                    int i3 = 0;
                            while (true) {
/* 46 */                        if (i3 >= i2) {
/* 66 */                            i3 = -1;
                                    break;
                                } else if (ph3VarM1712d.equals(m1712d(iArr[i3] & 31))) {
                                    break;
                                } else {
/* 63 */                            i3++;
                                }
                            }
/* 67 */                    if (i3 != -1) {
/* 82 */                        iArr[i3] = ph3VarM1712d.f15133c ? iArr[i3] | (1 << (i + 4)) : i;
                            } else {
/* 87 */                        iArr[i2] = i;
/* 85 */                        i2++;
                            }
                        } else {
/* 87 */                    iArr[i2] = i;
/* 85 */                    i2++;
                        }
/* 90 */                i++;
/* 92 */                j = j2;
                    }
/* 94 */            this.f2968e = i2;
                }

                @Override // p000.hj3
                /* JADX INFO: renamed from: a */
                public final void mo1709a(ti3 ti3Var, ii3 ii3Var) {
/* 4 */             for (int i = 0; i < this.f2968e; i++) {
/* 8 */                 int i2 = this.f2967d[i];
/* 12 */                ph3 ph3VarM1712d = m1712d(i2 & 31);
/* 18 */                if (ph3VarM1712d.f15133c) {
/* 47 */                    ti3Var.m8792b(ph3VarM1712d, new aj3(this, ph3VarM1712d, i2), ii3Var);
                        } else {
/* 38 */                    ti3Var.m8791a(ph3VarM1712d, ph3VarM1712d.f15132b.cast((i2 >= 0 ? this.f2966c : this.f2965b).mo3440Z(i2)), ii3Var);
                        }
                    }
                }

                @Override // p000.hj3
                /* JADX INFO: renamed from: b */
                public final int mo1710b() {
/* 1 */             return this.f2968e;
                }

                @Override // p000.hj3
                /* JADX INFO: renamed from: c */
                public final Set mo1711c() {
/* 4 */             return new gf2(this, 1);
                }

                /* JADX INFO: renamed from: d */
                public final ph3 m1712d(int i) {
/* 5 */             return (i >= 0 ? this.f2966c : this.f2965b).mo3439Y(i);
                }
            }
