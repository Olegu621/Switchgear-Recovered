            package p000;

            import android.app.Activity;
            import android.content.Context;
            import androidx.window.extensions.WindowExtensionsProvider;
            import androidx.window.extensions.layout.WindowLayoutComponent;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class l62 {

                /* JADX INFO: renamed from: a */
                public final ClassLoader f13125a;

                /* JADX INFO: renamed from: b */
                public final d52 f13126b;

                /* JADX INFO: renamed from: c */
                public final er0 f13127c;

                public l62(ClassLoader classLoader, d52 d52Var) {
/* 4 */             this.f13125a = classLoader;
/* 6 */             this.f13126b = d52Var;
/* 15 */            this.f13127c = new er0(classLoader, 14);
                }

                /* JADX INFO: renamed from: a */
                public final WindowLayoutComponent m6349a() {
/* 1 */             er0 er0Var = this.f13127c;
/* 3 */             er0Var.getClass();
/* 8 */             boolean zM6350b = false;
/* 8 */             zM6350b = false;
/* 8 */             zM6350b = false;
/* 8 */             zM6350b = false;
/* 8 */             zM6350b = false;
/* 8 */             zM6350b = false;
/* 8 */             zM6350b = false;
/* 8 */             zM6350b = false;
                    try {
/* 12 */                new j62(er0Var, 0).invoke();
/* 27 */                if (yy1.m10206M("WindowExtensionsProvider#getWindowExtensions is not valid", new j62(er0Var, 1)) && yy1.m10206M("WindowExtensions#getWindowLayoutComponent is not valid", new k62(this, 3)) && yy1.m10206M("FoldingFeature class is not valid", new k62(this, zM6350b ? 1 : 0))) {
/* 56 */                    int iM6975a = ng0.m6975a();
/* 60 */                    if (iM6975a == 1) {
/* 62 */                        zM6350b = m6350b();
                            } else {
/* 67 */                        int i = 2;
/* 68 */                        if (2 <= iM6975a && iM6975a <= Integer.MAX_VALUE && m6350b()) {
/* 115 */                           if (yy1.m10206M("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new k62(this, i))) {
/* 117 */                               zM6350b = true;
                                    }
                                }
                            }
                        }
                    } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                    }
/* 119 */           if (!zM6350b) {
/* 118 */               return null;
                    }
                    try {
/* 125 */               return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                    } catch (UnsupportedOperationException unused2) {
/* 118 */               return null;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final boolean m6350b() {
/* 32 */            return yy1.m10206M("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new k62(this, 1));
                }
            }
