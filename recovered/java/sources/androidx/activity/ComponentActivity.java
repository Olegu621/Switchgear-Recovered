            package androidx.activity;

            import android.app.Application;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.content.res.Configuration;
            import android.os.Bundle;
            import android.os.Trace;
            import android.view.Menu;
            import android.view.MenuInflater;
            import android.view.MenuItem;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.activity.ComponentActivity;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.jvm.functions.Function0;
            import p000.AbstractC0830d3;
            import p000.AbstractC0903f3;
            import p000.AbstractC1816k3;
            import p000.C1997od;
            import p000.C2234tx;
            import p000.C2310vx;
            import p000.C2347wx;
            import p000.C2567zx;
            import p000.InterfaceC0202c3;
            import p000.InterfaceC1876l3;
            import p000.InterfaceExecutorC0160ay;
            import p000.RunnableC2166s2;
            import p000.RunnableC2495ye;
            import p000.a72;
            import p000.aq1;
            import p000.as1;
            import p000.bq1;
            import p000.c00;
            import p000.d71;
            import p000.dc0;
            import p000.eq1;
            import p000.f42;
            import p000.fh1;
            import p000.g71;
            import p000.i32;
            import p000.i71;
            import p000.j13;
            import p000.k32;
            import p000.lg1;
            import p000.m20;
            import p000.mn0;
            import p000.n00;
            import p000.og1;
            import p000.ok1;
            import p000.pg1;
            import p000.pt0;
            import p000.qk1;
            import p000.qm0;
            import p000.s33;
            import p000.sp1;
            import p000.t33;
            import p000.tp1;
            import p000.u33;
            import p000.u61;
            import p000.v61;
            import p000.vp1;
            import p000.wn0;
            import p000.x62;
            import p000.xp1;
            import p000.y62;
            import p000.z62;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public class ComponentActivity extends androidx.core.app.ComponentActivity implements u33, pt0, z62, tp1, InterfaceC1876l3, vp1, eq1, aq1, bq1, lg1 {
                private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

                /* JADX INFO: renamed from: a */
                public static final /* synthetic */ int f345a = 0;
                private final AbstractC1816k3 mActivityResultRegistry;
                private int mContentLayoutId;
                private s33 mDefaultFactory;
                private boolean mDispatchingOnMultiWindowModeChanged;
                private boolean mDispatchingOnPictureInPictureModeChanged;
                final wn0 mFullyDrawnReporter;
                private final AtomicInteger mNextLocalRequestCode;
                private sp1 mOnBackPressedDispatcher;
                private final CopyOnWriteArrayList<c00> mOnConfigurationChangedListeners;
                private final CopyOnWriteArrayList<c00> mOnMultiWindowModeChangedListeners;
                private final CopyOnWriteArrayList<c00> mOnNewIntentListeners;
                private final CopyOnWriteArrayList<c00> mOnPictureInPictureModeChangedListeners;
                private final CopyOnWriteArrayList<c00> mOnTrimMemoryListeners;
                final InterfaceExecutorC0160ay mReportFullyDrawnExecutor;
                final y62 mSavedStateRegistryController;
                private t33 mViewModelStore;
                final n00 mContextAwareHelper = new n00();
                private final pg1 mMenuHostHelper = new pg1(new RunnableC2166s2(this, 10));
                private final i71 mLifecycleRegistry = new i71(this);

                public ComponentActivity() {
/* 34 */            y62 y62Var = new y62(this);
/* 37 */            this.mSavedStateRegistryController = y62Var;
/* 40 */            this.mOnBackPressedDispatcher = null;
/* 44 */            ViewTreeObserverOnDrawListenerC0059b viewTreeObserverOnDrawListenerC0059b = new ViewTreeObserverOnDrawListenerC0059b(this);
/* 47 */            this.mReportFullyDrawnExecutor = viewTreeObserverOnDrawListenerC0059b;
/* 60 */            this.mFullyDrawnReporter = new wn0(viewTreeObserverOnDrawListenerC0059b, new C1997od(this, 1));
/* 67 */            this.mNextLocalRequestCode = new AtomicInteger();
/* 74 */            this.mActivityResultRegistry = new C2310vx(this);
/* 81 */            this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
/* 88 */            this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
/* 95 */            this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
/* 102 */           this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
/* 109 */           this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
/* 112 */           this.mDispatchingOnMultiWindowModeChanged = false;
/* 114 */           this.mDispatchingOnPictureInPictureModeChanged = false;
/* 120 */           if (getLifecycle() == null) {
/* 192 */               f42.m3656l("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
/* 196 */               throw null;
                    }
/* 132 */           getLifecycle().mo4483a(new C2347wx(this, 0));
/* 144 */           getLifecycle().mo4483a(new C0058a(this));
/* 157 */           getLifecycle().mo4483a(new C2347wx(this, 1));
/* 160 */           y62Var.m10113a();
/* 163 */           mn0.m6696l(this);
/* 178 */           getSavedStateRegistry().m9724c(ACTIVITY_RESULT_TAG, new C2234tx(this, 0));
/* 186 */           addOnContextAvailableListener(new xp1() { // from class: ux
                        @Override // p000.xp1
                        /* JADX INFO: renamed from: a */
                        public final void mo126a(ComponentActivity componentActivity) {
/* 3 */                     ComponentActivity.m321a(this.f17739a);
                        }
                    });
                }

                /* JADX INFO: renamed from: a */
                public static void m321a(ComponentActivity componentActivity) {
/* 7 */             Bundle bundleM9722a = componentActivity.getSavedStateRegistry().m9722a(ACTIVITY_RESULT_TAG);
/* 11 */            if (bundleM9722a != null) {
/* 13 */                AbstractC1816k3 abstractC1816k3 = componentActivity.mActivityResultRegistry;
/* 15 */                HashMap map = abstractC1816k3.f12567b;
/* 17 */                HashMap map2 = abstractC1816k3.f12566a;
/* 19 */                Bundle bundle = abstractC1816k3.f12572g;
/* 23 */                ArrayList<Integer> integerArrayList = bundleM9722a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
/* 29 */                ArrayList<String> stringArrayList = bundleM9722a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
/* 33 */                if (stringArrayList == null || integerArrayList == null) {
/* 115 */                   return;
                        }
/* 44 */                abstractC1816k3.f12569d = bundleM9722a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
/* 52 */                bundle.putAll(bundleM9722a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
/* 60 */                for (int i = 0; i < stringArrayList.size(); i++) {
/* 62 */                    String str = stringArrayList.get(i);
/* 72 */                    if (map.containsKey(str)) {
/* 78 */                        Integer num = (Integer) map.remove(str);
/* 84 */                        if (!bundle.containsKey(str)) {
/* 86 */                            map2.remove(num);
                                }
                            }
/* 89 */                    Integer num2 = integerArrayList.get(i);
/* 95 */                    num2.intValue();
/* 98 */                    String str2 = stringArrayList.get(i);
/* 104 */                   map2.put(num2, str2);
/* 109 */                   abstractC1816k3.f12567b.put(str2, num2);
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public static Bundle m322b(ComponentActivity componentActivity) {
/* 3 */             Bundle bundle = new Bundle();
/* 6 */             AbstractC1816k3 abstractC1816k3 = componentActivity.mActivityResultRegistry;
/* 8 */             abstractC1816k3.getClass();
/* 13 */            HashMap map = abstractC1816k3.f12567b;
/* 24 */            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
/* 38 */            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
/* 50 */            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC1816k3.f12569d));
/* 63 */            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) abstractC1816k3.f12572g.clone());
/* 66 */            return bundle;
                }

                @Override // android.app.Activity
                public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             initializeViewTreeOwners();
/* 16 */            ((ViewTreeObserverOnDrawListenerC0059b) this.mReportFullyDrawnExecutor).m323a(getWindow().getDecorView());
/* 19 */            super.addContentView(view, layoutParams);
                }

                public void addMenuProvider(final fh1 fh1Var, g71 g71Var) {
/* 1 */             final pg1 pg1Var = this.mMenuHostHelper;
/* 5 */             pg1Var.f15112b.add(fh1Var);
/* 10 */            pg1Var.f15111a.run();
/* 13 */            v61 lifecycle = g71Var.getLifecycle();
/* 17 */            HashMap map = pg1Var.f15113c;
/* 23 */            og1 og1Var = (og1) map.remove(fh1Var);
/* 25 */            if (og1Var != null) {
/* 31 */                og1Var.f14741a.mo4484b(og1Var.f14742b);
/* 35 */                og1Var.f14742b = null;
                    }
/* 47 */            map.put(fh1Var, new og1(lifecycle, new d71() { // from class: ng1
                        @Override // p000.d71
                        public final void onStateChanged(g71 g71Var2, t61 t61Var) {
/* 1 */                     t61 t61Var2 = t61.ON_DESTROY;
/* 3 */                     pg1 pg1Var2 = pg1Var;
/* 5 */                     if (t61Var == t61Var2) {
/* 9 */                         pg1Var2.m7416b(fh1Var);
                            } else {
/* 13 */                        pg1Var2.getClass();
                            }
                        }
                    }));
                }

                @Override // p000.vp1
                public final void addOnConfigurationChangedListener(c00 c00Var) {
/* 3 */             this.mOnConfigurationChangedListeners.add(c00Var);
                }

                public final void addOnContextAvailableListener(xp1 xp1Var) {
/* 1 */             n00 n00Var = this.mContextAwareHelper;
/* 3 */             n00Var.getClass();
/* 6 */             xp1Var.getClass();
/* 9 */             ComponentActivity componentActivity = n00Var.f14087b;
/* 11 */            if (componentActivity != null) {
/* 13 */                xp1Var.mo126a(componentActivity);
                    }
/* 18 */            n00Var.f14086a.add(xp1Var);
                }

                @Override // p000.aq1
                public final void addOnMultiWindowModeChangedListener(c00 c00Var) {
/* 3 */             this.mOnMultiWindowModeChangedListeners.add(c00Var);
                }

                public final void addOnNewIntentListener(c00 c00Var) {
/* 3 */             this.mOnNewIntentListeners.add(c00Var);
                }

                @Override // p000.bq1
                public final void addOnPictureInPictureModeChangedListener(c00 c00Var) {
/* 3 */             this.mOnPictureInPictureModeChangedListeners.add(c00Var);
                }

                @Override // p000.eq1
                public final void addOnTrimMemoryListener(c00 c00Var) {
/* 3 */             this.mOnTrimMemoryListeners.add(c00Var);
                }

                public void ensureViewModelStore() {
/* 3 */             if (this.mViewModelStore == null) {
/* 9 */                 C2567zx c2567zx = (C2567zx) getLastNonConfigurationInstance();
/* 11 */                if (c2567zx != null) {
/* 15 */                    this.mViewModelStore = c2567zx.f20363b;
                        }
/* 19 */                if (this.mViewModelStore == null) {
/* 26 */                    this.mViewModelStore = new t33();
                        }
                    }
                }

                @Override // p000.InterfaceC1876l3
                public final AbstractC1816k3 getActivityResultRegistry() {
/* 1 */             return this.mActivityResultRegistry;
                }

                @Override // p000.pt0
                public m20 getDefaultViewModelCreationExtras() {
/* 3 */             qk1 qk1Var = new qk1();
/* 6 */             Application application = getApplication();
/* 10 */            LinkedHashMap linkedHashMap = qk1Var.f13548a;
/* 12 */            if (application != null) {
/* 20 */                linkedHashMap.put(dc0.f7097X, getApplication());
                    }
/* 25 */            linkedHashMap.put(mn0.f13870e, this);
/* 30 */            linkedHashMap.put(mn0.f13871f, this);
/* 37 */            if (getIntent() != null && getIntent().getExtras() != null) {
/* 59 */                linkedHashMap.put(mn0.f13872g, getIntent().getExtras());
                    }
/* 62 */            return qk1Var;
                }

                public s33 getDefaultViewModelProviderFactory() {
/* 3 */             if (this.mDefaultFactory == null) {
/* 30 */                this.mDefaultFactory = new a72(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
                    }
/* 32 */            return this.mDefaultFactory;
                }

                public wn0 getFullyDrawnReporter() {
/* 1 */             return this.mFullyDrawnReporter;
                }

                @Deprecated
                public Object getLastCustomNonConfigurationInstance() {
/* 5 */             C2567zx c2567zx = (C2567zx) getLastNonConfigurationInstance();
/* 7 */             if (c2567zx != null) {
/* 9 */                 return c2567zx.f20362a;
                    }
/* 12 */            return null;
                }

                @Override // androidx.core.app.ComponentActivity, p000.g71
                public v61 getLifecycle() {
/* 1 */             return this.mLifecycleRegistry;
                }

                @Override // p000.tp1
                public final sp1 getOnBackPressedDispatcher() {
/* 3 */             if (this.mOnBackPressedDispatcher == null) {
/* 16 */                this.mOnBackPressedDispatcher = new sp1(new RunnableC2495ye(this, 3));
/* 28 */                getLifecycle().mo4483a(new C2347wx(this, 2));
                    }
/* 31 */            return this.mOnBackPressedDispatcher;
                }

                @Override // p000.z62
                public final x62 getSavedStateRegistry() {
/* 3 */             return this.mSavedStateRegistryController.f19509b;
                }

                @Override // p000.u33
                public t33 getViewModelStore() {
/* 5 */             if (getApplication() != null) {
/* 7 */                 ensureViewModelStore();
/* 10 */                return this.mViewModelStore;
                    }
/* 15 */            f42.m3656l("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
/* 18 */            return null;
                }

                public void initializeViewTreeOwners() {
/* 5 */             View decorView = getWindow().getDecorView();
/* 9 */             decorView.getClass();
/* 14 */            decorView.setTag(androidx.lifecycle.runtime.R$id.view_tree_lifecycle_owner, this);
/* 21 */            View decorView2 = getWindow().getDecorView();
/* 25 */            decorView2.getClass();
/* 30 */            decorView2.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, this);
/* 37 */            View decorView3 = getWindow().getDecorView();
/* 41 */            decorView3.getClass();
/* 46 */            decorView3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
/* 53 */            View decorView4 = getWindow().getDecorView();
/* 57 */            decorView4.getClass();
/* 62 */            decorView4.setTag(R$id.view_tree_on_back_pressed_dispatcher_owner, this);
/* 69 */            View decorView5 = getWindow().getDecorView();
/* 73 */            decorView5.getClass();
/* 78 */            decorView5.setTag(R$id.report_drawn, this);
                }

                public void invalidateMenu() {
/* 1 */             invalidateOptionsMenu();
                }

                @Override // android.app.Activity
                public void onActivityResult(int i, int i2, Intent intent) {
/* 7 */             if (this.mActivityResultRegistry.m5937a(i, i2, intent)) {
/* 12 */                return;
                    }
/* 9 */             super.onActivityResult(i, i2, intent);
                }

                @Override // android.app.Activity
                @Deprecated
                public void onBackPressed() {
/* 5 */             getOnBackPressedDispatcher().m8602b();
                }

                @Override // android.app.Activity, android.content.ComponentCallbacks
                public void onConfigurationChanged(Configuration configuration) {
/* 1 */             super.onConfigurationChanged(configuration);
/* 6 */             Iterator<c00> it = this.mOnConfigurationChangedListeners.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                it.next().accept(configuration);
                    }
                }

                @Override // androidx.core.app.ComponentActivity, android.app.Activity
                public void onCreate(Bundle bundle) {
/* 3 */             this.mSavedStateRegistryController.m10114b(bundle);
/* 6 */             n00 n00Var = this.mContextAwareHelper;
/* 8 */             n00Var.getClass();
/* 11 */            n00Var.f14087b = this;
/* 15 */            Iterator it = n00Var.f14086a.iterator();
/* 23 */            while (it.hasNext()) {
/* 31 */                ((xp1) it.next()).mo126a(this);
                    }
/* 35 */            super.onCreate(bundle);
/* 38 */            int i = k32.f12578b;
/* 40 */            i32.m4462b(this);
/* 43 */            int i2 = this.mContentLayoutId;
/* 45 */            if (i2 != 0) {
/* 47 */                setContentView(i2);
                    }
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public boolean onCreatePanelMenu(int i, Menu menu) {
/* 1 */             if (i != 0) {
/* 38 */                return true;
                    }
/* 3 */             super.onCreatePanelMenu(i, menu);
/* 6 */             pg1 pg1Var = this.mMenuHostHelper;
/* 8 */             MenuInflater menuInflater = getMenuInflater();
/* 14 */            Iterator it = pg1Var.f15112b.iterator();
/* 22 */            while (it.hasNext()) {
/* 34 */                ((qm0) ((fh1) it.next())).f15653a.m713k(menu, menuInflater);
                    }
/* 38 */            return true;
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 5 */             if (super.onMenuItemSelected(i, menuItem)) {
/* 7 */                 return true;
                    }
/* 9 */             if (i == 0) {
/* 13 */                return this.mMenuHostHelper.m7415a(menuItem);
                    }
/* 18 */            return false;
                }

                @Override // android.app.Activity
                public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
/* 2 */             this.mDispatchingOnMultiWindowModeChanged = true;
                    try {
/* 5 */                 super.onMultiWindowModeChanged(z, configuration);
/* 8 */                 this.mDispatchingOnMultiWindowModeChanged = false;
/* 20 */                for (c00 c00Var : this.mOnMultiWindowModeChangedListeners) {
/* 30 */                    configuration.getClass();
/* 36 */                    c00Var.accept(new ok1(z));
                        }
                    } catch (Throwable th) {
/* 42 */                this.mDispatchingOnMultiWindowModeChanged = false;
/* 44 */                throw th;
                    }
                }

                @Override // android.app.Activity
                public void onNewIntent(Intent intent) {
/* 1 */             super.onNewIntent(intent);
/* 6 */             Iterator<c00> it = this.mOnNewIntentListeners.iterator();
/* 14 */            while (it.hasNext()) {
/* 22 */                it.next().accept(intent);
                    }
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public void onPanelClosed(int i, Menu menu) {
/* 5 */             Iterator it = this.mMenuHostHelper.f15112b.iterator();
/* 13 */            while (it.hasNext()) {
/* 25 */                ((qm0) ((fh1) it.next())).f15653a.m719q(menu);
                    }
/* 29 */            super.onPanelClosed(i, menu);
                }

                @Override // android.app.Activity
                public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
/* 2 */             this.mDispatchingOnPictureInPictureModeChanged = true;
                    try {
/* 5 */                 super.onPictureInPictureModeChanged(z, configuration);
/* 8 */                 this.mDispatchingOnPictureInPictureModeChanged = false;
/* 20 */                for (c00 c00Var : this.mOnPictureInPictureModeChangedListeners) {
/* 30 */                    configuration.getClass();
/* 36 */                    c00Var.accept(new as1(z));
                        }
                    } catch (Throwable th) {
/* 42 */                this.mDispatchingOnPictureInPictureModeChanged = false;
/* 44 */                throw th;
                    }
                }

                @Override // android.app.Activity, android.view.Window.Callback
                public boolean onPreparePanel(int i, View view, Menu menu) {
/* 1 */             if (i != 0) {
/* 34 */                return true;
                    }
/* 3 */             super.onPreparePanel(i, view, menu);
/* 10 */            Iterator it = this.mMenuHostHelper.f15112b.iterator();
/* 18 */            while (it.hasNext()) {
/* 30 */                ((qm0) ((fh1) it.next())).f15653a.m722t(menu);
                    }
/* 34 */            return true;
                }

                @Override // android.app.Activity
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 25 */            if (this.mActivityResultRegistry.m5937a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
/* 30 */                return;
                    }
/* 27 */            super.onRequestPermissionsResult(i, strArr, iArr);
                }

                @Deprecated
                public Object onRetainCustomNonConfigurationInstance() {
/* 1 */             return null;
                }

                @Override // android.app.Activity
                public final Object onRetainNonConfigurationInstance() {
                    C2567zx c2567zx;
/* 1 */             Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
/* 5 */             t33 t33Var = this.mViewModelStore;
/* 7 */             if (t33Var == null && (c2567zx = (C2567zx) getLastNonConfigurationInstance()) != null) {
/* 17 */                t33Var = c2567zx.f20363b;
                    }
/* 19 */            if (t33Var == null && objOnRetainCustomNonConfigurationInstance == null) {
/* 23 */                return null;
                    }
/* 27 */            C2567zx c2567zx2 = new C2567zx();
/* 30 */            c2567zx2.f20362a = objOnRetainCustomNonConfigurationInstance;
/* 32 */            c2567zx2.f20363b = t33Var;
/* 34 */            return c2567zx2;
                }

                @Override // androidx.core.app.ComponentActivity, android.app.Activity
                public void onSaveInstanceState(Bundle bundle) {
/* 1 */             v61 lifecycle = getLifecycle();
/* 7 */             if (lifecycle instanceof i71) {
/* 13 */                ((i71) lifecycle).m4489g(u61.f17376c);
                    }
/* 16 */            super.onSaveInstanceState(bundle);
/* 21 */            this.mSavedStateRegistryController.m10115c(bundle);
                }

                @Override // android.app.Activity, android.content.ComponentCallbacks2
                public void onTrimMemory(int i) {
/* 1 */             super.onTrimMemory(i);
/* 6 */             Iterator<c00> it = this.mOnTrimMemoryListeners.iterator();
/* 14 */            while (it.hasNext()) {
/* 26 */                it.next().accept(Integer.valueOf(i));
                    }
                }

                public Context peekAvailableContext() {
/* 3 */             return this.mContextAwareHelper.f14087b;
                }

                public final <I, O> AbstractC0903f3 registerForActivityResult(AbstractC0830d3 abstractC0830d3, AbstractC1816k3 abstractC1816k3, InterfaceC0202c3 interfaceC0202c3) {
/* 21 */            return abstractC1816k3.m5940d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0830d3, interfaceC0202c3);
                }

                @Override // p000.lg1
                public void removeMenuProvider(fh1 fh1Var) {
/* 3 */             this.mMenuHostHelper.m7416b(fh1Var);
                }

                @Override // p000.vp1
                public final void removeOnConfigurationChangedListener(c00 c00Var) {
/* 3 */             this.mOnConfigurationChangedListeners.remove(c00Var);
                }

                public final void removeOnContextAvailableListener(xp1 xp1Var) {
/* 1 */             n00 n00Var = this.mContextAwareHelper;
/* 3 */             n00Var.getClass();
/* 6 */             xp1Var.getClass();
/* 11 */            n00Var.f14086a.remove(xp1Var);
                }

                @Override // p000.aq1
                public final void removeOnMultiWindowModeChangedListener(c00 c00Var) {
/* 3 */             this.mOnMultiWindowModeChangedListeners.remove(c00Var);
                }

                public final void removeOnNewIntentListener(c00 c00Var) {
/* 3 */             this.mOnNewIntentListeners.remove(c00Var);
                }

                @Override // p000.bq1
                public final void removeOnPictureInPictureModeChangedListener(c00 c00Var) {
/* 3 */             this.mOnPictureInPictureModeChangedListeners.remove(c00Var);
                }

                @Override // p000.eq1
                public final void removeOnTrimMemoryListener(c00 c00Var) {
/* 3 */             this.mOnTrimMemoryListeners.remove(c00Var);
                }

                @Override // android.app.Activity
                public void reportFullyDrawn() {
                    try {
/* 5 */                 if (j13.m5651m()) {
/* 13 */                    Trace.beginSection(j13.m5636A("reportFullyDrawn() for ComponentActivity"));
                        }
/* 16 */                super.reportFullyDrawn();
/* 19 */                wn0 wn0Var = this.mFullyDrawnReporter;
                        synchronized (wn0Var.f18697a) {
                            try {
/* 25 */                        wn0Var.f18698b = true;
/* 29 */                        Iterator it = wn0Var.f18699c.iterator();
/* 37 */                        while (it.hasNext()) {
/* 45 */                            ((Function0) it.next()).invoke();
                                }
/* 53 */                        wn0Var.f18699c.clear();
                            } catch (Throwable th) {
/* 62 */                        throw th;
                            }
                        }
/* 57 */                Trace.endSection();
                    } catch (Throwable th2) {
/* 64 */                Trace.endSection();
/* 67 */                throw th2;
                    }
                }

                @Override // android.app.Activity
                public void setContentView(int i) {
/* 1 */             initializeViewTreeOwners();
/* 16 */            ((ViewTreeObserverOnDrawListenerC0059b) this.mReportFullyDrawnExecutor).m323a(getWindow().getDecorView());
/* 19 */            super.setContentView(i);
                }

                @Override // android.app.Activity
                @Deprecated
                public void startActivityForResult(Intent intent, int i) {
/* 1 */             super.startActivityForResult(intent, i);
                }

                @Override // android.app.Activity
                @Deprecated
                public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
