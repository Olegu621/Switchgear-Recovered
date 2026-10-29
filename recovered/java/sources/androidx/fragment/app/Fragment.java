            package androidx.fragment.app;

            import android.animation.Animator;
            import android.app.Activity;
            import android.app.Application;
            import android.content.ComponentCallbacks;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.content.res.Configuration;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.AttributeSet;
            import android.util.SparseArray;
            import android.view.ContextMenu;
            import android.view.LayoutInflater;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.animation.Animation;
            import androidx.activity.result.IntentSenderRequest;
            import androidx.lifecycle.runtime.R$id;
            import java.io.FileDescriptor;
            import java.io.PrintWriter;
            import java.lang.reflect.InvocationTargetException;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Objects;
            import java.util.UUID;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.AbstractC0830d3;
            import p000.AbstractC0903f3;
            import p000.AbstractC1816k3;
            import p000.AbstractC2353x2;
            import p000.C1951n4;
            import p000.C2086px;
            import p000.InterfaceC0202c3;
            import p000.RunnableC2166s2;
            import p000.RunnableC2495ye;
            import p000.a72;
            import p000.a91;
            import p000.an0;
            import p000.ar0;
            import p000.b91;
            import p000.bn0;
            import p000.br0;
            import p000.c91;
            import p000.dc0;
            import p000.f42;
            import p000.fm0;
            import p000.g71;
            import p000.gm0;
            import p000.gr0;
            import p000.hm0;
            import p000.i71;
            import p000.im0;
            import p000.jm0;
            import p000.km0;
            import p000.m20;
            import p000.md2;
            import p000.mm0;
            import p000.mn0;
            import p000.oi2;
            import p000.om0;
            import p000.pt0;
            import p000.qb2;
            import p000.qk1;
            import p000.rb2;
            import p000.rk1;
            import p000.rm0;
            import p000.rn0;
            import p000.s33;
            import p000.s80;
            import p000.so0;
            import p000.t33;
            import p000.t61;
            import p000.tb2;
            import p000.u33;
            import p000.u61;
            import p000.v00;
            import p000.v61;
            import p000.vf2;
            import p000.vm0;
            import p000.x62;
            import p000.xm0;
            import p000.y62;
            import p000.z62;
            import p000.zm0;
            import p000.zq0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, g71, u33, pt0, z62 {
                static final int ACTIVITY_CREATED = 4;
                static final int ATTACHED = 0;
                static final int AWAITING_ENTER_EFFECTS = 6;
                static final int AWAITING_EXIT_EFFECTS = 3;
                static final int CREATED = 1;
                static final int INITIALIZING = -1;
                static final int RESUMED = 7;
                static final int STARTED = 5;
                static final Object USE_DEFAULT_TRANSITION = new Object();
                static final int VIEW_CREATED = 2;
                boolean mAdded;
                jm0 mAnimationInfo;
                Bundle mArguments;
                int mBackStackNesting;
                boolean mBeingSaved;
                private boolean mCalled;
                AbstractC0111w mChildFragmentManager;
                ViewGroup mContainer;
                int mContainerId;
                private int mContentLayoutId;
                s33 mDefaultFactory;
                boolean mDeferStart;
                boolean mDetached;
                int mFragmentId;
                AbstractC0111w mFragmentManager;
                boolean mFromLayout;
                boolean mHasMenu;
                boolean mHidden;
                boolean mHiddenChanged;
                om0 mHost;
                boolean mInLayout;
                boolean mIsCreated;
                private Boolean mIsPrimaryNavigationFragment;
                LayoutInflater mLayoutInflater;
                i71 mLifecycleRegistry;
                u61 mMaxState;
                boolean mMenuVisible;
                private final AtomicInteger mNextLocalRequestCode;
                private final ArrayList<km0> mOnPreAttachedListeners;
                Fragment mParentFragment;
                boolean mPerformedCreateView;
                Runnable mPostponedDurationRunnable;
                Handler mPostponedHandler;
                public String mPreviousWho;
                boolean mRemoving;
                boolean mRestored;
                boolean mRetainInstance;
                boolean mRetainInstanceChangedWhileDetached;
                Bundle mSavedFragmentState;
                private final km0 mSavedStateAttachListener;
                y62 mSavedStateRegistryController;
                Boolean mSavedUserVisibleHint;
                Bundle mSavedViewRegistryState;
                SparseArray<Parcelable> mSavedViewState;
                int mState;
                String mTag;
                Fragment mTarget;
                int mTargetRequestCode;
                String mTargetWho;
                boolean mTransitioning;
                boolean mUserVisibleHint;
                View mView;
                rn0 mViewLifecycleOwner;
                rk1 mViewLifecycleOwnerLiveData;
                String mWho;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class SavedState implements Parcelable {
                    public static final Parcelable.Creator<SavedState> CREATOR = new C0101m();

                    /* JADX INFO: renamed from: a */
                    public final Bundle f1352a;

                    public SavedState(Parcel parcel, ClassLoader classLoader) {
/* 4 */                 Bundle bundle = parcel.readBundle();
/* 8 */                 this.f1352a = bundle;
/* 10 */                if (classLoader == null || bundle == null) {
/* 17 */                    return;
                        }
/* 14 */                bundle.setClassLoader(classLoader);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
/* 1 */                 return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
/* 3 */                 parcel.writeBundle(this.f1352a);
                    }
                }

                public Fragment() {
/* 5 */             this.mState = -1;
/* 15 */            this.mWho = UUID.randomUUID().toString();
/* 18 */            this.mTargetWho = null;
/* 20 */            this.mIsPrimaryNavigationFragment = null;
/* 27 */            this.mChildFragmentManager = new vm0();
/* 30 */            this.mMenuVisible = true;
/* 32 */            this.mUserVisibleHint = true;
/* 40 */            this.mPostponedDurationRunnable = new hm0(this, 0);
/* 44 */            this.mMaxState = u61.f17378e;
/* 51 */            this.mViewLifecycleOwnerLiveData = new rk1();
/* 58 */            this.mNextLocalRequestCode = new AtomicInteger();
/* 65 */            this.mOnPreAttachedListeners = new ArrayList<>();
/* 72 */            this.mSavedStateAttachListener = new C0098j(this);
/* 74 */            initLifecycle();
                }

                private jm0 ensureAnimationInfo() {
/* 3 */             if (this.mAnimationInfo == null) {
/* 7 */                 jm0 jm0Var = new jm0();
/* 11 */                jm0Var.f12370i = null;
/* 13 */                Object obj = USE_DEFAULT_TRANSITION;
/* 15 */                jm0Var.f12371j = obj;
/* 17 */                jm0Var.f12372k = null;
/* 19 */                jm0Var.f12373l = obj;
/* 21 */                jm0Var.f12374m = null;
/* 23 */                jm0Var.f12375n = obj;
/* 27 */                jm0Var.f12378q = 1.0f;
/* 29 */                jm0Var.f12379r = null;
/* 31 */                this.mAnimationInfo = jm0Var;
                    }
/* 33 */            return this.mAnimationInfo;
                }

                private int getMinimumMaxLifecycleState() {
/* 1 */             u61 u61Var = this.mMaxState;
                    return (u61Var == u61.f17375b || this.mParentFragment == null) ? u61Var.ordinal() : Math.min(u61Var.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
                }

                private Fragment getTargetFragment(boolean z) {
                    String str;
/* 1 */             if (z) {
/* 3 */                 an0 an0Var = bn0.f2547a;
/* 21 */                br0 br0Var = new br0(this, "Attempting to get target fragment from fragment " + this);
/* 24 */                bn0.m1397c(br0Var);
/* 27 */                an0 an0VarM1395a = bn0.m1395a(this);
/* 39 */                if (an0VarM1395a.f341a.contains(zm0.f20258v) && bn0.m1399e(an0VarM1395a, getClass(), br0.class)) {
/* 53 */                    bn0.m1396b(an0VarM1395a, br0Var);
                        }
                    }
/* 56 */            Fragment fragment = this.mTarget;
/* 58 */            if (fragment != null) {
/* 60 */                return fragment;
                    }
/* 61 */            AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 63 */            if (abstractC0111w == null || (str = this.mTargetWho) == null) {
/* 76 */                return null;
                    }
/* 71 */            return abstractC0111w.f1493c.m747b(str);
                }

                private void initLifecycle() {
/* 6 */             this.mLifecycleRegistry = new i71(this);
/* 13 */            this.mSavedStateRegistryController = new y62(this);
/* 16 */            this.mDefaultFactory = null;
/* 26 */            if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
/* 33 */                return;
                    }
/* 30 */            registerOnPreAttachListener(this.mSavedStateAttachListener);
                }

                @Deprecated
                public static Fragment instantiate(Context context, String str, Bundle bundle) {
                    try {
/* 22 */                Fragment fragment = (Fragment) rm0.m8206b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
/* 24 */                if (bundle == null) {
/* 49 */                    return fragment;
                        }
/* 34 */                bundle.setClassLoader(fragment.getClass().getClassLoader());
/* 37 */                fragment.setArguments(bundle);
/* 40 */                return fragment;
                    } catch (IllegalAccessException e) {
/* 83 */                throw new C2086px(fm0.m3784j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
                    } catch (InstantiationException e2) {
/* 93 */                throw new C2086px(fm0.m3784j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
                    } catch (NoSuchMethodException e3) {
/* 73 */                throw new C2086px(fm0.m3784j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
                    } catch (InvocationTargetException e4) {
/* 61 */                throw new C2086px(fm0.m3784j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void lambda$performCreateView$0() {
/* 1 */             rn0 rn0Var = this.mViewLifecycleOwner;
/* 7 */             rn0Var.f16197e.m10114b(this.mSavedViewRegistryState);
/* 11 */            this.mSavedViewRegistryState = null;
                }

                private <I, O> AbstractC0903f3 prepareCallInternal(AbstractC0830d3 abstractC0830d3, so0 so0Var, InterfaceC0202c3 interfaceC0202c3) {
/* 4 */             if (this.mState > 1) {
/* 38 */                f42.m3656l(fm0.m3782h("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
/* 41 */                return null;
                    }
/* 8 */             AtomicReference atomicReference = new AtomicReference();
/* 20 */            registerOnPreAttachListener(new im0(this, so0Var, atomicReference, abstractC0830d3, interfaceC0202c3));
/* 25 */            return new gm0(atomicReference);
                }

                private void registerOnPreAttachListener(km0 km0Var) {
/* 3 */             if (this.mState >= 0) {
/* 5 */                 km0Var.mo668a();
                    } else {
/* 11 */                this.mOnPreAttachedListeners.add(km0Var);
                    }
                }

                public void callStartTransitionListener(boolean z) {
                    ViewGroup viewGroup;
                    AbstractC0111w abstractC0111w;
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var != null) {
/* 6 */                 jm0Var.f12380s = false;
                    }
/* 10 */            if (this.mView == null || (viewGroup = this.mContainer) == null || (abstractC0111w = this.mFragmentManager) == null) {
/* 59 */                return;
                    }
/* 20 */            C0096h c0096hM654j = C0096h.m654j(viewGroup, abstractC0111w);
/* 24 */            c0096hM654j.m663k();
/* 27 */            if (z) {
/* 40 */                this.mHost.f14818c.post(new RunnableC2495ye(c0096hM654j, 8));
                    } else {
/* 44 */                c0096hM654j.m659e();
                    }
/* 47 */            Handler handler = this.mPostponedHandler;
/* 49 */            if (handler != null) {
/* 53 */                handler.removeCallbacks(this.mPostponedDurationRunnable);
/* 57 */                this.mPostponedHandler = null;
                    }
                }

                public mm0 createFragmentContainer() {
/* 3 */             return new C0099k(this);
                }

                /* JADX INFO: renamed from: d */
                public Activity m632d() {
/* 1 */             return getActivity();
                }

                public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
/* 1 */             printWriter.print(str);
/* 6 */             printWriter.print("mFragmentId=#");
/* 15 */            printWriter.print(Integer.toHexString(this.mFragmentId));
/* 20 */            printWriter.print(" mContainerId=#");
/* 29 */            printWriter.print(Integer.toHexString(this.mContainerId));
/* 34 */            printWriter.print(" mTag=");
/* 39 */            printWriter.println(this.mTag);
/* 42 */            printWriter.print(str);
/* 47 */            printWriter.print("mState=");
/* 52 */            printWriter.print(this.mState);
/* 57 */            printWriter.print(" mWho=");
/* 62 */            printWriter.print(this.mWho);
/* 67 */            printWriter.print(" mBackStackNesting=");
/* 72 */            printWriter.println(this.mBackStackNesting);
/* 75 */            printWriter.print(str);
/* 80 */            printWriter.print("mAdded=");
/* 85 */            printWriter.print(this.mAdded);
/* 90 */            printWriter.print(" mRemoving=");
/* 95 */            printWriter.print(this.mRemoving);
/* 100 */           printWriter.print(" mFromLayout=");
/* 105 */           printWriter.print(this.mFromLayout);
/* 110 */           printWriter.print(" mInLayout=");
/* 115 */           printWriter.println(this.mInLayout);
/* 118 */           printWriter.print(str);
/* 123 */           printWriter.print("mHidden=");
/* 128 */           printWriter.print(this.mHidden);
/* 133 */           printWriter.print(" mDetached=");
/* 138 */           printWriter.print(this.mDetached);
/* 143 */           printWriter.print(" mMenuVisible=");
/* 148 */           printWriter.print(this.mMenuVisible);
/* 153 */           printWriter.print(" mHasMenu=");
/* 158 */           printWriter.println(this.mHasMenu);
/* 161 */           printWriter.print(str);
/* 166 */           printWriter.print("mRetainInstance=");
/* 171 */           printWriter.print(this.mRetainInstance);
/* 176 */           printWriter.print(" mUserVisibleHint=");
/* 181 */           printWriter.println(this.mUserVisibleHint);
/* 186 */           if (this.mFragmentManager != null) {
/* 188 */               printWriter.print(str);
/* 193 */               printWriter.print("mFragmentManager=");
/* 198 */               printWriter.println(this.mFragmentManager);
                    }
/* 203 */           if (this.mHost != null) {
/* 205 */               printWriter.print(str);
/* 210 */               printWriter.print("mHost=");
/* 215 */               printWriter.println(this.mHost);
                    }
/* 220 */           if (this.mParentFragment != null) {
/* 222 */               printWriter.print(str);
/* 227 */               printWriter.print("mParentFragment=");
/* 232 */               printWriter.println(this.mParentFragment);
                    }
/* 237 */           if (this.mArguments != null) {
/* 239 */               printWriter.print(str);
/* 244 */               printWriter.print("mArguments=");
/* 249 */               printWriter.println(this.mArguments);
                    }
/* 254 */           if (this.mSavedFragmentState != null) {
/* 256 */               printWriter.print(str);
/* 261 */               printWriter.print("mSavedFragmentState=");
/* 266 */               printWriter.println(this.mSavedFragmentState);
                    }
/* 271 */           if (this.mSavedViewState != null) {
/* 273 */               printWriter.print(str);
/* 278 */               printWriter.print("mSavedViewState=");
/* 283 */               printWriter.println(this.mSavedViewState);
                    }
/* 288 */           if (this.mSavedViewRegistryState != null) {
/* 290 */               printWriter.print(str);
/* 295 */               printWriter.print("mSavedViewRegistryState=");
/* 300 */               printWriter.println(this.mSavedViewRegistryState);
                    }
/* 304 */           Fragment targetFragment = getTargetFragment(false);
/* 308 */           if (targetFragment != null) {
/* 310 */               printWriter.print(str);
/* 315 */               printWriter.print("mTarget=");
/* 318 */               printWriter.print(targetFragment);
/* 323 */               printWriter.print(" mTargetRequestCode=");
/* 328 */               printWriter.println(this.mTargetRequestCode);
                    }
/* 331 */           printWriter.print(str);
/* 336 */           printWriter.print("mPopDirection=");
/* 343 */           printWriter.println(getPopDirection());
/* 350 */           if (getEnterAnim() != 0) {
/* 352 */               printWriter.print(str);
/* 357 */               printWriter.print("getEnterAnim=");
/* 364 */               printWriter.println(getEnterAnim());
                    }
/* 371 */           if (getExitAnim() != 0) {
/* 373 */               printWriter.print(str);
/* 378 */               printWriter.print("getExitAnim=");
/* 385 */               printWriter.println(getExitAnim());
                    }
/* 392 */           if (getPopEnterAnim() != 0) {
/* 394 */               printWriter.print(str);
/* 399 */               printWriter.print("getPopEnterAnim=");
/* 406 */               printWriter.println(getPopEnterAnim());
                    }
/* 413 */           if (getPopExitAnim() != 0) {
/* 415 */               printWriter.print(str);
/* 420 */               printWriter.print("getPopExitAnim=");
/* 427 */               printWriter.println(getPopExitAnim());
                    }
/* 432 */           if (this.mContainer != null) {
/* 434 */               printWriter.print(str);
/* 439 */               printWriter.print("mContainer=");
/* 444 */               printWriter.println(this.mContainer);
                    }
/* 449 */           if (this.mView != null) {
/* 451 */               printWriter.print(str);
/* 456 */               printWriter.print("mView=");
/* 461 */               printWriter.println(this.mView);
                    }
/* 468 */           if (getAnimatingAway() != null) {
/* 470 */               printWriter.print(str);
/* 475 */               printWriter.print("mAnimatingAway=");
/* 482 */               printWriter.println(getAnimatingAway());
                    }
/* 489 */           if (getContext() != null) {
/* 495 */               b91.m1298a(this).m3344b(str, printWriter);
                    }
/* 498 */           printWriter.print(str);
/* 522 */           printWriter.println("Child " + this.mChildFragmentManager + ":");
/* 533 */           this.mChildFragmentManager.m724v(fm0.m3783i(str, "  "), fileDescriptor, printWriter, strArr);
                }

                public final boolean equals(Object obj) {
                    return this == obj;
                }

                public Fragment findFragmentByWho(String str) {
                    return str.equals(this.mWho) ? this : this.mChildFragmentManager.f1493c.m748c(str);
                }

                public String generateActivityResultKey() {
/* 27 */            return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
                }

                public final FragmentActivity getActivity() {
/* 1 */             om0 om0Var = this.mHost;
/* 3 */             if (om0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return om0Var.f14816a;
                }

                public boolean getAllowEnterTransitionOverlap() {
                    Boolean bool;
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null || (bool = jm0Var.f12377p) == null) {
/* 15 */                return true;
                    }
/* 10 */            return bool.booleanValue();
                }

                public boolean getAllowReturnTransitionOverlap() {
                    Boolean bool;
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null || (bool = jm0Var.f12376o) == null) {
/* 15 */                return true;
                    }
/* 10 */            return bool.booleanValue();
                }

                public View getAnimatingAway() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 4 */             if (jm0Var == null) {
/* 3 */                 return null;
                    }
/* 7 */             jm0Var.getClass();
/* 3 */             return null;
                }

                public final Bundle getArguments() {
/* 1 */             return this.mArguments;
                }

                public final AbstractC0111w getChildFragmentManager() {
/* 3 */             if (this.mHost != null) {
/* 5 */                 return this.mChildFragmentManager;
                    }
/* 16 */            f42.m3656l(fm0.m3782h("Fragment ", this, " has not been attached yet."));
/* 19 */            return null;
                }

                public Context getContext() {
/* 1 */             om0 om0Var = this.mHost;
/* 3 */             if (om0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return om0Var.f14817b;
                }

                @Override // p000.pt0
                public m20 getDefaultViewModelCreationExtras() {
                    Application application;
/* 5 */             Context applicationContext = requireContext().getApplicationContext();
                    while (true) {
/* 11 */                if (!(applicationContext instanceof ContextWrapper)) {
/* 27 */                    application = null;
                            break;
                        }
/* 15 */                if (applicationContext instanceof Application) {
/* 17 */                    application = (Application) applicationContext;
                            break;
                        }
/* 22 */                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
/* 28 */            if (application == null && AbstractC0111w.m674K(3)) {
/* 45 */                Objects.toString(requireContext().getApplicationContext());
                    }
/* 50 */            qk1 qk1Var = new qk1();
/* 53 */            LinkedHashMap linkedHashMap = qk1Var.f13548a;
/* 55 */            if (application != null) {
/* 59 */                linkedHashMap.put(dc0.f7097X, application);
                    }
/* 64 */            linkedHashMap.put(mn0.f13870e, this);
/* 69 */            linkedHashMap.put(mn0.f13871f, this);
/* 76 */            if (getArguments() != null) {
/* 84 */                linkedHashMap.put(mn0.f13872g, getArguments());
                    }
/* 87 */            return qk1Var;
                }

                public s33 getDefaultViewModelProviderFactory() {
/* 3 */             Application application = null;
/* 4 */             if (this.mFragmentManager == null) {
/* 73 */                f42.m3656l("Can't access ViewModels from detached fragment");
/* 3 */                 return null;
                    }
/* 8 */             if (this.mDefaultFactory == null) {
/* 20 */                for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
/* 24 */                    if (applicationContext instanceof Application) {
/* 27 */                        application = (Application) applicationContext;
                                break;
                            }
                        }
/* 37 */                if (application == null && AbstractC0111w.m674K(3)) {
/* 54 */                    Objects.toString(requireContext().getApplicationContext());
                        }
/* 66 */                this.mDefaultFactory = new a72(application, this, getArguments());
                    }
/* 68 */            return this.mDefaultFactory;
                }

                public int getEnterAnim() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return jm0Var.f12363b;
                }

                public Object getEnterTransition() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return jm0Var.f12370i;
                }

                public md2 getEnterTransitionCallback() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 4 */             if (jm0Var == null) {
/* 3 */                 return null;
                    }
/* 7 */             jm0Var.getClass();
/* 3 */             return null;
                }

                public int getExitAnim() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return jm0Var.f12364c;
                }

                public Object getExitTransition() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return jm0Var.f12372k;
                }

                public md2 getExitTransitionCallback() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 4 */             if (jm0Var == null) {
/* 3 */                 return null;
                    }
/* 7 */             jm0Var.getClass();
/* 3 */             return null;
                }

                public View getFocusedView() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return jm0Var.f12379r;
                }

                @Deprecated
                public final AbstractC0111w getFragmentManager() {
/* 1 */             return this.mFragmentManager;
                }

                public final Object getHost() {
/* 1 */             om0 om0Var = this.mHost;
/* 3 */             if (om0Var == null) {
/* 5 */                 return null;
                    }
/* 9 */             return ((C0105q) om0Var).f1468e;
                }

                public final int getId() {
/* 1 */             return this.mFragmentId;
                }

                @Deprecated
                public LayoutInflater getLayoutInflater(Bundle bundle) {
/* 1 */             om0 om0Var = this.mHost;
/* 3 */             if (om0Var == null) {
/* 27 */                f42.m3656l("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
/* 30 */                return null;
                    }
/* 7 */             FragmentActivity fragmentActivity = ((C0105q) om0Var).f1468e;
/* 13 */            LayoutInflater layoutInflaterCloneInContext = fragmentActivity.getLayoutInflater().cloneInContext(fragmentActivity);
/* 21 */            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f1496f);
/* 24 */            return layoutInflaterCloneInContext;
                }

                @Override // p000.g71
                public v61 getLifecycle() {
/* 1 */             return this.mLifecycleRegistry;
                }

                @Deprecated
                public b91 getLoaderManager() {
/* 1 */             return b91.m1298a(this);
                }

                public int getNextTransition() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return jm0Var.f12367f;
                }

                public final Fragment getParentFragment() {
/* 1 */             return this.mParentFragment;
                }

                public final AbstractC0111w getParentFragmentManager() {
/* 1 */             AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 3 */             if (abstractC0111w != null) {
/* 5 */                 return abstractC0111w;
                    }
/* 14 */            f42.m3656l(fm0.m3782h("Fragment ", this, " not associated with a fragment manager."));
/* 17 */            return null;
                }

                public boolean getPopDirection() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return false;
                    }
