            package p000;

            import android.hardware.camera2.CameraCaptureSession;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.OutputConfiguration;
            import android.hardware.camera2.params.SessionConfiguration;
            import android.os.Build;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hb2 implements jb2 {

                /* JADX INFO: renamed from: a */
                public final SessionConfiguration f9000a;

                /* JADX INFO: renamed from: b */
                public final List f9001b;

                public hb2(ArrayList arrayList, y92 y92Var, C0851dp c0851dp) {
                    oq1 oq1Var;
/* 8 */             SessionConfiguration sessionConfiguration = new SessionConfiguration(0, kb2.m6075a(arrayList), y92Var, c0851dp);
/* 14 */            this.f9000a = sessionConfiguration;
/* 16 */            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
/* 26 */            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
/* 37 */            for (OutputConfiguration outputConfiguration : outputConfigurations) {
/* 45 */                if (outputConfiguration == null) {
/* 47 */                    oq1Var = null;
                        } else {
/* 49 */                    int i = Build.VERSION.SDK_INT;
/* 103 */                   oq1Var = new oq1(i >= 33 ? new vq1(outputConfiguration) : i >= 28 ? new uq1(new tq1(outputConfiguration)) : i >= 26 ? new sq1(new rq1(outputConfiguration)) : new qq1(new pq1(outputConfiguration)));
                        }
/* 106 */               arrayList2.add(oq1Var);
                    }
/* 114 */           this.f9001b = Collections.unmodifiableList(arrayList2);
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: a */
                public final Object mo4150a() {
/* 1 */             return this.f9000a;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: b */
                public final by0 mo4151b() {
/* 7 */             return by0.m1468a(this.f9000a.getInputConfiguration());
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: c */
                public final Executor mo4152c() {
/* 3 */             return this.f9000a.getExecutor();
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: d */
                public final int mo4153d() {
/* 3 */             return this.f9000a.getSessionType();
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: e */
                public final CameraCaptureSession.StateCallback mo4154e() {
/* 3 */             return this.f9000a.getStateCallback();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof hb2) {
/* 13 */                return Objects.equals(this.f9000a, ((hb2) obj).f9000a);
                    }
/* 5 */             return false;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: f */
                public final List mo4155f() {
/* 1 */             return this.f9001b;
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: g */
                public final void mo4156g(CaptureRequest captureRequest) {
/* 3 */             this.f9000a.setSessionParameters(captureRequest);
                }

                @Override // p000.jb2
                /* JADX INFO: renamed from: h */
                public final void mo4157h(by0 by0Var) {
/* 7 */             this.f9000a.setInputConfiguration(by0Var.f2634a.f20364a);
                }

                public final int hashCode() {
/* 3 */             return this.f9000a.hashCode();
                }
            }