/* 1 */             super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
                }

                @Override // android.app.Activity
                @Deprecated
/* 4 */         public void startActivityForResult(Intent intent, int i, Bundle bundle) {
/* 5 */             super.startActivityForResult(intent, i, bundle);
                }

                @Override // android.app.Activity
                @Deprecated
/* 4 */         public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
/* 5 */             super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                }

                @Override // android.app.Activity
/* 22 */        public void setContentView(View view) {
/* 23 */            initializeViewTreeOwners();
/* 24 */            ((ViewTreeObserverOnDrawListenerC0059b) this.mReportFullyDrawnExecutor).m323a(getWindow().getDecorView());
/* 25 */            super.setContentView(view);
                }

/* 25 */        public final <I, O> AbstractC0903f3 registerForActivityResult(AbstractC0830d3 abstractC0830d3, InterfaceC0202c3 interfaceC0202c3) {
/* 26 */            return registerForActivityResult(abstractC0830d3, this.mActivityResultRegistry, interfaceC0202c3);
                }

                @Override // android.app.Activity
/* 25 */        public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 26 */            initializeViewTreeOwners();
/* 27 */            ((ViewTreeObserverOnDrawListenerC0059b) this.mReportFullyDrawnExecutor).m323a(getWindow().getDecorView());
/* 28 */            super.setContentView(view, layoutParams);
                }

                @Override // android.app.Activity
