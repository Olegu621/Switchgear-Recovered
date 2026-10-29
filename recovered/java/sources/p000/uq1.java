            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class uq1 extends sq1 {
                @Override // p000.sq1, p000.qq1
                /* JADX INFO: renamed from: c */
                public Object mo7988c() {
/* 1 */             Object obj = this.f15707a;
/* 5 */             de3.m3024f(obj instanceof tq1);
/* 10 */            return ((tq1) obj).f17226a;
                }

                @Override // p000.sq1, p000.qq1
                /* JADX INFO: renamed from: d */
                public final String mo7989d() {
/* 1 */             return null;
                }

                @Override // p000.sq1, p000.qq1
                /* JADX INFO: renamed from: f */
                public void mo7991f(long j) {
/* 5 */             ((tq1) this.f15707a).f17227b = j;
                }

                @Override // p000.sq1, p000.qq1
                /* JADX INFO: renamed from: h */
                public final void mo7993h(String str) {
/* 7 */             ((OutputConfiguration) mo7988c()).setPhysicalCameraId(str);
                }
            }
