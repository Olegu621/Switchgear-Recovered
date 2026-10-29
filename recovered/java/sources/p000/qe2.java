            package p000;

            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qe2 {

                /* JADX INFO: renamed from: a */
                public final gl1 f15503a = new gl1();

                /* JADX INFO: renamed from: b */
                public final qc3 f15504b = new qc3(10);

                /* JADX INFO: renamed from: c */
                public final ts0 f15505c = new ts0(new pe2(2, null));

                public qe2(String str) {
                }

                /* JADX INFO: renamed from: a */
                public final Integer m7782a() {
/* 13 */            return new Integer(((AtomicInteger) this.f15504b.f15492b).get());
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
                
                    if (r8 == r1) goto L25;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0, types: [qe2] */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v6, types: [gl1] */
                /* JADX INFO: renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object m7783b(Function1 function1, d10 d10Var) {
                    ne2 ne2Var;
                    gl1 gl1Var;
                    gl1 gl1Var2;
                    dl1 dl1Var;
/* 3 */             if (d10Var instanceof ne2) {
/* 6 */                 ne2Var = (ne2) d10Var;
/* 8 */                 int i = ne2Var.f14213e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ne2Var.f14213e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ne2Var = new ne2(this, d10Var);
                        }
                    } else {
/* 22 */                ne2Var = new ne2(this, d10Var);
                    }
/* 25 */            Object objInvoke = ne2Var.f14211c;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = ne2Var.f14213e;
                    try {
/* 34 */                if (i2 == 0) {
/* 66 */                    pg3.m7417A(objInvoke);
/* 69 */                    ne2Var.f14209a = function1;
/* 71 */                    gl1Var = this.f15503a;
/* 73 */                    ne2Var.f14210b = gl1Var;
/* 75 */                    ne2Var.f14213e = 1;
/* 81 */                    if (gl1Var.m3967d(ne2Var) != z10Var) {
                            }
                            gl1Var2 = gl1Var;
/* 96 */                    return z10Var;
                        }
/* 36 */                if (i2 == 1) {
/* 56 */                    gl1 gl1Var3 = ne2Var.f14210b;
/* 60 */                    function1 = (Function1) ne2Var.f14209a;
/* 62 */                    pg3.m7417A(objInvoke);
                            gl1Var2 = gl1Var3;
                        } else {
/* 38 */                    if (i2 != 2) {
/* 52 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 42 */                    dl1 dl1Var2 = (dl1) ne2Var.f14209a;
/* 44 */                    pg3.m7417A(objInvoke);
                            dl1Var = dl1Var2;
                        }
/* 97 */                this = (gl1) dl1Var;
/* 99 */                this.m3970g(null);
/* 102 */               return objInvoke;
                        gl1Var2 = gl1Var;
/* 84 */                ne2Var.f14209a = gl1Var2;
/* 86 */                ne2Var.f14210b = null;
/* 88 */                ne2Var.f14213e = 2;
/* 90 */                objInvoke = function1.invoke(ne2Var);
                        dl1Var = gl1Var2;
                    } catch (Throwable th) {
/* 105 */               ((gl1) this).m3970g(null);
/* 108 */               throw th;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:24:0x0054  */
                /* JADX WARN: Code duplicated, block: B:29:0x005f  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX INFO: renamed from: c */
                public final Object m7784c(Function2 function2, d10 d10Var) {
                    oe2 oe2Var;
                    gl1 gl1Var;
                    boolean z;
                    Throwable th;
/* 3 */             if (d10Var instanceof oe2) {
/* 6 */                 oe2Var = (oe2) d10Var;
/* 8 */                 int i = oe2Var.f14726e;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oe2Var.f14726e = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oe2Var = new oe2(this, d10Var);
                        }
                    } else {
/* 22 */                oe2Var = new oe2(this, d10Var);
                    }
/* 25 */            Object obj = oe2Var.f14724c;
/* 27 */            Object obj2 = z10.f19902a;
/* 29 */            int i2 = oe2Var.f14726e;
/* 33 */            if (i2 != 0) {
/* 35 */                if (i2 != 1) {
/* 49 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                z = oe2Var.f14723b;
/* 39 */                gl1Var = oe2Var.f14722a;
                        try {
/* 41 */                    pg3.m7417A(obj);
/* 83 */                    if (z) {
/* 85 */                        gl1Var.m3970g(null);
                            }
/* 88 */                    return obj;
                        } catch (Throwable th2) {
/* 45 */                    th = th2;
/* 94 */                    if (z) {
/* 96 */                        gl1Var.m3970g(null);
                            }
/* 99 */                    throw th;
                        }
                    }
/* 53 */            pg3.m7417A(obj);
/* 56 */            gl1 gl1Var2 = this.f15503a;
/* 58 */            boolean zM3968e = gl1Var2.m3968e();
                    try {
/* 62 */                Object objValueOf = Boolean.valueOf(zM3968e);
/* 66 */                oe2Var.f14722a = gl1Var2;
/* 68 */                oe2Var.f14723b = zM3968e;
/* 70 */                oe2Var.f14726e = 1;
/* 72 */                Object objInvoke = function2.invoke(objValueOf, oe2Var);
/* 76 */                if (objInvoke == obj2) {
/* 78 */                    return obj2;
                        }
/* 80 */                gl1Var = gl1Var2;
/* 81 */                z = zM3968e;
/* 82 */                obj = objInvoke;
/* 83 */                if (z) {
/* 85 */                    gl1Var.m3970g(null);
                        }
/* 88 */                return obj;
                    } catch (Throwable th3) {
/* 91 */                gl1Var = gl1Var2;
/* 92 */                z = zM3968e;
/* 93 */                th = th3;
/* 94 */                if (z) {
/* 96 */                    gl1Var.m3970g(null);
                        }
/* 99 */                throw th;
                    }
                }
            }
