            package p000;

            import java.util.HashMap;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: rf */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2142rf {

                /* JADX INFO: renamed from: a */
                public final String f16030a;

                /* JADX INFO: renamed from: b */
                public final Integer f16031b;

                /* JADX INFO: renamed from: c */
                public final sd0 f16032c;

                /* JADX INFO: renamed from: d */
                public final long f16033d;

                /* JADX INFO: renamed from: e */
                public final long f16034e;

                /* JADX INFO: renamed from: f */
                public final Map f16035f;

                public C2142rf(String str, Integer num, sd0 sd0Var, long j, long j2, HashMap map) {
/* 4 */             this.f16030a = str;
/* 6 */             this.f16031b = num;
/* 8 */             this.f16032c = sd0Var;
/* 10 */            this.f16033d = j;
/* 12 */            this.f16034e = j2;
/* 14 */            this.f16035f = map;
                }

                /* JADX INFO: renamed from: a */
                public final String m8152a(String str) {
/* 7 */             String str2 = (String) this.f16035f.get(str);
                    return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
                }

                /* JADX INFO: renamed from: b */
                public final int m8153b(String str) {
/* 7 */             String str2 = (String) this.f16035f.get(str);
/* 9 */             if (str2 == null) {
/* 11 */                return 0;
                    }
/* 17 */            return Integer.valueOf(str2).intValue();
                }

                /* JADX INFO: renamed from: c */
                public final xy1 m8154c() {
/* 3 */             xy1 xy1Var = new xy1();
/* 7 */             String str = this.f16030a;
/* 9 */             if (str == null) {
/* 57 */                C1951n4.m6868s("Null transportName");
/* 6 */                 return null;
                    }
/* 11 */            xy1Var.f19393a = str;
/* 15 */            xy1Var.f19394b = this.f16031b;
/* 17 */            sd0 sd0Var = this.f16032c;
/* 19 */            if (sd0Var == null) {
/* 51 */                C1951n4.m6868s("Null encodedPayload");
/* 6 */                 return null;
                    }
/* 21 */            xy1Var.f19395c = sd0Var;
/* 29 */            xy1Var.f19396d = Long.valueOf(this.f16033d);
/* 37 */            xy1Var.f19397e = Long.valueOf(this.f16034e);
/* 46 */            xy1Var.f19398f = new HashMap(this.f16035f);
/* 48 */            return xy1Var;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof C2142rf) {
/* 10 */                C2142rf c2142rf = (C2142rf) obj;
/* 20 */                if (this.f16030a.equals(c2142rf.f16030a)) {
/* 22 */                    Integer num = c2142rf.f16031b;
/* 24 */                    Integer num2 = this.f16031b;
/* 26 */                    if (num2 != null ? num2.equals(num) : num == null) {
/* 45 */                        if (this.f16032c.equals(c2142rf.f16032c) && this.f16033d == c2142rf.f16033d && this.f16034e == c2142rf.f16034e && this.f16035f.equals(c2142rf.f16035f)) {
/* 1 */                             return true;
                                }
                            }
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 11 */            int iHashCode = (this.f16030a.hashCode() ^ 1000003) * 1000003;
/* 12 */            Integer num = this.f16031b;
/* 31 */            int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f16032c.hashCode()) * 1000003;
/* 32 */            long j = this.f16033d;
/* 41 */            int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
/* 42 */            long j2 = this.f16034e;
/* 56 */            return this.f16035f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
                }

                public final String toString() {
/* 68 */            return "EventInternal{transportName=" + this.f16030a + ", code=" + this.f16031b + ", encodedPayload=" + this.f16032c + ", eventMillis=" + this.f16033d + ", uptimeMillis=" + this.f16034e + ", autoMetadata=" + this.f16035f + "}";
                }
            }
