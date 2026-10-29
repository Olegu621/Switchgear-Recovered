            package androidx.fragment.app;

            import android.content.Context;
            import android.content.res.TypedArray;
            import android.util.AttributeSet;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.fragment.R$styleable;
            import p000.an0;
            import p000.bn0;
            import p000.cn0;
            import p000.f42;
            import p000.fm0;
            import p000.om0;
            import p000.rm0;
            import p000.zm0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 438 */   public final class LayoutInflaterFactory2C0107s implements LayoutInflater.Factory2 {

                /* JADX INFO: renamed from: a */
                public final AbstractC0111w f1471a;

                public LayoutInflaterFactory2C0107s(AbstractC0111w abstractC0111w) {
/* 4 */             this.f1471a = abstractC0111w;
                }

                @Override // android.view.LayoutInflater.Factory2
                public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
                    boolean zIsAssignableFrom;
                    C0113y c0113yM709g;
/* 7 */             boolean zEquals = FragmentContainerView.class.getName().equals(str);
/* 11 */            AbstractC0111w abstractC0111w = this.f1471a;
/* 13 */            if (zEquals) {
/* 17 */                return new FragmentContainerView(context, attributeSet, abstractC0111w);
                    }
/* 28 */            if ("fragment".equals(str)) {
/* 34 */                String attributeValue = attributeSet.getAttributeValue(null, "class");
/* 40 */                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Fragment);
/* 44 */                if (attributeValue == null) {
/* 48 */                    attributeValue = typedArrayObtainStyledAttributes.getString(R$styleable.Fragment_android_name);
                        }
/* 55 */                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.Fragment_android_id, -1);
/* 61 */                String string = typedArrayObtainStyledAttributes.getString(R$styleable.Fragment_android_tag);
/* 65 */                typedArrayObtainStyledAttributes.recycle();
/* 68 */                if (attributeValue != null) {
                            try {
/* 81 */                        zIsAssignableFrom = Fragment.class.isAssignableFrom(rm0.m8205a(context.getClassLoader(), attributeValue));
                            } catch (ClassNotFoundException unused) {
/* 86 */                        zIsAssignableFrom = false;
                            }
/* 87 */                    if (zIsAssignableFrom) {
/* 93 */                        int id = view != null ? view.getId() : 0;
/* 97 */                        if (id == -1 && resourceId == -1 && string == null) {
/* 133 */                           throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                                }
/* 141 */                       Fragment fragmentM679C = resourceId != -1 ? abstractC0111w.m679C(resourceId) : null;
/* 142 */                       if (fragmentM679C == null && string != null) {
/* 146 */                           fragmentM679C = abstractC0111w.m680D(string);
                                }
/* 150 */                       if (fragmentM679C == null && id != -1) {
/* 154 */                           fragmentM679C = abstractC0111w.m679C(id);
                                }
/* 160 */                       if (fragmentM679C == null) {
/* 162 */                           rm0 rm0VarM684I = abstractC0111w.m684I();
/* 166 */                           context.getClassLoader();
/* 175 */                           fragmentM679C = Fragment.instantiate(rm0VarM684I.f16180a.f1512v.f14817b, attributeValue, null);
/* 179 */                           fragmentM679C.mFromLayout = true;
/* 186 */                           fragmentM679C.mFragmentId = resourceId != 0 ? resourceId : id;
/* 188 */                           fragmentM679C.mContainerId = id;
/* 190 */                           fragmentM679C.mTag = string;
/* 192 */                           fragmentM679C.mInLayout = true;
/* 194 */                           fragmentM679C.mFragmentManager = abstractC0111w;
/* 196 */                           om0 om0Var = abstractC0111w.f1512v;
/* 198 */                           fragmentM679C.mHost = om0Var;
/* 204 */                           fragmentM679C.onInflate((Context) om0Var.f14817b, attributeSet, fragmentM679C.mSavedFragmentState);
/* 207 */                           c0113yM709g = abstractC0111w.m699a(fragmentM679C);
/* 215 */                           if (AbstractC0111w.m674K(2)) {
/* 217 */                               fragmentM679C.toString();
/* 220 */                               Integer.toHexString(resourceId);
                                    }
                                } else {
/* 226 */                           if (fragmentM679C.mInLayout) {
/* 438 */                               throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                                    }
/* 228 */                           fragmentM679C.mInLayout = true;
/* 230 */                           fragmentM679C.mFragmentManager = abstractC0111w;
/* 232 */                           om0 om0Var2 = abstractC0111w.f1512v;
/* 234 */                           fragmentM679C.mHost = om0Var2;
/* 240 */                           fragmentM679C.onInflate((Context) om0Var2.f14817b, attributeSet, fragmentM679C.mSavedFragmentState);
/* 243 */                           c0113yM709g = abstractC0111w.m709g(fragmentM679C);
/* 251 */                           if (AbstractC0111w.m674K(2)) {
/* 253 */                               fragmentM679C.toString();
/* 256 */                               Integer.toHexString(resourceId);
                                    }
                                }
/* 259 */                       ViewGroup viewGroup = (ViewGroup) view;
/* 261 */                       an0 an0Var = bn0.f2547a;
/* 287 */                       cn0 cn0Var = new cn0(fragmentM679C, "Attempting to use <fragment> tag to add fragment " + fragmentM679C + " to container " + viewGroup);
/* 290 */                       bn0.m1397c(cn0Var);
/* 293 */                       an0 an0VarM1395a = bn0.m1395a(fragmentM679C);
/* 305 */                       if (an0VarM1395a.f341a.contains(zm0.f20254d) && bn0.m1399e(an0VarM1395a, fragmentM679C.getClass(), cn0.class)) {
/* 319 */                           bn0.m1396b(an0VarM1395a, cn0Var);
                                }
/* 322 */                       fragmentM679C.mContainer = viewGroup;
/* 324 */                       c0113yM709g.m741i();
/* 327 */                       c0113yM709g.m740h();
/* 330 */                       View view2 = fragmentM679C.mView;
/* 332 */                       if (view2 == null) {
/* 373 */                           f42.m3656l(fm0.m3784j("Fragment ", attributeValue, " did not create a view."));
/* 27 */                            return null;
                                }
/* 334 */                       if (resourceId != 0) {
/* 336 */                           view2.setId(resourceId);
                                }
/* 345 */                       if (fragmentM679C.mView.getTag() == null) {
/* 349 */                           fragmentM679C.mView.setTag(string);
                                }
/* 359 */                       fragmentM679C.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0106r(this, c0113yM709g));
/* 362 */                       return fragmentM679C.mView;
                            }
                        }
                    }
/* 27 */            return null;
                }

                @Override // android.view.LayoutInflater.Factory
/* 439 */       public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
/* 440 */           return onCreateView(null, str, context, attributeSet);
                }
            }
