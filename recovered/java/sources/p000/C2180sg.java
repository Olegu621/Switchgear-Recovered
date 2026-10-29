            package p000;

            import android.graphics.Rect;
            import android.util.Size;
            
            /* JADX INFO: renamed from: sg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2180sg {

                /* JADX INFO: renamed from: a */
                public final Size f16575a;

                /* JADX INFO: renamed from: b */
                public final Rect f16576b;

                /* JADX INFO: renamed from: c */
                public final InterfaceC2559zp f16577c;

                /* JADX INFO: renamed from: d */
                public final int f16578d;

                /* JADX INFO: renamed from: e */
                public final boolean f16579e;

                public C2180sg(Size size, Rect rect, InterfaceC2559zp interfaceC2559zp, int i, boolean z) {
/* 5 */             if (size == null) {
/* 28 */                C1951n4.m6868s("Null inputSize");
/* 31 */                throw null;
                    }
/* 7 */             this.f16575a = size;
/* 9 */             if (rect == null) {
/* 22 */                C1951n4.m6868s("Null inputCropRect");
/* 25 */                throw null;
                    }
/* 11 */            this.f16576b = rect;
/* 13 */            this.f16577c = interfaceC2559zp;
/* 15 */            this.f16578d = i;
/* 17 */            this.f16579e = z;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2180sg) {
/* 10 */                C2180sg c2180sg = (C2180sg) obj;
/* 20 */                if (this.f16575a.equals(c2180sg.f16575a) && this.f16576b.equals(c2180sg.f16576b)) {
/* 32 */                    InterfaceC2559zp interfaceC2559zp = c2180sg.f16577c;
/* 34 */                    InterfaceC2559zp interfaceC2559zp2 = this.f16577c;
/* 36 */                    if (interfaceC2559zp2 != null ? interfaceC2559zp2.equals(interfaceC2559zp) : interfaceC2559zp == null) {
/* 51 */                        if (this.f16578d == c2180sg.f16578d && this.f16579e == c2180sg.f16579e) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 19 */            int iHashCode = (((this.f16575a.hashCode() ^ 1000003) * 1000003) ^ this.f16576b.hashCode()) * 1000003;
/* 20 */            InterfaceC2559zp interfaceC2559zp = this.f16577c;
/* 45 */            return (this.f16579e ? 1231 : 1237) ^ ((((iHashCode ^ (interfaceC2559zp == null ? 0 : interfaceC2559zp.hashCode())) * 1000003) ^ this.f16578d) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
/* 10 */            sb.append(this.f16575a);
/* 15 */            sb.append(", inputCropRect=");
/* 20 */            sb.append(this.f16576b);
/* 25 */            sb.append(", cameraInternal=");
/* 30 */            sb.append(this.f16577c);
/* 35 */            sb.append(", rotationDegrees=");
/* 40 */            sb.append(this.f16578d);
/* 45 */            sb.append(", mirroring=");
/* 52 */            return AbstractC0886en.m3511o(sb, this.f16579e, "}");
                }
            }
