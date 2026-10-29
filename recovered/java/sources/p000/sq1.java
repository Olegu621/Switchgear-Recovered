            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            import android.view.Surface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class sq1 extends qq1 {
                @Override // p000.qq1
                /* JADX INFO: renamed from: a */
                public final void mo7986a(Surface surface) {
/* 7 */             ((OutputConfiguration) mo7988c()).addSurface(surface);
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: b */
                public final void mo7987b() {
/* 7 */             ((OutputConfiguration) mo7988c()).enableSurfaceSharing();
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: c */
                public Object mo7988c() {
/* 1 */             Object obj = this.f15707a;
/* 5 */             de3.m3024f(obj instanceof rq1);
/* 10 */            return ((rq1) obj).f16229a;
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: d */
                public String mo7989d() {
/* 5 */             return ((rq1) this.f15707a).f16230b;
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: e */
                public final boolean mo7990e() {
/* 8 */             throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: f */
                public void mo7991f(long j) {
/* 5 */             ((rq1) this.f15707a).f16231c = j;
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: h */
                public void mo7993h(String str) {
/* 5 */             ((rq1) this.f15707a).f16230b = str;
                }
            }
