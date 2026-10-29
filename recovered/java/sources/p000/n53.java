            package p000;

            import android.graphics.Matrix;
            import android.os.Build;
            import android.view.View;
            import java.lang.reflect.Field;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class n53 extends yy1 {

                /* JADX INFO: renamed from: h */
                public static boolean f14129h = true;

                /* JADX INFO: renamed from: i */
                public static boolean f14130i = true;

                /* JADX INFO: renamed from: j */
                public static boolean f14131j = true;

                /* JADX INFO: renamed from: k */
                public static boolean f14132k = true;

                /* JADX INFO: renamed from: l */
                public static boolean f14133l = true;

                /* JADX INFO: renamed from: P */
                public void mo6890P(View view, Matrix matrix) {
/* 3 */             if (f14129h) {
                        try {
/* 1 */                     view.setAnimationMatrix(matrix);
                        } catch (NoSuchMethodError unused) {
/* 10 */                    f14129h = false;
                        }
                    }
                }

                /* JADX INFO: renamed from: Q */
                public void mo6891Q(View view, int i, int i2, int i3, int i4) {
/* 3 */             if (f14132k) {
                        try {
/* 1 */                     view.setLeftTopRightBottom(i, i2, i3, i4);
                        } catch (NoSuchMethodError unused) {
/* 10 */                    f14132k = false;
                        }
                    }
                }

                /* JADX INFO: renamed from: R */
                public void mo6892R(int i, View view) {
/* 5 */             if (Build.VERSION.SDK_INT != 28) {
/* 46 */                if (f14133l) {
                            try {
/* 1 */                         view.setTransitionVisibility(i);
/* 51 */                        return;
                            } catch (NoSuchMethodError unused) {
/* 53 */                        f14133l = false;
/* 55 */                        return;
                            }
                        }
/* 55 */                return;
                    }
/* 9 */             if (!yy1.f19863f) {
                        try {
/* 16 */                    Field declaredField = View.class.getDeclaredField("mViewFlags");
/* 20 */                    yy1.f19862e = declaredField;
/* 22 */                    declaredField.setAccessible(true);
                        } catch (NoSuchFieldException unused2) {
                        }
/* 25 */                yy1.f19863f = true;
                    }
/* 27 */            Field field = yy1.f19862e;
/* 29 */            if (field != null) {
                        try {
/* 40 */                    yy1.f19862e.setInt(view, (field.getInt(view) & (-13)) | i);
                        } catch (IllegalAccessException unused3) {
                        }
                    }
                }

                /* JADX INFO: renamed from: S */
                public void mo6893S(View view, Matrix matrix) {
/* 3 */             if (f14130i) {
                        try {
/* 1 */                     view.transformMatrixToGlobal(matrix);
                        } catch (NoSuchMethodError unused) {
/* 10 */                    f14130i = false;
                        }
                    }
                }

                /* JADX INFO: renamed from: T */
                public void mo6894T(View view, Matrix matrix) {
/* 3 */             if (f14131j) {
                        try {
/* 1 */                     view.transformMatrixToLocal(matrix);
                        } catch (NoSuchMethodError unused) {
/* 10 */                    f14131j = false;
                        }
                    }
                }
            }