/* 7 */             return jm0Var.f12362a;
                }

                public int getPopEnterAnim() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return jm0Var.f12365d;
                }

                public int getPopExitAnim() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return jm0Var.f12366e;
                }

                public float getPostOnViewCreatedAlpha() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return 1.0f;
                    }
/* 8 */             return jm0Var.f12378q;
                }

                public Object getReenterTransition() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             Object obj = jm0Var.f12373l;
                    return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
                }

                public final Resources getResources() {
/* 5 */             return requireContext().getResources();
                }

                @Deprecated
                public final boolean getRetainInstance() {
/* 1 */             an0 an0Var = bn0.f2547a;
/* 19 */            zq0 zq0Var = new zq0(this, "Attempting to get retain instance for fragment " + this);
/* 22 */            bn0.m1397c(zq0Var);
/* 25 */            an0 an0VarM1395a = bn0.m1395a(this);
/* 37 */            if (an0VarM1395a.f341a.contains(zm0.f20256f) && bn0.m1399e(an0VarM1395a, getClass(), zq0.class)) {
/* 51 */                bn0.m1396b(an0VarM1395a, zq0Var);
                    }
/* 54 */            return this.mRetainInstance;
                }

                public Object getReturnTransition() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             Object obj = jm0Var.f12371j;
                    return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
                }

                @Override // p000.z62
                public final x62 getSavedStateRegistry() {
/* 3 */             return this.mSavedStateRegistryController.f19509b;
                }

                public Object getSharedElementEnterTransition() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             return jm0Var.f12374m;
                }

                public Object getSharedElementReturnTransition() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return null;
                    }
