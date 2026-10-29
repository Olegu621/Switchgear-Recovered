            package p000;

            import kotlin.Unit;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class lk0 implements fk0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ d52 f13339a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ o40 f13340b;

                public lk0(d52 d52Var, o40 o40Var) {
/* 4 */             this.f13339a = d52Var;
/* 6 */             this.f13340b = o40Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p000.fk0
                public final Object collect(hk0 hk0Var, c10 c10Var) throws Throwable {
                    kk0 kk0Var;
                    w52 w52Var;
                    w52 w52Var2;
/* 3 */             if (c10Var instanceof kk0) {
/* 6 */                 kk0Var = (kk0) c10Var;
/* 8 */                 int i = kk0Var.f12835b;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    kk0Var.f12835b = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    kk0Var = new kk0(this, c10Var);
                        }
                    } else {
/* 22 */                kk0Var = new kk0(this, c10Var);
                    }
/* 25 */            Object obj = kk0Var.f12834a;
/* 27 */            z10 z10Var = z10.f19902a;
/* 29 */            int i2 = kk0Var.f12835b;
                    try {
                        try {
/* 35 */                    if (i2 == 0) {
/* 82 */                        pg3.m7417A(obj);
/* 85 */                        d52 d52Var = this.f13339a;
/* 87 */                        kk0Var.f12837d = this;
/* 89 */                        kk0Var.f12838e = hk0Var;
/* 91 */                        kk0Var.f12835b = 1;
/* 97 */                        if (d52Var.collect(hk0Var, kk0Var) != z10Var) {
                                }
/* 156 */                       return z10Var;
                            }
/* 37 */                    if (i2 != 1) {
/* 39 */                        if (i2 == 2) {
/* 61 */                            Throwable th = (Throwable) kk0Var.f12837d;
/* 63 */                            pg3.m7417A(obj);
/* 157 */                           throw th;
                                }
/* 41 */                        if (i2 != 3) {
/* 55 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 34 */                            return null;
                                }
/* 45 */                        w52Var2 = (w52) kk0Var.f12837d;
                                try {
/* 47 */                            pg3.m7417A(obj);
/* 125 */                           w52Var2.releaseIntercepted();
/* 128 */                           return Unit.f12910a;
                                } catch (Throwable th2) {
/* 51 */                            th = th2;
/* 133 */                           w52Var2.releaseIntercepted();
/* 136 */                           throw th;
                                }
                            }
/* 67 */                    hk0Var = kk0Var.f12838e;
/* 71 */                    this = (lk0) kk0Var.f12837d;
/* 73 */                    pg3.m7417A(obj);
/* 109 */                   o40 o40Var = this.f13340b;
/* 111 */                   kk0Var.f12837d = w52Var;
/* 113 */                   kk0Var.f12838e = null;
/* 115 */                   kk0Var.f12835b = 3;
/* 121 */                   if (o40Var.mo4450a(w52Var, null, kk0Var) != z10Var) {
/* 124 */                       w52Var2 = w52Var;
/* 125 */                       w52Var2.releaseIntercepted();
/* 128 */                       return Unit.f12910a;
                            }
                        } catch (Throwable th3) {
/* 131 */                   th = th3;
/* 132 */                   w52Var2 = w52Var;
/* 133 */                   w52Var2.releaseIntercepted();
/* 136 */                   throw th;
                        }
/* 106 */               w52Var = new w52(hk0Var, kk0Var.getContext());
                    } catch (Throwable th4) {
/* 79 */                lk0 lk0Var = this;
/* 139 */               go2 go2Var = new go2(th4);
/* 142 */               o40 o40Var2 = lk0Var.f13340b;
/* 144 */               kk0Var.f12837d = th4;
/* 146 */               kk0Var.f12838e = null;
/* 148 */               kk0Var.f12835b = 2;
/* 154 */               if (w11.m9417a(go2Var, o40Var2, th4, kk0Var) != z10Var) {
/* 157 */                   throw th4;
                        }
                    }
/* 156 */           return z10Var;
                }
            }
