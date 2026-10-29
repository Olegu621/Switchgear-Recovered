            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mb0 {

                /* JADX INFO: renamed from: c */
                public static final mb0 f13670c = new mb0(0, 0);

                /* JADX INFO: renamed from: d */
                public static final mb0 f13671d = new mb0(1, 8);

                /* JADX INFO: renamed from: e */
                public static final mb0 f13672e = new mb0(3, 10);

                /* JADX INFO: renamed from: f */
                public static final mb0 f13673f = new mb0(4, 10);

                /* JADX INFO: renamed from: g */
                public static final mb0 f13674g = new mb0(5, 10);

                /* JADX INFO: renamed from: h */
                public static final mb0 f13675h = new mb0(6, 10);

                /* JADX INFO: renamed from: i */
                public static final mb0 f13676i = new mb0(6, 8);

                /* JADX INFO: renamed from: a */
                public final int f13677a;

                /* JADX INFO: renamed from: b */
                public final int f13678b;

                public mb0(int i, int i2) {
/* 4 */             this.f13677a = i;
/* 6 */             this.f13678b = i2;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m6634a() {
                    return m6635b() && this.f13677a != 1 && this.f13678b == 10;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m6635b() {
/* 1 */             int i = this.f13677a;
                    return (i == 0 || i == 2 || this.f13678b == 0) ? false : true;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof mb0) {
/* 10 */                mb0 mb0Var = (mb0) obj;
/* 16 */                if (this.f13677a == mb0Var.f13677a && this.f13678b == mb0Var.f13678b) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            return this.f13678b ^ ((this.f13677a ^ 1000003) * 1000003);
                }

                public final String toString() {
                    String str;
/* 5 */             StringBuilder sb = new StringBuilder("DynamicRange@");
/* 16 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 21 */            sb.append("{encoding=");
                    switch (this.f13677a) {
                        case 0:
/* 50 */                    str = "UNSPECIFIED";
                            break;
                        case 1:
/* 47 */                    str = "SDR";
                            break;
                        case 2:
/* 44 */                    str = "HDR_UNSPECIFIED";
                            break;
                        case 3:
/* 41 */                    str = "HLG";
                            break;
                        case 4:
/* 38 */                    str = "HDR10";
                            break;
                        case 5:
/* 35 */                    str = "HDR10_PLUS";
                            break;
                        case 6:
/* 32 */                    str = "DOLBY_VISION";
                            break;
                        default:
/* 29 */                    str = "<Unknown>";
                            break;
                    }
/* 52 */            sb.append(str);
/* 57 */            sb.append(", bitDepth=");
/* 64 */            return fm0.m3786l(sb, this.f13678b, "}");
                }
            }
