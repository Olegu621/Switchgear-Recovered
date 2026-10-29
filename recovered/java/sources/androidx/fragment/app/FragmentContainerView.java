            package androidx.fragment.app;

            import android.animation.LayoutTransition;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.res.TypedArray;
            import android.graphics.Canvas;
            import android.os.Bundle;
            import android.util.AttributeSet;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.WindowInsets;
            import android.widget.FrameLayout;
            import androidx.fragment.R$id;
            import androidx.fragment.R$styleable;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.ds0;
            import p000.e33;
            import p000.f42;
            import p000.fm0;
            import p000.m83;
            import p000.rm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00028\u0000\"\n\b\u0000\u0010\u0018*\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m6176d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", HttpUrl.FRAGMENT_ENCODE_SET, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/animation/LayoutTransition;", "transition", HttpUrl.FRAGMENT_ENCODE_SET, "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", HttpUrl.FRAGMENT_ENCODE_SET, "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 211 */   public final class FragmentContainerView extends FrameLayout {

                /* JADX INFO: renamed from: a */
                public final ArrayList f1353a;

                /* JADX INFO: renamed from: b */
                public final ArrayList f1354b;

                /* JADX INFO: renamed from: c */
                public View.OnApplyWindowInsetsListener f1355c;

                /* JADX INFO: renamed from: d */
                public boolean f1356d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC0111w abstractC0111w) {
                    View view;
/* 7 */             super(context, attributeSet);
/* 1 */             context.getClass();
/* 4 */             attributeSet.getClass();
/* 15 */            this.f1353a = new ArrayList();
/* 22 */            this.f1354b = new ArrayList();
/* 25 */            this.f1356d = true;
/* 27 */            String classAttribute = attributeSet.getClassAttribute();
/* 31 */            int[] iArr = R$styleable.FragmentContainerView;
/* 33 */            iArr.getClass();
/* 37 */            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
/* 45 */            classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name) : classAttribute;
/* 51 */            String string = typedArrayObtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_tag);
/* 55 */            typedArrayObtainStyledAttributes.recycle();
/* 58 */            int id = getId();
/* 62 */            Fragment fragmentM679C = abstractC0111w.m679C(id);
/* 66 */            if (classAttribute != null && fragmentM679C == null) {
/* 72 */                if (id == -1) {
/* 91 */                    f42.m3656l(fm0.m3784j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : HttpUrl.FRAGMENT_ENCODE_SET));
/* 94 */                    throw null;
                        }
/* 95 */                rm0 rm0VarM684I = abstractC0111w.m684I();
/* 99 */                context.getClassLoader();
/* 108 */               Fragment fragmentInstantiate = Fragment.instantiate(rm0VarM684I.f16180a.f1512v.f14817b, classAttribute, null);
/* 112 */               fragmentInstantiate.getClass();
/* 115 */               fragmentInstantiate.mFragmentId = id;
/* 117 */               fragmentInstantiate.mContainerId = id;
/* 119 */               fragmentInstantiate.mTag = string;
/* 121 */               fragmentInstantiate.mFragmentManager = abstractC0111w;
/* 125 */               fragmentInstantiate.mHost = abstractC0111w.f1512v;
/* 127 */               fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
/* 132 */               C0086a c0086a = new C0086a(abstractC0111w);
/* 135 */               c0086a.f1400p = true;
/* 137 */               fragmentInstantiate.mContainer = this;
/* 143 */               c0086a.m639e(getId(), fragmentInstantiate, string, 1);
/* 148 */               if (c0086a.f1391g) {
/* 160 */                   f42.m3656l("This transaction is already being added to the back stack");
/* 163 */                   throw null;
                        }
/* 150 */               c0086a.f1392h = false;
/* 154 */               c0086a.f1401q.m677A(c0086a, true);
                    }
