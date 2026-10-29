            package androidx.fragment.app;

            import android.content.res.Resources;
            import android.os.BadParcelableException;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.ViewParent;
            import androidx.fragment.R$id;
            import java.util.ArrayList;
            import java.util.Objects;
            import java.util.WeakHashMap;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.ViewOnAttachStateChangeListenerC2228tr;
            import p000.an0;
            import p000.bn0;
            import p000.e33;
            import p000.f42;
            import p000.fm0;
            import p000.i93;
            import p000.j93;
            import p000.om0;
            import p000.q23;
            import p000.rm0;
            import p000.s80;
            import p000.u33;
            import p000.u61;
            import p000.wc0;
            import p000.xf2;
            import p000.zm0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.y */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 123 */   public final class C0113y {

                /* JADX INFO: renamed from: a */
                public final wc0 f1524a;

                /* JADX INFO: renamed from: b */
                public final C0114z f1525b;

                /* JADX INFO: renamed from: c */
                public final Fragment f1526c;

                /* JADX INFO: renamed from: d */
                public boolean f1527d = false;

                /* JADX INFO: renamed from: e */
                public int f1528e = -1;

                public C0113y(wc0 wc0Var, C0114z c0114z, ClassLoader classLoader, rm0 rm0Var, Bundle bundle) {
/* 10 */            this.f1524a = wc0Var;
/* 12 */            this.f1525b = c0114z;
/* 20 */            FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
/* 31 */            Fragment fragmentInstantiate = Fragment.instantiate(rm0Var.f16180a.f1512v.f14817b, fragmentState.f1372a, null);
/* 37 */            fragmentInstantiate.mWho = fragmentState.f1373b;
/* 41 */            fragmentInstantiate.mFromLayout = fragmentState.f1374c;
/* 44 */            fragmentInstantiate.mRestored = true;
/* 48 */            fragmentInstantiate.mFragmentId = fragmentState.f1375d;
/* 52 */            fragmentInstantiate.mContainerId = fragmentState.f1376e;
/* 56 */            fragmentInstantiate.mTag = fragmentState.f1377f;
/* 60 */            fragmentInstantiate.mRetainInstance = fragmentState.f1378i;
/* 64 */            fragmentInstantiate.mRemoving = fragmentState.f1379v;
/* 68 */            fragmentInstantiate.mDetached = fragmentState.f1380w;
/* 72 */            fragmentInstantiate.mHidden = fragmentState.f1367U;
/* 82 */            fragmentInstantiate.mMaxState = u61.values()[fragmentState.f1368V];
/* 86 */            fragmentInstantiate.mTargetWho = fragmentState.f1369W;
/* 90 */            fragmentInstantiate.mTargetRequestCode = fragmentState.f1370X;
/* 94 */            fragmentInstantiate.mUserVisibleHint = fragmentState.f1371Y;
/* 96 */            this.f1526c = fragmentInstantiate;
/* 98 */            fragmentInstantiate.mSavedFragmentState = bundle;
/* 102 */           Bundle bundle2 = bundle.getBundle("arguments");
/* 106 */           if (bundle2 != null) {
/* 108 */               bundle2.setClassLoader(classLoader);
                    }
/* 111 */           fragmentInstantiate.setArguments(bundle2);
/* 119 */           if (AbstractC0111w.m674K(2)) {
/* 121 */               Objects.toString(fragmentInstantiate);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m733a() {
                    Fragment fragment;
                    View view;
                    View view2;
/* 1 */             Fragment fragment2 = this.f1526c;
/* 3 */             View view3 = fragment2.mContainer;
                    while (true) {
/* 5 */                 fragment = null;
/* 6 */                 if (view3 == null) {
                            break;
                        }
/* 10 */                Object tag = view3.getTag(R$id.fragment_container_view_tag);
/* 21 */                Fragment fragment3 = tag instanceof Fragment ? (Fragment) tag : null;
/* 22 */                if (fragment3 != null) {
/* 24 */                    fragment = fragment3;
                            break;
                        } else {
/* 26 */                    Object parent = view3.getParent();
/* 37 */                    view3 = parent instanceof View ? (View) parent : null;
                        }
                    }
/* 39 */            Fragment parentFragment = fragment2.getParentFragment();
/* 43 */            if (fragment != null && !fragment.equals(parentFragment)) {
/* 51 */                int i = fragment2.mContainerId;
/* 53 */                an0 an0Var = bn0.f2547a;
/* 61 */                StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
/* 64 */                sb.append(fragment2);
/* 69 */                sb.append(" within the view of parent fragment ");
/* 72 */                sb.append(fragment);
/* 77 */                sb.append(" via container with ID ");
/* 86 */                j93 j93Var = new j93(fragment2, fm0.m3786l(sb, i, " without using parent's childFragmentManager"));
/* 89 */                bn0.m1397c(j93Var);
/* 92 */                an0 an0VarM1395a = bn0.m1395a(fragment2);
/* 104 */               if (an0VarM1395a.f341a.contains(zm0.f20255e) && bn0.m1399e(an0VarM1395a, fragment2.getClass(), j93.class)) {
/* 118 */                   bn0.m1396b(an0VarM1395a, j93Var);
                        }
                    }
/* 123 */           ArrayList arrayList = this.f1525b.f1529a;
/* 125 */           ViewGroup viewGroup = fragment2.mContainer;
/* 127 */           int iIndexOfChild = -1;
/* 128 */           if (viewGroup != null) {
/* 131 */               int iIndexOf = arrayList.indexOf(fragment2);
/* 137 */               for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
/* 143 */                   Fragment fragment4 = (Fragment) arrayList.get(i2);
/* 147 */                   if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
/* 157 */                       iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                            }
                        }
                        while (true) {
/* 163 */                   iIndexOf++;
/* 169 */                   if (iIndexOf >= arrayList.size()) {
                                break;
                            }
/* 175 */                   Fragment fragment5 = (Fragment) arrayList.get(iIndexOf);
/* 179 */                   if (fragment5.mContainer == viewGroup && (view = fragment5.mView) != null) {
/* 185 */                       iIndexOfChild = viewGroup.indexOfChild(view);
                                break;
                            }
                        }
                    }
/* 195 */           fragment2.mContainer.addView(fragment2.mView, iIndexOfChild);
                }

                /* JADX INFO: renamed from: b */
                public final void m734b() {
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             Fragment fragment = this.f1526c;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(fragment);
                    }
/* 13 */            Fragment fragment2 = fragment.mTarget;
/* 15 */            C0113y c0113y = null;
/* 22 */            C0114z c0114z = this.f1525b;
/* 24 */            if (fragment2 != null) {
/* 34 */                C0113y c0113y2 = (C0113y) c0114z.f1530b.get(fragment2.mWho);
/* 36 */                if (c0113y2 == null) {
/* 52 */                    StringBuilder sb = new StringBuilder("Fragment ");
/* 55 */                    sb.append(fragment);
/* 58 */                    Fragment fragment3 = fragment.mTarget;
/* 60 */                    sb.append(" declared target fragment ");
/* 63 */                    sb.append(fragment3);
/* 66 */                    sb.append(" that does not belong to this FragmentManager!");
/* 76 */                    throw new IllegalStateException(sb.toString());
                        }
/* 42 */                fragment.mTargetWho = fragment.mTarget.mWho;
/* 44 */                fragment.mTarget = null;
/* 46 */                c0113y = c0113y2;
                    } else {
/* 77 */                String str = fragment.mTargetWho;
/* 79 */                if (str != null && (c0113y = (C0113y) c0114z.f1530b.get(str)) == null) {
/* 95 */                    StringBuilder sb2 = new StringBuilder("Fragment ");
/* 98 */                    sb2.append(fragment);
/* 101 */                   sb2.append(" declared target fragment ");
/* 110 */                   f42.m3656l(fm0.m3789o(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
/* 113 */                   return;
                        }
                    }
/* 114 */           if (c0113y != null) {
/* 116 */               c0113y.m741i();
                    }
/* 119 */           AbstractC0111w abstractC0111w = fragment.mFragmentManager;
/* 123 */           fragment.mHost = abstractC0111w.f1512v;
/* 127 */           fragment.mParentFragment = abstractC0111w.f1514x;
/* 129 */           wc0 wc0Var = this.f1524a;
/* 132 */           wc0Var.m9537l(fragment, false);
/* 135 */           fragment.performAttach();
/* 138 */           wc0Var.m9532g(fragment, false);
                }

                /* JADX INFO: renamed from: c */
                public final int m735c() {
/* 1 */             Fragment fragment = this.f1526c;
/* 5 */             if (fragment.mFragmentManager == null) {
/* 7 */                 return fragment.mState;
                    }
/* 10 */            int iMin = this.f1528e;
/* 14 */            int iOrdinal = fragment.mMaxState.ordinal();
/* 18 */            int i = 0;
/* 25 */            if (iOrdinal == 1) {
/* 48 */                iMin = Math.min(iMin, 0);
                    } else if (iOrdinal == 2) {
/* 43 */                iMin = Math.min(iMin, 1);
                    } else if (iOrdinal == 3) {
/* 38 */                iMin = Math.min(iMin, 5);
                    } else if (iOrdinal != 4) {
/* 33 */                iMin = Math.min(iMin, -1);
                    }
/* 54 */            if (fragment.mFromLayout) {
/* 56 */                boolean z = fragment.mInLayout;
/* 58 */                int i2 = this.f1528e;
/* 60 */                if (z) {
/* 62 */                    iMin = Math.max(i2, 2);
/* 66 */                    View view = fragment.mView;
/* 68 */                    if (view != null && view.getParent() == null) {
/* 76 */                        iMin = Math.min(iMin, 2);
                            }
                        } else {
/* 90 */                    iMin = i2 < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
                        }
                    }
/* 96 */            if (!fragment.mAdded) {
/* 98 */                iMin = Math.min(iMin, 1);
                    }
/* 102 */           ViewGroup viewGroup = fragment.mContainer;
/* 104 */           if (viewGroup != null) {
/* 110 */               C0096h c0096hM654j = C0096h.m654j(viewGroup, fragment.getParentFragmentManager());
/* 114 */               C0091c0 c0091c0M660g = c0096hM654j.m660g(fragment);
/* 123 */               int i3 = c0091c0M660g != null ? c0091c0M660g.f1409b : 0;
/* 124 */               C0091c0 c0091c0M661h = c0096hM654j.m661h(fragment);
/* 130 */               i = c0091c0M661h != null ? c0091c0M661h.f1409b : 0;
/* 142 */               int i4 = i3 == 0 ? -1 : xf2.f19076a[AbstractC0886en.m3520y(i3)];
/* 144 */               if (i4 != -1 && i4 != 1) {
/* 148 */                   i = i3;
                        }
                    }
/* 149 */           if (i == 2) {
/* 152 */               iMin = Math.min(iMin, 6);
                    } else if (i == 3) {
/* 159 */               iMin = Math.max(iMin, 3);
                    } else if (fragment.mRemoving) {
/* 179 */               iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
                    }
/* 185 */           if (fragment.mDeferStart && fragment.mState < 5) {
/* 191 */               iMin = Math.min(iMin, 4);
                    }
/* 197 */           if (fragment.mTransitioning && fragment.mContainer != null) {
/* 203 */               iMin = Math.max(iMin, 3);
                    }
/* 211 */           if (AbstractC0111w.m674K(2)) {
/* 213 */               Objects.toString(fragment);
                    }
/* 216 */           return iMin;
                }

                /* JADX INFO: renamed from: d */
                public final void m736d() {
                    String resourceName;
/* 1 */             Fragment fragment = this.f1526c;
/* 5 */             if (fragment.mFromLayout) {
/* 7 */                 return;
                    }
/* 13 */            if (AbstractC0111w.m674K(3)) {
/* 15 */                Objects.toString(fragment);
                    }
/* 18 */            Bundle bundle = fragment.mSavedFragmentState;
/* 20 */            ViewGroup viewGroup = null;
/* 30 */            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
/* 31 */            LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
/* 35 */            ViewGroup viewGroup2 = fragment.mContainer;
/* 37 */            if (viewGroup2 != null) {
/* 39 */                viewGroup = viewGroup2;
                    } else {
/* 42 */                int i = fragment.mContainerId;
/* 44 */                if (i != 0) {
/* 47 */                    if (i == -1) {
/* 177 */                       C1951n4.m6859j(fm0.m3782h("Cannot create fragment ", fragment, " for a container view with no id"));
/* 180 */                       return;
                            }
/* 57 */                    viewGroup = (ViewGroup) fragment.mFragmentManager.f1513w.mo669b(i);
/* 59 */                    if (viewGroup == null) {
/* 63 */                        if (!fragment.mRestored) {
                                    try {
/* 73 */                                resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                                    } catch (Resources.NotFoundException unused) {
/* 79 */                                resourceName = "unknown";
                                    }
/* 94 */                            s80.m8427h("No view found for id 0x", Integer.toHexString(fragment.mContainerId), " (", resourceName, ") for fragment ", fragment);
/* 97 */                            return;
                                }
                            } else if (!(viewGroup instanceof FragmentContainerView)) {
/* 102 */                       an0 an0Var = bn0.f2547a;
/* 133 */                       i93 i93Var = new i93(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
/* 136 */                       bn0.m1397c(i93Var);
/* 139 */                       an0 an0VarM1395a = bn0.m1395a(fragment);
/* 151 */                       if (an0VarM1395a.f341a.contains(zm0.f20259w) && bn0.m1399e(an0VarM1395a, fragment.getClass(), i93.class)) {
/* 165 */                           bn0.m1396b(an0VarM1395a, i93Var);
                                }
                            }
                        }
                    }
/* 181 */           fragment.mContainer = viewGroup;
/* 183 */           fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
/* 188 */           int i2 = 2;
/* 189 */           if (fragment.mView != null) {
/* 195 */               if (AbstractC0111w.m674K(3)) {
/* 197 */                   Objects.toString(fragment);
                        }
/* 203 */               fragment.mView.setSaveFromParentEnabled(false);
/* 210 */               fragment.mView.setTag(R$id.fragment_container_view_tag, fragment);
/* 213 */               if (viewGroup != null) {
/* 215 */                   m733a();
                        }
/* 220 */               if (fragment.mHidden) {
/* 226 */                   fragment.mView.setVisibility(8);
                        }
/* 231 */               boolean zIsAttachedToWindow = fragment.mView.isAttachedToWindow();
/* 235 */               View view = fragment.mView;
/* 237 */               if (zIsAttachedToWindow) {
/* 239 */                   WeakHashMap weakHashMap = e33.f7494a;
/* 241 */                   q23.m7679c(view);
                        } else {
/* 250 */                   view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2228tr(view, i2));
                        }
/* 253 */               fragment.performViewCreated();
/* 260 */               this.f1524a.m9543r(fragment, fragment.mView, false);
/* 265 */               int visibility = fragment.mView.getVisibility();
/* 275 */               fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
/* 280 */               if (fragment.mContainer != null && visibility == 0) {
/* 286 */                   View viewFindFocus = fragment.mView.findFocus();
/* 290 */                   if (viewFindFocus != null) {
/* 292 */                       fragment.setFocusedView(viewFindFocus);
/* 299 */                       if (AbstractC0111w.m674K(2)) {
/* 301 */                           viewFindFocus.toString();
/* 304 */                           Objects.toString(fragment);
                                }
                            }
/* 310 */                   fragment.mView.setAlpha(0.0f);
                        }
                    }
/* 313 */           fragment.mState = 2;
                }

                /* JADX INFO: renamed from: e */
                public final void m737e() {
                    Fragment fragmentM747b;
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             Fragment fragment = this.f1526c;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(fragment);
                    }
/* 15 */            boolean zIsChangingConfigurations = true;
/* 27 */            boolean z = fragment.mRemoving && !fragment.isInBackStack();
/* 29 */            C0114z c0114z = this.f1525b;
/* 31 */            if (z && !fragment.mBeingSaved) {
/* 39 */                c0114z.m754i(fragment.mWho, null);
                    }
/* 42 */            if (!z) {
/* 44 */                C0112x c0112x = c0114z.f1532d;
/* 65 */                if (!((c0112x.f1518d.containsKey(fragment.mWho) && c0112x.f1521g) ? c0112x.f1522h : true)) {
/* 68 */                    String str = fragment.mTargetWho;
/* 70 */                    if (str != null && (fragmentM747b = c0114z.m747b(str)) != null && fragmentM747b.mRetainInstance) {
/* 82 */                        fragment.mTarget = fragmentM747b;
                            }
/* 84 */                    fragment.mState = 0;
/* 86 */                    return;
                        }
                    }
/* 87 */            om0 om0Var = fragment.mHost;
/* 91 */            if (om0Var instanceof u33) {
/* 95 */                zIsChangingConfigurations = c0114z.f1532d.f1522h;
                    } else {
/* 98 */                FragmentActivity fragmentActivity = om0Var.f14817b;
/* 100 */               if (fragmentActivity != null) {
/* 106 */                   zIsChangingConfigurations = true ^ fragmentActivity.isChangingConfigurations();
                        }
                    }
/* 107 */           if ((z && !fragment.mBeingSaved) || zIsChangingConfigurations) {
/* 115 */               C0112x c0112x2 = c0114z.f1532d;
/* 117 */               c0112x2.getClass();
/* 124 */               if (AbstractC0111w.m674K(3)) {
/* 126 */                   Objects.toString(fragment);
                        }
/* 131 */               c0112x2.m731d(fragment.mWho, false);
                    }
/* 134 */           fragment.performDestroy();
/* 139 */           this.f1524a.m9534i(fragment, false);
/* 154 */           for (C0113y c0113y : c0114z.m749d()) {
/* 162 */               if (c0113y != null) {
/* 164 */                   Fragment fragment2 = c0113y.f1526c;
/* 174 */                   if (fragment.mWho.equals(fragment2.mTargetWho)) {
/* 176 */                       fragment2.mTarget = fragment;
/* 178 */                       fragment2.mTargetWho = null;
                            }
                        }
                    }
/* 181 */           String str2 = fragment.mTargetWho;
/* 183 */           if (str2 != null) {
/* 189 */               fragment.mTarget = c0114z.m747b(str2);
                    }
/* 191 */           c0114z.m753h(this);
                }

                /* JADX INFO: renamed from: f */
                public final void m738f() {
                    View view;
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             Fragment fragment = this.f1526c;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(fragment);
                    }
/* 13 */            ViewGroup viewGroup = fragment.mContainer;
/* 15 */            if (viewGroup != null && (view = fragment.mView) != null) {
/* 21 */                viewGroup.removeView(view);
                    }
/* 24 */            fragment.performDestroyView();
/* 30 */            this.f1524a.m9544s(fragment, false);
/* 34 */            fragment.mContainer = null;
/* 36 */            fragment.mView = null;
/* 38 */            fragment.mViewLifecycleOwner = null;
/* 42 */            fragment.mViewLifecycleOwnerLiveData.mo124j(null);
/* 45 */            fragment.mInLayout = false;
                }

                /* JADX INFO: renamed from: g */
                public final void m739g() {
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             Fragment fragment = this.f1526c;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(fragment);
                    }