/* 7 */             Object obj = jm0Var.f12375n;
                    return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
                }

                public ArrayList<String> getSharedElementSourceNames() {
                    ArrayList<String> arrayList;
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
                    return (jm0Var == null || (arrayList = jm0Var.f12368g) == null) ? new ArrayList<>() : arrayList;
                }

                public ArrayList<String> getSharedElementTargetNames() {
                    ArrayList<String> arrayList;
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
                    return (jm0Var == null || (arrayList = jm0Var.f12369h) == null) ? new ArrayList<>() : arrayList;
                }

                public final String getString(int i) {
/* 5 */             return getResources().getString(i);
                }

                public final String getTag() {
/* 1 */             return this.mTag;
                }

                @Deprecated
                public final int getTargetRequestCode() {
/* 1 */             an0 an0Var = bn0.f2547a;
/* 19 */            ar0 ar0Var = new ar0(this, "Attempting to get target request code from fragment " + this);
/* 22 */            bn0.m1397c(ar0Var);
/* 25 */            an0 an0VarM1395a = bn0.m1395a(this);
/* 37 */            if (an0VarM1395a.f341a.contains(zm0.f20258v) && bn0.m1399e(an0VarM1395a, getClass(), ar0.class)) {
/* 51 */                bn0.m1396b(an0VarM1395a, ar0Var);
                    }
/* 54 */            return this.mTargetRequestCode;
                }

                public final CharSequence getText(int i) {
/* 5 */             return getResources().getText(i);
                }

                @Deprecated
                public boolean getUserVisibleHint() {
/* 1 */             return this.mUserVisibleHint;
                }

                public View getView() {
/* 1 */             return this.mView;
                }

                public g71 getViewLifecycleOwner() {
/* 1 */             rn0 rn0Var = this.mViewLifecycleOwner;
/* 3 */             if (rn0Var != null) {
/* 5 */                 return rn0Var;
                    }
/* 14 */            f42.m3656l(fm0.m3782h("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
/* 17 */            return null;
                }

                public a91 getViewLifecycleOwnerLiveData() {
/* 1 */             return this.mViewLifecycleOwnerLiveData;
                }

                @Override // p000.u33
                public t33 getViewModelStore() {
/* 4 */             if (this.mFragmentManager == null) {
/* 48 */                f42.m3656l("Can't access ViewModels from detached fragment");
/* 3 */                 return null;
                    }
/* 11 */            if (getMinimumMaxLifecycleState() == 1) {
/* 42 */                f42.m3656l("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
/* 3 */                 return null;
                    }
/* 17 */            HashMap map = this.mFragmentManager.f1489N.f1520f;
/* 25 */            t33 t33Var = (t33) map.get(this.mWho);
/* 27 */            if (t33Var != null) {
/* 39 */                return t33Var;
                    }
/* 31 */            t33 t33Var2 = new t33();
/* 36 */            map.put(this.mWho, t33Var2);
/* 39 */            return t33Var2;
                }

                public final boolean hasOptionsMenu() {
/* 1 */             return this.mHasMenu;
                }

                public final int hashCode() {
/* 1 */             return super.hashCode();
                }

                public void initState() {
/* 1 */             initLifecycle();
/* 6 */             this.mPreviousWho = this.mWho;
/* 16 */            this.mWho = UUID.randomUUID().toString();
/* 19 */            this.mAdded = false;
/* 21 */            this.mRemoving = false;
/* 23 */            this.mFromLayout = false;
/* 25 */            this.mInLayout = false;
/* 27 */            this.mRestored = false;
/* 29 */            this.mBackStackNesting = 0;
/* 32 */            this.mFragmentManager = null;
/* 39 */            this.mChildFragmentManager = new vm0();
/* 41 */            this.mHost = null;
/* 43 */            this.mFragmentId = 0;
/* 45 */            this.mContainerId = 0;
/* 47 */            this.mTag = null;
/* 49 */            this.mHidden = false;
/* 51 */            this.mDetached = false;
                }

                public final boolean isAdded() {
                    return this.mHost != null && this.mAdded;
                }

                public final boolean isDetached() {
/* 1 */             return this.mDetached;
                }

                public final boolean isHidden() {
/* 3 */             if (this.mHidden) {
/* 27 */                return true;
                    }
/* 5 */             AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 8 */             if (abstractC0111w != null) {
/* 10 */                Fragment fragment = this.mParentFragment;
/* 12 */                abstractC0111w.getClass();
/* 23 */                if (fragment == null ? false : fragment.isHidden()) {
/* 27 */                    return true;
                        }
                    }
/* 7 */             return false;
                }

                public final boolean isInBackStack() {
                    return this.mBackStackNesting > 0;
                }

                public final boolean isInLayout() {
/* 1 */             return this.mInLayout;
                }

                public final boolean isMenuVisible() {
/* 3 */             if (!this.mMenuVisible) {
/* 23 */                return false;
                    }
/* 8 */             if (this.mFragmentManager != null) {
/* 10 */                Fragment fragment = this.mParentFragment;
/* 20 */                if (!(fragment == null ? true : fragment.isMenuVisible())) {
/* 23 */                    return false;
                        }
                    }
/* 7 */             return true;
                }

                public boolean isPostponed() {
/* 1 */             jm0 jm0Var = this.mAnimationInfo;
/* 3 */             if (jm0Var == null) {
/* 5 */                 return false;
                    }
/* 7 */             return jm0Var.f12380s;
                }

                public final boolean isRemoving() {
/* 1 */             return this.mRemoving;
                }

                public final boolean isResumed() {
                    return this.mState >= 7;
                }

                public final boolean isStateSaved() {
/* 1 */             AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 4 */             if (abstractC0111w == null) {
/* 3 */                 return false;
                    }
                    return abstractC0111w.f1482G || abstractC0111w.f1483H;
                }

                public final boolean isVisible() {
                    View view;
                    return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
                }

                public void noteStateNotSaved() {
/* 3 */             this.mChildFragmentManager.m688P();
                }

                @Deprecated
                public void onActivityCreated(Bundle bundle) {
/* 2 */             this.mCalled = true;
                }

                @Deprecated
                public void onActivityResult(int i, int i2, Intent intent) {
/* 6 */             if (AbstractC0111w.m674K(2)) {
/* 8 */                 toString();
/* 11 */                Objects.toString(intent);
                    }
                }

                public void onAttach(Context context) {
/* 2 */             this.mCalled = true;
/* 4 */             om0 om0Var = this.mHost;
/* 10 */            FragmentActivity fragmentActivity = om0Var == null ? null : om0Var.f14816a;
/* 12 */            if (fragmentActivity != null) {
/* 15 */                this.mCalled = false;
/* 17 */                onAttach((Activity) fragmentActivity);
                    }
                }

                @Deprecated
                public void onAttachFragment(Fragment fragment) {
                }

                @Override // android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
/* 2 */             this.mCalled = true;
                }

                public boolean onContextItemSelected(MenuItem menuItem) {
/* 1 */             return false;
                }

                public void onCreate(Bundle bundle) {
/* 2 */             this.mCalled = true;
/* 4 */             restoreChildFragmentState();
/* 7 */             AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 11 */            if (abstractC0111w.f1511u >= 1) {
/* 13 */                return;
                    }
/* 15 */            abstractC0111w.f1482G = false;
/* 17 */            abstractC0111w.f1483H = false;
/* 21 */            abstractC0111w.f1489N.f1523i = false;
/* 23 */            abstractC0111w.m723u(1);
                }

                public Animation onCreateAnimation(int i, boolean z, int i2) {
/* 1 */             return null;
                }

                public Animator onCreateAnimator(int i, boolean z, int i2) {
/* 1 */             return null;
                }

                @Override // android.view.View.OnCreateContextMenuListener
                public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
/* 5 */             requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
                }

                @Deprecated
                public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
                }

                public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 1 */             int i = this.mContentLayoutId;
