            package p000;

            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: oz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2051oz {

                /* JADX INFO: renamed from: b */
                public int f14925b;

                /* JADX INFO: renamed from: c */
                public boolean f14926c;

                /* JADX INFO: renamed from: d */
                public final C2569zz f14927d;

                /* JADX INFO: renamed from: e */
                public final int f14928e;

                /* JADX INFO: renamed from: f */
                public C2051oz f14929f;

                /* JADX INFO: renamed from: i */
                public qf2 f14932i;

                /* JADX INFO: renamed from: a */
                public HashSet f14924a = null;

                /* JADX INFO: renamed from: g */
                public int f14930g = 0;

                /* JADX INFO: renamed from: h */
                public int f14931h = Integer.MIN_VALUE;

                public C2051oz(C2569zz c2569zz, int i) {
/* 14 */            this.f14927d = c2569zz;
/* 16 */            this.f14928e = i;
                }

                /* JADX INFO: renamed from: a */
                public final void m7243a(C2051oz c2051oz, int i) {
/* 4 */             m7244b(c2051oz, i, Integer.MIN_VALUE, false);
                }

                /* JADX INFO: renamed from: b */
                public final boolean m7244b(C2051oz c2051oz, int i, int i2, boolean z) {
/* 2 */             if (c2051oz == null) {
/* 4 */                 m7252j();
/* 1 */                 return true;
                    }
/* 8 */             if (!z && !m7251i(c2051oz)) {
/* 16 */                return false;
                    }
/* 18 */            this.f14929f = c2051oz;
/* 22 */            if (c2051oz.f14924a == null) {
/* 29 */                c2051oz.f14924a = new HashSet();
                    }
/* 33 */            HashSet hashSet = this.f14929f.f14924a;
/* 35 */            if (hashSet != null) {
/* 37 */                hashSet.add(this);
                    }
/* 40 */            this.f14930g = i;
/* 42 */            this.f14931h = i2;
/* 1 */             return true;
                }

                /* JADX INFO: renamed from: c */
                public final void m7245c(int i, k73 k73Var, ArrayList arrayList) {
/* 1 */             HashSet hashSet = this.f14924a;
/* 3 */             if (hashSet != null) {
/* 5 */                 Iterator it = hashSet.iterator();
/* 13 */                while (it.hasNext()) {
/* 23 */                    kb1.m6031D(((C2051oz) it.next()).f14927d, i, arrayList, k73Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final int m7246d() {
/* 3 */             if (this.f14926c) {
/* 7 */                 return this.f14925b;
                    }
/* 5 */             return 0;
                }

                /* JADX INFO: renamed from: e */
                public final int m7247e() {
                    C2051oz c2051oz;
/* 7 */             if (this.f14927d.f20438i0 == 8) {
/* 9 */                 return 0;
                    }
/* 11 */            int i = this.f14931h;
                    return (i == Integer.MIN_VALUE || (c2051oz = this.f14929f) == null || c2051oz.f14927d.f20438i0 != 8) ? this.f14930g : i;
                }

                /* JADX INFO: renamed from: f */
                public final C2051oz m7248f() {
/* 1 */             int i = this.f14928e;
/* 3 */             int iM3520y = AbstractC0886en.m3520y(i);
/* 8 */             C2569zz c2569zz = this.f14927d;
                    switch (iM3520y) {
                        case 0:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
/* 7 */                     return null;
                        case 1:
/* 30 */                    return c2569zz.f20406L;
                        case 2:
/* 27 */                    return c2569zz.f20407M;
                        case 3:
/* 24 */                    return c2569zz.f20404J;
                        case 4:
/* 21 */                    return c2569zz.f20405K;
                        default:
/* 17 */                    C1951n4.m6856g(AbstractC0886en.m3519x(i));
/* 7 */                     return null;
                    }
                }

                /* JADX INFO: renamed from: g */
                public final boolean m7249g() {
/* 1 */             HashSet hashSet = this.f14924a;
/* 4 */             if (hashSet == null) {
/* 3 */                 return false;
                    }
/* 7 */             Iterator it = hashSet.iterator();
/* 15 */            while (it.hasNext()) {
/* 31 */                if (((C2051oz) it.next()).m7248f().m7250h()) {
/* 33 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                /* JADX INFO: renamed from: h */
                public final boolean m7250h() {
                    return this.f14929f != null;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:46:0x0061 A[RETURN] */
                /* JADX INFO: renamed from: i */
                public final boolean m7251i(C2051oz c2051oz) {
/* 2 */             if (c2051oz != null) {
/* 6 */                 C2569zz c2569zz = c2051oz.f14927d;
/* 8 */                 int i = c2051oz.f14928e;
/* 11 */                int i2 = this.f14928e;
/* 14 */                if (i != i2) {
                            switch (AbstractC0886en.m3520y(i2)) {
                                case 0:
                                case 7:
                                case 8:
                                    break;
                                case 1:
                                case 3:
/* 89 */                            boolean z = i == 2 || i == 4;
/* 92 */                            if (!(c2569zz instanceof bs0)) {
/* 99 */                                return z;
                                    }
/* 94 */                            if (z || i == 8) {
/* 13 */                                return true;
                                    }
                                    break;
                                case 2:
                                case 4:
/* 71 */                            boolean z2 = i == 3 || i == 5;
/* 74 */                            if (!(c2569zz instanceof bs0)) {
/* 81 */                                return z2;
                                    }
/* 76 */                            if (z2 || i == 9) {
/* 13 */                                return true;
                                    }
                                    break;
                                case 5:
/* 57 */                            if (i != 2 && i != 4) {
/* 13 */                                return true;
                                    }
                                    break;
                                case 6:
/* 50 */                            if (i != 6 && i != 8 && i != 9) {
/* 13 */                                return true;
                                    }
                                    break;
                                default:
/* 46 */                            C1951n4.m6856g(AbstractC0886en.m3519x(i2));
/* 1 */                             return false;
                            }
                        } else if (i2 != 6 || (c2569zz.f20399E && this.f14927d.f20399E)) {
/* 13 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: j */
                public final void m7252j() {
                    HashSet hashSet;
/* 1 */             C2051oz c2051oz = this.f14929f;
/* 4 */             if (c2051oz != null && (hashSet = c2051oz.f14924a) != null) {
/* 10 */                hashSet.remove(this);
/* 21 */                if (this.f14929f.f14924a.size() == 0) {
/* 25 */                    this.f14929f.f14924a = null;
                        }
                    }
/* 27 */            this.f14924a = null;
/* 29 */            this.f14929f = null;
/* 32 */            this.f14930g = 0;
/* 36 */            this.f14931h = Integer.MIN_VALUE;
/* 38 */            this.f14926c = false;
/* 40 */            this.f14925b = 0;
                }

                /* JADX INFO: renamed from: k */
                public final void m7253k() {
/* 1 */             qf2 qf2Var = this.f14932i;
/* 3 */             if (qf2Var == null) {
/* 11 */                this.f14932i = new qf2(1);
                    } else {
/* 14 */                qf2Var.m7787c();
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m7254l(int i) {
/* 1 */             this.f14925b = i;
/* 4 */             this.f14926c = true;
                }

                public final String toString() {
/* 27 */            return this.f14927d.f20442k0 + ":" + AbstractC0886en.m3519x(this.f14928e);
                }
            }
