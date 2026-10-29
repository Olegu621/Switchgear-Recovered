            package p000;

            import android.util.Range;
            import android.util.Size;
            
            /* JADX INFO: renamed from: pg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2069pg {

                /* JADX INFO: renamed from: f */
                public static final Range f15101f = new Range(0, 0);

                /* JADX INFO: renamed from: a */
                public final Size f15102a;

                /* JADX INFO: renamed from: b */
                public final mb0 f15103b;

                /* JADX INFO: renamed from: c */
                public final Range f15104c;

                /* JADX INFO: renamed from: d */
                public final InterfaceC2235ty f15105d;

                /* JADX INFO: renamed from: e */
                public final boolean f15106e;

                public C2069pg(Size size, mb0 mb0Var, Range range, InterfaceC2235ty interfaceC2235ty, boolean z) {
/* 4 */             this.f15102a = size;
/* 6 */             this.f15103b = mb0Var;
/* 8 */             this.f15104c = range;
/* 10 */            this.f15105d = interfaceC2235ty;
/* 12 */            this.f15106e = z;
                }

                /* JADX INFO: renamed from: a */
                public final C0168b5 m7414a() {
/* 4 */             C0168b5 c0168b5 = new C0168b5(2);
/* 9 */             c0168b5.f2211b = this.f15102a;
/* 13 */            c0168b5.f2212c = this.f15103b;
/* 17 */            c0168b5.f2213d = this.f15104c;
/* 21 */            c0168b5.f2214e = this.f15105d;
/* 29 */            c0168b5.f2215f = Boolean.valueOf(this.f15106e);
/* 31 */            return c0168b5;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2069pg) {
/* 10 */                C2069pg c2069pg = (C2069pg) obj;
/* 20 */                if (this.f15102a.equals(c2069pg.f15102a) && this.f15103b.equals(c2069pg.f15103b) && this.f15104c.equals(c2069pg.f15104c)) {
/* 42 */                    InterfaceC2235ty interfaceC2235ty = c2069pg.f15105d;
/* 44 */                    InterfaceC2235ty interfaceC2235ty2 = this.f15105d;
/* 46 */                    if (interfaceC2235ty2 != null ? interfaceC2235ty2.equals(interfaceC2235ty) : interfaceC2235ty == null) {
/* 61 */                        if (this.f15106e == c2069pg.f15106e) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 27 */            int iHashCode = (((((this.f15102a.hashCode() ^ 1000003) * 1000003) ^ this.f15103b.hashCode()) * 1000003) ^ this.f15104c.hashCode()) * 1000003;
/* 28 */            InterfaceC2235ty interfaceC2235ty = this.f15105d;
/* 49 */            return (this.f15106e ? 1231 : 1237) ^ ((iHashCode ^ (interfaceC2235ty == null ? 0 : interfaceC2235ty.hashCode())) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
/* 10 */            sb.append(this.f15102a);
/* 15 */            sb.append(", dynamicRange=");
/* 20 */            sb.append(this.f15103b);
/* 25 */            sb.append(", expectedFrameRateRange=");
/* 30 */            sb.append(this.f15104c);
/* 35 */            sb.append(", implementationOptions=");
/* 40 */            sb.append(this.f15105d);
/* 45 */            sb.append(", zslDisabled=");
/* 52 */            return AbstractC0886en.m3511o(sb, this.f15106e, "}");
                }
            }
