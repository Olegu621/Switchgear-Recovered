            package p000;

            import android.view.View;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.reflect.Field;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class y73 {

                /* JADX INFO: renamed from: a */
                public static final Field f19515a;

                /* JADX INFO: renamed from: b */
                public static final Field f19516b;

                /* JADX INFO: renamed from: c */
                public static final Field f19517c;

                /* JADX INFO: renamed from: d */
                public static final boolean f19518d;

                static {
                    try {
/* 5 */                 Field declaredField = View.class.getDeclaredField("mAttachInfo");
/* 9 */                 f19515a = declaredField;
/* 12 */                declaredField.setAccessible(true);
/* 17 */                Class<?> cls = Class.forName("android.view.View$AttachInfo");
/* 23 */                Field declaredField2 = cls.getDeclaredField("mStableInsets");
/* 27 */                f19516b = declaredField2;
/* 29 */                declaredField2.setAccessible(true);
/* 34 */                Field declaredField3 = cls.getDeclaredField("mContentInsets");
/* 38 */                f19517c = declaredField3;
/* 40 */                declaredField3.setAccessible(true);
/* 43 */                f19518d = true;
                    } catch (ReflectiveOperationException e) {
/* 67 */                AbstractC1245n0.m4891s("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
                    }
                }
            }
