            package p000;

            import kotlin.Unit;
            import kotlin.coroutines.CoroutineContext;
            
            /* JADX INFO: renamed from: rm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C2149rm extends AbstractC0155at {

                /* JADX INFO: renamed from: d */
                public final C2562zs f16177d;

                /* JADX INFO: renamed from: e */
                public final C2562zs f16178e;

                public C2149rm(C2562zs c2562zs, CoroutineContext coroutineContext, int i, EnumC2464xk enumC2464xk) {
/* 1 */             super(coroutineContext, i, enumC2464xk);
/* 4 */             this.f16177d = c2562zs;
/* 6 */             this.f16178e = c2562zs;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p000.AbstractC0155at
                /* JADX INFO: renamed from: a */
                public final Object mo1162a(xx1 xx1Var, c10 c10Var) {
                    C2112qm c2112qm;
/* 3 */             if (c10Var instanceof C2112qm) {
/* 6 */                 c2112qm = (C2112qm) c10Var;
/* 8 */                 int i = c2112qm.f15652d;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    c2112qm.f15652d = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    c2112qm = new C2112qm(this, (d10) c10Var);
                        }
                    } else {
/* 24 */                c2112qm = new C2112qm(this, (d10) c10Var);
                    }
/* 27 */            Object obj = c2112qm.f15650b;
/* 29 */            z10 z10Var = z10.f19902a;
/* 31 */            int i2 = c2112qm.f15652d;
/* 35 */            if (i2 == 0) {
/* 51 */                pg3.m7417A(obj);
/* 54 */                c2112qm.f15649a = xx1Var;
/* 56 */                c2112qm.f15652d = 1;
/* 60 */                Object objInvoke = this.f16177d.invoke(xx1Var, c2112qm);
/* 64 */                if (objInvoke != z10Var) {
/* 67 */                    objInvoke = Unit.f12910a;
                        }
/* 69 */                if (objInvoke == z10Var) {
/* 71 */                    return z10Var;
                        }
                    } else {
/* 37 */                if (i2 != 1) {
/* 47 */                    f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 33 */                    return null;
                        }
/* 39 */                xx1Var = c2112qm.f15649a;
/* 41 */                pg3.m7417A(obj);
                    }
/* 78 */            if (xx1Var.f19390f.m10398w()) {
/* 80 */                return Unit.f12910a;
                    }
/* 85 */            f42.m3656l("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
/* 33 */            return null;
                }

                @Override // p000.AbstractC0155at
                public final String toString() {
/* 25 */            return "block[" + this.f16177d + "] -> " + super.toString();
                }
            }
