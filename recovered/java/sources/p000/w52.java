            package p000;

            import kotlin.Unit;
            import kotlin.coroutines.C1846g;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1850c;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class w52 extends d10 implements hk0 {

                /* JADX INFO: renamed from: a */
                public final hk0 f18444a;

                /* JADX INFO: renamed from: b */
                public final CoroutineContext f18445b;

                /* JADX INFO: renamed from: c */
                public final int f18446c;

                /* JADX INFO: renamed from: d */
                public CoroutineContext f18447d;

                /* JADX INFO: renamed from: e */
                public c10 f18448e;

                public w52(hk0 hk0Var, CoroutineContext coroutineContext) {
/* 5 */             super(nn1.f14389a, C1846g.f12919a);
/* 8 */             this.f18444a = hk0Var;
/* 10 */            this.f18445b = coroutineContext;
/* 29 */            this.f18446c = ((Number) coroutineContext.fold(0, v52.f17868a)).intValue();
                }

                /* JADX INFO: renamed from: e */
                public final Object m9477e(c10 c10Var, Object obj) {
/* 1 */             CoroutineContext context = c10Var.getContext();
/* 5 */             hu0.m4328W(context);
/* 8 */             CoroutineContext coroutineContext = this.f18447d;
/* 10 */            if (coroutineContext != context) {
/* 14 */                if (coroutineContext instanceof p90) {
/* 126 */                   throw new IllegalStateException(C1850c.m6253b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((p90) coroutineContext).f15026a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
                        }
/* 38 */                if (((Number) context.fold(0, new z52(this))).intValue() != this.f18446c) {
/* 81 */                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f18445b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                        }
/* 40 */                this.f18447d = context;
                    }
/* 127 */           this.f18448e = c10Var;
/* 129 */           lo0 lo0Var = y52.f19489a;
/* 131 */           hk0 hk0Var = this.f18444a;
/* 133 */           hk0Var.getClass();
/* 136 */           Object objMo4450a = lo0Var.mo4450a(hk0Var, obj, this);
/* 146 */           if (!Intrinsics.m6216a(objMo4450a, z10.f19902a)) {
/* 149 */               this.f18448e = null;
                    }
/* 151 */           return objMo4450a;
                }

                @Override // p000.hk0
                public final Object emit(Object obj, c10 c10Var) {
                    try {
/* 1 */                 Object objM9477e = m9477e(c10Var, obj);
                        return objM9477e == z10.f19902a ? objM9477e : Unit.f12910a;
                    } catch (Throwable th) {
/* 23 */                this.f18447d = new p90(th, c10Var.getContext());
/* 25 */                throw th;
                    }
                }

                @Override // p000.AbstractC0181bi, p000.a20
                public final a20 getCallerFrame() {
/* 1 */             c10 c10Var = this.f18448e;
/* 5 */             if (c10Var instanceof a20) {
/* 7 */                 return (a20) c10Var;
                    }
/* 10 */            return null;
                }

                @Override // p000.d10, p000.c10
                public final CoroutineContext getContext() {
/* 1 */             CoroutineContext coroutineContext = this.f18447d;
                    return coroutineContext == null ? C1846g.f12919a : coroutineContext;
                }

                @Override // p000.AbstractC0181bi
                public final StackTraceElement getStackTraceElement() {
/* 1 */             return null;
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             Throwable thM7099a = o42.m7099a(obj);
/* 5 */             if (thM7099a != null) {
/* 16 */                this.f18447d = new p90(thM7099a, getContext());
                    }
/* 18 */            c10 c10Var = this.f18448e;
/* 20 */            if (c10Var != null) {
/* 22 */                c10Var.resumeWith(obj);
                    }
/* 25 */            return z10.f19902a;
                }
            }
