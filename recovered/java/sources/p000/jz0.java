            package p000;

            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class jz0 extends d10 {

                /* JADX INFO: renamed from: a */
                public int f12545a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Function2 f12546b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ c10 f12547c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public jz0(c10 c10Var, CoroutineContext coroutineContext, Function2 function2, c10 c10Var2) {
/* 5 */             super(c10Var, coroutineContext);
/* 1 */             this.f12546b = function2;
/* 3 */             this.f12547c = c10Var2;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             int i = this.f12545a;
/* 5 */             if (i != 0) {
/* 7 */                 if (i != 1) {
/* 17 */                    f42.m3656l("This coroutine had already completed");
/* 20 */                    return null;
                        }
/* 9 */                 this.f12545a = 2;
/* 11 */                pg3.m7417A(obj);
/* 14 */                return obj;
                    }
/* 22 */            this.f12545a = 1;
/* 24 */            pg3.m7417A(obj);
/* 27 */            Function2 function2 = this.f12546b;
/* 29 */            function2.getClass();
/* 32 */            gs2.m4011b(2, function2);
/* 37 */            return function2.invoke(this.f12547c, this);
                }
            }
