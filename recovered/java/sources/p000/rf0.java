            package p000;

            import android.os.Bundle;
            import android.view.View;
            import android.view.accessibility.AccessibilityManager;
            import android.view.accessibility.AccessibilityNodeInfo;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class rf0 extends qc3 {

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ sf0 f16036i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public rf0(sf0 sf0Var) {
/* 4 */             super(4);
/* 1 */             this.f16036i = sf0Var;
                }

                @Override // p000.qc3
                /* JADX INFO: renamed from: f */
                public final C0901f1 mo7766f(int i) {
/* 15 */            return new C0901f1(AccessibilityNodeInfo.obtain(this.f16036i.m8497r(i).f7961a));
                }

                @Override // p000.qc3
                /* JADX INFO: renamed from: h */
                public final C0901f1 mo7768h(int i) {
/* 2 */             sf0 sf0Var = this.f16036i;
/* 9 */             int i2 = i == 2 ? sf0Var.f16569k : sf0Var.f16570l;
/* 13 */            if (i2 == Integer.MIN_VALUE) {
/* 15 */                return null;
                    }
/* 17 */            return mo7766f(i2);
                }

                @Override // p000.qc3
                /* JADX INFO: renamed from: l */
                public final boolean mo7769l(int i, int i2, Bundle bundle) {
                    int i3;
/* 1 */             sf0 sf0Var = this.f16036i;
/* 3 */             View view = sf0Var.f16567i;
/* 6 */             if (i == -1) {
/* 98 */                WeakHashMap weakHashMap = e33.f7494a;
/* 100 */               return view.performAccessibilityAction(i2, bundle);
                    }
/* 9 */             if (i2 == 1) {
/* 93 */                return sf0Var.m8498w(i);
                    }
/* 12 */            if (i2 == 2) {
/* 88 */                return sf0Var.m8491j(i);
                    }
/* 21 */            if (i2 != 64) {
/* 25 */                if (i2 != 128) {
/* 27 */                    return sf0Var.mo2377s(i, i2, bundle);
                        }
/* 34 */                if (sf0Var.f16569k != i) {
/* 16 */                    return false;
                        }
/* 36 */                sf0Var.f16569k = Integer.MIN_VALUE;
/* 38 */                view.invalidate();
/* 41 */                sf0Var.m8499x(i, 65536);
/* 8 */                 return true;
                    }
/* 46 */            AccessibilityManager accessibilityManager = sf0Var.f16566h;
/* 52 */            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = sf0Var.f16569k) == i) {
/* 16 */                return false;
                    }
/* 65 */            if (i3 != Integer.MIN_VALUE) {
/* 67 */                sf0Var.f16569k = Integer.MIN_VALUE;
/* 69 */                view.invalidate();
/* 72 */                sf0Var.m8499x(i3, 65536);
                    }
/* 75 */            sf0Var.f16569k = i;
/* 77 */            view.invalidate();
/* 83 */            sf0Var.m8499x(i, 32768);
/* 8 */             return true;
                }
            }
