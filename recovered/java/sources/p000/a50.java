            package p000;

            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a50 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public f22 f85a;

                /* JADX INFO: renamed from: b */
                public int f86b;

                /* JADX INFO: renamed from: c */
                public /* synthetic */ Object f87c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ f22 f88d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ b50 f89e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f90f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ boolean f91i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a50(f22 f22Var, b50 b50Var, Object obj, boolean z, c10 c10Var) {
/* 10 */            super(2, c10Var);
/* 1 */             this.f88d = f22Var;
/* 3 */             this.f89e = b50Var;
/* 5 */             this.f90f = obj;
/* 7 */             this.f91i = z;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 12 */            a50 a50Var = new a50(this.f88d, this.f89e, this.f90f, this.f91i, c10Var);
/* 15 */            a50Var.f87c = obj;
/* 17 */            return a50Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((a50) create((ei0) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
                
                    if (r7.m3445b(r3, r8) == r0) goto L16;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    ei0 ei0Var;
                    f22 f22Var;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.f86b;
/* 6 */             Object obj2 = this.f90f;
/* 8 */             b50 b50Var = this.f89e;
/* 10 */            f22 f22Var2 = this.f88d;
/* 14 */            if (i != 0) {
/* 16 */                if (i == 1) {
/* 30 */                    f22Var = this.f85a;
/* 34 */                    ei0Var = (ei0) this.f87c;
/* 36 */                    pg3.m7417A(obj);
                        } else {
/* 18 */                    if (i != 2) {
/* 26 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 20 */                    pg3.m7417A(obj);
                        }
/* 102 */               if (this.f91i) {
/* 121 */                   b50Var.f2223h.m4003u(new x30(obj2, obj2 != null ? obj2.hashCode() : 0, f22Var2.f7976a));
                        }
/* 124 */               return Unit.f12910a;
                    }
/* 40 */            pg3.m7417A(obj);
/* 45 */            ei0 ei0Var2 = (ei0) this.f87c;
/* 47 */            qe2 qe2VarM1286g = b50Var.m1286g();
/* 51 */            this.f87c = ei0Var2;
/* 53 */            this.f85a = f22Var2;
/* 55 */            this.f86b = 1;
/* 69 */            Integer num = new Integer(((AtomicInteger) qe2VarM1286g.f15504b.f15492b).incrementAndGet());
/* 72 */            if (num != z10Var) {
/* 76 */                ei0Var = ei0Var2;
/* 77 */                obj = num;
/* 78 */                f22Var = f22Var2;
                    }
/* 99 */            return z10Var;
/* 85 */            f22Var.f7976a = ((Number) obj).intValue();
/* 87 */            this.f87c = null;
/* 89 */            this.f85a = null;
/* 91 */            this.f86b = 2;
                }
            }
