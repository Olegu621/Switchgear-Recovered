            package p000;

            import android.text.TextUtils;
            import android.view.View;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class o23 extends rb1 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f14596e;

                public o23(int i, Class cls, int i2, int i3, int i4) {
/* 1 */             this.f14596e = i4;
/* 6 */             this.f15962a = i;
/* 8 */             this.f15965d = cls;
/* 10 */            this.f15964c = i2;
/* 12 */            this.f15963b = i3;
                }

                @Override // p000.rb1
                /* JADX INFO: renamed from: c */
                public final Object mo7090c(View view) {
                    switch (this.f14596e) {
                        case 0:
/* 29 */                    return Boolean.valueOf(x23.m9688d(view));
                        case 1:
/* 20 */                    return x23.m9686b(view);
                        case 2:
/* 15 */                    return z23.m10262b(view);
                        default:
/* 10 */                    return Boolean.valueOf(x23.m9687c(view));
                    }
                }

                @Override // p000.rb1
                /* JADX INFO: renamed from: d */
                public final void mo7091d(View view, Object obj) {
                    switch (this.f14596e) {
                        case 0:
/* 34 */                    x23.m9694j(view, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
/* 24 */                    x23.m9692h(view, (CharSequence) obj);
                            break;
                        case 2:
/* 18 */                    z23.m10265e(view, (CharSequence) obj);
                            break;
                        default:
/* 12 */                    x23.m9691g(view, ((Boolean) obj).booleanValue());
                            break;
                    }
                }

                @Override // p000.rb1
                /* JADX INFO: renamed from: g */
                public final boolean mo7092g(Object obj, Object obj2) {
                    boolean zEquals;
                    switch (this.f14596e) {
                        case 0:
/* 59 */                    Boolean bool = (Boolean) obj;
/* 61 */                    Boolean bool2 = (Boolean) obj2;
/* 88 */                    return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
                        case 1:
/* 54 */                    zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                            break;
                        case 2:
/* 44 */                    zEquals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                            break;
                        default:
/* 8 */                     Boolean bool3 = (Boolean) obj;
/* 10 */                    Boolean bool4 = (Boolean) obj2;
/* 37 */                    return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
                    }
/* 48 */            return !zEquals;
                }
            }
