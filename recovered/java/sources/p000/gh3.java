            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gh3 extends hh3 {

                /* JADX INFO: renamed from: b */
                public final String f8617b;

                /* JADX INFO: renamed from: c */
                public final String f8618c;

                /* JADX INFO: renamed from: d */
                public final int f8619d;

                /* JADX INFO: renamed from: e */
                public final String f8620e;

                /* JADX INFO: renamed from: f */
                public int f8621f = 0;

                public gh3(int i, String str, String str2, String str3) {
/* 7 */             this.f8617b = str;
/* 9 */             this.f8618c = str2;
/* 11 */            this.f8619d = i;
/* 13 */            this.f8620e = str3;
                }

                @Override // p000.hh3
                /* JADX INFO: renamed from: a */
                public final String mo3764a() {
/* 7 */             return this.f8617b.replace('/', '.');
                }

                @Override // p000.hh3
                /* JADX INFO: renamed from: b */
                public final String mo3765b() {
/* 1 */             return this.f8618c;
                }

                @Override // p000.hh3
                /* JADX INFO: renamed from: c */
                public final int mo3766c() {
/* 3 */             return (char) this.f8619d;
                }

                @Override // p000.hh3
                /* JADX INFO: renamed from: d */
                public final String mo3767d() {
/* 1 */             return this.f8620e;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof gh3)) {
/* 35 */                return false;
                    }
/* 5 */             gh3 gh3Var = (gh3) obj;
                    return this.f8617b.equals(gh3Var.f8617b) && this.f8618c.equals(gh3Var.f8618c) && this.f8619d == gh3Var.f8619d;
                }

                public final int hashCode() {
/* 1 */             int i = this.f8621f;
/* 3 */             if (i != 0) {
/* 27 */                return i;
                    }
/* 24 */            int iM7485h = pm2.m7485h((this.f8617b.hashCode() + 4867) * 31, 31, this.f8618c) + this.f8619d;
/* 25 */            this.f8621f = iM7485h;
/* 27 */            return iM7485h;
                }
            }
