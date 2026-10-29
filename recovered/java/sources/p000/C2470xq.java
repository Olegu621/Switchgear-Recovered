            package p000;

            import android.os.Handler;
            import java.util.concurrent.Executor;
            
            /* JADX INFO: renamed from: xq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2470xq implements rm2 {

                /* JADX INFO: renamed from: a */
                public final nq1 f19321a;

                /* JADX INFO: renamed from: b */
                public static final C1888lf f19313b = new C1888lf("camerax.core.appConfig.cameraFactoryProvider", C0887eo.class, null);

                /* JADX INFO: renamed from: c */
                public static final C1888lf f19314c = new C1888lf("camerax.core.appConfig.deviceSurfaceManagerProvider", C0924fo.class, null);

                /* JADX INFO: renamed from: d */
                public static final C1888lf f19315d = new C1888lf("camerax.core.appConfig.useCaseConfigFactoryProvider", C0961go.class, null);

                /* JADX INFO: renamed from: e */
                public static final C1888lf f19316e = new C1888lf("camerax.core.appConfig.cameraExecutor", Executor.class, null);

                /* JADX INFO: renamed from: f */
                public static final C1888lf f19317f = new C1888lf("camerax.core.appConfig.schedulerHandler", Handler.class, null);

                /* JADX INFO: renamed from: i */
                public static final C1888lf f19318i = new C1888lf("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

                /* JADX INFO: renamed from: v */
                public static final C1888lf f19319v = new C1888lf("camerax.core.appConfig.availableCamerasLimiter", C1802jq.class, null);

                /* JADX INFO: renamed from: w */
                public static final C1888lf f19320w = new C1888lf("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);

                /* JADX INFO: renamed from: U */
                public static final C1888lf f19311U = new C1888lf("camerax.core.appConfig.cameraProviderInitRetryPolicy", y42.class, null);

                /* JADX INFO: renamed from: V */
                public static final C1888lf f19312V = new C1888lf("camerax.core.appConfig.quirksSettings", i02.class, null);

                public C2470xq(nq1 nq1Var) {
/* 4 */             this.f19321a = nq1Var;
                }

                /* JADX INFO: renamed from: d */
                public final C1802jq m10014d() {
                    Object objMo7025e;
                    try {
/* 5 */                 objMo7025e = this.f19321a.mo7025e(f19319v);
                    } catch (IllegalArgumentException unused) {
/* 10 */                objMo7025e = null;
                    }
/* 11 */            return (C1802jq) objMo7025e;
                }

                /* JADX INFO: renamed from: j */
                public final C0887eo m10015j() {
                    Object objMo7025e;
                    try {
/* 5 */                 objMo7025e = this.f19321a.mo7025e(f19313b);
                    } catch (IllegalArgumentException unused) {
/* 10 */                objMo7025e = null;
                    }
/* 11 */            return (C0887eo) objMo7025e;
                }

                @Override // p000.x02
                /* JADX INFO: renamed from: k */
                public final InterfaceC2235ty mo1174k() {
/* 1 */             return this.f19321a;
                }

                /* JADX INFO: renamed from: m */
                public final long m10016m() {
/* 7 */             Object objMo7025e = -1L;
                    try {
/* 11 */                objMo7025e = this.f19321a.mo7025e(f19320w);
                    } catch (IllegalArgumentException unused) {
                    }
/* 17 */            return ((Long) objMo7025e).longValue();
                }

                /* JADX INFO: renamed from: o */
                public final C0924fo m10017o() {
                    Object objMo7025e;
                    try {
/* 5 */                 objMo7025e = this.f19321a.mo7025e(f19314c);
                    } catch (IllegalArgumentException unused) {
/* 10 */                objMo7025e = null;
                    }
/* 11 */            return (C0924fo) objMo7025e;
                }

                /* JADX INFO: renamed from: p */
                public final C0961go m10018p() {
                    Object objMo7025e;
                    try {
/* 5 */                 objMo7025e = this.f19321a.mo7025e(f19315d);
                    } catch (IllegalArgumentException unused) {
/* 10 */                objMo7025e = null;
                    }
/* 11 */            return (C0961go) objMo7025e;
                }
            }
