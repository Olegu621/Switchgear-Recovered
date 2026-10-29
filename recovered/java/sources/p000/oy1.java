            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oy1 extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public Exception f14915a;

                /* JADX INFO: renamed from: b */
                public int f14916b;

                /* JADX INFO: renamed from: c */
                public int f14917c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f14918d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f14919e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f14920f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f14921i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ Function1 f14922v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public oy1(int i, long j, long j2, long j3, Function1 function1, c10 c10Var) {
/* 12 */            super(2, c10Var);
/* 1 */             this.f14918d = i;
/* 3 */             this.f14919e = j;
/* 5 */             this.f14920f = j2;
/* 7 */             this.f14921i = j3;
/* 9 */             this.f14922v = function1;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 14 */            return new oy1(this.f14918d, this.f14919e, this.f14920f, this.f14921i, this.f14922v, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((oy1) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) throws Exception {
                    Exception exc;
                    int i;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i2 = this.f14917c;
                    try {
/* 8 */                 if (i2 == 0) {
/* 37 */                    pg3.m7417A(obj);
/* 41 */                    i = 0;
/* 42 */                    exc = null;
/* 45 */                    if (i >= this.f14918d) {
/* 120 */                       if (exc != null) {
/* 130 */                           throw exc;
                                }
/* 130 */                       throw new Exception("max retries");
                            }
/* 47 */                    if (i > 0) {
                                long j = i;
/* 69 */                        long jMin = Math.min(this.f14919e * j * j, this.f14920f) + ((long) (Math.random() * this.f14921i));
/* 70 */                        this.f14915a = exc;
/* 72 */                        this.f14916b = i;
/* 74 */                        this.f14917c = 1;
/* 80 */                        if (w11.m9431h(jMin, this) != z10Var) {
                                }
                            }
                        }
/* 10 */                if (i2 != 1) {
/* 12 */                    if (i2 != 2) {
/* 25 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 14 */                    int i3 = this.f14916b;
/* 16 */                    pg3.m7417A(obj);
/* 19 */                    return obj;
                        }
/* 29 */                i = this.f14916b;
/* 31 */                exc = this.f14915a;
/* 33 */                pg3.m7417A(obj);
                    } catch (Exception e) {
/* 21 */                exc = e;
/* 107 */               i = i2 + 1;
                    }
/* 89 */            e70 e70Var = (e70) this.f14922v.invoke(exc);
/* 91 */            if (e70Var == null) {
/* 109 */               if (exc != null) {
/* 119 */                   throw exc;
                        }
/* 119 */               throw new Exception("attempt returned null");
                    }
/* 93 */            this.f14915a = null;
/* 95 */            this.f14916b = i;
/* 97 */            this.f14917c = 2;
/* 99 */            Object objAwait = e70Var.await(this);
                    return objAwait == z10Var ? z10Var : objAwait;
                }
            }
