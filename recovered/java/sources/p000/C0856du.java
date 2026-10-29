            package p000;

            import android.util.Property;
            import android.view.ViewGroup;
            import com.google.android.material.R$id;
            
            /* JADX INFO: renamed from: du */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0856du extends Property {

                /* JADX INFO: renamed from: a */
                public static final C0856du f7406a = new C0856du(Float.class, "childrenAlpha");

                @Override // android.util.Property
                public final Object get(Object obj) {
/* 9 */             Float f = (Float) ((ViewGroup) obj).getTag(R$id.mtrl_internal_children_alpha_tag);
                    return f != null ? f : Float.valueOf(1.0f);
                }

                @Override // android.util.Property
                public final void set(Object obj, Object obj2) {
/* 1 */             ViewGroup viewGroup = (ViewGroup) obj;
/* 3 */             Float f = (Float) obj2;
/* 5 */             float fFloatValue = f.floatValue();
/* 11 */            viewGroup.setTag(R$id.mtrl_internal_children_alpha_tag, f);
/* 14 */            int childCount = viewGroup.getChildCount();
/* 19 */            for (int i = 0; i < childCount; i++) {
/* 25 */                viewGroup.getChildAt(i).setAlpha(fFloatValue);
                    }
                }
            }
