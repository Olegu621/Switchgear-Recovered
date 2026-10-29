            package com.google.android.material.navigation;

            import android.content.Context;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import android.view.MenuItem;
            import androidx.transition.AutoTransition;
            import com.google.android.material.badge.BadgeState$State;
            import com.google.android.material.internal.ParcelableSparseArray;
            import p000.C1927mh;
            import p000.C1951n4;
            import p000.eh1;
            import p000.hi2;
            import p000.jg1;
            import p000.lr2;
            import p000.rl1;
            import p000.sg1;
            import p000.tl1;
            
            /* JADX INFO: renamed from: com.google.android.material.navigation.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0366b implements eh1 {

                /* JADX INFO: renamed from: a */
                public tl1 f4831a;

                /* JADX INFO: renamed from: b */
                public boolean f4832b;

                /* JADX INFO: renamed from: c */
                public int f4833c;

                @Override // p000.eh1
                /* JADX INFO: renamed from: b */
                public final void mo419b(boolean z) {
                    AutoTransition autoTransition;
/* 3 */             if (this.f4832b) {
/* 142 */               return;
                    }
/* 7 */             tl1 tl1Var = this.f4831a;
/* 9 */             if (z) {
/* 11 */                tl1Var.m8809a();
/* 14 */                return;
                    }
/* 15 */            jg1 jg1Var = tl1Var.f17174p0;
/* 17 */            if (jg1Var == null || tl1Var.f17162f == null) {
/* 142 */               return;
                    }
/* 27 */            int size = jg1Var.f12261f.size();
/* 34 */            if (size != tl1Var.f17162f.length) {
/* 36 */                tl1Var.m8809a();
/* 39 */                return;
                    }
/* 40 */            int i = tl1Var.f17166i;
/* 44 */            for (int i2 = 0; i2 < size; i2++) {
/* 48 */                MenuItem item = tl1Var.f17174p0.getItem(i2);
/* 56 */                if (item.isChecked()) {
/* 62 */                    tl1Var.f17166i = item.getItemId();
/* 64 */                    tl1Var.f17175v = i2;
                        }
                    }
/* 71 */            if (i != tl1Var.f17166i && (autoTransition = tl1Var.f17152a) != null) {
/* 77 */                lr2.m6525a(tl1Var, autoTransition);
                    }
/* 92 */            boolean zM8808f = tl1.m8808f(tl1Var.f17160e, tl1Var.f17174p0.m5807l().size());
/* 97 */            for (int i3 = 0; i3 < size; i3++) {
/* 102 */               tl1Var.f17173o0.f4832b = true;
/* 110 */               tl1Var.f17162f[i3].setLabelVisibilityMode(tl1Var.f17160e);
/* 117 */               tl1Var.f17162f[i3].setShifting(zM8808f);
/* 132 */               tl1Var.f17162f[i3].mo327c((sg1) tl1Var.f17174p0.getItem(i3));
/* 137 */               tl1Var.f17173o0.f4832b = false;
                    }
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: c */
                public final boolean mo420c(hi2 hi2Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: d */
                public final void mo421d(jg1 jg1Var, boolean z) {
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
/* 3 */             if (parcelable instanceof NavigationBarPresenter$SavedState) {
/* 5 */                 tl1 tl1Var = this.f4831a;
/* 7 */                 NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (NavigationBarPresenter$SavedState) parcelable;
/* 9 */                 int i = navigationBarPresenter$SavedState.f4812a;
/* 15 */                int size = tl1Var.f17174p0.f12261f.size();
/* 21 */                for (int i2 = 0; i2 < size; i2++) {
/* 25 */                    MenuItem item = tl1Var.f17174p0.getItem(i2);
/* 33 */                    if (i == item.getItemId()) {
/* 35 */                        tl1Var.f17166i = i;
/* 37 */                        tl1Var.f17175v = i2;
/* 40 */                        item.setChecked(true);
                                break;
                            }
                        }
/* 49 */                Context context = this.f4831a.getContext();
/* 53 */                ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.f4813b;
/* 61 */                SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
/* 69 */                for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
/* 71 */                    int iKeyAt = parcelableSparseArray.keyAt(i3);
/* 79 */                    BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i3);
/* 81 */                    if (badgeState$State == null) {
/* 96 */                        C1951n4.m6859j("BadgeDrawable's savedState cannot be null");
/* 99 */                        return;
                            }
/* 88 */                    sparseArray.put(iKeyAt, new C1927mh(context, badgeState$State));
                        }
/* 100 */               tl1 tl1Var2 = this.f4831a;
/* 102 */               SparseArray sparseArray2 = tl1Var2.f17161e0;
/* 109 */               for (int i4 = 0; i4 < sparseArray.size(); i4++) {
/* 111 */                   int iKeyAt2 = sparseArray.keyAt(i4);
/* 119 */                   if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
/* 125 */                       sparseArray2.append(iKeyAt2, sparseArray.get(iKeyAt2));
                            }
                        }
/* 131 */               rl1[] rl1VarArr = tl1Var2.f17162f;
/* 133 */               if (rl1VarArr != null) {
/* 136 */                   for (rl1 rl1Var : rl1VarArr) {
/* 150 */                       rl1Var.setBadge((C1927mh) sparseArray2.get(rl1Var.getId()));
                            }
                        }
                    }
                }

                @Override // p000.eh1
                public final int getId() {
/* 1 */             return this.f4833c;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: i */
                public final boolean mo434i(sg1 sg1Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: k */
                public final void mo425k(Context context, jg1 jg1Var) {
/* 3 */             this.f4831a.f17174p0 = jg1Var;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: l */
                public final Parcelable mo426l() {
/* 3 */             NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
/* 12 */            navigationBarPresenter$SavedState.f4812a = this.f4831a.getSelectedItemId();
/* 16 */            SparseArray<C1927mh> badgeDrawables = this.f4831a.getBadgeDrawables();
/* 22 */            ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
/* 30 */            for (int i = 0; i < badgeDrawables.size(); i++) {
/* 32 */                int iKeyAt = badgeDrawables.keyAt(i);
/* 36 */                C1927mh c1927mhValueAt = badgeDrawables.valueAt(i);
/* 42 */                if (c1927mhValueAt == null) {
/* 56 */                    C1951n4.m6859j("badgeDrawable cannot be null");
/* 59 */                    return null;
                        }
/* 48 */                parcelableSparseArray.put(iKeyAt, c1927mhValueAt.f13777e.f14262a);
                    }
/* 61 */            navigationBarPresenter$SavedState.f4813b = parcelableSparseArray;
/* 63 */            return navigationBarPresenter$SavedState;
                }
            }
