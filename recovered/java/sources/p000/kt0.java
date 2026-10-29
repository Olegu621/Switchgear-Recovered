            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import java.util.concurrent.CancellationException;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class kt0 extends s10 implements g70 {

                /* JADX INFO: renamed from: c */
                public final Handler f13000c;

                /* JADX INFO: renamed from: d */
                public final boolean f13001d;

                /* JADX INFO: renamed from: e */
                public final kt0 f13002e;

                public kt0(Handler handler, boolean z) {
/* 4 */             this.f13000c = handler;
/* 6 */             this.f13001d = z;
/* 18 */            this.f13002e = z ? this : new kt0(handler, true);
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: c */
                public final e90 mo3417c(long j, final mo2 mo2Var, CoroutineContext coroutineContext) {
/* 8 */             if (j > 4611686018427387903L) {
/* 10 */                j = 4611686018427387903L;
                    }
/* 17 */            if (this.f13000c.postDelayed(mo2Var, j)) {
/* 21 */                return new e90() { // from class: jt0
                            @Override // p000.e90
                            public final void dispose() {
/* 7 */                         this.f12476a.f13000c.removeCallbacks(mo2Var);
                            }
                        };
                    }
/* 25 */            m6282l(coroutineContext, mo2Var);
/* 28 */            return rn1.f16198a;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof kt0)) {
/* 21 */                return false;
                    }
/* 5 */             kt0 kt0Var = (kt0) obj;
                    return kt0Var.f13000c == this.f13000c && kt0Var.f13001d == this.f13001d;
                }

                @Override // p000.g70
                /* JADX INFO: renamed from: f */
                public final void mo3418f(long j, C0890er c0890er) {
/* 5 */             cp0 cp0Var = new cp0(11, c0890er, this);
/* 15 */            if (j > 4611686018427387903L) {
/* 17 */                j = 4611686018427387903L;
                    }
/* 24 */            if (this.f13000c.postDelayed(cp0Var, j)) {
/* 32 */                c0890er.m3573w(new C1996oc(5, this, cp0Var));
                    } else {
/* 38 */                m6282l(c0890er.f7845e, cp0Var);
                    }
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: g */
                public final void mo1539g(CoroutineContext coroutineContext, Runnable runnable) {
/* 7 */             if (this.f13000c.post(runnable)) {
/* 12 */                return;
                    }
/* 9 */             m6282l(coroutineContext, runnable);
                }

                public final int hashCode() {
/* 16 */            return (this.f13001d ? 1231 : 1237) ^ System.identityHashCode(this.f13000c);
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: i */
                public final boolean mo6281i() {
                    return (this.f13001d && Intrinsics.m6216a(Looper.myLooper(), this.f13000c.getLooper())) ? false : true;
                }

                @Override // p000.s10
                /* JADX INFO: renamed from: k */
                public final s10 mo1541k(int i) {
/* 2 */             j13.m5643c(1);
/* 5 */             return this;
                }

                /* JADX INFO: renamed from: l */
                public final void m6282l(CoroutineContext coroutineContext, Runnable runnable) {
/* 22 */            CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
/* 31 */            h01 h01Var = (h01) coroutineContext.get(xt0.f19368w);
/* 33 */            if (h01Var != null) {
/* 35 */                h01Var.cancel(cancellationException);
                    }
/* 40 */            z80.f19977c.mo1539g(coroutineContext, runnable);
                }

                @Override // p000.s10
                public final String toString() {
                    kt0 kt0Var;
                    String str;
/* 1 */             m60 m60Var = z80.f19975a;
/* 3 */             kt0 kt0Var2 = gb1.f8531a;
/* 5 */             if (this == kt0Var2) {
/* 7 */                 str = "Dispatchers.Main";
                    } else {
                        try {
/* 11 */                    kt0Var = kt0Var2.f13002e;
                        } catch (UnsupportedOperationException unused) {
/* 14 */                    kt0Var = null;
                        }
/* 20 */                str = this == kt0Var ? "Dispatchers.Main.immediate" : null;
                    }
/* 21 */            if (str != null) {
/* 40 */                return str;
                    }
/* 25 */            String string = this.f13000c.toString();
                    return this.f13001d ? fm0.m3783i(string, ".immediate") : string;
                }
            }
