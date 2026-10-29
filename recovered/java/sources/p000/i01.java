            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class i01 extends CancellationException {

                /* JADX INFO: renamed from: a */
                public final transient h01 f9383a;

                public i01(String str, Throwable th, h01 h01Var) {
/* 1 */             super(str);
/* 4 */             this.f9383a = h01Var;
/* 6 */             if (th != null) {
/* 8 */                 initCause(th);
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 50 */                return true;
                    }
/* 5 */             if (!(obj instanceof i01)) {
/* 48 */                return false;
                    }
/* 7 */             i01 i01Var = (i01) obj;
                    return Intrinsics.m6216a(i01Var.getMessage(), getMessage()) && Intrinsics.m6216a(i01Var.f9383a, this.f9383a) && Intrinsics.m6216a(i01Var.getCause(), getCause());
                }

                @Override // java.lang.Throwable
                public final Throwable fillInStackTrace() {
/* 4 */             setStackTrace(new StackTraceElement[0]);
/* 7 */             return this;
                }

                public final int hashCode() {
/* 1 */             String message = getMessage();
/* 5 */             message.getClass();
/* 21 */            int iHashCode = (this.f9383a.hashCode() + (message.hashCode() * 31)) * 31;
/* 23 */            Throwable cause = getCause();
/* 35 */            return iHashCode + (cause != null ? cause.hashCode() : 0);
                }

                @Override // java.lang.Throwable
                public final String toString() {
/* 23 */            return super.toString() + "; job=" + this.f9383a;
                }
            }