/* 13 */            fragment.performDetach();
/* 19 */            this.f1524a.m9535j(fragment, false);
/* 23 */            fragment.mState = -1;
/* 26 */            fragment.mHost = null;
/* 28 */            fragment.mParentFragment = null;
/* 30 */            fragment.mFragmentManager = null;
/* 34 */            if (!fragment.mRemoving || fragment.isInBackStack()) {
/* 45 */                C0112x c0112x = this.f1525b.f1532d;
/* 66 */                if (!((c0112x.f1518d.containsKey(fragment.mWho) && c0112x.f1521g) ? c0112x.f1522h : true)) {
/* 80 */                    return;
                        }
                    }
/* 72 */            if (AbstractC0111w.m674K(3)) {
/* 74 */                Objects.toString(fragment);
                    }
/* 77 */            fragment.initState();
                }

                /* JADX INFO: renamed from: h */
                public final void m740h() {
/* 1 */             Fragment fragment = this.f1526c;
/* 5 */             if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
/* 20 */                if (AbstractC0111w.m674K(3)) {
/* 22 */                    Objects.toString(fragment);
                        }
/* 25 */                Bundle bundle = fragment.mSavedFragmentState;
/* 37 */                Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
/* 42 */                fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
/* 45 */                View view = fragment.mView;
/* 47 */                if (view != null) {
/* 50 */                    view.setSaveFromParentEnabled(false);
/* 57 */                    fragment.mView.setTag(R$id.fragment_container_view_tag, fragment);
/* 62 */                    if (fragment.mHidden) {
/* 68 */                        fragment.mView.setVisibility(8);
                            }
/* 71 */                    fragment.performViewCreated();
/* 78 */                    this.f1524a.m9543r(fragment, fragment.mView, false);
/* 82 */                    fragment.mState = 2;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m741i() {
                    ViewGroup viewGroup;
                    ViewGroup viewGroup2;
                    ViewGroup viewGroup3;
/* 1 */             boolean z = this.f1527d;
/* 4 */             Fragment fragment = this.f1526c;
/* 6 */             if (z) {
/* 12 */                if (AbstractC0111w.m674K(2)) {
/* 14 */                    Objects.toString(fragment);
/* 17 */                    return;
                        }
/* 17 */                return;
                    }
                    try {
/* 20 */                this.f1527d = true;
/* 22 */                boolean z2 = false;
                        while (true) {
/* 23 */                    int iM735c = m735c();
/* 27 */                    int i = fragment.mState;
/* 29 */                    int i2 = 3;
/* 30 */                    C0114z c0114z = this.f1525b;
/* 32 */                    if (iM735c == i) {
/* 383 */                       if (!z2 && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
/* 406 */                           if (AbstractC0111w.m674K(3)) {
/* 408 */                               Objects.toString(fragment);
                                    }
/* 411 */                           C0112x c0112x = c0114z.f1532d;
/* 413 */                           c0112x.getClass();
/* 420 */                           if (AbstractC0111w.m674K(3)) {
/* 422 */                               Objects.toString(fragment);
                                    }
/* 427 */                           c0112x.m731d(fragment.mWho, true);
/* 430 */                           c0114z.m753h(this);
/* 437 */                           if (AbstractC0111w.m674K(3)) {
/* 439 */                               Objects.toString(fragment);
                                    }
/* 442 */                           fragment.initState();
                                }
/* 447 */                       if (fragment.mHiddenChanged) {
/* 451 */                           if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
/* 461 */                               C0096h c0096hM654j = C0096h.m654j(viewGroup, fragment.getParentFragmentManager());
/* 467 */                               if (fragment.mHidden) {
/* 473 */                                   if (AbstractC0111w.m674K(2)) {
/* 475 */                                       Objects.toString(fragment);
                                            }
/* 478 */                                   c0096hM654j.m658d(3, 1, this);
                                        } else {
/* 486 */                                   if (AbstractC0111w.m674K(2)) {
/* 488 */                                       Objects.toString(fragment);
                                            }
/* 491 */                                   c0096hM654j.m658d(2, 1, this);
                                        }
                                    }
/* 494 */                           AbstractC0111w abstractC0111w = fragment.mFragmentManager;
/* 496 */                           if (abstractC0111w != null && fragment.mAdded && AbstractC0111w.m675L(fragment)) {
/* 508 */                               abstractC0111w.f1481F = true;
                                    }
/* 510 */                           fragment.mHiddenChanged = false;
/* 514 */                           fragment.onHiddenChanged(fragment.mHidden);
/* 519 */                           fragment.mChildFragmentManager.m717o();
                                }
/* 522 */                       this.f1527d = false;
/* 524 */                       return;
                            }
/* 34 */                    wc0 wc0Var = this.f1524a;
/* 36 */                    if (iM735c > i) {
                                switch (i + 1) {
                                    case 0:
/* 221 */                               m734b();
                                        break;
                                    case 1:
/* 186 */                               if (AbstractC0111w.m674K(3)) {
/* 188 */                                   Objects.toString(fragment);
                                        }
/* 191 */                               Bundle bundle = fragment.mSavedFragmentState;
/* 195 */                               Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
/* 201 */                               if (!fragment.mIsCreated) {
/* 203 */                                   wc0Var.m9538m(fragment, false);
/* 206 */                                   fragment.performCreate(bundle2);
/* 209 */                                   wc0Var.m9533h(fragment, false);
                                        } else {
/* 214 */                                   fragment.mState = 1;
/* 216 */                                   fragment.restoreChildFragmentState();
                                        }
                                        break;
                                    case 2:
/* 174 */                               m740h();
/* 177 */                               m736d();
                                        break;
                                    case 3:
/* 153 */                               if (AbstractC0111w.m674K(3)) {
/* 155 */                                   Objects.toString(fragment);
                                        }
/* 158 */                               Bundle bundle3 = fragment.mSavedFragmentState;
/* 166 */                               fragment.performActivityCreated(bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
/* 169 */                               wc0Var.m9531f(fragment, false);
                                        break;
                                    case 4:
/* 81 */                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
/* 91 */                                    C0096h c0096hM654j2 = C0096h.m654j(viewGroup3, fragment.getParentFragmentManager());
/* 97 */                                    int visibility = fragment.mView.getVisibility();
/* 101 */                                   if (visibility == 0) {
/* 132 */                                       i2 = 2;
                                            } else if (visibility == 4) {
/* 130 */                                       i2 = 4;
                                            } else if (visibility != 8) {
/* 129 */                                       throw new IllegalArgumentException("Unknown visibility " + visibility);
                                            }
/* 137 */                                   if (AbstractC0111w.m674K(2)) {
/* 139 */                                       Objects.toString(fragment);
                                            }
/* 142 */                                   c0096hM654j2.m658d(i2, 2, this);
                                        }
/* 145 */                               fragment.mState = 4;
                                        break;
                                    case 5:
/* 65 */                                if (AbstractC0111w.m674K(3)) {
/* 67 */                                    Objects.toString(fragment);
                                        }
/* 70 */                                fragment.performStart();
/* 73 */                                wc0Var.m9541p(fragment, false);
                                        break;
                                    case 6:
/* 57 */                                fragment.mState = 6;
                                        break;
                                    case 7:
/* 48 */                                m743k();
                                        break;
                                }
                            } else {
                                switch (i - 1) {
                                    case -1:
/* 377 */                               m739g();
                                        break;
                                    case 0:
/* 350 */                               if (fragment.mBeingSaved) {
/* 362 */                                   if (((Bundle) c0114z.f1531c.get(fragment.mWho)) == null) {
/* 370 */                                       c0114z.m754i(fragment.mWho, m744l());
                                            }
                                        }
/* 373 */                               m737e();
                                        break;
                                    case 1:
/* 342 */                               m738f();
/* 345 */                               fragment.mState = 1;
                                        break;
                                    case 2:
/* 337 */                               fragment.mInLayout = false;
/* 339 */                               fragment.mState = 2;
                                        break;
                                    case 3:
/* 276 */                               if (AbstractC0111w.m674K(3)) {
/* 278 */                                   Objects.toString(fragment);
                                        }
/* 283 */                               if (fragment.mBeingSaved) {
/* 291 */                                   c0114z.m754i(fragment.mWho, m744l());
                                        } else if (fragment.mView != null && fragment.mSavedViewState == null) {
/* 303 */                                   m745m();
                                        }
/* 308 */                               if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
/* 318 */                                   C0096h c0096hM654j3 = C0096h.m654j(viewGroup2, fragment.getParentFragmentManager());
/* 326 */                                   if (AbstractC0111w.m674K(2)) {
/* 328 */                                       Objects.toString(fragment);
                                            }
/* 331 */                                   c0096hM654j3.m658d(1, 3, this);
                                        }
/* 334 */                               fragment.mState = 3;
                                        break;
                                    case 4:
/* 259 */                               if (AbstractC0111w.m674K(3)) {
/* 261 */                                   Objects.toString(fragment);
                                        }
/* 264 */                               fragment.performStop();
/* 267 */                               wc0Var.m9542q(fragment, false);
                                        break;
                                    case 5:
/* 251 */                               fragment.mState = 5;
                                        break;
                                    case 6:
/* 237 */                               if (AbstractC0111w.m674K(3)) {
/* 239 */                                   Objects.toString(fragment);
                                        }
/* 242 */                               fragment.performPause();
/* 245 */                               wc0Var.m9536k(fragment, false);
                                        break;
                                }
                            }
/* 380 */                   z2 = true;
                        }
                    } catch (Throwable th) {
/* 525 */               this.f1527d = false;
/* 527 */               throw th;
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m742j(ClassLoader classLoader) {
/* 1 */             Fragment fragment = this.f1526c;
/* 3 */             Bundle bundle = fragment.mSavedFragmentState;
/* 5 */             if (bundle == null) {
/* 96 */                return;
                    }
/* 8 */             bundle.setClassLoader(classLoader);
/* 19 */            if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
/* 28 */                fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                    }
                    try {
/* 39 */                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
/* 49 */                fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
/* 59 */                FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable("state");
/* 61 */                if (fragmentState != null) {
/* 65 */                    fragment.mTargetWho = fragmentState.f1369W;
/* 69 */                    fragment.mTargetRequestCode = fragmentState.f1370X;
/* 71 */                    Boolean bool = fragment.mSavedUserVisibleHint;
/* 73 */                    if (bool != null) {
/* 79 */                        fragment.mUserVisibleHint = bool.booleanValue();
/* 82 */                        fragment.mSavedUserVisibleHint = null;
                            } else {
/* 87 */                        fragment.mUserVisibleHint = fragmentState.f1371Y;
                            }
                        }
/* 91 */                if (fragment.mUserVisibleHint) {
/* 96 */                    return;
                        }
/* 94 */                fragment.mDeferStart = true;
                    } catch (BadParcelableException e) {
/* 117 */               throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:16:0x002b  */
                /* JADX INFO: renamed from: k */
                public final void m743k() {
/* 2 */             boolean zM674K = AbstractC0111w.m674K(3);
/* 6 */             Fragment fragment = this.f1526c;
/* 8 */             if (zM674K) {
/* 10 */                Objects.toString(fragment);
                    }
/* 13 */            View focusedView = fragment.getFocusedView();
/* 17 */            if (focusedView != null) {
/* 21 */                if (focusedView == fragment.mView) {
/* 34 */                    focusedView.requestFocus();
/* 42 */                    if (AbstractC0111w.m674K(2)) {
/* 44 */                        focusedView.toString();
/* 47 */                        Objects.toString(fragment);
/* 56 */                        Objects.toString(fragment.mView.findFocus());
                            }
                        } else {
/* 24 */                    ViewParent parent = focusedView.getParent();
                            while (true) {
/* 28 */                        if (parent != null) {
/* 32 */                            if (parent == fragment.mView) {
                                        break;
                                    } else {
/* 60 */                                parent = parent.getParent();
                                    }
                                }
                            }
/* 34 */                    focusedView.requestFocus();
/* 42 */                    if (AbstractC0111w.m674K(2)) {
/* 44 */                        focusedView.toString();
/* 47 */                        Objects.toString(fragment);
/* 56 */                        Objects.toString(fragment.mView.findFocus());
                            }
                        }
                    }
/* 66 */            fragment.setFocusedView(null);
/* 69 */            fragment.performResume();
/* 75 */            this.f1524a.m9539n(fragment, false);
/* 82 */            this.f1525b.m754i(fragment.mWho, null);
/* 85 */            fragment.mSavedFragmentState = null;
/* 87 */            fragment.mSavedViewState = null;
/* 89 */            fragment.mSavedViewRegistryState = null;
                }

                /* JADX INFO: renamed from: l */
                public final Bundle m744l() {
                    Bundle bundle;
/* 3 */             Bundle bundle2 = new Bundle();
/* 6 */             Fragment fragment = this.f1526c;
/* 11 */            if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
/* 17 */                bundle2.putAll(bundle);
                    }
/* 27 */            bundle2.putParcelable("state", new FragmentState(fragment));
/* 32 */            if (fragment.mState > -1) {
/* 36 */                Bundle bundle3 = new Bundle();
/* 39 */                fragment.performSaveInstanceState(bundle3);
/* 46 */                if (!bundle3.isEmpty()) {
/* 50 */                    bundle2.putBundle("savedInstanceState", bundle3);
                        }
/* 56 */                this.f1524a.m9540o(fragment, bundle3, false);
/* 61 */                Bundle bundle4 = new Bundle();
/* 66 */                fragment.mSavedStateRegistryController.m10115c(bundle4);
/* 73 */                if (!bundle4.isEmpty()) {
/* 77 */                    bundle2.putBundle("registryState", bundle4);
                        }
/* 82 */                Bundle bundleM695W = fragment.mChildFragmentManager.m695W();
/* 90 */                if (!bundleM695W.isEmpty()) {
/* 94 */                    bundle2.putBundle("childFragmentManager", bundleM695W);
                        }
/* 99 */                if (fragment.mView != null) {
/* 101 */                   m745m();
                        }
/* 104 */               SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
/* 106 */               if (sparseArray != null) {
/* 110 */                   bundle2.putSparseParcelableArray("viewState", sparseArray);
                        }
/* 113 */               Bundle bundle5 = fragment.mSavedViewRegistryState;
/* 115 */               if (bundle5 != null) {
/* 119 */                   bundle2.putBundle("viewRegistryState", bundle5);
                        }
                    }
/* 122 */           Bundle bundle6 = fragment.mArguments;
/* 124 */           if (bundle6 != null) {
/* 128 */               bundle2.putBundle("arguments", bundle6);
                    }
/* 131 */           return bundle2;
                }

                /* JADX INFO: renamed from: m */
                public final void m745m() {
/* 1 */             Fragment fragment = this.f1526c;
/* 5 */             if (fragment.mView == null) {
/* 61 */                return;
                    }
/* 13 */            if (AbstractC0111w.m674K(2)) {
/* 15 */                Objects.toString(fragment);
/* 20 */                Objects.toString(fragment.mView);
                    }
/* 25 */            SparseArray<Parcelable> sparseArray = new SparseArray<>();
/* 30 */            fragment.mView.saveHierarchyState(sparseArray);
/* 37 */            if (sparseArray.size() > 0) {
/* 39 */                fragment.mSavedViewState = sparseArray;
                    }
/* 43 */            Bundle bundle = new Bundle();
/* 50 */            fragment.mViewLifecycleOwner.f16197e.m10115c(bundle);
/* 57 */            if (bundle.isEmpty()) {
/* 61 */                return;
                    }
/* 59 */            fragment.mSavedViewRegistryState = bundle;
                }

/* 124 */       public C0113y(wc0 wc0Var, C0114z c0114z, Fragment fragment) {
/* 128 */           this.f1524a = wc0Var;
/* 129 */           this.f1525b = c0114z;
/* 130 */           this.f1526c = fragment;
                }

/* 130 */       public C0113y(wc0 wc0Var, C0114z c0114z, Fragment fragment, Bundle bundle) {
/* 134 */           this.f1524a = wc0Var;
/* 135 */           this.f1525b = c0114z;
/* 136 */           this.f1526c = fragment;
/* 137 */           fragment.mSavedViewState = null;
/* 138 */           fragment.mSavedViewRegistryState = null;
/* 139 */           fragment.mBackStackNesting = 0;
/* 140 */           fragment.mInLayout = false;
/* 141 */           fragment.mAdded = false;
/* 142 */           Fragment fragment2 = fragment.mTarget;
                    fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
/* 143 */           fragment.mTarget = null;
/* 144 */           fragment.mSavedFragmentState = bundle;
/* 145 */           fragment.mArguments = bundle.getBundle("arguments");
                }
            }
