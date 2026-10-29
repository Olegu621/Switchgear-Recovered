            package p000;

            import android.os.Build;
            import android.view.View;
            import androidx.transition.R$id;
            import androidx.transition.Transition;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: us */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C2266us extends jr2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17707a = 0;

                /* JADX INFO: renamed from: b */
                public Object f17708b;

                /* JADX INFO: renamed from: c */
                public Object f17709c;

                public C2266us(kr2 kr2Var, C1024id c1024id) {
/* 7 */             this.f17709c = kr2Var;
/* 9 */             this.f17708b = c1024id;
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: b */
                public void mo87b(Transition transition) {
                    switch (this.f17707a) {
                        case 0:
/* 12 */                    ((cr0) this.f17709c).setVisibility(4);
                            break;
                    }
                }

                @Override // p000.ir2
                /* JADX INFO: renamed from: c */
                public final void mo88c(Transition transition) {
                    switch (this.f17707a) {
                        case 0:
/* 30 */                    transition.m1104v(this);
/* 35 */                    View view = (View) this.f17708b;
/* 42 */                    if (Build.VERSION.SDK_INT == 28) {
/* 46 */                        if (!er0.f7851v) {
                                    try {
/* 50 */                                if (!er0.f7847d) {
                                            try {
/* 58 */                                        er0.f7846c = Class.forName("android.view.GhostView");
                                                break;
                                            } catch (ClassNotFoundException unused) {
                                            }
/* 60 */                                    er0.f7847d = true;
                                        }
/* 72 */                                Method declaredMethod = er0.f7846c.getDeclaredMethod("removeGhost", View.class);
/* 76 */                                er0.f7850i = declaredMethod;
/* 78 */                                declaredMethod.setAccessible(true);
                                        break;
                                    } catch (NoSuchMethodException unused2) {
                                    }
/* 81 */                            er0.f7851v = true;
                                }
/* 83 */                        Method method = er0.f7850i;
/* 85 */                        if (method != null) {
                                    try {
/* 91 */                                method.invoke(null, view);
                                        break;
                                    } catch (IllegalAccessException unused3) {
                                    } catch (InvocationTargetException e) {
/* 100 */                               ds0.m3199p(e.getCause());
/* 142 */                               return;
                                    }
                                }
                            } else {
/* 104 */                       int i = fr0.f8328i;
/* 112 */                       fr0 fr0Var = (fr0) view.getTag(R$id.ghost_view);
/* 114 */                       if (fr0Var != null) {
/* 118 */                           int i2 = fr0Var.f8332d - 1;
/* 119 */                           fr0Var.f8332d = i2;
/* 121 */                           if (i2 <= 0) {
/* 129 */                               ((dr0) fr0Var.getParent()).removeView(fr0Var);
                                    }
                                }
                            }
/* 134 */                   view.setTag(R$id.transition_transform, null);
/* 139 */                   view.setTag(R$id.parent_matrix, null);
                            break;
                        default:
/* 23 */                    ((ArrayList) ((C1024id) this.f17708b).getOrDefault(((kr2) this.f17709c).f12992b, null)).remove(transition);
/* 26 */                    transition.m1104v(this);
                            break;
                    }
                }

                @Override // p000.jr2, p000.ir2
                /* JADX INFO: renamed from: e */
                public void mo90e(Transition transition) {
                    switch (this.f17707a) {
                        case 0:
/* 12 */                    ((cr0) this.f17709c).setVisibility(0);
                            break;
                    }
                }

/* 11 */        public /* synthetic */ C2266us() {
                }
            }
