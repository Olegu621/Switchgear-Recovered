            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            import android.view.Surface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class qq1 {

                /* JADX INFO: renamed from: a */
                public final Object f15707a;

                public qq1(Object obj) {
/* 4 */             this.f15707a = obj;
                }

                /* JADX INFO: renamed from: a */
                public void mo7986a(Surface surface) {
/* 11 */            if (((OutputConfiguration) mo7988c()).getSurface() == surface) {
/* 42 */                throw new IllegalStateException("Surface is already added!");
                    }
/* 17 */            if (!mo7990e()) {
/* 26 */                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
                    }
/* 34 */            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
                }

                /* JADX INFO: renamed from: b */
                public void mo7987b() {
/* 6 */             ((pq1) this.f15707a).f15249c = true;
                }

                /* JADX INFO: renamed from: c */
                public Object mo7988c() {
/* 1 */             Object obj = this.f15707a;
/* 5 */             de3.m3024f(obj instanceof pq1);
/* 10 */            return ((pq1) obj).f15247a;
                }

                /* JADX INFO: renamed from: d */
                public String mo7989d() {
/* 5 */             return ((pq1) this.f15707a).f15248b;
                }

                /* JADX INFO: renamed from: e */
                public boolean mo7990e() {
/* 5 */             return ((pq1) this.f15707a).f15249c;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof qq1)) {
/* 5 */                 return false;
                    }
/* 13 */            return this.f15707a.equals(((qq1) obj).f15707a);
                }

                /* JADX INFO: renamed from: f */
                public void mo7991f(long j) {
/* 5 */             ((pq1) this.f15707a).f15250d = j;
                }

                /* JADX INFO: renamed from: g */
                public void mo7992g(int i) {
                }

                /* JADX INFO: renamed from: h */
                public void mo7993h(String str) {
/* 5 */             ((pq1) this.f15707a).f15248b = str;
                }

                public final int hashCode() {
/* 3 */             return this.f15707a.hashCode();
                }

                /* JADX INFO: renamed from: i */
                public void mo7994i(long j) {
                }
            }
