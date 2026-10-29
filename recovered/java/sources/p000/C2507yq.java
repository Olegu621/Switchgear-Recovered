            package p000;

            import java.util.concurrent.ScheduledFuture;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: renamed from: yq */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2507yq implements InterfaceC2560zq {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19750a;

                /* JADX INFO: renamed from: b */
                public final Object f19751b;

                public /* synthetic */ C2507yq(Object obj, int i) {
/* 1 */             this.f19750a = i;
/* 3 */             this.f19751b = obj;
                }

                @Override // p000.InterfaceC2560zq
                /* JADX INFO: renamed from: a */
                public final void mo1354a(Throwable th) {
/* 1 */             int i = this.f19750a;
/* 3 */             Object obj = this.f19751b;
                    switch (i) {
                        case 0:
/* 20 */                    if (th != null) {
/* 25 */                        ((ScheduledFuture) obj).cancel(false);
                            }
                            break;
                        case 1:
/* 16 */                    ((Function1) obj).invoke(th);
                            break;
                        default:
/* 10 */                    ((e90) obj).dispose();
                            break;
                    }
                }

                public final String toString() {
/* 1 */             int i = this.f19750a;
/* 5 */             Object obj = this.f19751b;
                    switch (i) {
                        case 0:
/* 85 */                    return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
                        case 1:
/* 65 */                    return "CancelHandler.UserSupplied[" + ((Function1) obj).getClass().getSimpleName() + '@' + k50.m5983t(this) + ']';
                        default:
/* 25 */                    return "DisposeOnCancel[" + ((e90) obj) + ']';
                    }
                }
            }
