            package p000;

            import io.sentry.util.AbstractC1703b;
            import java.util.ArrayList;
            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            /* JADX INFO: renamed from: ah */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C0019ah extends o01 {

                /* JADX INFO: renamed from: V */
                public static final /* synthetic */ AtomicReferenceFieldUpdater f251V = AtomicReferenceFieldUpdater.newUpdater(C0019ah.class, Object.class, "_disposer$volatile");

                /* JADX INFO: renamed from: W */
                public static final /* synthetic */ long f252W = AbstractC1703b.f11726a.objectFieldOffset(C0019ah.class.getDeclaredField("_disposer$volatile"));

                /* JADX INFO: renamed from: U */
                public final /* synthetic */ C0216ch f253U;
                private volatile /* synthetic */ Object _disposer$volatile;

                /* JADX INFO: renamed from: v */
                public final C0890er f254v;

                /* JADX INFO: renamed from: w */
                public e90 f255w;

                public C0019ah(C0216ch c0216ch, C0890er c0890er) {
/* 1 */             this.f253U = c0216ch;
/* 6 */             this.f254v = c0890er;
                }

                @Override // p000.hz0
                /* JADX INFO: renamed from: a */
                public final void mo277a(Throwable th) {
/* 1 */             C0890er c0890er = this.f254v;
/* 3 */             if (th != null) {
/* 5 */                 C2131r4 c2131r4M3555H = c0890er.m3555H(th);
/* 9 */                 if (c2131r4M3555H != null) {
/* 11 */                    c0890er.mo3180f(c2131r4M3555H);
/* 14 */                    C0180bh c0180bhM278p = m278p();
/* 18 */                    if (c0180bhM278p != null) {
/* 20 */                        c0180bhM278p.m1355b();
/* 23 */                        return;
                            }
/* 63 */                    return;
                        }
/* 63 */                return;
                    }
/* 24 */            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0216ch.f2916b;
/* 26 */            C0216ch c0216ch = this.f253U;
/* 32 */            if (atomicIntegerFieldUpdater.decrementAndGet(c0216ch) == 0) {
/* 34 */                e70[] e70VarArr = c0216ch.f2917a;
/* 39 */                ArrayList arrayList = new ArrayList(e70VarArr.length);
/* 44 */                for (e70 e70Var : e70VarArr) {
/* 52 */                    arrayList.add(e70Var.getCompleted());
                        }
/* 58 */                m42 m42Var = o42.f14612b;
/* 60 */                c0890er.resumeWith(arrayList);
                    }
                }

                /* JADX INFO: renamed from: p */
                public final C0180bh m278p() {
/* 3 */             f251V.getClass();
/* 14 */            return (C0180bh) AbstractC1703b.f11726a.getObjectVolatile(this, f252W);
                }

                /* JADX INFO: renamed from: q */
                public final void m279q(C0180bh c0180bh) {
/* 3 */             f251V.getClass();
/* 10 */            AbstractC1703b.f11726a.putObjectVolatile(this, f252W, c0180bh);
                }
            }
