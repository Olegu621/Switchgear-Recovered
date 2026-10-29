            package p000;

            import android.R;
            import android.graphics.Insets;
            import android.graphics.PorterDuff;
            import android.graphics.Rect;
            import android.graphics.drawable.Drawable;
            import android.os.Build;
            import java.lang.reflect.InvocationTargetException;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class w90 {

                /* JADX INFO: renamed from: a */
                public static final int[] f18483a = {R.attr.state_checked};

                /* JADX INFO: renamed from: b */
                public static final int[] f18484b = new int[0];

                /* JADX INFO: renamed from: c */
                public static final Rect f18485c = new Rect();

                /* JADX INFO: renamed from: a */
                public static void m9483a(Drawable drawable) {
/* 5 */             String name = drawable.getClass().getName();
/* 9 */             int i = Build.VERSION.SDK_INT;
/* 13 */            if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
/* 51 */                return;
                    }
/* 27 */            int[] state = drawable.getState();
/* 31 */            if (state == null || state.length == 0) {
/* 45 */                drawable.setState(f18483a);
                    } else {
/* 39 */                drawable.setState(f18484b);
                    }
/* 48 */            drawable.setState(state);
                }

                /* JADX INFO: renamed from: b */
                public static Rect m9484b(Drawable drawable) {
/* 1 */             int i = Build.VERSION.SDK_INT;
/* 5 */             if (i >= 29) {
/* 7 */                 Insets insetsM9232a = v90.m9232a(drawable);
/* 29 */                return new Rect(insetsM9232a.left, insetsM9232a.top, insetsM9232a.right, insetsM9232a.bottom);
                    }
/* 33 */            if (i >= 29) {
/* 78 */                boolean z = u90.f17421a;
                    } else if (u90.f17421a) {
                        try {
/* 42 */                    Object objInvoke = u90.f17422b.invoke(drawable, null);
/* 46 */                    if (objInvoke != null) {
/* 74 */                        return new Rect(u90.f17423c.getInt(objInvoke), u90.f17424d.getInt(objInvoke), u90.f17425e.getInt(objInvoke), u90.f17426f.getInt(objInvoke));
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    }
/* 80 */            return f18485c;
                }

                /* JADX INFO: renamed from: c */
                public static PorterDuff.Mode m9485c(int i, PorterDuff.Mode mode) {
/* 2 */             if (i == 3) {
/* 30 */                return PorterDuff.Mode.SRC_OVER;
                    }
/* 5 */             if (i == 5) {
/* 27 */                return PorterDuff.Mode.SRC_IN;
                    }
/* 9 */             if (i == 9) {
/* 24 */                return PorterDuff.Mode.SRC_ATOP;
                    }
                    switch (i) {
                        case 14:
/* 21 */                    return PorterDuff.Mode.MULTIPLY;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 18 */                    return PorterDuff.Mode.SCREEN;
                        case 16:
/* 15 */                    return PorterDuff.Mode.ADD;
                        default:
/* 14 */                    return mode;
                    }
                }
            }
