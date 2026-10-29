            package p000;

            import android.util.SparseArray;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.core.R$id;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class d33 {

                /* JADX INFO: renamed from: d */
                public static final ArrayList f6968d = new ArrayList();

                /* JADX INFO: renamed from: a */
                public WeakHashMap f6969a;

                /* JADX INFO: renamed from: b */
                public SparseArray f6970b;

                /* JADX INFO: renamed from: c */
                public WeakReference f6971c;

                /* JADX INFO: renamed from: a */
                public final View m2918a(View view) {
                    int size;
/* 1 */             WeakHashMap weakHashMap = this.f6969a;
/* 3 */             if (weakHashMap == null || !weakHashMap.containsKey(view)) {
/* 65 */                return null;
                    }
/* 14 */            if (view instanceof ViewGroup) {
/* 17 */                ViewGroup viewGroup = (ViewGroup) view;
/* 25 */                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
/* 31 */                    View viewM2918a = m2918a(viewGroup.getChildAt(childCount));
/* 35 */                    if (viewM2918a != null) {
/* 37 */                        return viewM2918a;
                            }
                        }
                    }
/* 47 */            ArrayList arrayList = (ArrayList) view.getTag(R$id.tag_unhandled_key_listeners);
/* 49 */            if (arrayList == null || (size = arrayList.size() - 1) < 0) {
/* 65 */                return null;
                    }
/* 64 */            throw pm2.m7486i(size, arrayList);
                }
            }
