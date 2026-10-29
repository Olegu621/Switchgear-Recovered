            package p000;

            import android.content.Context;
            import java.lang.ref.WeakReference;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: renamed from: sh */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2181sh extends b51 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16617a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16618b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f16619c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f16620d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2181sh(int i, Object obj, Object obj2, Object obj3) {
/* 10 */            super(1);
/* 1 */             this.f16617a = i;
/* 3 */             this.f16618b = obj;
/* 5 */             this.f16619c = obj2;
/* 7 */             this.f16620d = obj3;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    bw1 bw1Var;
/* 1 */             int i = this.f16617a;
/* 7 */             Object obj2 = this.f16620d;
/* 9 */             Object obj3 = this.f16619c;
/* 11 */            Object obj4 = this.f16618b;
                    switch (i) {
                        case 0:
/* 208 */                   dw1 dw1Var = (dw1) obj;
/* 210 */                   dw1Var.getClass();
/* 213 */                   C2218th c2218th = (C2218th) obj4;
/* 226 */                   c2218th.f17100h.m9744c(new C2144rh((Function1) obj3, (k61) obj2, c2218th, dw1Var));
/* 229 */                   return Unit.f12910a;
                        case 1:
/* 111 */                   ra2 ra2Var = (ra2) obj3;
/* 114 */                   tu1 tu1Var = (tu1) obj;
/* 116 */                   tu1Var.getClass();
/* 119 */                   pg3 g03Var = (pg3) obj4;
/* 121 */                   if (g03Var == null) {
/* 131 */                       fj0 fj0Var = tu1Var.f17274a.f18819a.f6925b.f7434c.f12528a;
/* 133 */                       fj0Var.getClass();
/* 136 */                       int iOrdinal = fj0Var.ordinal();
/* 140 */                       if (iOrdinal == 0) {
/* 171 */                           g03Var = h03.f8862i;
                                } else if (iOrdinal == 1) {
/* 168 */                           g03Var = f03.f7959i;
                                } else if (iOrdinal == 2) {
/* 164 */                           g03Var = new g03(pt1.f15280a);
                                } else {
/* 146 */                           if (iOrdinal != 3) {
/* 156 */                               ds0.m3187b();
/* 3 */                                 return null;
                                    }
/* 152 */                           g03Var = new g03(pt1.f15281b);
                                }
                            }
/* 182 */                   Context context = (Context) ((WeakReference) ra2Var.f15958d).get();
/* 184 */                   if (context != null) {
/* 192 */                       iz2 iz2Var = new iz2(ra2Var, context, (u03) obj2, g03Var, tu1Var);
/* 199 */                       if (!mn0.m6705u(context)) {
                                    try {
/* 202 */                               iz2Var.invoke();
                                        break;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
/* 205 */                   return Unit.f12910a;
                        default:
/* 16 */                    wu1 wu1Var = (wu1) obj;
/* 18 */                    wu1Var.getClass();
/* 23 */                    fb1 fb1Var = ((a13) obj4).f30a;
/* 25 */                    bw1 bw1Var2 = (bw1) obj3;
/* 29 */                    dw1 dw1Var2 = wu1Var.f18819a.f6925b;
/* 31 */                    if (bw1Var2 == null) {
/* 37 */                        int iOrdinal2 = dw1Var2.f7434c.f12528a.ordinal();
/* 41 */                        if (iOrdinal2 == 0) {
/* 63 */                            bw1Var = bw1.f2624b;
                                } else if (iOrdinal2 == 1) {
/* 60 */                            bw1Var = bw1.f2623a;
                                } else if (iOrdinal2 == 2) {
/* 57 */                            bw1Var = bw1.f2626d;
                                } else {
/* 47 */                            if (iOrdinal2 != 3) {
/* 53 */                                ds0.m3187b();
/* 3 */                                 return null;
                                    }
/* 49 */                            bw1Var = bw1.f2625c;
                                }
/* 51 */                        bw1Var2 = bw1Var;
                            }
/* 72 */                    gv1 gv1Var = (gv1) fb1Var.f8081S.getValue();
/* 74 */                    gv1Var.getClass();
/* 77 */                    od2 od2Var = gv1Var.f8825b;
/* 79 */                    fh2[] fh2VarArr = fh2.f8216a;
/* 87 */                    od2Var.m7138d("ui_variant", bw1Var2.name());
/* 105 */                   ((C2181sh) obj2).invoke(new tu1(wu1Var, (zt1) fb1Var.f8107u.getValue()));
/* 108 */                   return Unit.f12910a;
                    }
                }
            }
