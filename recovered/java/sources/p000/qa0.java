            package p000;

            import android.widget.AbsListView;
            import java.lang.reflect.Field;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class qa0 {

                /* JADX INFO: renamed from: a */
                public static final Field f15460a;

                static {
/* 1 */             Field declaredField = null;
                    try {
/* 6 */                 declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
/* 11 */                declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e) {
/* 16 */                e.printStackTrace();
                    }
/* 19 */            f15460a = declaredField;
                }
            }
