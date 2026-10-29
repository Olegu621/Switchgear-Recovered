            package p000;

            import android.os.Build;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class by0 {

                /* JADX INFO: renamed from: a */
                public final zx0 f2634a;

                public by0(zx0 zx0Var) {
/* 4 */             this.f2634a = zx0Var;
                }

                /* JADX INFO: renamed from: a */
                public static by0 m1468a(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return null;
                    }
                    return Build.VERSION.SDK_INT >= 31 ? new by0(new ay0(obj)) : new by0(new zx0(obj));
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof by0)) {
/* 5 */                 return false;
                    }
/* 13 */            return this.f2634a.equals(((by0) obj).f2634a);
                }

                public final int hashCode() {
/* 5 */             return this.f2634a.f20364a.hashCode();
                }

                public final String toString() {
/* 5 */             return this.f2634a.f20364a.toString();
                }
            }
