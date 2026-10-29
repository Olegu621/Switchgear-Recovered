            package p000;

            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import androidx.appcompat.view.menu.ListMenuItemView;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gg1 extends BaseAdapter {

                /* JADX INFO: renamed from: a */
                public final jg1 f8595a;

                /* JADX INFO: renamed from: b */
                public int f8596b = -1;

                /* JADX INFO: renamed from: c */
                public boolean f8597c;

                /* JADX INFO: renamed from: d */
                public final boolean f8598d;

                /* JADX INFO: renamed from: e */
                public final LayoutInflater f8599e;

                /* JADX INFO: renamed from: f */
                public final int f8600f;

                public gg1(jg1 jg1Var, LayoutInflater layoutInflater, boolean z, int i) {
/* 7 */             this.f8598d = z;
/* 9 */             this.f8599e = layoutInflater;
/* 11 */            this.f8595a = jg1Var;
/* 13 */            this.f8600f = i;
/* 15 */            m3922a();
                }

                /* JADX INFO: renamed from: a */
                public final void m3922a() {
/* 1 */             jg1 jg1Var = this.f8595a;
/* 3 */             sg1 sg1Var = jg1Var.f12278w;
/* 5 */             if (sg1Var != null) {
/* 7 */                 jg1Var.m5806i();
/* 10 */                ArrayList arrayList = jg1Var.f12265j;
/* 12 */                int size = arrayList.size();
/* 17 */                for (int i = 0; i < size; i++) {
/* 25 */                    if (((sg1) arrayList.get(i)) == sg1Var) {
/* 27 */                        this.f8596b = i;
/* 29 */                        return;
                            }
                        }
                    }
/* 34 */            this.f8596b = -1;
                }

                @Override // android.widget.Adapter
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final sg1 getItem(int i) {
                    ArrayList arrayListM5807l;
/* 1 */             boolean z = this.f8598d;
/* 3 */             jg1 jg1Var = this.f8595a;
/* 5 */             if (z) {
/* 7 */                 jg1Var.m5806i();
/* 10 */                arrayListM5807l = jg1Var.f12265j;
                    } else {
/* 13 */                arrayListM5807l = jg1Var.m5807l();
                    }
/* 17 */            int i2 = this.f8596b;
/* 19 */            if (i2 >= 0 && i >= i2) {
/* 23 */                i++;
                    }
/* 29 */            return (sg1) arrayListM5807l.get(i);
                }

                @Override // android.widget.Adapter
                public final int getCount() {
                    ArrayList arrayListM5807l;
/* 1 */             boolean z = this.f8598d;
/* 3 */             jg1 jg1Var = this.f8595a;
/* 5 */             if (z) {
/* 7 */                 jg1Var.m5806i();
/* 10 */                arrayListM5807l = jg1Var.f12265j;
                    } else {
/* 13 */                arrayListM5807l = jg1Var.m5807l();
                    }
                    return this.f8596b < 0 ? arrayListM5807l.size() : arrayListM5807l.size() - 1;
                }

                @Override // android.widget.Adapter
                public final long getItemId(int i) {
/* 1 */             return i;
                }

                @Override // android.widget.Adapter
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             boolean z = false;
/* 2 */             if (view == null) {
/* 8 */                 view = this.f8599e.inflate(this.f8600f, viewGroup, false);
                    }
/* 16 */            int i2 = getItem(i).f16584b;
/* 18 */            int i3 = i - 1;
/* 29 */            int i4 = i3 >= 0 ? getItem(i3).f16584b : i2;
/* 31 */            ListMenuItemView listMenuItemView = (ListMenuItemView) view;
/* 40 */            if (this.f8595a.mo4235m() && i2 != i4) {
/* 44 */                z = true;
                    }
/* 45 */            listMenuItemView.setGroupDividerEnabled(z);
/* 49 */            gh1 gh1Var = (gh1) view;
/* 53 */            if (this.f8597c) {
/* 55 */                listMenuItemView.setForceShowIcon(true);
                    }
/* 62 */            gh1Var.mo327c(getItem(i));
/* 65 */            return view;
                }

                @Override // android.widget.BaseAdapter
                public final void notifyDataSetChanged() {
/* 1 */             m3922a();
/* 4 */             super.notifyDataSetChanged();
                }
            }
