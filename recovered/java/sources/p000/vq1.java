            package p000;

            import android.hardware.camera2.params.OutputConfiguration;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vq1 extends uq1 {
                @Override // p000.uq1, p000.sq1, p000.qq1
                /* JADX INFO: renamed from: c */
                public final Object mo7988c() {
/* 1 */             Object obj = this.f15707a;
/* 5 */             de3.m3024f(obj instanceof OutputConfiguration);
/* 8 */             return obj;
                }

                @Override // p000.uq1, p000.sq1, p000.qq1
                /* JADX INFO: renamed from: f */
                public final void mo7991f(long j) {
/* 7 */             ((OutputConfiguration) mo7988c()).setDynamicRangeProfile(j);
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: g */
                public final void mo7992g(int i) {
/* 7 */             ((OutputConfiguration) mo7988c()).setMirrorMode(i);
                }

                @Override // p000.qq1
                /* JADX INFO: renamed from: i */
                public final void mo7994i(long j) {
/* 5 */             if (j == -1) {
/* 7 */                 return;
                    }
/* 14 */            ((OutputConfiguration) mo7988c()).setStreamUseCase(j);
                }
            }
