            package com.quago.mobile.sdk;

            import java.util.HashMap;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.a1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 5 */     public final class C0714a1 {

                /* JADX INFO: renamed from: a */
                public final String f5346a;

                /* JADX INFO: renamed from: b */
                public final String f5347b;

                /* JADX INFO: renamed from: c */
                public final HashMap f5348c;

                /* JADX INFO: renamed from: d */
                public long f5349d;

                /* JADX INFO: renamed from: e */
                public long f5350e;

                /* JADX INFO: renamed from: f */
                public long f5351f;

                /* JADX INFO: renamed from: g */
                public long f5352g;

                /* JADX INFO: renamed from: h */
                public final C0754p0 f5353h;

                /* JADX INFO: renamed from: i */
                public final C0732g1 f5354i;

                /* JADX INFO: renamed from: j */
                public String f5355j;

                /* JADX INFO: renamed from: k */
                public String f5356k;

                /* JADX INFO: renamed from: l */
                public int f5357l;

                /* JADX INFO: renamed from: m */
                public int f5358m;

                /* JADX INFO: renamed from: n */
                public boolean f5359n;

                public C0714a1(String str, String str2, String str3, C0754p0 c0754p0, C0732g1 c0732g1) {
/* 5 */             this.f5359n = false;
/* 7 */             this.f5346a = str;
/* 9 */             this.f5355j = str2;
/* 11 */            this.f5347b = str3;
/* 13 */            this.f5353h = c0754p0;
/* 20 */            this.f5348c = new HashMap();
/* 22 */            this.f5354i = c0732g1;
                }

                /* JADX INFO: renamed from: a */
                public final void m2546a(String str, String str2) {
/* 3 */             this.f5348c.put(str, str2);
                }

                public final String toString() {
/* 68 */            return "QuagoSegment{name='" + this.f5346a + "', mapKeyValues=" + this.f5348c + ", startTime=" + this.f5349d + ", endTime=" + this.f5350e + ", uptimeStart=" + this.f5351f + ", uptimeEnd=" + this.f5352g + '}';
                }

                /* JADX INFO: renamed from: a */
/* 6 */         public final String m2544a() {
/* 7 */             return this.f5346a;
                }

                /* JADX INFO: renamed from: a */
/* 7 */         public final void m2545a(long j, long j2) {
/* 8 */             this.f5349d = j;
/* 9 */             this.f5351f = j2;
                }

/* 24 */        public C0714a1(String str, C0754p0 c0754p0, C0732g1 c0732g1) {
/* 25 */            this("INIT", null, str, c0754p0, c0732g1);
                }
            }
