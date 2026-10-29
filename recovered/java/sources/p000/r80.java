            package p000;

            import java.util.concurrent.CancellationException;
            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class r80 extends sm2 {

                /* JADX INFO: renamed from: c */
                public int f15912c;

                public r80(int i) {
/* 5 */             super(0L, ym2.f19705g);
/* 8 */             this.f15912c = i;
                }

                /* JADX INFO: renamed from: c */
                public abstract void mo3556c(Object obj, CancellationException cancellationException);

                /* JADX INFO: renamed from: e */
                public abstract c10 mo3557e();

                /* JADX INFO: renamed from: g */
                public Throwable mo3558g(Object obj) {
/* 9 */             C1980nx c1980nx = obj instanceof C1980nx ? (C1980nx) obj : null;
/* 10 */            if (c1980nx != null) {
/* 12 */                return c1980nx.f14555a;
                    }
/* 3 */             return null;
                }

                /* JADX INFO: renamed from: h */
                public Object mo3559h(Object obj) {
/* 1 */             return obj;
                }

                /* JADX INFO: renamed from: i */
                public final void m8080i(Throwable th, Throwable th2) {
/* 1 */             if (th == null && th2 == null) {
/* 5 */                 return;
                    }
/* 6 */             if (th != null && th2 != null) {
/* 10 */                jf0.m5798a(th, th2);
                    }
/* 13 */            if (th == null) {
/* 15 */                th = th2;
                    }
/* 37 */            th.getClass();
/* 51 */            b40.m1231o(new c20("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo3557e().getContext());
                }

                /* JADX INFO: renamed from: j */
                public abstract Object mo3560j();

                /* JADX WARN: Code duplicated, block: B:22:0x004a  */
                @Override // java.lang.Runnable
                public final void run() {
                    Object n42Var;
                    h01 h01Var;
                    Object n42Var2;
/* 1 */             vm2 vm2Var = this.f16707b;
                    try {
/* 3 */                 c10 c10VarMo3557e = mo3557e();
/* 7 */                 c10VarMo3557e.getClass();
/* 10 */                p80 p80Var = (p80) c10VarMo3557e;
/* 12 */                d10 d10Var = p80Var.f15020e;
/* 14 */                Object obj = p80Var.f15022i;
/* 16 */                CoroutineContext context = d10Var.getContext();
/* 20 */                Object objM1741c = co2.m1741c(context, obj);
/* 37 */                kx2 kx2VarM5638C = objM1741c != co2.f3022a ? j13.m5638C(d10Var, context, objM1741c) : null;
                        try {
/* 38 */                    CoroutineContext context2 = d10Var.getContext();
/* 42 */                    Object objMo3560j = mo3560j();
/* 46 */                    Throwable thMo3558g = mo3558g(objMo3560j);
/* 50 */                    if (thMo3558g == null) {
/* 52 */                        int i = this.f15912c;
/* 54 */                        boolean z = true;
/* 55 */                        if (i != 1 && i != 2) {
/* 61 */                            z = false;
                                }
/* 62 */                        if (z) {
/* 70 */                            h01Var = (h01) context2.get(xt0.f19368w);
                                } else {
/* 75 */                            h01Var = null;
                                }
                            } else {
/* 75 */                        h01Var = null;
                            }
/* 76 */                    if (h01Var != null && !h01Var.isActive()) {
/* 84 */                        CancellationException cancellationException = h01Var.getCancellationException();
/* 88 */                        mo3556c(objMo3560j, cancellationException);
/* 91 */                        m42 m42Var = o42.f14612b;
/* 97 */                        d10Var.resumeWith(pg3.m7426e(cancellationException));
                            } else if (thMo3558g != null) {
/* 103 */                       m42 m42Var2 = o42.f14612b;
/* 110 */                       d10Var.resumeWith(new n42(thMo3558g));
                            } else {
/* 114 */                       m42 m42Var3 = o42.f14612b;
/* 120 */                       d10Var.resumeWith(mo3559h(objMo3560j));
                            }
/* 123 */                   if (kx2VarM5638C == null || kx2VarM5638C.m6305X()) {
/* 131 */                       co2.m1739a(context, objM1741c);
                            }
                            try {
/* 134 */                       vm2Var.getClass();
/* 137 */                       n42Var2 = Unit.f12910a;
                            } catch (Throwable th) {
/* 141 */                       m42 m42Var4 = o42.f14612b;
/* 145 */                       n42Var2 = new n42(th);
                            }
/* 153 */                   m8080i(null, o42.m7099a(n42Var2));
                        } catch (Throwable th2) {
/* 157 */                   if (kx2VarM5638C == null || kx2VarM5638C.m6305X()) {
/* 165 */                       co2.m1739a(context, objM1741c);
                            }
/* 168 */                   throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
/* 169 */                   m42 m42Var5 = o42.f14612b;
/* 171 */                   vm2Var.getClass();
/* 174 */                   n42Var = Unit.f12910a;
                        } catch (Throwable th4) {
/* 178 */                   m42 m42Var6 = o42.f14612b;
/* 182 */                   n42Var = new n42(th4);
                        }
/* 190 */               m8080i(th3, o42.m7099a(n42Var));
                    }
                }
            }
