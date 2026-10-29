            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fn3 {

                /* JADX INFO: renamed from: a */
                public final String f8292a;

                /* JADX INFO: renamed from: b */
                public final String f8293b;

                /* JADX INFO: renamed from: c */
                public final boolean f8294c;

                public fn3(String str, String str2, boolean z) {
/* 4 */             kb1.m6058k(str);
/* 7 */             this.f8292a = str;
/* 9 */             kb1.m6058k(str2);
/* 12 */            this.f8293b = str2;
/* 14 */            this.f8294c = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof fn3)) {
/* 7 */                 return false;
                    }
/* 11 */            fn3 fn3Var = (fn3) obj;
                    return de3.m3029k(this.f8292a, fn3Var.f8292a) && de3.m3029k(this.f8293b, fn3Var.f8293b) && de3.m3029k(null, null) && this.f8294c == fn3Var.f8294c;
                }

                public final int hashCode() {
/* 22 */            return Arrays.hashCode(new Object[]{this.f8292a, this.f8293b, null, 4225, Boolean.valueOf(this.f8294c)});
                }

                public final String toString() {
/* 1 */             String str = this.f8292a;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 7 */             kb1.m6061n(null);
/* 10 */            throw null;
                }
            }
