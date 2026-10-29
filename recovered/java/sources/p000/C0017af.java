            package p000;

            import android.util.Range;
            import android.util.Size;
            import java.util.List;
            
            /* JADX INFO: renamed from: af */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0017af {

                /* JADX INFO: renamed from: a */
                public final C2143rg f217a;

                /* JADX INFO: renamed from: b */
                public final int f218b;

                /* JADX INFO: renamed from: c */
                public final Size f219c;

                /* JADX INFO: renamed from: d */
                public final mb0 f220d;

                /* JADX INFO: renamed from: e */
                public final List f221e;

                /* JADX INFO: renamed from: f */
                public final InterfaceC2235ty f222f;

                /* JADX INFO: renamed from: g */
                public final Range f223g;

                public C0017af(C2143rg c2143rg, int i, Size size, mb0 mb0Var, List list, InterfaceC2235ty interfaceC2235ty, Range range) {
/* 5 */             if (c2143rg == null) {
/* 48 */                C1951n4.m6868s("Null surfaceConfig");
/* 51 */                throw null;
                    }
/* 7 */             this.f217a = c2143rg;
/* 9 */             this.f218b = i;
/* 11 */            if (size == null) {
/* 42 */                C1951n4.m6868s("Null size");
/* 45 */                throw null;
                    }
/* 13 */            this.f219c = size;
/* 15 */            if (mb0Var == null) {
/* 36 */                C1951n4.m6868s("Null dynamicRange");
/* 39 */                throw null;
                    }
/* 17 */            this.f220d = mb0Var;
/* 19 */            if (list == null) {
/* 30 */                C1951n4.m6868s("Null captureTypes");
/* 33 */                throw null;
                    }
/* 21 */            this.f221e = list;
/* 23 */            this.f222f = interfaceC2235ty;
/* 25 */            this.f223g = range;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C0017af) {
/* 10 */                C0017af c0017af = (C0017af) obj;
/* 20 */                if (this.f217a.equals(c0017af.f217a) && this.f218b == c0017af.f218b && this.f219c.equals(c0017af.f219c) && this.f220d.equals(c0017af.f220d) && this.f221e.equals(c0017af.f221e)) {
/* 58 */                    InterfaceC2235ty interfaceC2235ty = c0017af.f222f;
/* 60 */                    InterfaceC2235ty interfaceC2235ty2 = this.f222f;
/* 62 */                    if (interfaceC2235ty2 != null ? interfaceC2235ty2.equals(interfaceC2235ty) : interfaceC2235ty == null) {
/* 73 */                        Range range = c0017af.f223g;
/* 75 */                        Range range2 = this.f223g;
/* 77 */                        if (range2 != null ? range2.equals(range) : range == null) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 39 */            int iHashCode = (((((((((this.f217a.hashCode() ^ 1000003) * 1000003) ^ this.f218b) * 1000003) ^ this.f219c.hashCode()) * 1000003) ^ this.f220d.hashCode()) * 1000003) ^ this.f221e.hashCode()) * 1000003;
/* 41 */            InterfaceC2235ty interfaceC2235ty = this.f222f;
/* 52 */            int iHashCode2 = (iHashCode ^ (interfaceC2235ty == null ? 0 : interfaceC2235ty.hashCode())) * 1000003;
/* 53 */            Range range = this.f223g;
/* 62 */            return iHashCode2 ^ (range != null ? range.hashCode() : 0);
                }

                public final String toString() {
/* 78 */            return "AttachedSurfaceInfo{surfaceConfig=" + this.f217a + ", imageFormat=" + this.f218b + ", size=" + this.f219c + ", dynamicRange=" + this.f220d + ", captureTypes=" + this.f221e + ", implementationOptions=" + this.f222f + ", targetFrameRate=" + this.f223g + "}";
                }
            }