/* 178 */           for (C0113y c0113y : abstractC0111w.f1493c.m749d()) {
/* 186 */               Fragment fragment = c0113y.f1526c;
/* 194 */               if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
/* 206 */                   fragment.mContainer = this;
/* 208 */                   c0113y.m733a();
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m634a(View view) {
/* 7 */             if (this.f1354b.contains(view)) {
/* 11 */                this.f1353a.add(view);
                    }
                }

                @Override // android.view.ViewGroup
                public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
/* 1 */             view.getClass();
/* 6 */             Object tag = view.getTag(R$id.fragment_container_view_tag);
/* 18 */            if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
/* 20 */                super.addView(view, i, layoutParams);
                    } else {
/* 28 */                ds0.m3202s(view, "Views added to a FragmentContainerView must be associated with a Fragment. View ", " is not associated with a Fragment.");
                    }
                }

                @Override // android.view.ViewGroup, android.view.View
                public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
                    m83 m83VarM3312h;
/* 1 */             windowInsets.getClass();
/* 5 */             m83 m83VarM6620h = m83.m6620h(windowInsets, null);
/* 9 */             View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1355c;
/* 11 */            if (onApplyWindowInsetsListener != null) {
/* 13 */                onApplyWindowInsetsListener.getClass();
/* 16 */                WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
/* 20 */                windowInsetsOnApplyWindowInsets.getClass();
/* 23 */                m83VarM3312h = m83.m6620h(windowInsetsOnApplyWindowInsets, null);
                    } else {
/* 28 */                m83VarM3312h = e33.m3312h(this, m83VarM6620h);
                    }
/* 38 */            if (!m83VarM3312h.f13660a.mo3342m()) {
/* 40 */                int childCount = getChildCount();
/* 45 */                for (int i = 0; i < childCount; i++) {
/* 51 */                    e33.m3306b(getChildAt(i), m83VarM3312h);
                        }
                    }
/* 57 */            return windowInsets;
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void dispatchDraw(Canvas canvas) {
/* 1 */             canvas.getClass();
/* 6 */             if (this.f1356d) {
/* 10 */                Iterator it = this.f1353a.iterator();
/* 18 */                while (it.hasNext()) {
/* 30 */                    super.drawChild(canvas, (View) it.next(), getDrawingTime());
                        }
                    }
/* 34 */            super.dispatchDraw(canvas);
                }

                @Override // android.view.ViewGroup
                public final boolean drawChild(Canvas canvas, View view, long j) {
/* 1 */             canvas.getClass();
/* 4 */             view.getClass();
/* 9 */             if (this.f1356d) {
/* 11 */                ArrayList arrayList = this.f1353a;
/* 17 */                if (!arrayList.isEmpty() && arrayList.contains(view)) {
/* 25 */                    return false;
                        }
                    }
/* 27 */            return super.drawChild(canvas, view, j);
                }

                @Override // android.view.ViewGroup
                public final void endViewTransition(View view) {
/* 1 */             view.getClass();
/* 6 */             this.f1354b.remove(view);
/* 15 */            if (this.f1353a.remove(view)) {
/* 18 */                this.f1356d = true;
                    }
/* 20 */            super.endViewTransition(view);
                }

                public final <F extends Fragment> F getFragment() {
                    Fragment fragment;
                    FragmentActivity fragmentActivity;
                    AbstractC0111w supportFragmentManager;
/* 1 */             View view = this;
                    while (true) {
/* 3 */                 if (view == null) {
/* 35 */                    fragment = null;
                            break;
                        }
/* 7 */                 Object tag = view.getTag(R$id.fragment_container_view_tag);
/* 18 */                fragment = tag instanceof Fragment ? (Fragment) tag : null;
/* 19 */                if (fragment != null) {
                            break;
                        }
/* 22 */                Object parent = view.getParent();
/* 33 */                view = parent instanceof View ? (View) parent : null;
                    }
/* 36 */            if (fragment == null) {
/* 59 */                Context context = getContext();
                        while (true) {
/* 65 */                    if (!(context instanceof ContextWrapper)) {
/* 81 */                        fragmentActivity = null;
                                break;
                            }
/* 69 */                    if (context instanceof FragmentActivity) {
/* 71 */                        fragmentActivity = (FragmentActivity) context;
                                break;
                            }
/* 76 */                    context = ((ContextWrapper) context).getBaseContext();
                        }
/* 82 */                if (fragmentActivity == null) {
/* 101 */                   s80.m8424e(this, "View ", " is not within a subclass of FragmentActivity.");
/* 2 */                     return null;
                        }
/* 84 */                supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                    } else {
/* 42 */                if (!fragment.isAdded()) {
/* 55 */                    s80.m8431l("The Fragment ", fragment, " that owns View ", this, " has already been destroyed. Nested fragments should always use the child FragmentManager.");
/* 2 */                     return null;
                        }
/* 44 */                supportFragmentManager = fragment.getChildFragmentManager();
                    }
/* 92 */            return (F) supportFragmentManager.m679C(getId());
                }

                @Override // android.view.View
                public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
