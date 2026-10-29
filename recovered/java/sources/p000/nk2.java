            package p000;

            import com.usercentrics.sdk.services.tcf.interfaces.TCFStack;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class nk2 extends b51 implements Function1 {

                /* JADX INFO: renamed from: U */
                public static final nk2 f14337U;

                /* JADX INFO: renamed from: V */
                public static final nk2 f14338V;

                /* JADX INFO: renamed from: b */
                public static final nk2 f14339b;

                /* JADX INFO: renamed from: c */
                public static final nk2 f14340c;

                /* JADX INFO: renamed from: d */
                public static final nk2 f14341d;

                /* JADX INFO: renamed from: e */
                public static final nk2 f14342e;

                /* JADX INFO: renamed from: f */
                public static final nk2 f14343f;

                /* JADX INFO: renamed from: i */
                public static final nk2 f14344i;

                /* JADX INFO: renamed from: v */
                public static final nk2 f14345v;

                /* JADX INFO: renamed from: w */
                public static final nk2 f14346w;

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14347a;

                static {
/* 3 */             int i = 1;
/* 8 */             f14339b = new nk2(i, 0);
/* 16 */            f14340c = new nk2(i, 1);
/* 24 */            f14341d = new nk2(i, 2);
/* 32 */            f14342e = new nk2(i, 3);
/* 40 */            f14343f = new nk2(i, 4);
/* 48 */            f14344i = new nk2(i, 5);
/* 56 */            f14345v = new nk2(i, 6);
/* 64 */            f14346w = new nk2(i, 7);
/* 73 */            f14337U = new nk2(i, 8);
/* 82 */            f14338V = new nk2(i, 9);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public nk2(qk2 qk2Var) {
/* 6 */             super(1);
/* 3 */             this.f14347a = 12;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (this.f14347a) {
                        case 0:
/* 151 */                   TCFStack tCFStack = (TCFStack) obj;
/* 153 */                   tCFStack.getClass();
/* 156 */                   return tCFStack.f6202c;
                        case 1:
/* 143 */                   TCFVendor tCFVendor = (TCFVendor) obj;
/* 145 */                   tCFVendor.getClass();
/* 148 */                   return tCFVendor.f6212g;
                        case 2:
/* 135 */                   TCFVendor tCFVendor2 = (TCFVendor) obj;
/* 137 */                   tCFVendor2.getClass();
/* 140 */                   return tCFVendor2.f6212g;
                        case 3:
/* 129 */                   ((Boolean) obj).booleanValue();
/* 132 */                   return Unit.f12910a;
                        case 4:
/* 121 */                   ((tz2) obj).getClass();
/* 124 */                   return Unit.f12910a;
                        case 5:
/* 113 */                   ((Boolean) obj).booleanValue();
/* 116 */                   return Unit.f12910a;
                        case 6:
/* 105 */                   ((Boolean) obj).booleanValue();
/* 108 */                   return Unit.f12910a;
                        case 7:
/* 97 */                    ((Boolean) obj).booleanValue();
/* 100 */                   return Unit.f12910a;
                        case 8:
/* 50 */                    Throwable th = (Throwable) obj;
/* 52 */                    th.getClass();
/* 55 */                    e03 e03Var = e03.f7466a;
/* 57 */                    vz2 vz2VarM3286b = e03.m3286b(th);
/* 61 */                    fb1 fb1VarM3289e = e03.m3289e();
/* 65 */                    if (fb1VarM3289e != null) {
/* 74 */                        fb1VarM3289e.m3699e().mo2908c("Usercentrics SDK was not able to initialize online, let's try to initialize offline", vz2VarM3286b);
/* 89 */                        fb1VarM3289e.m3696b().m9743b(new C2223tm(fb1VarM3289e, vz2VarM3286b, null, 12));
                            }
/* 92 */                    return Unit.f12910a;
                        case 9:
/* 42 */                    TCFVendor tCFVendor3 = (TCFVendor) obj;
/* 44 */                    tCFVendor3.getClass();
/* 47 */                    return tCFVendor3.f6212g;
                        case 10:
/* 36 */                    ((zu0) obj).getClass();
/* 39 */                    return Unit.f12910a;
                        case 11:
/* 28 */                    ((Throwable) obj).getClass();
/* 31 */                    return Unit.f12910a;
                        default:
/* 6 */                     TCFVendor tCFVendor4 = (TCFVendor) obj;
/* 8 */                     tCFVendor4.getClass();
/* 21 */                    return Boolean.valueOf(qk2.m7917m(tCFVendor4.f6214i, tCFVendor4.f6211f, tCFVendor4.f6217l));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public /* synthetic */ nk2(int i, int i2) {
                    super(i);
/* 10 */            this.f14347a = i2;
                }
            }
