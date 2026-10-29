            package p000;

            import android.content.Context;
            import android.content.ContextWrapper;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.WindowManager;
            import android.widget.AdapterView;
            import androidx.appcompat.R$layout;
            import androidx.appcompat.view.menu.ExpandedMenuView;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class k81 implements eh1, AdapterView.OnItemClickListener {

                /* JADX INFO: renamed from: a */
                public Context f12647a;

                /* JADX INFO: renamed from: b */
                public LayoutInflater f12648b;

                /* JADX INFO: renamed from: c */
                public jg1 f12649c;

                /* JADX INFO: renamed from: d */
                public ExpandedMenuView f12650d;

                /* JADX INFO: renamed from: e */
                public final int f12651e;

                /* JADX INFO: renamed from: f */
                public dh1 f12652f;

                /* JADX INFO: renamed from: i */
                public j81 f12653i;

                public k81(ContextWrapper contextWrapper, int i) {
/* 4 */             this.f12651e = i;
/* 6 */             this.f12647a = contextWrapper;
/* 12 */            this.f12648b = LayoutInflater.from(contextWrapper);
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: b */
                public final void mo419b(boolean z) {
/* 1 */             j81 j81Var = this.f12653i;
/* 3 */             if (j81Var != null) {
/* 5 */                 j81Var.notifyDataSetChanged();
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: c */
                public final boolean mo420c(hi2 hi2Var) {
/* 1 */             boolean zHasVisibleItems = hi2Var.hasVisibleItems();
/* 5 */             Context context = hi2Var.f12256a;
/* 7 */             if (!zHasVisibleItems) {
/* 9 */                 return false;
                    }
/* 13 */            kg1 kg1Var = new kg1();
/* 16 */            kg1Var.f12744a = hi2Var;
/* 20 */            C1954n7 c1954n7 = new C1954n7(context);
/* 27 */            C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 33 */            k81 k81Var = new k81(c1783j7.f12105a, R$layout.abc_list_menu_item_layout);
/* 36 */            kg1Var.f12746c = k81Var;
/* 38 */            k81Var.f12652f = kg1Var;
/* 40 */            hi2Var.m5802b(k81Var, context);
/* 43 */            k81 k81Var2 = kg1Var.f12746c;
/* 47 */            if (k81Var2.f12653i == null) {
/* 54 */                k81Var2.f12653i = new j81(k81Var2);
                    }
/* 58 */            c1783j7.f12119o = k81Var2.f12653i;
/* 60 */            c1783j7.f12120p = kg1Var;
/* 62 */            View view = hi2Var.f12270o;
/* 64 */            if (view != null) {
/* 66 */                c1783j7.f12109e = view;
                    } else {
/* 71 */                c1783j7.f12107c = hi2Var.f12269n;
/* 75 */                c1783j7.f12108d = hi2Var.f12268m;
                    }
/* 77 */            c1783j7.f12118n = kg1Var;
/* 79 */            DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
/* 83 */            kg1Var.f12745b = dialogInterfaceC1991o7M6897b;
/* 85 */            dialogInterfaceC1991o7M6897b.setOnDismissListener(kg1Var);
/* 94 */            WindowManager.LayoutParams attributes = kg1Var.f12745b.getWindow().getAttributes();
/* 100 */           attributes.type = 1003;
/* 107 */           attributes.flags |= 131072;
/* 111 */           kg1Var.f12745b.show();
/* 114 */           dh1 dh1Var = this.f12652f;
/* 116 */           if (dh1Var == null) {
/* 121 */               return true;
                    }
/* 118 */           dh1Var.mo2942z(hi2Var);
/* 121 */           return true;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: d */
                public final void mo421d(jg1 jg1Var, boolean z) {
/* 1 */             dh1 dh1Var = this.f12652f;
/* 3 */             if (dh1Var != null) {
/* 5 */                 dh1Var.mo2938d(jg1Var, z);
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: e */
                public final boolean mo422e() {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: f */
                public final boolean mo433f(sg1 sg1Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: g */
                public final void mo423g(Parcelable parcelable) {
/* 5 */             SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
/* 9 */             if (sparseParcelableArray != null) {
/* 13 */                this.f12650d.restoreHierarchyState(sparseParcelableArray);
                    }
                }

                @Override // p000.eh1
                public final int getId() {
/* 1 */             return 0;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: h */
                public final void mo3431h(dh1 dh1Var) {
                    throw null;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: i */
                public final boolean mo434i(sg1 sg1Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: k */
                public final void mo425k(Context context, jg1 jg1Var) {
/* 3 */             if (this.f12647a != null) {
/* 5 */                 this.f12647a = context;
/* 9 */                 if (this.f12648b == null) {
/* 15 */                    this.f12648b = LayoutInflater.from(context);
                        }
                    }
/* 17 */            this.f12649c = jg1Var;
/* 19 */            j81 j81Var = this.f12653i;
/* 21 */            if (j81Var != null) {
/* 23 */                j81Var.notifyDataSetChanged();
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: l */
                public final Parcelable mo426l() {
/* 3 */             if (this.f12650d == null) {
/* 5 */                 return null;
                    }
/* 9 */             Bundle bundle = new Bundle();
/* 14 */            SparseArray<Parcelable> sparseArray = new SparseArray<>();
/* 17 */            ExpandedMenuView expandedMenuView = this.f12650d;
/* 19 */            if (expandedMenuView != null) {
/* 21 */                expandedMenuView.saveHierarchyState(sparseArray);
                    }
/* 26 */            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
/* 29 */            return bundle;
                }

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
/* 10 */            this.f12649c.m5809q(this.f12653i.getItem(i), this, 0);
                }
            }
