            package p000;

            import kotlin.Unit;
            import kotlin.coroutines.AbstractC1844e;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class x80 {

                /* JADX INFO: renamed from: a */
                public final s10 f18988a;

                /* JADX INFO: renamed from: b */
                public final s10 f18989b;

                public x80(s10 s10Var, s10 s10Var2) {
/* 1 */             s10Var.getClass();
/* 4 */             s10Var2.getClass();
/* 15 */            this.f18988a = s10Var.mo1541k(1);
/* 21 */            this.f18989b = s10Var2.mo1541k(1);
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: a */
                public static final Object m9742a(x80 x80Var, Function2 function2, C0875ec c0875ec, d10 d10Var) throws Throwable {
                    w80 w80Var;
/* 3 */             if (d10Var instanceof w80) {
/* 6 */                 w80Var = (w80) d10Var;
/* 8 */                 int i = w80Var.f18478e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    w80Var.f18478e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    w80Var = new w80(x80Var, d10Var);
                        }
                    } else {
/* 22 */                w80Var = new w80(x80Var, d10Var);
                    }
/* 25 */            Object n42Var = w80Var.f18476c;
/* 27 */            Object obj = z10.f19902a;
/* 29 */            int i2 = w80Var.f18478e;
                    try {
/* 33 */                if (i2 == 0) {
/* 53 */                    pg3.m7417A(n42Var);
/* 60 */                    x80Var.f18989b.getClass();
/* 63 */                    Object y80Var = new y80();
/* 66 */                    m42 m42Var = o42.f14612b;
/* 68 */                    w80Var.f18474a = x80Var;
/* 70 */                    w80Var.f18475b = c0875ec;
/* 72 */                    w80Var.f18478e = 1;
/* 74 */                    n42Var = function2.invoke(y80Var, w80Var);
/* 78 */                    if (n42Var == obj) {
/* 80 */                        return obj;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 49 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    c0875ec = w80Var.f18475b;
/* 39 */                    x80Var = w80Var.f18474a;
/* 41 */                    pg3.m7417A(n42Var);
                        }
/* 81 */                m42 m42Var2 = o42.f14612b;
                    } catch (Throwable th) {
/* 84 */                m42 m42Var3 = o42.f14612b;
/* 88 */                n42Var = new n42(th);
                    }
/* 91 */            Throwable thM7099a = o42.m7099a(n42Var);
/* 95 */            x80Var.getClass();
/* 100 */           if (thM7099a instanceof AssertionError) {
/* 147 */               throw thM7099a;
                    }
/* 102 */           c0875ec.getClass();
/* 110 */           c0875ec.f7613b = new o42(n42Var);
/* 114 */           Function1 function1 = (Function1) c0875ec.f7614c;
/* 116 */           if (function1 != null) {
/* 118 */               c0875ec.f7614c = null;
/* 120 */               Throwable thM7099a2 = o42.m7099a(n42Var);
/* 124 */               if (thM7099a2 != null) {
/* 126 */                   function1.invoke(thM7099a2);
                        }
                    }
/* 131 */           Function1 function3 = (Function1) c0875ec.f7615d;
/* 133 */           if (function3 != null) {
/* 135 */               c0875ec.f7615d = null;
/* 139 */               if (!(n42Var instanceof n42)) {
/* 141 */                   function3.invoke(n42Var);
                        }
                    }
/* 144 */           return Unit.f12910a;
                }

                /* JADX INFO: renamed from: b */
                public final C0875ec m9743b(Function2 function2) {
/* 5 */             C0875ec c0875ec = new C0875ec(21);
/* 8 */             s10 s10Var = this.f18989b;
/* 10 */            s10Var.getClass();
/* 36 */            i13.m4443w(k50.m5964a(AbstractC1844e.m6215c(new pi2(), s10Var)), null, new C2562zs(this, function2, c0875ec, null, 3), 3);
/* 39 */            return c0875ec;
                }

                /* JADX INFO: renamed from: c */
                public final void m9744c(Function0 function0) {
/* 1 */             s10 s10Var = this.f18988a;
/* 3 */             s10Var.getClass();
/* 27 */            i13.m4443w(k50.m5964a(AbstractC1844e.m6215c(new pi2(), s10Var)), null, new t80(function0, null, 0), 3);
                }
            }