/* 3 */             if (i != 0) {
/* 6 */                 return layoutInflater.inflate(i, viewGroup, false);
                    }
/* 11 */            return null;
                }

                public void onDestroy() {
/* 2 */             this.mCalled = true;
                }

                @Deprecated
                public void onDestroyOptionsMenu() {
                }

                public void onDestroyView() {
/* 2 */             this.mCalled = true;
                }

                public void onDetach() {
/* 2 */             this.mCalled = true;
                }

                public LayoutInflater onGetLayoutInflater(Bundle bundle) {
/* 1 */             return getLayoutInflater(bundle);
                }

                public void onHiddenChanged(boolean z) {
                }

                public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
/* 2 */             this.mCalled = true;
/* 4 */             om0 om0Var = this.mHost;
/* 10 */            FragmentActivity fragmentActivity = om0Var == null ? null : om0Var.f14816a;
/* 12 */            if (fragmentActivity != null) {
/* 15 */                this.mCalled = false;
/* 17 */                onInflate((Activity) fragmentActivity, attributeSet, bundle);
                    }
                }

                @Override // android.content.ComponentCallbacks
                public void onLowMemory() {
/* 2 */             this.mCalled = true;
                }

                public void onMultiWindowModeChanged(boolean z) {
                }

                @Deprecated
                public boolean onOptionsItemSelected(MenuItem menuItem) {
/* 1 */             return false;
                }

                @Deprecated
                public void onOptionsMenuClosed(Menu menu) {
                }

                public void onPause() {
/* 2 */             this.mCalled = true;
                }

                public void onPictureInPictureModeChanged(boolean z) {
                }

                @Deprecated
                public void onPrepareOptionsMenu(Menu menu) {
                }

                public void onPrimaryNavigationFragmentChanged(boolean z) {
                }

                @Deprecated
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                }

                public void onResume() {
/* 2 */             this.mCalled = true;
                }

                public void onSaveInstanceState(Bundle bundle) {
                }

                public void onStart() {
/* 2 */             this.mCalled = true;
                }

                public void onStop() {
/* 2 */             this.mCalled = true;
                }

                public void onViewCreated(View view, Bundle bundle) {
                }

                public void onViewStateRestored(Bundle bundle) {
/* 2 */             this.mCalled = true;
                }

                public void performActivityCreated(Bundle bundle) {
/* 3 */             this.mChildFragmentManager.m688P();
/* 7 */             this.mState = 3;
/* 10 */            this.mCalled = false;
/* 12 */            onActivityCreated(bundle);
/* 17 */            if (!this.mCalled) {
/* 50 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onActivityCreated()"));
                    }
/* 19 */            restoreViewState();
/* 22 */            AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 24 */            abstractC0111w.f1482G = false;
/* 26 */            abstractC0111w.f1483H = false;
/* 30 */            abstractC0111w.f1489N.f1523i = false;
/* 33 */            abstractC0111w.m723u(4);
                }

                public void performAttach() {
/* 3 */             Iterator<km0> it = this.mOnPreAttachedListeners.iterator();
/* 11 */            while (it.hasNext()) {
/* 19 */                it.next().mo668a();
                    }
/* 25 */            this.mOnPreAttachedListeners.clear();
/* 36 */            this.mChildFragmentManager.m701b(this.mHost, createFragmentContainer(), this);
/* 40 */            this.mState = 0;
/* 42 */            this.mCalled = false;
/* 48 */            onAttach((Context) this.mHost.f14817b);
/* 53 */            if (!this.mCalled) {
/* 106 */               throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onAttach()"));
                    }
/* 59 */            Iterator it2 = this.mFragmentManager.f1505o.iterator();
/* 67 */            while (it2.hasNext()) {
/* 75 */                ((xm0) it2.next()).mo672a(this);
                    }
/* 79 */            AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 81 */            abstractC0111w.f1482G = false;
/* 83 */            abstractC0111w.f1483H = false;
/* 87 */            abstractC0111w.f1489N.f1523i = false;
/* 89 */            abstractC0111w.m723u(0);
                }

                public void performConfigurationChanged(Configuration configuration) {
/* 1 */             onConfigurationChanged(configuration);
                }

                public boolean performContextItemSelected(MenuItem menuItem) {
/* 3 */             if (this.mHidden) {
/* 20 */                return false;
                    }
/* 9 */             if (onContextItemSelected(menuItem)) {
/* 11 */                return true;
                    }
/* 15 */            return this.mChildFragmentManager.m712j(menuItem);
                }

                public void performCreate(Bundle bundle) {
/* 3 */             this.mChildFragmentManager.m688P();
/* 7 */             this.mState = 1;
/* 10 */            this.mCalled = false;
/* 19 */            this.mLifecycleRegistry.mo4483a(new C0100l(this));
/* 22 */            onCreate(bundle);
/* 25 */            this.mIsCreated = true;
/* 29 */            if (!this.mCalled) {
/* 52 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onCreate()"));
                    }
/* 35 */            this.mLifecycleRegistry.m4487e(t61.ON_CREATE);
                }

                public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
/* 3 */             boolean z = false;
/* 4 */             if (this.mHidden) {
/* 3 */                 return false;
                    }
/* 8 */             if (this.mHasMenu && this.mMenuVisible) {
/* 14 */                onCreateOptionsMenu(menu, menuInflater);
/* 17 */                z = true;
                    }
/* 24 */            return this.mChildFragmentManager.m713k(menu, menuInflater) | z;
                }

                public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
/* 3 */             this.mChildFragmentManager.m688P();
/* 7 */             this.mPerformedCreateView = true;
/* 25 */            this.mViewLifecycleOwner = new rn0(this, getViewModelStore(), new RunnableC2166s2(this, 22));
/* 27 */            View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
/* 31 */            this.mView = viewOnCreateView;
/* 33 */            rn0 rn0Var = this.mViewLifecycleOwner;
/* 35 */            if (viewOnCreateView == null) {
/* 101 */               if (rn0Var.f16196d == null) {
/* 104 */                   this.mViewLifecycleOwner = null;
/* 106 */                   return;
                        } else {
/* 109 */                   f42.m3656l("Called getViewLifecycleOwner() but onCreateView() returned null");
/* 112 */                   return;
                        }
                    }
/* 37 */            rn0Var.m8209b();
/* 45 */            if (AbstractC0111w.m674K(3)) {
/* 49 */                Objects.toString(this.mView);
/* 52 */                toString();
                    }
/* 55 */            View view = this.mView;
/* 57 */            rn0 rn0Var2 = this.mViewLifecycleOwner;
/* 59 */            view.getClass();
/* 64 */            view.setTag(R$id.view_tree_lifecycle_owner, rn0Var2);
/* 67 */            View view2 = this.mView;
/* 69 */            rn0 rn0Var3 = this.mViewLifecycleOwner;
/* 71 */            view2.getClass();
/* 76 */            view2.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, rn0Var3);
/* 79 */            View view3 = this.mView;
/* 81 */            rn0 rn0Var4 = this.mViewLifecycleOwner;
/* 83 */            view3.getClass();
/* 88 */            view3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, rn0Var4);
/* 95 */            this.mViewLifecycleOwnerLiveData.mo124j(this.mViewLifecycleOwner);
                }

                public void performDestroy() {
/* 3 */             this.mChildFragmentManager.m714l();
/* 10 */            this.mLifecycleRegistry.m4487e(t61.ON_DESTROY);
/* 14 */            this.mState = 0;
/* 16 */            this.mCalled = false;
/* 18 */            this.mIsCreated = false;
/* 20 */            onDestroy();
/* 25 */            if (!this.mCalled) {
/* 41 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onDestroy()"));
                    }
                }

                public void performDestroyView() {
/* 4 */             this.mChildFragmentManager.m723u(1);
/* 9 */             if (this.mView != null) {
/* 11 */                rn0 rn0Var = this.mViewLifecycleOwner;
/* 13 */                rn0Var.m8209b();
/* 26 */                if (rn0Var.f16196d.f9483c.compareTo(u61.f17376c) >= 0) {
/* 32 */                    this.mViewLifecycleOwner.m8208a(t61.ON_DESTROY);
                        }
                    }
/* 35 */            this.mState = 1;
/* 38 */            this.mCalled = false;
/* 40 */            onDestroyView();
/* 45 */            if (!this.mCalled) {
/* 88 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onDestroyView()"));
                    }
/* 53 */            vf2 vf2Var = b91.m1298a(this).f7578b.f7066d;
/* 55 */            int i = vf2Var.f18042c;
/* 58 */            for (int i2 = 0; i2 < i; i2++) {
/* 66 */                ((c91) vf2Var.f18041b[i2]).m1551l();
                    }
/* 72 */            this.mPerformedCreateView = false;
                }

                public void performDetach() {
/* 2 */             this.mState = -1;
/* 5 */             this.mCalled = false;
/* 7 */             onDetach();
/* 11 */            this.mLayoutInflater = null;
/* 15 */            if (!this.mCalled) {
/* 47 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onDetach()"));
                    }
/* 17 */            AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 21 */            if (abstractC0111w.f1484I) {
/* 33 */                return;
                    }
/* 23 */            abstractC0111w.m714l();
/* 31 */            this.mChildFragmentManager = new vm0();
                }

                public LayoutInflater performGetLayoutInflater(Bundle bundle) {
/* 1 */             LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
/* 5 */             this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
/* 7 */             return layoutInflaterOnGetLayoutInflater;
                }

                public void performLowMemory() {
/* 1 */             onLowMemory();
                }

                public void performMultiWindowModeChanged(boolean z) {
/* 1 */             onMultiWindowModeChanged(z);
                }

                public boolean performOptionsItemSelected(MenuItem menuItem) {
/* 3 */             if (this.mHidden) {
/* 28 */                return false;
                    }
/* 7 */             if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
/* 19 */                return true;
                    }
/* 23 */            return this.mChildFragmentManager.m718p(menuItem);
                }

                public void performOptionsMenuClosed(Menu menu) {
/* 3 */             if (this.mHidden) {
/* 21 */                return;
                    }
/* 7 */             if (this.mHasMenu && this.mMenuVisible) {
/* 13 */                onOptionsMenuClosed(menu);
                    }
/* 18 */            this.mChildFragmentManager.m719q(menu);
                }

                public void performPause() {
/* 4 */             this.mChildFragmentManager.m723u(5);
/* 9 */             if (this.mView != null) {
/* 15 */                this.mViewLifecycleOwner.m8208a(t61.ON_PAUSE);
                    }
/* 22 */            this.mLifecycleRegistry.m4487e(t61.ON_PAUSE);
/* 26 */            this.mState = 6;
/* 29 */            this.mCalled = false;
/* 31 */            onPause();
/* 36 */            if (!this.mCalled) {
/* 52 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onPause()"));
                    }
                }

                public void performPictureInPictureModeChanged(boolean z) {
/* 1 */             onPictureInPictureModeChanged(z);
                }

                public boolean performPrepareOptionsMenu(Menu menu) {
/* 3 */             boolean z = false;
/* 4 */             if (this.mHidden) {
/* 3 */                 return false;
                    }
/* 8 */             if (this.mHasMenu && this.mMenuVisible) {
/* 14 */                onPrepareOptionsMenu(menu);
/* 17 */                z = true;
                    }
/* 24 */            return this.mChildFragmentManager.m722t(menu) | z;
                }

                public void performPrimaryNavigationFragmentChanged() {
/* 3 */             this.mFragmentManager.getClass();
/* 6 */             boolean zM676N = AbstractC0111w.m676N(this);
/* 10 */            Boolean bool = this.mIsPrimaryNavigationFragment;
/* 12 */            if (bool == null || bool.booleanValue() != zM676N) {
/* 26 */                this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM676N);
/* 28 */                onPrimaryNavigationFragmentChanged(zM676N);
/* 31 */                AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 33 */                abstractC0111w.m706d0();
/* 38 */                abstractC0111w.m720r(abstractC0111w.f1515y);
                    }
                }

                public void performResume() {
/* 3 */             this.mChildFragmentManager.m688P();
/* 9 */             this.mChildFragmentManager.m728z(true);
/* 13 */            this.mState = 7;
/* 16 */            this.mCalled = false;
/* 18 */            onResume();
/* 23 */            if (!this.mCalled) {
/* 70 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onResume()"));
                    }
/* 25 */            i71 i71Var = this.mLifecycleRegistry;
/* 27 */            t61 t61Var = t61.ON_RESUME;
/* 29 */            i71Var.m4487e(t61Var);
/* 34 */            if (this.mView != null) {
/* 40 */                this.mViewLifecycleOwner.f16196d.m4487e(t61Var);
                    }
/* 43 */            AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 45 */            abstractC0111w.f1482G = false;
/* 47 */            abstractC0111w.f1483H = false;
/* 51 */            abstractC0111w.f1489N.f1523i = false;
/* 53 */            abstractC0111w.m723u(7);
                }

                public void performSaveInstanceState(Bundle bundle) {
/* 1 */             onSaveInstanceState(bundle);
                }

                public void performStart() {
/* 3 */             this.mChildFragmentManager.m688P();
/* 9 */             this.mChildFragmentManager.m728z(true);
/* 13 */            this.mState = 5;
/* 16 */            this.mCalled = false;
/* 18 */            onStart();
/* 23 */            if (!this.mCalled) {
/* 70 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onStart()"));
                    }
/* 25 */            i71 i71Var = this.mLifecycleRegistry;
/* 27 */            t61 t61Var = t61.ON_START;
/* 29 */            i71Var.m4487e(t61Var);
/* 34 */            if (this.mView != null) {
/* 40 */                this.mViewLifecycleOwner.f16196d.m4487e(t61Var);
                    }
/* 43 */            AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 45 */            abstractC0111w.f1482G = false;
/* 47 */            abstractC0111w.f1483H = false;
/* 51 */            abstractC0111w.f1489N.f1523i = false;
/* 53 */            abstractC0111w.m723u(5);
                }

                public void performStop() {
/* 1 */             AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 4 */             abstractC0111w.f1483H = true;
/* 8 */             abstractC0111w.f1489N.f1523i = true;
/* 11 */            abstractC0111w.m723u(4);
/* 16 */            if (this.mView != null) {
/* 22 */                this.mViewLifecycleOwner.m8208a(t61.ON_STOP);
                    }
/* 29 */            this.mLifecycleRegistry.m4487e(t61.ON_STOP);
/* 32 */            this.mState = 4;
/* 35 */            this.mCalled = false;
/* 37 */            onStop();
/* 42 */            if (!this.mCalled) {
/* 58 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onStop()"));
                    }
                }

                public void performViewCreated() {
/* 1 */             Bundle bundle = this.mSavedFragmentState;
/* 15 */            onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
/* 21 */            this.mChildFragmentManager.m723u(2);
                }

                public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
/* 6 */             ensureAnimationInfo().f12380s = true;
/* 8 */             Handler handler = this.mPostponedHandler;
/* 10 */            if (handler != null) {
/* 14 */                handler.removeCallbacks(this.mPostponedDurationRunnable);
                    }
/* 17 */            AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 19 */            if (abstractC0111w != null) {
/* 25 */                this.mPostponedHandler = abstractC0111w.f1512v.f14818c;
                    } else {
/* 37 */                this.mPostponedHandler = new Handler(Looper.getMainLooper());
                    }
/* 43 */            this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
/* 54 */            this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
                }

                public final <I, O> AbstractC0903f3 registerForActivityResult(AbstractC0830d3 abstractC0830d3, InterfaceC0202c3 interfaceC0202c3) {
/* 7 */             return prepareCallInternal(abstractC0830d3, new C0108t(this, 3), interfaceC0202c3);
                }

                public void registerForContextMenu(View view) {
/* 1 */             view.setOnCreateContextMenuListener(this);
                }

                @Deprecated
                public final void requestPermissions(String[] strArr, int i) {
/* 3 */             if (this.mHost == null) {
/* 48 */                f42.m3656l(fm0.m3782h("Fragment ", this, " not attached to Activity"));
/* 51 */                return;
                    }
/* 5 */             AbstractC0111w parentFragmentManager = getParentFragmentManager();
/* 11 */            if (parentFragmentManager.f1479D == null) {
/* 33 */                parentFragmentManager.f1512v.getClass();
/* 36 */                strArr.getClass();
                    } else {
/* 22 */                parentFragmentManager.f1480E.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
/* 27 */                parentFragmentManager.f1479D.mo3637a(strArr);
                    }
                }

                public final FragmentActivity requireActivity() {
/* 1 */             FragmentActivity activity = getActivity();
/* 5 */             if (activity != null) {
/* 7 */                 return activity;
                    }
/* 16 */            f42.m3656l(fm0.m3782h("Fragment ", this, " not attached to an activity."));
/* 19 */            return null;
                }

                public final Bundle requireArguments() {
/* 1 */             Bundle arguments = getArguments();
/* 5 */             if (arguments != null) {
/* 7 */                 return arguments;
                    }
/* 16 */            f42.m3656l(fm0.m3782h("Fragment ", this, " does not have any arguments."));
/* 19 */            return null;
                }

                public final Context requireContext() {
/* 1 */             Context context = getContext();
/* 5 */             if (context != null) {
/* 7 */                 return context;
                    }
/* 16 */            f42.m3656l(fm0.m3782h("Fragment ", this, " not attached to a context."));
/* 19 */            return null;
                }

                @Deprecated
                public final AbstractC0111w requireFragmentManager() {
/* 1 */             return getParentFragmentManager();
                }

                public final Object requireHost() {
/* 1 */             Object host = getHost();
/* 5 */             if (host != null) {
/* 7 */                 return host;
                    }
/* 16 */            f42.m3656l(fm0.m3782h("Fragment ", this, " not attached to a host."));
/* 19 */            return null;
                }

                public final Fragment requireParentFragment() {
/* 1 */             Fragment parentFragment = getParentFragment();
/* 5 */             if (parentFragment != null) {
/* 56 */                return parentFragment;
                    }
/* 13 */            if (getContext() == null) {
/* 21 */                f42.m3656l(fm0.m3782h("Fragment ", this, " is not attached to any Fragment or host"));
/* 24 */                return null;
                    }
/* 30 */            StringBuilder sb = new StringBuilder("Fragment ");
/* 33 */            sb.append(this);
/* 36 */            Context context = getContext();
/* 42 */            sb.append(" is not a child Fragment, it is directly attached to ");
/* 45 */            sb.append(context);
/* 55 */            throw new IllegalStateException(sb.toString());
                }

                public final View requireView() {
/* 1 */             View view = getView();
/* 5 */             if (view != null) {
/* 7 */                 return view;
                    }
/* 16 */            f42.m3656l(fm0.m3782h("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
/* 19 */            return null;
                }

                public void restoreChildFragmentState() {
                    Bundle bundle;
/* 1 */             Bundle bundle2 = this.mSavedFragmentState;
/* 3 */             if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
/* 33 */                return;
                    }
/* 15 */            this.mChildFragmentManager.m694V(bundle);
/* 18 */            AbstractC0111w abstractC0111w = this.mChildFragmentManager;
/* 21 */            abstractC0111w.f1482G = false;
/* 23 */            abstractC0111w.f1483H = false;
/* 27 */            abstractC0111w.f1489N.f1523i = false;
/* 30 */            abstractC0111w.m723u(1);
                }

                public final void restoreViewState(Bundle bundle) {
/* 1 */             SparseArray<Parcelable> sparseArray = this.mSavedViewState;
/* 3 */             if (sparseArray != null) {
/* 7 */                 this.mView.restoreHierarchyState(sparseArray);
/* 11 */                this.mSavedViewState = null;
                    }
/* 14 */            this.mCalled = false;
/* 16 */            onViewStateRestored(bundle);
/* 21 */            if (!this.mCalled) {
/* 48 */                throw new oi2(fm0.m3782h("Fragment ", this, " did not call through to super.onViewStateRestored()"));
                    }
/* 25 */            if (this.mView != null) {
/* 31 */                this.mViewLifecycleOwner.m8208a(t61.ON_CREATE);
                    }
                }

                public void setAllowEnterTransitionOverlap(boolean z) {
/* 9 */             ensureAnimationInfo().f12377p = Boolean.valueOf(z);
                }

                public void setAllowReturnTransitionOverlap(boolean z) {
/* 9 */             ensureAnimationInfo().f12376o = Boolean.valueOf(z);
                }

                public void setAnimations(int i, int i2, int i3, int i4) {
/* 3 */             if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
/* 13 */                return;
                    }
/* 18 */            ensureAnimationInfo().f12363b = i;
/* 24 */            ensureAnimationInfo().f12364c = i2;
/* 30 */            ensureAnimationInfo().f12365d = i3;
/* 36 */            ensureAnimationInfo().f12366e = i4;
                }

                public void setArguments(Bundle bundle) {
/* 3 */             if (this.mFragmentManager == null || !isStateSaved()) {
/* 18 */                this.mArguments = bundle;
                    } else {
/* 14 */                f42.m3656l("Fragment already added and state has been saved");
                    }
                }

                public void setEnterSharedElementCallback(md2 md2Var) {
/* 5 */             ensureAnimationInfo().getClass();
                }

                public void setEnterTransition(Object obj) {
/* 5 */             ensureAnimationInfo().f12370i = obj;
                }

                public void setExitSharedElementCallback(md2 md2Var) {
/* 5 */             ensureAnimationInfo().getClass();
                }

                public void setExitTransition(Object obj) {
/* 5 */             ensureAnimationInfo().f12372k = obj;
                }

                public void setFocusedView(View view) {
/* 5 */             ensureAnimationInfo().f12379r = view;
                }

                @Deprecated
                public void setHasOptionsMenu(boolean z) {
/* 3 */             if (this.mHasMenu != z) {
/* 5 */                 this.mHasMenu = z;
/* 11 */                if (!isAdded() || isHidden()) {
/* 28 */                    return;
                        }
/* 25 */                ((C0105q) this.mHost).f1468e.invalidateMenu();
                    }
                }

                public void setInitialSavedState(SavedState savedState) {
                    Bundle bundle;
/* 3 */             if (this.mFragmentManager != null) {
/* 18 */                f42.m3656l("Fragment already added");
/* 21 */                return;
                    }
/* 5 */             if (savedState == null || (bundle = savedState.f1352a) == null) {
/* 12 */                bundle = null;
                    }
/* 13 */            this.mSavedFragmentState = bundle;
                }

                public void setMenuVisibility(boolean z) {
/* 3 */             if (this.mMenuVisible != z) {
/* 5 */                 this.mMenuVisible = z;
/* 9 */                 if (this.mHasMenu && isAdded() && !isHidden()) {
/* 29 */                    ((C0105q) this.mHost).f1468e.invalidateMenu();
                        }
                    }
                }

                public void setNextTransition(int i) {
/* 3 */             if (this.mAnimationInfo == null && i == 0) {
/* 7 */                 return;
                    }
/* 8 */             ensureAnimationInfo();
/* 13 */            this.mAnimationInfo.f12367f = i;
                }

                public void setPopDirection(boolean z) {
/* 3 */             if (this.mAnimationInfo == null) {
/* 5 */                 return;
                    }
/* 10 */            ensureAnimationInfo().f12362a = z;
                }

                public void setPostOnViewCreatedAlpha(float f) {
/* 5 */             ensureAnimationInfo().f12378q = f;
                }

                public void setReenterTransition(Object obj) {
/* 5 */             ensureAnimationInfo().f12373l = obj;
                }

                @Deprecated
                public void setRetainInstance(boolean z) {
/* 1 */             an0 an0Var = bn0.f2547a;
/* 19 */            qb2 qb2Var = new qb2(this, "Attempting to set retain instance for fragment " + this);
/* 22 */            bn0.m1397c(qb2Var);
/* 25 */            an0 an0VarM1395a = bn0.m1395a(this);
/* 37 */            if (an0VarM1395a.f341a.contains(zm0.f20256f) && bn0.m1399e(an0VarM1395a, getClass(), qb2.class)) {
/* 51 */                bn0.m1396b(an0VarM1395a, qb2Var);
                    }
/* 54 */            this.mRetainInstance = z;
/* 56 */            AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 58 */            if (abstractC0111w == null) {
/* 73 */                this.mRetainInstanceChangedWhileDetached = true;
/* 75 */                return;
                    }
/* 60 */            C0112x c0112x = abstractC0111w.f1489N;
/* 62 */            if (z) {
/* 64 */                c0112x.m730c(this);
                    } else {
/* 68 */                c0112x.m732e(this);
                    }
                }

                public void setReturnTransition(Object obj) {
/* 5 */             ensureAnimationInfo().f12371j = obj;
                }

                public void setSharedElementEnterTransition(Object obj) {
/* 5 */             ensureAnimationInfo().f12374m = obj;
                }

                public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
/* 1 */             ensureAnimationInfo();
/* 4 */             jm0 jm0Var = this.mAnimationInfo;
/* 6 */             jm0Var.f12368g = arrayList;
/* 8 */             jm0Var.f12369h = arrayList2;
                }

                public void setSharedElementReturnTransition(Object obj) {
/* 5 */             ensureAnimationInfo().f12375n = obj;
                }

                @Deprecated
                public void setTargetFragment(Fragment fragment, int i) {
/* 1 */             if (fragment != null) {
/* 3 */                 an0 an0Var = bn0.f2547a;
/* 37 */                rb2 rb2Var = new rb2(this, "Attempting to set target fragment " + fragment + " with request code " + i + " for fragment " + this);
/* 40 */                bn0.m1397c(rb2Var);
/* 43 */                an0 an0VarM1395a = bn0.m1395a(this);
/* 55 */                if (an0VarM1395a.f341a.contains(zm0.f20258v) && bn0.m1399e(an0VarM1395a, getClass(), rb2.class)) {
/* 69 */                    bn0.m1396b(an0VarM1395a, rb2Var);
                        }
                    }
/* 72 */            AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 80 */            AbstractC0111w abstractC0111w2 = fragment != null ? fragment.mFragmentManager : null;
/* 81 */            if (abstractC0111w != null && abstractC0111w2 != null && abstractC0111w != abstractC0111w2) {
/* 96 */                C1951n4.m6859j(fm0.m3782h("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
/* 99 */                return;
                    }
/* 101 */           for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
/* 107 */               if (targetFragment.equals(this)) {
/* 121 */                   s80.m8426g("Setting ", fragment, " as the target of ", this, " would create a target cycle");
/* 124 */                   return;
                        }
                    }
/* 125 */           if (fragment == null) {
/* 127 */               this.mTargetWho = null;
/* 129 */               this.mTarget = null;
                    } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
/* 147 */               this.mTargetWho = null;
/* 149 */               this.mTarget = fragment;
                    } else {
/* 142 */               this.mTargetWho = fragment.mWho;
/* 144 */               this.mTarget = null;
                    }
/* 151 */           this.mTargetRequestCode = i;
                }

                @Deprecated
                public void setUserVisibleHint(boolean z) {
/* 1 */             an0 an0Var = bn0.f2547a;
/* 27 */            tb2 tb2Var = new tb2(this, "Attempting to set user visible hint to " + z + " for fragment " + this);
/* 30 */            bn0.m1397c(tb2Var);
/* 33 */            an0 an0VarM1395a = bn0.m1395a(this);
/* 45 */            if (an0VarM1395a.f341a.contains(zm0.f20257i) && bn0.m1399e(an0VarM1395a, getClass(), tb2.class)) {
/* 59 */                bn0.m1396b(an0VarM1395a, tb2Var);
                    }
/* 64 */            boolean z2 = false;
/* 67 */            if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
/* 89 */                AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 91 */                C0113y c0113yM709g = abstractC0111w.m709g(this);
/* 95 */                Fragment fragment = c0113yM709g.f1526c;
/* 99 */                if (fragment.mDeferStart) {
/* 103 */                   if (abstractC0111w.f1492b) {
/* 105 */                       abstractC0111w.f1485J = true;
                            } else {
/* 108 */                       fragment.mDeferStart = false;
/* 110 */                       c0113yM709g.m741i();
                            }
                        }
                    }
/* 113 */           this.mUserVisibleHint = z;
/* 117 */           if (this.mState < 5 && !z) {
/* 121 */               z2 = true;
                    }
/* 122 */           this.mDeferStart = z2;
/* 126 */           if (this.mSavedFragmentState != null) {
/* 132 */               this.mSavedUserVisibleHint = Boolean.valueOf(z);
                    }
                }

                public boolean shouldShowRequestPermissionRationale(String str) {
/* 1 */             om0 om0Var = this.mHost;
/* 3 */             if (om0Var != null) {
/* 9 */                 return AbstractC2353x2.m9684b(((C0105q) om0Var).f1468e, str);
                    }
/* 14 */            return false;
                }

                public void startActivity(Intent intent, Bundle bundle) {
/* 1 */             om0 om0Var = this.mHost;
/* 3 */             if (om0Var == null) {
/* 22 */                f42.m3656l(fm0.m3782h("Fragment ", this, " not attached to Activity"));
                    } else {
/* 5 */                 intent.getClass();
/* 10 */                v00.startActivity(om0Var.f14817b, intent, bundle);
                    }
                }

                @Deprecated
                public void startActivityForResult(Intent intent, int i, Bundle bundle) {
/* 3 */             if (this.mHost == null) {
/* 69 */                f42.m3656l(fm0.m3782h("Fragment ", this, " not attached to Activity"));
/* 72 */                return;
                    }
/* 5 */             AbstractC0111w parentFragmentManager = getParentFragmentManager();
/* 11 */            if (parentFragmentManager.f1477B != null) {
/* 22 */                parentFragmentManager.f1480E.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
/* 25 */                if (bundle != null) {
/* 29 */                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                        }
/* 34 */                parentFragmentManager.f1477B.mo3637a(intent);
/* 37 */                return;
                    }
/* 38 */            om0 om0Var = parentFragmentManager.f1512v;
/* 40 */            om0Var.getClass();
/* 43 */            intent.getClass();
/* 47 */            if (i == -1) {
/* 51 */                v00.startActivity(om0Var.f14817b, intent, bundle);
                    } else {
/* 57 */                f42.m3656l("Starting activity with a requestCode requires a FragmentActivity host");
                    }
                }

                @Deprecated
                public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
/* 5 */             if (this.mHost == null) {
/* 147 */               f42.m3656l(fm0.m3782h("Fragment ", this, " not attached to Activity"));
/* 150 */               return;
                    }
/* 12 */            if (AbstractC0111w.m674K(2)) {
/* 14 */                toString();
/* 17 */                Objects.toString(intentSender);
/* 20 */                Objects.toString(intent);
/* 23 */                Objects.toString(bundle);
                    }
/* 26 */            AbstractC0111w parentFragmentManager = getParentFragmentManager();
/* 32 */            if (parentFragmentManager.f1478C == null) {
/* 104 */               om0 om0Var = parentFragmentManager.f1512v;
/* 106 */               om0Var.getClass();
/* 109 */               intentSender.getClass();
/* 115 */               if (i != -1) {
/* 135 */                   f42.m3656l("Starting intent sender with a requestCode requires a FragmentActivity host");
/* 138 */                   return;
                        }
/* 117 */               FragmentActivity fragmentActivity = om0Var.f14816a;
/* 119 */               if (fragmentActivity != null) {
/* 127 */                   fragmentActivity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
/* 130 */                   return;
                        } else {
/* 131 */                   f42.m3656l("Starting intent sender with a requestCode requires a FragmentActivity host");
/* 134 */                   return;
                        }
                    }
/* 34 */            if (bundle != null) {
/* 36 */                if (intent == null) {
/* 40 */                    intent = new Intent();
/* 46 */                    intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                        }
/* 53 */                if (AbstractC0111w.m674K(2)) {
/* 55 */                    bundle.toString();
/* 58 */                    intent.toString();
/* 61 */                    Objects.toString(this);
                        }
/* 66 */                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                    }
/* 69 */            intentSender.getClass();
/* 74 */            IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, intent, i2, i3);
/* 86 */            parentFragmentManager.f1480E.addLast(new FragmentManager$LaunchedFragmentInfo(this.mWho, i));
/* 93 */            if (AbstractC0111w.m674K(2)) {
/* 95 */                toString();
                    }
/* 100 */           parentFragmentManager.f1478C.mo3637a(intentSenderRequest);
                }

                public void startPostponedEnterTransition() {
/* 3 */             if (this.mAnimationInfo == null || !ensureAnimationInfo().f12380s) {
/* 58 */                return;
                    }
/* 16 */            if (this.mHost == null) {
/* 23 */                ensureAnimationInfo().f12380s = false;
                    } else if (Looper.myLooper() != this.mHost.f14818c.getLooper()) {
/* 50 */                this.mHost.f14818c.postAtFrontOfQueue(new hm0(this, 1));
                    } else {
/* 55 */                callStartTransitionListener(true);
                    }
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder(128);
/* 16 */            sb.append(getClass().getSimpleName());
/* 21 */            sb.append("{");
/* 32 */            sb.append(Integer.toHexString(System.identityHashCode(this)));
/* 37 */            sb.append("} (");
/* 42 */            sb.append(this.mWho);
/* 47 */            if (this.mFragmentId != 0) {
/* 51 */                sb.append(" id=0x");
/* 60 */                sb.append(Integer.toHexString(this.mFragmentId));
                    }
/* 65 */            if (this.mTag != null) {
/* 69 */                sb.append(" tag=");
/* 74 */                sb.append(this.mTag);
                    }
/* 79 */            sb.append(")");
/* 82 */            return sb.toString();
                }

                public void unregisterForContextMenu(View view) {
/* 2 */             view.setOnCreateContextMenuListener(null);
                }

