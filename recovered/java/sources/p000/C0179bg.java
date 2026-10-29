            package p000;

            import java.util.Arrays;
            
            /* JADX INFO: renamed from: bg */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0179bg extends ba1 {

                /* JADX INFO: renamed from: a */
                public final long f2401a;

                /* JADX INFO: renamed from: b */
                public final Integer f2402b;

                /* JADX INFO: renamed from: c */
                public final long f2403c;

                /* JADX INFO: renamed from: d */
                public final byte[] f2404d;

                /* JADX INFO: renamed from: e */
                public final String f2405e;

                /* JADX INFO: renamed from: f */
                public final long f2406f;

                /* JADX INFO: renamed from: g */
                public final xm1 f2407g;

                public C0179bg(long j, Integer num, long j2, byte[] bArr, String str, long j3, xm1 xm1Var) {
/* 4 */             this.f2401a = j;
/* 6 */             this.f2402b = num;
/* 8 */             this.f2403c = j2;
/* 10 */            this.f2404d = bArr;
/* 12 */            this.f2405e = str;
/* 14 */            this.f2406f = j3;
/* 16 */            this.f2407g = xm1Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ba1) {
/* 10 */                ba1 ba1Var = (ba1) obj;
/* 13 */                C0179bg c0179bg = (C0179bg) ba1Var;
/* 21 */                if (this.f2401a == c0179bg.f2401a) {
/* 23 */                    Integer num = c0179bg.f2402b;
/* 25 */                    Integer num2 = this.f2402b;
/* 27 */                    if (num2 != null ? num2.equals(num) : num == null) {
/* 44 */                        if (this.f2403c == c0179bg.f2403c) {
/* 63 */                            if (Arrays.equals(this.f2404d, ba1Var instanceof C0179bg ? ((C0179bg) ba1Var).f2404d : c0179bg.f2404d)) {
/* 65 */                                String str = c0179bg.f2405e;
/* 67 */                                String str2 = this.f2405e;
/* 69 */                                if (str2 != null ? str2.equals(str) : str == null) {
/* 86 */                                    if (this.f2406f == c0179bg.f2406f) {
/* 88 */                                        xm1 xm1Var = c0179bg.f2407g;
/* 90 */                                        xm1 xm1Var2 = this.f2407g;
/* 92 */                                        if (xm1Var2 != null ? xm1Var2.equals(xm1Var) : xm1Var == null) {
/* 1 */                                             return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             long j = this.f2401a;
/* 13 */            int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
/* 15 */            Integer num = this.f2402b;
/* 26 */            int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
/* 27 */            long j2 = this.f2403c;
/* 42 */            int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2404d)) * 1000003;
/* 43 */            String str = this.f2405e;
/* 54 */            int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
/* 55 */            long j3 = this.f2406f;
/* 62 */            int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
/* 63 */            xm1 xm1Var = this.f2407g;
/* 72 */            return i2 ^ (xm1Var != null ? xm1Var.hashCode() : 0);
                }

                public final String toString() {
/* 82 */            return "LogEvent{eventTimeMs=" + this.f2401a + ", eventCode=" + this.f2402b + ", eventUptimeMs=" + this.f2403c + ", sourceExtension=" + Arrays.toString(this.f2404d) + ", sourceExtensionJsonProto3=" + this.f2405e + ", timezoneOffsetSeconds=" + this.f2406f + ", networkConnectionInfo=" + this.f2407g + "}";
                }
            }
