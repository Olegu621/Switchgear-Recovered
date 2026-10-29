            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import android.widget.BaseAdapter;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class j81 extends BaseAdapter {

                /* JADX INFO: renamed from: a */
                public int f12138a = -1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ k81 f12139b;

                public j81(k81 k81Var) {
/* 1 */             this.f12139b = k81Var;
/* 9 */             m5724a();
                }

                /* JADX INFO: renamed from: a */
                public final void m5724a() {
/* 3 */             jg1 jg1Var = this.f12139b.f12649c;
/* 5 */             sg1 sg1Var = jg1Var.f12278w;
/* 7 */             if (sg1Var != null) {
/* 9 */                 jg1Var.m5806i();
/* 12 */                ArrayList arrayList = jg1Var.f12265j;
/* 14 */                int size = arrayList.size();
/* 19 */                for (int i = 0; i < size; i++) {
/* 27 */                    if (((sg1) arrayList.get(i)) == sg1Var) {
/* 29 */                        this.f12138a = i;
/* 31 */                        return;
                            }
                        }
                    }
/* 36 */            this.f12138a = -1;
                }

                @Override // android.widget.Adapter
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final sg1 getItem(int i) {
/* 1 */             k81 k81Var = this.f12139b;
/* 3 */             jg1 jg1Var = k81Var.f12649c;
/* 5 */             jg1Var.m5806i();
/* 8 */             ArrayList arrayList = jg1Var.f12265j;
/* 10 */            k81Var.getClass();
/* 13 */            int i2 = this.f12138a;
/* 15 */            if (i2 >= 0 && i >= i2) {
/* 19 */                i++;
                    }
/* 25 */            return (sg1) arrayList.get(i);
                }

                @Override // android.widget.Adapter
                public final int getCount() {
/* 1 */             k81 k81Var = this.f12139b;
/* 3 */             jg1 jg1Var = k81Var.f12649c;
/* 5 */             jg1Var.m5806i();
/* 10 */            int size = jg1Var.f12265j.size();
/* 14 */            k81Var.getClass();
                    return this.f12138a < 0 ? size : size - 1;
                }

                @Override // android.widget.Adapter
                public final long getItemId(int i) {
/* 1 */             return i;
                }

                @Override // android.widget.Adapter
                public final View getView(int i, View view, ViewGroup viewGroup) {
/* 1 */             if (view == null) {
/* 3 */                 k81 k81Var = this.f12139b;
/* 10 */                view = k81Var.f12648b.inflate(k81Var.f12651e, viewGroup, false);
                    }
/* 21 */            ((gh1) view).mo327c(getItem(i));
/* 24 */            return view;
                }

                @Override // android.widget.BaseAdapter
                public final void notifyDataSetChanged() {
/* 1 */             m5724a();
/* 4 */             super.notifyDataSetChanged();
                }
            }
