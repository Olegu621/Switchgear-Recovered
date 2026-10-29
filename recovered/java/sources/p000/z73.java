            package p000;

            import android.graphics.Rect;
            import android.view.WindowInsets;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class z73 extends c83 {

                /* JADX INFO: renamed from: c */
                public static Field f19969c;

                /* JADX INFO: renamed from: d */
                public static boolean f19970d;

                /* JADX INFO: renamed from: e */
                public static Constructor f19971e;

                /* JADX INFO: renamed from: f */
                public static boolean f19972f;

                /* JADX INFO: renamed from: a */
                public WindowInsets f19973a;

                /* JADX INFO: renamed from: b */
                public ly0 f19974b;

                public z73() {
/* 8 */             this.f19973a = m10286e();
                }

                /* JADX INFO: renamed from: e */
                private static WindowInsets m10286e() {
/* 6 */             if (!f19970d) {
                        try {
/* 14 */                    f19969c = WindowInsets.class.getDeclaredField("CONSUMED");
                        } catch (ReflectiveOperationException unused) {
                        }
/* 16 */                f19970d = true;
                    }
/* 18 */            Field field = f19969c;
/* 21 */            if (field != null) {
                        try {
/* 27 */                    WindowInsets windowInsets = (WindowInsets) field.get(null);
/* 29 */                    if (windowInsets != null) {
/* 33 */                        return new WindowInsets(windowInsets);
                            }
                        } catch (ReflectiveOperationException unused2) {
                        }
                    }
/* 39 */            if (!f19972f) {
                        try {
/* 51 */                    f19971e = WindowInsets.class.getConstructor(Rect.class);
                        } catch (ReflectiveOperationException unused3) {
                        }
/* 53 */                f19972f = true;
                    }
/* 55 */            Constructor constructor = f19971e;
/* 57 */            if (constructor != null) {
                        try {
/* 72 */                    return (WindowInsets) constructor.newInstance(new Rect());
                        } catch (ReflectiveOperationException unused4) {
                        }
                    }
/* 20 */            return null;
                }

                @Override // p000.c83
                /* JADX INFO: renamed from: b */
                public m83 mo106b() {
/* 1 */             m1545a();
/* 7 */             m83 m83VarM6620h = m83.m6620h(this.f19973a, null);
/* 11 */            j83 j83Var = m83VarM6620h.f13660a;
/* 13 */            j83Var.mo2974o(null);
/* 18 */            j83Var.mo3343q(this.f19974b);
/* 21 */            return m83VarM6620h;
                }

                @Override // p000.c83
                /* JADX INFO: renamed from: c */
                public void mo107c(ly0 ly0Var) {
/* 1 */             this.f19974b = ly0Var;
                }

                @Override // p000.c83
                /* JADX INFO: renamed from: d */
                public void mo108d(ly0 ly0Var) {
/* 1 */             WindowInsets windowInsets = this.f19973a;
/* 3 */             if (windowInsets != null) {
/* 17 */                this.f19973a = windowInsets.replaceSystemWindowInsets(ly0Var.f13528a, ly0Var.f13529b, ly0Var.f13530c, ly0Var.f13531d);
                    }
                }

/* 10 */        public z73(m83 m83Var) {
/* 11 */            super(m83Var);
/* 12 */            this.f19973a = m83Var.m6626g();
                }
            }
