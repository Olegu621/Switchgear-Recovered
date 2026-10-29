            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ub2 extends wx2 {

                /* JADX INFO: renamed from: b */
                public int f17439b;

                /* JADX INFO: renamed from: c */
                public Object f17440c;

                /* JADX INFO: renamed from: d */
                public final Iterator f17441d;

                /* JADX INFO: renamed from: e */
                public final Iterator f17442e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ vb2 f17443f;

                public ub2(vb2 vb2Var) {
/* 2 */             super(0);
/* 5 */             this.f17443f = vb2Var;
/* 8 */             this.f17439b = 2;
/* 16 */            this.f17441d = vb2Var.f17955a.iterator();
/* 24 */            this.f17442e = vb2Var.f17956b.iterator();
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    Object next;
/* 1 */             int i = this.f17439b;
/* 5 */             if (i == 4) {
/* 70 */                f42.m3664t();
/* 3 */                 return false;
                    }
/* 7 */             int iM3520y = AbstractC0886en.m3520y(i);
/* 12 */            if (iM3520y == 0) {
/* 11 */                return true;
                    }
/* 15 */            if (iM3520y != 2) {
/* 17 */                this.f17439b = 4;
/* 19 */                Iterator it = this.f17441d;
/* 26 */                if (!it.hasNext()) {
/* 53 */                    do {
/* 33 */                        Iterator it2 = this.f17442e;
/* 39 */                        if (!it2.hasNext()) {
/* 56 */                            this.f17439b = 3;
/* 58 */                            next = null;
                                    break;
                                }
/* 41 */                        next = it2.next();
/* 53 */                    } while (this.f17443f.f17955a.contains(next));
                        } else {
/* 28 */                    next = it.next();
                        }
/* 59 */                this.f17440c = next;
/* 63 */                if (this.f17439b != 3) {
/* 65 */                    this.f17439b = 1;
/* 11 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 16 */                C1951n4.m6864o();
/* 19 */                return null;
                    }
/* 8 */             this.f17439b = 2;
/* 10 */            Object obj = this.f17440c;
/* 13 */            this.f17440c = null;
/* 15 */            return obj;
                }
            }
