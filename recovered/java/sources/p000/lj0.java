            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class lj0 implements Comparable {

                /* JADX INFO: renamed from: a */
                public int f13313a;

                /* JADX INFO: renamed from: b */
                public int f13314b;

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 1 */             lj0 lj0Var = (lj0) obj;
/* 3 */             int i = this.f13314b;
/* 5 */             int i2 = lj0Var.f13314b;
                    return i != i2 ? i - i2 : this.f13313a - lj0Var.f13313a;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Order{order=");
/* 10 */            sb.append(this.f13314b);
/* 15 */            sb.append(", index=");
/* 22 */            return AbstractC0886en.m3510n(sb, this.f13313a, '}');
                }
            }
