            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class f02 {

                /* JADX INFO: renamed from: a */
                public final Class f7957a;

                /* JADX INFO: renamed from: b */
                public final Class f7958b;

                public f02(Class cls, Class cls2) {
/* 4 */             this.f7957a = cls;
/* 6 */             this.f7958b = cls2;
                }

                /* JADX INFO: renamed from: a */
                public static f02 m3619a(Class cls) {
/* 5 */             return new f02(e02.class, cls);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || f02.class != obj.getClass()) {
/* 38 */                return false;
                    }
/* 16 */            f02 f02Var = (f02) obj;
/* 26 */            if (this.f7958b.equals(f02Var.f7958b)) {
/* 33 */                return this.f7957a.equals(f02Var.f7957a);
                    }
/* 38 */            return false;
                }

                public final int hashCode() {
/* 15 */            return this.f7957a.hashCode() + (this.f7958b.hashCode() * 31);
                }

                public final String toString() {
/* 3 */             Class cls = this.f7958b;
/* 5 */             Class cls2 = this.f7957a;
/* 7 */             if (cls2 == e02.class) {
/* 9 */                 return cls.getName();
                    }
/* 40 */            return "@" + cls2.getName() + " " + cls.getName();
                }
            }
