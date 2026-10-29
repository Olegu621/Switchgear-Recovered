            package p000;

            import java.util.Collections;
            import java.util.List;
            
            /* JADX INFO: renamed from: mg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1926mg {

                /* JADX INFO: renamed from: a */
                public final d70 f13750a;

                /* JADX INFO: renamed from: b */
                public final List f13751b;

                /* JADX INFO: renamed from: c */
                public final int f13752c;

                /* JADX INFO: renamed from: d */
                public final int f13753d;

                /* JADX INFO: renamed from: e */
                public final mb0 f13754e;

                public C1926mg(d70 d70Var, List list, int i, int i2, mb0 mb0Var) {
/* 4 */             this.f13750a = d70Var;
/* 6 */             this.f13751b = list;
/* 8 */             this.f13752c = i;
/* 10 */            this.f13753d = i2;
/* 12 */            this.f13754e = mb0Var;
                }

                /* JADX INFO: renamed from: a */
                public static C0168b5 m6646a(d70 d70Var) {
/* 9 */             C0168b5 c0168b5 = new C0168b5(1);
/* 13 */            if (d70Var == null) {
/* 40 */                C1951n4.m6868s("Null surface");
/* 12 */                return null;
                    }
/* 15 */            c0168b5.f2213d = d70Var;
/* 17 */            List list = Collections.EMPTY_LIST;
/* 19 */            if (list == null) {
/* 34 */                C1951n4.m6868s("Null sharedSurfaces");
/* 12 */                return null;
                    }
/* 21 */            c0168b5.f2214e = list;
/* 23 */            c0168b5.f2211b = -1;
/* 25 */            c0168b5.f2212c = -1;
/* 29 */            c0168b5.f2215f = mb0.f13671d;
/* 31 */            return c0168b5;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 52 */                return true;
                    }
/* 6 */             if (!(obj instanceof C1926mg)) {
/* 54 */                return false;
                    }
/* 8 */             C1926mg c1926mg = (C1926mg) obj;
                    return this.f13750a.equals(c1926mg.f13750a) && this.f13751b.equals(c1926mg.f13751b) && this.f13752c == c1926mg.f13752c && this.f13753d == c1926mg.f13753d && this.f13754e.equals(c1926mg.f13754e);
                }

                public final int hashCode() {
/* 37 */            return this.f13754e.hashCode() ^ ((((((((this.f13750a.hashCode() ^ 1000003) * 1000003) ^ this.f13751b.hashCode()) * (-721379959)) ^ this.f13752c) * 1000003) ^ this.f13753d) * 1000003);
                }

                public final String toString() {
/* 58 */            return "OutputConfig{surface=" + this.f13750a + ", sharedSurfaces=" + this.f13751b + ", physicalCameraId=null, mirrorMode=" + this.f13752c + ", surfaceGroupId=" + this.f13753d + ", dynamicRange=" + this.f13754e + "}";
                }
            }
