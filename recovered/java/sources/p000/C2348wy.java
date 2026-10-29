            package p000;

            import kotlin.Unit;
            
            /* JADX INFO: renamed from: wy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2348wy extends C2554zk {

                /* JADX INFO: renamed from: a0 */
                public final EnumC2464xk f18855a0;

                public C2348wy(int i, EnumC2464xk enumC2464xk) {
/* 1 */             super(i);
/* 4 */             this.f18855a0 = enumC2464xk;
/* 8 */             if (enumC2464xk != EnumC2464xk.f19232a) {
/* 11 */                if (i >= 1) {
/* 13 */                    return;
                        }
/* 22 */                ds0.m3200q(AbstractC0886en.m3505i(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
/* 26 */                throw null;
                    }
/* 65 */            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + j22.m5667a(C2554zk.class).m3242b() + " instead").toString());
                }

                /* JADX INFO: renamed from: L */
                public final Object m9651L(Object obj, boolean z) {
/* 5 */             if (this.f18855a0 != EnumC2464xk.f19234c) {
/* 23 */                return m10377H(obj);
                    }
/* 7 */             Object objMo6629e = super.mo6629e(obj);
                    return (!(objMo6629e instanceof C0892et) || (objMo6629e instanceof C0855dt)) ? objMo6629e : Unit.f12910a;
                }

                @Override // p000.C2554zk, p000.m92
                /* JADX INFO: renamed from: a */
                public final Object mo6628a(c10 c10Var, Object obj) throws Throwable {
/* 8 */             if (m9651L(obj, true) instanceof C0855dt) {
/* 17 */                throw m10392p();
                    }
/* 10 */            return Unit.f12910a;
                }

                @Override // p000.C2554zk, p000.m92
                /* JADX INFO: renamed from: e */
                public final Object mo6629e(Object obj) {
/* 2 */             return m9651L(obj, false);
                }

                @Override // p000.C2554zk
                /* JADX INFO: renamed from: x */
                public final boolean mo9652x() {
                    return this.f18855a0 == EnumC2464xk.f19233b;
                }
            }
