            package p000;

            import android.os.Looper;
            import android.os.Message;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.internal.base.zau;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nb3 extends zau {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ rb3 f14178a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public nb3(rb3 rb3Var, Looper looper) {
/* 3 */             super(looper);
/* 1 */             this.f14178a = rb3Var;
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
/* 1 */             int i = message.what;
/* 3 */             if (i != 0) {
/* 6 */                 if (i == 1) {
/* 30 */                    RuntimeException runtimeException = (RuntimeException) message.obj;
/* 48 */                    AbstractC1245n0.m4876d("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
/* 51 */                    throw runtimeException;
                        }
/* 24 */                AbstractC1245n0.m4876d("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i);
/* 27 */                return;
                    }
/* 54 */            sr1 sr1Var = (sr1) message.obj;
                    synchronized (this.f14178a.f15967b) {
                        try {
/* 63 */                    rb3 rb3Var = this.f14178a.f15966a;
/* 65 */                    kb1.m6061n(rb3Var);
/* 68 */                    if (sr1Var == null) {
/* 80 */                        rb3Var.m8130a(new Status(13, "Transform returned null", null, null));
                            }
                        } catch (Throwable th) {
/* 96 */                    throw th;
                        }
                    }
                }
            }
