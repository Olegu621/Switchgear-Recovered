            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class r70 {

                /* JADX INFO: renamed from: a */
                public final f02 f15895a;

                /* JADX INFO: renamed from: b */
                public final int f15896b;

                /* JADX INFO: renamed from: c */
                public final int f15897c;

                public r70(f02 f02Var, int i, int i2) {
/* 4 */             this.f15895a = f02Var;
/* 6 */             this.f15896b = i;
/* 8 */             this.f15897c = i2;
                }

                /* JADX INFO: renamed from: a */
                public static r70 m8078a(Class cls) {
/* 5 */             return new r70(1, 0, cls);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof r70)) {
/* 31 */                return false;
                    }
/* 5 */             r70 r70Var = (r70) obj;
                    return this.f15895a.equals(r70Var.f15895a) && this.f15896b == r70Var.f15896b && this.f15897c == r70Var.f15897c;
                }

                public final int hashCode() {
/* 18 */            return this.f15897c ^ ((((this.f15895a.hashCode() ^ 1000003) * 1000003) ^ this.f15896b) * 1000003);
                }

                public final String toString() {
                    String str;
                    String str2;
/* 5 */             StringBuilder sb = new StringBuilder("Dependency{anInterface=");
/* 10 */            sb.append(this.f15895a);
/* 15 */            sb.append(", type=");
/* 18 */            int i = this.f15896b;
/* 21 */            if (i == 1) {
/* 23 */                str = "required";
                    } else {
/* 31 */                str = i == 0 ? "optional" : "set";
                    }
/* 33 */            sb.append(str);
/* 38 */            sb.append(", injection=");
/* 41 */            int i2 = this.f15897c;
/* 43 */            if (i2 == 0) {
/* 67 */                str2 = "direct";
                    } else if (i2 == 1) {
/* 64 */                str2 = "provider";
                    } else {
/* 48 */                if (i2 != 2) {
/* 59 */                    C1951n4.m6856g(fm0.m3781g(i2, "Unsupported injection: "));
/* 62 */                    return null;
                        }
/* 50 */                str2 = "deferred";
                    }
/* 71 */            return fm0.m3789o(sb, str2, "}");
                }

/* 10 */        public r70(int i, int i2, Class cls) {
/* 11 */            this(f02.m3619a(cls), i, i2);
                }
            }
