            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import com.google.android.material.chip.Chip;
            import com.google.android.material.chip.ChipGroup;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.WeakHashMap;
            
            /* JADX INFO: renamed from: ku */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewGroupOnHierarchyChangeListenerC1866ku implements ViewGroup.OnHierarchyChangeListener {

                /* JADX INFO: renamed from: a */
                public ViewGroup.OnHierarchyChangeListener f13009a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ChipGroup f13010b;

                public ViewGroupOnHierarchyChangeListenerC1866ku(ChipGroup chipGroup) {
/* 4 */             this.f13010b = chipGroup;
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewAdded(View view, View view2) {
/* 1 */             ChipGroup chipGroup = this.f13010b;
/* 3 */             if (view == chipGroup && (view2 instanceof Chip)) {
/* 14 */                if (view2.getId() == -1) {
/* 16 */                    WeakHashMap weakHashMap = e33.f7494a;
/* 22 */                    view2.setId(View.generateViewId());
                        }
/* 25 */                C2306vt c2306vt = chipGroup.f4604v;
/* 28 */                Chip chip = (Chip) view2;
/* 42 */                ((HashMap) c2306vt.f18350c).put(Integer.valueOf(chip.getId()), chip);
/* 49 */                if (chip.isChecked()) {
/* 51 */                    c2306vt.m9341a(chip);
                        }
/* 59 */                chip.setInternalOnCheckedChangeListener(new d52(c2306vt));
                    }
/* 62 */            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13009a;
/* 64 */            if (onHierarchyChangeListener != null) {
/* 66 */                onHierarchyChangeListener.onChildViewAdded(view, view2);
                    }
                }

                @Override // android.view.ViewGroup.OnHierarchyChangeListener
                public final void onChildViewRemoved(View view, View view2) {
/* 1 */             ChipGroup chipGroup = this.f13010b;
/* 3 */             if (view == chipGroup && (view2 instanceof Chip)) {
/* 9 */                 C2306vt c2306vt = chipGroup.f4604v;
/* 12 */                Chip chip = (Chip) view2;
/* 14 */                c2306vt.getClass();
/* 18 */                chip.setInternalOnCheckedChangeListener(null);
/* 33 */                ((HashMap) c2306vt.f18350c).remove(Integer.valueOf(chip.getId()));
/* 48 */                ((HashSet) c2306vt.f18351d).remove(Integer.valueOf(chip.getId()));
                    }
/* 51 */            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13009a;
/* 53 */            if (onHierarchyChangeListener != null) {
/* 55 */                onHierarchyChangeListener.onChildViewRemoved(view, view2);
                    }
                }
            }
