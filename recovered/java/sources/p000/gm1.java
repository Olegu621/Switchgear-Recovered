            package p000;

            import android.content.Context;
            import android.content.res.ColorStateList;
            import android.graphics.drawable.Drawable;
            import android.graphics.drawable.RippleDrawable;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.widget.LinearLayout;
            import com.google.android.material.R$dimen;
            import com.google.android.material.internal.NavigationMenuView;
            import com.google.android.material.internal.ParcelableSparseArray;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gm1 implements eh1 {

                /* JADX INFO: renamed from: U */
                public ColorStateList f8713U;

                /* JADX INFO: renamed from: V */
                public ColorStateList f8714V;

                /* JADX INFO: renamed from: W */
                public Drawable f8715W;

                /* JADX INFO: renamed from: X */
                public RippleDrawable f8716X;

                /* JADX INFO: renamed from: Y */
                public int f8717Y;

                /* JADX INFO: renamed from: Z */
                public int f8718Z;

                /* JADX INFO: renamed from: a */
                public NavigationMenuView f8719a;

                /* JADX INFO: renamed from: a0 */
                public int f8720a0;

                /* JADX INFO: renamed from: b */
                public LinearLayout f8721b;

                /* JADX INFO: renamed from: b0 */
                public int f8722b0;

                /* JADX INFO: renamed from: c */
                public jg1 f8723c;

                /* JADX INFO: renamed from: c0 */
                public int f8724c0;

                /* JADX INFO: renamed from: d */
                public int f8725d;

                /* JADX INFO: renamed from: d0 */
                public int f8726d0;

                /* JADX INFO: renamed from: e */
                public yl1 f8727e;

                /* JADX INFO: renamed from: e0 */
                public int f8728e0;

                /* JADX INFO: renamed from: f */
                public LayoutInflater f8729f;

                /* JADX INFO: renamed from: f0 */
                public boolean f8730f0;

                /* JADX INFO: renamed from: h0 */
                public int f8732h0;

                /* JADX INFO: renamed from: i0 */
                public int f8734i0;

                /* JADX INFO: renamed from: j0 */
                public int f8735j0;

                /* JADX INFO: renamed from: v */
                public ColorStateList f8738v;

                /* JADX INFO: renamed from: i */
                public int f8733i = 0;

                /* JADX INFO: renamed from: w */
                public int f8739w = 0;

                /* JADX INFO: renamed from: g0 */
                public boolean f8731g0 = true;

                /* JADX INFO: renamed from: k0 */
                public int f8736k0 = -1;

                /* JADX INFO: renamed from: l0 */
                public final ViewOnClickListenerC2239u1 f8737l0 = new ViewOnClickListenerC2239u1(this, 7);

                @Override // p000.eh1
                /* JADX INFO: renamed from: b */
                public final void mo419b(boolean z) {
/* 1 */             yl1 yl1Var = this.f8727e;
/* 3 */             if (yl1Var != null) {
/* 5 */                 yl1Var.m10157h();
/* 8 */                 yl1Var.m958d();
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
                    sg1 sg1Var;
                    View actionView;
                    ParcelableSparseArray parcelableSparseArray;
/* 3 */             if (parcelable instanceof Bundle) {
/* 5 */                 Bundle bundle = (Bundle) parcelable;
/* 9 */                 SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
/* 13 */                if (sparseParcelableArray != null) {
/* 17 */                    this.f8719a.restoreHierarchyState(sparseParcelableArray);
                        }
/* 22 */                Bundle bundle2 = bundle.getBundle("android:menu:adapter");
/* 26 */                if (bundle2 != null) {
/* 28 */                    yl1 yl1Var = this.f8727e;
/* 30 */                    ArrayList arrayList = yl1Var.f19677d;
/* 35 */                    int i = bundle2.getInt("android:menu:checked", 0);
/* 39 */                    if (i != 0) {
/* 42 */                        yl1Var.f19679f = true;
/* 44 */                        int size = arrayList.size();
/* 49 */                        for (int i2 = 0; i2 < size; i2++) {
/* 55 */                            am1 am1Var = (am1) arrayList.get(i2);
/* 59 */                            if (am1Var instanceof cm1) {
/* 63 */                                sg1 sg1Var2 = ((cm1) am1Var).f3000a;
/* 67 */                                if (sg1Var2.f16583a == i) {
/* 69 */                                    yl1Var.m10158i(sg1Var2);
                                            break;
                                        }
                                    }
                                }
/* 76 */                        yl1Var.f19679f = false;
/* 78 */                        yl1Var.m10157h();
                            }
/* 83 */                    SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
/* 87 */                    if (sparseParcelableArray2 != null) {
/* 89 */                        int size2 = arrayList.size();
/* 93 */                        for (int i3 = 0; i3 < size2; i3++) {
/* 99 */                            am1 am1Var2 = (am1) arrayList.get(i3);
/* 103 */                           if ((am1Var2 instanceof cm1) && (actionView = (sg1Var = ((cm1) am1Var2).f3000a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(sg1Var.f16583a)) != null) {
/* 128 */                               actionView.restoreHierarchyState(parcelableSparseArray);
                                    }
                                }
                            }
                        }
/* 136 */               SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
/* 140 */               if (sparseParcelableArray3 != null) {
/* 144 */                   this.f8721b.restoreHierarchyState(sparseParcelableArray3);
                        }
                    }
                }

                @Override // p000.eh1
                public final int getId() {
/* 1 */             return this.f8725d;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: i */
                public final boolean mo434i(sg1 sg1Var) {
/* 1 */             return false;
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: k */
                public final void mo425k(Context context, jg1 jg1Var) {
/* 5 */             this.f8729f = LayoutInflater.from(context);
/* 7 */             this.f8723c = jg1Var;
/* 19 */            this.f8735j0 = context.getResources().getDimensionPixelOffset(R$dimen.design_navigation_separator_vertical_padding);
                }

                @Override // p000.eh1
                /* JADX INFO: renamed from: l */
                public final Parcelable mo426l() {
                    sg1 sg1Var;
                    View actionView;
/* 3 */             Bundle bundle = new Bundle();
/* 8 */             if (this.f8719a != null) {
/* 12 */                SparseArray<Parcelable> sparseArray = new SparseArray<>();
/* 17 */                this.f8719a.saveHierarchyState(sparseArray);
/* 22 */                bundle.putSparseParcelableArray("android:menu:list", sparseArray);
                    }
/* 25 */            yl1 yl1Var = this.f8727e;
/* 27 */            if (yl1Var != null) {
/* 29 */                ArrayList arrayList = yl1Var.f19677d;
/* 33 */                Bundle bundle2 = new Bundle();
/* 36 */                sg1 sg1Var2 = yl1Var.f19678e;
/* 38 */                if (sg1Var2 != null) {
/* 44 */                    bundle2.putInt("android:menu:checked", sg1Var2.f16583a);
                        }
/* 49 */                SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
/* 52 */                int size = arrayList.size();
/* 57 */                for (int i = 0; i < size; i++) {
/* 63 */                    am1 am1Var = (am1) arrayList.get(i);
/* 67 */                    if ((am1Var instanceof cm1) && (actionView = (sg1Var = ((cm1) am1Var).f3000a).getActionView()) != null) {
/* 81 */                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
/* 84 */                        actionView.saveHierarchyState(parcelableSparseArray);
/* 89 */                        sparseArray2.put(sg1Var.f16583a, parcelableSparseArray);
                            }
                        }
/* 97 */                bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
/* 102 */               bundle.putBundle("android:menu:adapter", bundle2);
                    }
/* 107 */           if (this.f8721b != null) {
/* 111 */               SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
/* 116 */               this.f8721b.saveHierarchyState(sparseArray3);
/* 121 */               bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
                    }
/* 124 */           return bundle;
                }
            }