/* 1 */             windowInsets.getClass();
/* 4 */             return windowInsets;
                }

                @Override // android.view.ViewGroup
                public final void removeAllViewsInLayout() {
/* 1 */             int childCount = getChildCount();
                    while (true) {
/* 5 */                 childCount--;
/* 8 */                 if (-1 >= childCount) {
/* 23 */                    super.removeAllViewsInLayout();
/* 26 */                    return;
                        } else {
/* 10 */                    View childAt = getChildAt(childCount);
/* 14 */                    childAt.getClass();
/* 17 */                    m634a(childAt);
                        }
                    }
                }

                @Override // android.view.ViewGroup, android.view.ViewManager
                public final void removeView(View view) {
/* 1 */             view.getClass();
/* 4 */             m634a(view);
/* 7 */             super.removeView(view);
                }

                @Override // android.view.ViewGroup
                public final void removeViewAt(int i) {
/* 1 */             View childAt = getChildAt(i);
/* 5 */             childAt.getClass();
/* 8 */             m634a(childAt);
/* 11 */            super.removeViewAt(i);
                }

                @Override // android.view.ViewGroup
                public final void removeViewInLayout(View view) {
/* 1 */             view.getClass();
/* 4 */             m634a(view);
/* 7 */             super.removeViewInLayout(view);
                }

                @Override // android.view.ViewGroup
                public final void removeViews(int i, int i2) {
/* 1 */             int i3 = i + i2;
/* 4 */             for (int i4 = i; i4 < i3; i4++) {
/* 6 */                 View childAt = getChildAt(i4);
/* 10 */                childAt.getClass();
/* 13 */                m634a(childAt);
                    }
/* 19 */            super.removeViews(i, i2);
                }

                @Override // android.view.ViewGroup
                public final void removeViewsInLayout(int i, int i2) {
/* 1 */             int i3 = i + i2;
/* 4 */             for (int i4 = i; i4 < i3; i4++) {
/* 6 */                 View childAt = getChildAt(i4);
/* 10 */                childAt.getClass();
/* 13 */                m634a(childAt);
                    }
/* 19 */            super.removeViewsInLayout(i, i2);
                }

                public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
/* 1 */             this.f1356d = drawDisappearingViewsFirst;
                }

                @Override // android.view.ViewGroup
                public void setLayoutTransition(LayoutTransition transition) {
/* 8 */             throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
                }

                @Override // android.view.View
                public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
/* 1 */             listener.getClass();
/* 4 */             this.f1355c = listener;
                }

                @Override // android.view.ViewGroup
                public final void startViewTransition(View view) {
/* 1 */             view.getClass();
/* 8 */             if (view.getParent() == this) {
/* 12 */                this.f1354b.add(view);
                    }
/* 15 */            super.startViewTransition(view);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 212 */       public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
                    String str;
/* 213 */           super(context, attributeSet, i);
                    context.getClass();
/* 214 */           this.f1353a = new ArrayList();
/* 215 */           this.f1354b = new ArrayList();
/* 216 */           this.f1356d = true;
                    if (attributeSet != null) {
/* 217 */               String classAttribute = attributeSet.getClassAttribute();
/* 218 */               int[] iArr = R$styleable.FragmentContainerView;
                        iArr.getClass();
/* 219 */               TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        if (classAttribute == null) {
/* 220 */                   classAttribute = typedArrayObtainStyledAttributes.getString(R$styleable.FragmentContainerView_android_name);
/* 221 */                   str = "android:name";
                        } else {
/* 222 */                   str = "class";
                        }
/* 223 */               typedArrayObtainStyledAttributes.recycle();
/* 224 */               if (classAttribute == null || isInEditMode()) {
                            return;
                        }
/* 229 */               throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 229 */       public FragmentContainerView(Context context, AttributeSet attributeSet) {
/* 230 */           this(context, attributeSet, 0);
                    context.getClass();
                }
            }
