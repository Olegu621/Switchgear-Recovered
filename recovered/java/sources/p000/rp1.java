            package p000;

            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rp1 implements InterfaceC0817cr {

                /* JADX INFO: renamed from: a */
                public final kp1 f16219a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ sp1 f16220b;

                public rp1(sp1 sp1Var, kp1 kp1Var) {
/* 4 */             kp1Var.getClass();
/* 7 */             this.f16220b = sp1Var;
/* 9 */             this.f16219a = kp1Var;
                }

                @Override // p000.InterfaceC0817cr
                public final void cancel() {
/* 1 */             sp1 sp1Var = this.f16220b;
/* 3 */             C0840dd c0840dd = sp1Var.f16739b;
/* 5 */             kp1 kp1Var = this.f16219a;
/* 7 */             c0840dd.remove(kp1Var);
/* 17 */            if (Intrinsics.m6216a(sp1Var.f16740c, kp1Var)) {
/* 19 */                kp1Var.handleOnBackCancelled();
/* 22 */                sp1Var.f16740c = null;
                    }
/* 24 */            kp1Var.removeCancellable(this);
/* 27 */            Function0<Unit> enabledChangedCallback$activity_release = kp1Var.getEnabledChangedCallback$activity_release();
/* 31 */            if (enabledChangedCallback$activity_release != null) {
/* 33 */                enabledChangedCallback$activity_release.invoke();
                    }
/* 36 */            kp1Var.setEnabledChangedCallback$activity_release(null);
                }
            }