/* 44 */        public void onMultiWindowModeChanged(boolean z) {
/* 45 */            if (this.mDispatchingOnMultiWindowModeChanged) {
                        return;
                    }
/* 46 */            Iterator<c00> it = this.mOnMultiWindowModeChangedListeners.iterator();
                    while (it.hasNext()) {
/* 47 */                it.next().accept(new ok1(z));
                    }
                }

                @Override // android.app.Activity
/* 44 */        public void onPictureInPictureModeChanged(boolean z) {
/* 45 */            if (this.mDispatchingOnPictureInPictureModeChanged) {
                        return;
                    }
/* 46 */            Iterator<c00> it = this.mOnPictureInPictureModeChangedListeners.iterator();
                    while (it.hasNext()) {
/* 47 */                it.next().accept(new as1(z));
                    }
                }

                @Override // p000.lg1
/* 50 */        public void addMenuProvider(fh1 fh1Var) {
/* 51 */            pg1 pg1Var = this.mMenuHostHelper;
/* 53 */            pg1Var.f15112b.add(fh1Var);
/* 54 */            pg1Var.f15111a.run();
                }

/* 54 */        public void addMenuProvider(final fh1 fh1Var, g71 g71Var, final u61 u61Var) {
/* 55 */            final pg1 pg1Var = this.mMenuHostHelper;
                    pg1Var.getClass();
/* 56 */            v61 lifecycle = g71Var.getLifecycle();
/* 57 */            HashMap map = pg1Var.f15113c;
                    og1 og1Var = (og1) map.remove(fh1Var);
                    if (og1Var != null) {
/* 58 */                og1Var.f14741a.mo4484b(og1Var.f14742b);
/* 59 */                og1Var.f14742b = null;
                    }
/* 61 */            map.put(fh1Var, new og1(lifecycle, new d71() { // from class: mg1
                        @Override // p000.d71
                        public final void onStateChanged(g71 g71Var2, t61 t61Var) {
                            t61 t61Var2;
/* 1 */                     pg1 pg1Var2 = pg1Var;
/* 3 */                     pg1Var2.getClass();
/* 6 */                     Runnable runnable = pg1Var2.f15111a;
/* 8 */                     CopyOnWriteArrayList copyOnWriteArrayList = pg1Var2.f15112b;
/* 12 */                    t61.Companion.getClass();
/* 15 */                    u61 u61Var2 = u61Var;
/* 17 */                    u61Var2.getClass();
/* 20 */                    int iOrdinal = u61Var2.ordinal();
/* 24 */                    t61 t61Var3 = null;
/* 28 */                    if (iOrdinal == 2) {
/* 42 */                        t61Var2 = t61.ON_CREATE;
                            } else if (iOrdinal != 3) {
/* 36 */                        t61Var2 = iOrdinal != 4 ? null : t61.ON_RESUME;
                            } else {
/* 39 */                        t61Var2 = t61.ON_START;
                            }
/* 44 */                    fh1 fh1Var2 = fh1Var;
/* 46 */                    if (t61Var == t61Var2) {
/* 48 */                        copyOnWriteArrayList.add(fh1Var2);
/* 51 */                        runnable.run();
/* 54 */                        return;
                            }
/* 55 */                    t61 t61Var4 = t61.ON_DESTROY;
/* 57 */                    if (t61Var == t61Var4) {
/* 59 */                        pg1Var2.m7416b(fh1Var2);
/* 62 */                        return;
                            }
/* 63 */                    int iOrdinal2 = u61Var2.ordinal();
/* 67 */                    if (iOrdinal2 == 2) {
/* 80 */                        t61Var3 = t61Var4;
                            } else if (iOrdinal2 == 3) {
/* 77 */                        t61Var3 = t61.ON_STOP;
                            } else if (iOrdinal2 == 4) {
/* 74 */                        t61Var3 = t61.ON_PAUSE;
                            }
/* 81 */                    if (t61Var == t61Var3) {
/* 83 */                        copyOnWriteArrayList.remove(fh1Var2);
/* 86 */                        runnable.run();
                            }
                        }
                    }));
                }
            }
