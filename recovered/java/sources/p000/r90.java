            package p000;

            import android.graphics.drawable.Drawable;
            import android.util.Property;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class r90 extends Property {

                /* JADX INFO: renamed from: a */
                public static final r90 f15933a;

                static {
/* 7 */             r90 r90Var = new r90(Integer.class, "drawableAlphaCompat");
/* 12 */            new WeakHashMap();
/* 15 */            f15933a = r90Var;
                }

                @Override // android.util.Property
                public final Object get(Object obj) {
/* 7 */             return Integer.valueOf(((Drawable) obj).getAlpha());
                }

                @Override // android.util.Property
                public final void set(Object obj, Object obj2) {
/* 9 */             ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
                }
            }
