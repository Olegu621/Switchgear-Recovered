            package com.google.android.recaptcha.internal;

            import java.util.concurrent.CancellationException;
            import kotlin.coroutines.AbstractC1844e;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.coroutines.InterfaceC1845f;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function2;
            import kotlin.sequences.Sequence;
            import p000.C0828d1;
            import p000.C1869kx;
            import p000.InterfaceC0820cu;
            import p000.InterfaceC1809jx;
            import p000.InterfaceC2563zt;
            import p000.c10;
            import p000.e70;
            import p000.e90;
            import p000.gs2;
            import p000.h01;
            import p000.i01;
            import p000.ts0;
            import p000.w01;
            import p000.x01;
            import p000.xt0;
            import p000.y01;
            import p000.y82;
            import p000.z01;
            import p000.z10;
            import p000.z82;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 8 */     public final class zzde implements e70 {
                private final /* synthetic */ InterfaceC1809jx zza;

                public zzde(InterfaceC1809jx interfaceC1809jx) {
/* 4 */             this.zza = interfaceC1809jx;
                }

                @Override // p000.h01
                public final InterfaceC2563zt attachChild(InterfaceC0820cu interfaceC0820cu) {
/* 5 */             return ((z01) this.zza).attachChild(interfaceC0820cu);
                }

                @Override // p000.e70
                public final Object await(c10 c10Var) throws Throwable {
/* 5 */             Object objM10250i = ((C1869kx) this.zza).m10250i(c10Var);
/* 9 */             z10 z10Var = z10.f19902a;
/* 11 */            return objM10250i;
                }

                public final /* synthetic */ boolean cancel(Throwable th) {
                    CancellationException i01Var;
/* 3 */             z01 z01Var = (z01) this.zza;
/* 5 */             if (th != null) {
/* 7 */                 z01Var.getClass();
/* 10 */                i01Var = z01.m10235Q(z01Var, th);
                    } else {
/* 22 */                i01Var = new i01(z01Var.mo4407m(), null, z01Var);
                    }
/* 25 */            z01Var.mo10035k(i01Var);
/* 28 */            return true;
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final Object fold(Object obj, Function2 function2) {
/* 3 */             z01 z01Var = (z01) this.zza;
/* 5 */             z01Var.getClass();
/* 8 */             function2.getClass();
/* 11 */            return function2.invoke(obj, z01Var);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext.Element get(InterfaceC1845f interfaceC1845f) {
/* 3 */             z01 z01Var = (z01) this.zza;
/* 5 */             z01Var.getClass();
/* 8 */             return AbstractC1844e.m6213a(z01Var, interfaceC1845f);
                }

                @Override // p000.h01
                public final CancellationException getCancellationException() {
/* 5 */             return ((z01) this.zza).getCancellationException();
                }

                @Override // p000.h01
                public final Sequence getChildren() {
/* 5 */             return ((z01) this.zza).getChildren();
                }

                @Override // p000.e70
                public final Object getCompleted() {
/* 5 */             return ((C1869kx) this.zza).m10256r();
                }

                @Override // p000.e70
                public final Throwable getCompletionExceptionOrNull() {
/* 5 */             return ((z01) this.zza).getCompletionExceptionOrNull();
                }

                @Override // kotlin.coroutines.CoroutineContext.Element
                public final InterfaceC1845f getKey() {
/* 3 */             this.zza.getClass();
/* 6 */             return xt0.f19368w;
                }

                public final z82 getOnAwait() {
/* 3 */             C1869kx c1869kx = (C1869kx) this.zza;
/* 5 */             c1869kx.getClass();
/* 13 */            gs2.m4011b(3, w01.f18405a);
/* 18 */            gs2.m4011b(3, x01.f18883a);
/* 21 */            return new C0828d1(c1869kx);
                }

                public final y82 getOnJoin() {
/* 3 */             z01 z01Var = (z01) this.zza;
/* 5 */             z01Var.getClass();
/* 13 */            gs2.m4011b(3, y01.f19428a);
/* 16 */            return new ts0(z01Var);
                }

                public final h01 getParent() {
/* 5 */             InterfaceC2563zt interfaceC2563ztM10259w = ((z01) this.zza).m10259w();
/* 9 */             if (interfaceC2563ztM10259w != null) {
/* 11 */                return interfaceC2563ztM10259w.getParent();
                    }
/* 16 */            return null;
                }

                @Override // p000.h01
                public final e90 invokeOnCompletion(Function1 function1) {
/* 5 */             return ((z01) this.zza).invokeOnCompletion(function1);
                }

                @Override // p000.h01
                public final boolean isActive() {
/* 5 */             return ((z01) this.zza).isActive();
                }

                @Override // p000.h01
                public final boolean isCancelled() {
/* 5 */             return ((z01) this.zza).isCancelled();
                }

                @Override // p000.h01
                public final boolean isCompleted() {
/* 5 */             return ((z01) this.zza).isCompleted();
                }

                @Override // p000.h01
                public final Object join(c10 c10Var) {
/* 5 */             return ((z01) this.zza).join(c10Var);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext minusKey(InterfaceC1845f interfaceC1845f) {
/* 3 */             z01 z01Var = (z01) this.zza;
/* 5 */             z01Var.getClass();
/* 8 */             return AbstractC1844e.m6214b(z01Var, interfaceC1845f);
                }

                @Override // kotlin.coroutines.CoroutineContext
                public final CoroutineContext plus(CoroutineContext coroutineContext) {
/* 3 */             z01 z01Var = (z01) this.zza;
/* 5 */             z01Var.getClass();
/* 8 */             return AbstractC1844e.m6215c(z01Var, coroutineContext);
                }

                @Override // p000.h01
                public final boolean start() {
/* 5 */             return ((z01) this.zza).start();
                }

                @Override // p000.h01
/* 9 */         public final e90 invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
/* 10 */            return ((z01) this.zza).invokeOnCompletion(z, z2, function1);
                }

/* 12 */        public final h01 plus(h01 h01Var) {
/* 13 */            ((z01) this.zza).getClass();
                    return h01Var;
                }

                @Override // p000.h01
/* 29 */        public final void cancel(CancellationException cancellationException) {
/* 30 */            ((z01) this.zza).cancel(cancellationException);
                }

/* 30 */        public final /* synthetic */ void cancel() {
/* 31 */            ((z01) this.zza).cancel(null);
                }
            }