/* 9 */         public final String getString(int i, Object... objArr) {
/* 10 */            return getResources().getString(i, objArr);
                }

/* 11 */        public final <I, O> AbstractC0903f3 registerForActivityResult(AbstractC0830d3 abstractC0830d3, AbstractC1816k3 abstractC1816k3, InterfaceC0202c3 interfaceC0202c3) {
/* 12 */            return prepareCallInternal(abstractC0830d3, new gr0(abstractC1816k3), interfaceC0202c3);
                }

                @Deprecated
/* 20 */        public void onAttach(Activity activity) {
/* 21 */            this.mCalled = true;
                }

                @Deprecated
/* 20 */        public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
/* 21 */            this.mCalled = true;
                }

/* 25 */        public void startActivity(Intent intent) {
/* 26 */            startActivity(intent, null);
                }

/* 31 */        public final LayoutInflater getLayoutInflater() {
/* 32 */            LayoutInflater layoutInflater = this.mLayoutInflater;
                    return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
                }

/* 48 */        private void restoreViewState() {
/* 49 */            if (AbstractC0111w.m674K(3)) {
/* 50 */                toString();
                    }
/* 51 */            if (this.mView != null) {
/* 52 */                Bundle bundle = this.mSavedFragmentState;
/* 54 */                restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
                    }
/* 55 */            this.mSavedFragmentState = null;
                }

/* 57 */        public void postponeEnterTransition() {
/* 58 */            ensureAnimationInfo().f12380s = true;
                }

                @Deprecated
/* 72 */        public void startActivityForResult(Intent intent, int i) {
/* 73 */            startActivityForResult(intent, i, null);
                }

/* 77 */        public Fragment(int i) {
/* 78 */            this();
/* 79 */            this.mContentLayoutId = i;
                }

                @Deprecated
/* 77 */        public final Fragment getTargetFragment() {
/* 78 */            return getTargetFragment(true);
                }

                @Deprecated
/* 93 */        public static Fragment instantiate(Context context, String str) {
/* 94 */            return instantiate(context, str, null);
                }
            }
