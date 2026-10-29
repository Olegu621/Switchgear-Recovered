            package p000;

            import com.usercentrics.sdk.p008ui.components.UCToggle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class yv1 implements ut1 {

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ u21[] f19818d;

                /* JADX INFO: renamed from: a */
                public Function1 f19819a = C0170b7.f2250V;

                /* JADX INFO: renamed from: b */
                public final ArrayList f19820b = new ArrayList();

                /* JADX INFO: renamed from: c */
                public final wc0 f19821c;

                static {
/* 9 */             yk1 yk1Var = new yk1(yv1.class, "currentState", "getCurrentState()Z");
/* 14 */            j22.f12033a.getClass();
/* 23 */            f19818d = new u21[]{yk1Var};
                }

                public yv1(boolean z) {
/* 26 */            this.f19821c = new wc0(23, Boolean.valueOf(z), this);
                }

                /* JADX INFO: renamed from: a */
                public final void m10183a(UCToggle uCToggle) {
/* 1 */             ArrayList arrayList = this.f19820b;
/* 3 */             arrayList.getClass();
/* 18 */            if (!arrayList.contains(uCToggle) ? arrayList.add(uCToggle) : false) {
/* 28 */                if (getCurrentState() != uCToggle.getCurrentState()) {
/* 34 */                    uCToggle.setCurrentState(getCurrentState());
                        }
/* 52 */                uCToggle.setListener(new n01(1, this, yv1.class, "onStateChange", "onStateChange(Z)V", 0, 1));
                    }
                }

                @Override // p000.ut1
                public final void dispose() {
/* 1 */             ArrayList arrayList = this.f19820b;
/* 3 */             Iterator it = arrayList.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                ((ut1) it.next()).dispose();
                    }
/* 23 */            arrayList.clear();
/* 28 */            this.f19819a = C0170b7.f2249U;
                }

                @Override // p000.ut1
                public final boolean getCurrentState() {
/* 4 */             u21 u21Var = f19818d[0];
/* 6 */             wc0 wc0Var = this.f19821c;
/* 8 */             wc0Var.getClass();
/* 11 */            u21Var.getClass();
/* 18 */            return ((Boolean) wc0Var.f18577b).booleanValue();
                }

                @Override // p000.ut1
                public final void setCurrentState(boolean z) {
/* 4 */             u21 u21Var = f19818d[0];
/* 6 */             Boolean boolValueOf = Boolean.valueOf(z);
/* 10 */            wc0 wc0Var = this.f19821c;
/* 12 */            wc0Var.getClass();
/* 15 */            u21Var.getClass();
/* 20 */            Boolean bool = (Boolean) wc0Var.f18577b;
/* 22 */            wc0Var.f18577b = boolValueOf;
/* 24 */            boolean zBooleanValue = boolValueOf.booleanValue();
/* 32 */            if (bool.booleanValue() != zBooleanValue) {
/* 48 */                for (ut1 ut1Var : ((yv1) wc0Var.f18578c).f19820b) {
/* 60 */                    if (ut1Var.getCurrentState() != zBooleanValue) {
/* 62 */                        ut1Var.setCurrentState(zBooleanValue);
                            }
                        }
                    }
                }

                @Override // p000.ut1
                public final void setListener(Function1 function1) {
/* 1 */             if (function1 == null) {
/* 3 */                 function1 = C0170b7.f2251W;
                    }
/* 5 */             this.f19819a = function1;
                }
            }
