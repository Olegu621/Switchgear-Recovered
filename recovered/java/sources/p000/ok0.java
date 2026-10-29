            package p000;

            import java.io.IOException;
            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 24 */    public final class ok0 implements hk0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14784a = 0;

                /* JADX INFO: renamed from: b */
                public final Object f14785b;

                /* JADX INFO: renamed from: c */
                public final Object f14786c;

                /* JADX INFO: renamed from: d */
                public final tj2 f14787d;

                public ok0(hk0 hk0Var, CoroutineContext coroutineContext) {
/* 7 */             this.f14785b = coroutineContext;
/* 13 */            this.f14786c = co2.m1740b(coroutineContext);
/* 23 */            this.f14787d = new C2223tm(hk0Var, null, 10);
                }

                /* JADX WARN: Code duplicated, block: B:14:0x002e  */
                /* JADX WARN: Code duplicated, block: B:35:0x0087  */
                /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
                @Override // p000.hk0
                public final Object emit(Object obj, c10 c10Var) throws IOException {
                    nk0 nk0Var;
                    hk0 hk0Var;
/* 1 */             int i = this.f14784a;
/* 3 */             tj2 tj2Var = this.f14787d;
/* 5 */             Object obj2 = this.f14786c;
/* 7 */             Object obj3 = this.f14785b;
                    switch (i) {
                        case 0:
/* 30 */                    if (c10Var instanceof nk0) {
/* 33 */                        nk0Var = (nk0) c10Var;
/* 35 */                        int i2 = nk0Var.f14331e;
/* 41 */                        if ((i2 & Integer.MIN_VALUE) != 0) {
/* 44 */                            nk0Var.f14331e = i2 - Integer.MIN_VALUE;
                                } else {
/* 49 */                            nk0Var = new nk0(this, c10Var);
                                }
                            } else {
/* 49 */                        nk0Var = new nk0(this, c10Var);
                            }
/* 52 */                    Object objInvoke = nk0Var.f14329c;
/* 54 */                    z10 z10Var = z10.f19902a;
/* 56 */                    int i3 = nk0Var.f14331e;
/* 62 */                    if (i3 != 0) {
/* 64 */                        if (i3 != 1) {
/* 66 */                            if (i3 == 2) {
/* 78 */                                obj = nk0Var.f14328b;
/* 80 */                                this = nk0Var.f14327a;
/* 82 */                                pg3.m7417A(objInvoke);
/* 134 */                               if (!((Boolean) objInvoke).booleanValue()) {
/* 140 */                                   ((e22) this.f14785b).f7490a = true;
/* 144 */                                   hk0Var = (hk0) this.f14786c;
/* 146 */                                   nk0Var.f14327a = null;
/* 148 */                                   nk0Var.f14328b = null;
/* 150 */                                   nk0Var.f14331e = 3;
/* 156 */                                   if (hk0Var.emit(obj, nk0Var) == z10Var) {
/* 158 */                                       return z10Var;
                                            }
                                        }
                                    } else if (i3 != 3) {
/* 73 */                                f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 58 */                                return null;
                                    }
                                }
/* 86 */                        pg3.m7417A(objInvoke);
                            } else {
/* 90 */                        pg3.m7417A(objInvoke);
/* 97 */                        if (((e22) obj3).f7490a) {
/* 101 */                           nk0Var.f14331e = 1;
/* 107 */                           if (((hk0) obj2).emit(obj, nk0Var) == z10Var) {
/* 158 */                               return z10Var;
                                    }
                                } else {
/* 115 */                           nk0Var.f14327a = this;
/* 117 */                           nk0Var.f14328b = obj;
/* 119 */                           nk0Var.f14331e = 2;
/* 121 */                           objInvoke = ((C2107qh) tj2Var).invoke(obj, nk0Var);
/* 125 */                           if (objInvoke == z10Var) {
/* 158 */                               return z10Var;
                                    }
/* 134 */                           if (!((Boolean) objInvoke).booleanValue()) {
/* 140 */                               ((e22) this.f14785b).f7490a = true;
/* 144 */                               hk0Var = (hk0) this.f14786c;
/* 146 */                               nk0Var.f14327a = null;
/* 148 */                               nk0Var.f14328b = null;
/* 150 */                               nk0Var.f14331e = 3;
/* 156 */                               if (hk0Var.emit(obj, nk0Var) == z10Var) {
/* 158 */                                   return z10Var;
                                        }
                                    }
                                }
                            }
/* 110 */                   return Unit.f12910a;
                        default:
/* 16 */                    Object objM5959M = k50.m5959M((CoroutineContext) obj3, obj, obj2, (C2223tm) tj2Var, c10Var);
                            return objM5959M == z10.f19902a ? objM5959M : Unit.f12910a;
                    }
                }

/* 25 */        public ok0(e22 e22Var, hk0 hk0Var, C2107qh c2107qh) {
                    this.f14785b = e22Var;
                    this.f14786c = hk0Var;
                    this.f14787d = c2107qh;
                }
            }
