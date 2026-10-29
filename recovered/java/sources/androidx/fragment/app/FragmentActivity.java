            package androidx.fragment.app;

            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentSender;
            import android.os.Bundle;
            import android.util.AttributeSet;
            import android.view.MenuItem;
            import android.view.View;
            import androidx.activity.ComponentActivity;
            import java.io.FileDescriptor;
            import java.io.PrintWriter;
            import p000.AbstractC2203t2;
            import p000.b91;
            import p000.c00;
            import p000.i71;
            import p000.md2;
            import p000.nm0;
            import p000.rn0;
            import p000.t61;
            import p000.u61;
            import p000.vm0;
            import p000.w62;
            import p000.xp1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public class FragmentActivity extends ComponentActivity {
                static final String LIFECYCLE_TAG = "android:support:lifecycle";
                boolean mCreated;
                boolean mResumed;
                final nm0 mFragments = new nm0(new C0105q(this));
                final i71 mFragmentLifecycleRegistry = new i71(this);
                boolean mStopped = true;

                public FragmentActivity() {
/* 37 */            getSavedStateRegistry().m9724c("android:support:lifecycle", new w62() { // from class: androidx.fragment.app.n
                        @Override // p000.w62
                        /* JADX INFO: renamed from: a */
                        public final Bundle mo671a() {
/* 1 */                     String str = FragmentActivity.LIFECYCLE_TAG;
/* 3 */                     FragmentActivity fragmentActivity = this.f1464a;
/* 5 */                     fragmentActivity.markFragmentsCreated();
/* 12 */                    fragmentActivity.mFragmentLifecycleRegistry.m4487e(t61.ON_STOP);
/* 17 */                    return new Bundle();
                        }
                    });
/* 42 */            final int i = 0;
/* 46 */            addOnConfigurationChangedListener(new c00(this) { // from class: androidx.fragment.app.o

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ FragmentActivity f1466b;

                        {
/* 3 */                     this.f1466b = this;
                        }

                        @Override // p000.c00
                        public final void accept(Object obj) {
/* 1 */                     int i2 = i;
/* 3 */                     FragmentActivity fragmentActivity = this.f1466b;
                            switch (i2) {
                                case 0:
/* 20 */                            fragmentActivity.mFragments.m7014a();
                                    break;
                                default:
/* 12 */                            fragmentActivity.mFragments.m7014a();
                                    break;
                            }
                        }
                    });
/* 51 */            final int i2 = 1;
/* 55 */            addOnNewIntentListener(new c00(this) { // from class: androidx.fragment.app.o

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ FragmentActivity f1466b;

                        {
/* 3 */                     this.f1466b = this;
                        }

                        @Override // p000.c00
                        public final void accept(Object obj) {
/* 1 */                     int i3 = i2;
/* 3 */                     FragmentActivity fragmentActivity = this.f1466b;
                            switch (i3) {
                                case 0:
/* 20 */                            fragmentActivity.mFragments.m7014a();
                                    break;
                                default:
/* 12 */                            fragmentActivity.mFragments.m7014a();
                                    break;
                            }
                        }
                    });
/* 63 */            addOnContextAvailableListener(new xp1() { // from class: androidx.fragment.app.p
                        @Override // p000.xp1
                        /* JADX INFO: renamed from: a */
                        public final void mo126a(ComponentActivity componentActivity) {
/* 5 */                     C0105q c0105q = this.f1467a.mFragments.f14381a;
/* 10 */                    c0105q.f14819d.m701b(c0105q, c0105q, null);
                        }
                    });
                }

                /* JADX INFO: renamed from: c */
                public static boolean m633c(AbstractC0111w abstractC0111w) {
/* 11 */            boolean zM633c = false;
/* 16 */            for (Fragment fragment : abstractC0111w.f1493c.m751f()) {
/* 24 */                if (fragment != null) {
/* 31 */                    if (fragment.getHost() != null) {
/* 41 */                        zM633c |= m633c(fragment.getChildFragmentManager());
                            }
/* 42 */                    rn0 rn0Var = fragment.mViewLifecycleOwner;
/* 46 */                    u61 u61Var = u61.f17376c;
/* 49 */                    u61 u61Var2 = u61.f17377d;
/* 51 */                    if (rn0Var != null) {
/* 53 */                        rn0Var.m8209b();
/* 64 */                        if (rn0Var.f16196d.f9483c.compareTo(u61Var2) >= 0) {
/* 68 */                            i71 i71Var = fragment.mViewLifecycleOwner.f16196d;
/* 70 */                            i71Var.m4486d("setCurrentState");
/* 73 */                            i71Var.m4488f(u61Var);
/* 76 */                            zM633c = true;
                                }
                            }
/* 85 */                    if (fragment.mLifecycleRegistry.f9483c.compareTo(u61Var2) >= 0) {
/* 87 */                        i71 i71Var2 = fragment.mLifecycleRegistry;
/* 89 */                        i71Var2.m4486d("setCurrentState");
/* 92 */                        i71Var2.m4488f(u61Var);
/* 95 */                        zM633c = true;
                            }
                        }
                    }
/* 97 */            return zM633c;
                }

                public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
/* 9 */             return this.mFragments.f14381a.f14819d.f1496f.onCreateView(view, str, context, attributeSet);
                }

                @Override // android.app.Activity
                public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
/* 1 */             super.dump(str, fileDescriptor, printWriter, strArr);
/* 8 */             if (shouldDumpInternalState(strArr)) {
/* 11 */                printWriter.print(str);
/* 16 */                printWriter.print("Local FragmentActivity ");
/* 27 */                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
/* 32 */                printWriter.println(" State:");
/* 48 */                String str2 = str + "  ";
/* 52 */                printWriter.print(str2);
/* 57 */                printWriter.print("mCreated=");
/* 62 */                printWriter.print(this.mCreated);
/* 67 */                printWriter.print(" mResumed=");
/* 72 */                printWriter.print(this.mResumed);
/* 77 */                printWriter.print(" mStopped=");
/* 82 */                printWriter.print(this.mStopped);
/* 89 */                if (getApplication() != null) {
/* 95 */                    b91.m1298a(this).m3344b(str2, printWriter);
                        }
/* 104 */               this.mFragments.f14381a.f14819d.m724v(str, fileDescriptor, printWriter, strArr);
                    }
                }

                public AbstractC0111w getSupportFragmentManager() {
/* 5 */             return this.mFragments.f14381a.f14819d;
                }

                @Deprecated
                public b91 getSupportLoaderManager() {
/* 1 */             return b91.m1298a(this);
                }

                public void markFragmentsCreated() {
/* 9 */             while (m633c(getSupportFragmentManager())) {
                    }
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public void onActivityResult(int i, int i2, Intent intent) {
/* 3 */             this.mFragments.m7014a();
/* 6 */             super.onActivityResult(i, i2, intent);
                }

                @Deprecated
                public void onAttachFragment(Fragment fragment) {
                }

                @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 8 */             this.mFragmentLifecycleRegistry.m4487e(t61.ON_CREATE);
/* 15 */            vm0 vm0Var = this.mFragments.f14381a.f14819d;
/* 18 */            vm0Var.f1482G = false;
/* 20 */            vm0Var.f1483H = false;
/* 24 */            vm0Var.f1489N.f1523i = false;
/* 27 */            vm0Var.m723u(1);
                }

                @Override // android.app.Activity, android.view.LayoutInflater.Factory
                public View onCreateView(String str, Context context, AttributeSet attributeSet) {
/* 2 */             View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
                    return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
                }

                @Override // android.app.Activity
                public void onDestroy() {
/* 1 */             super.onDestroy();
/* 10 */            this.mFragments.f14381a.f14819d.m714l();
/* 17 */            this.mFragmentLifecycleRegistry.m4487e(t61.ON_DESTROY);
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
                public boolean onMenuItemSelected(int i, MenuItem menuItem) {
/* 5 */             if (super.onMenuItemSelected(i, menuItem)) {
/* 7 */                 return true;
                    }
/* 10 */            if (i == 6) {
/* 18 */                return this.mFragments.f14381a.f14819d.m712j(menuItem);
                    }
/* 23 */            return false;
                }

                @Override // android.app.Activity
                public void onPause() {
/* 1 */             super.onPause();
/* 5 */             this.mResumed = false;
/* 14 */            this.mFragments.f14381a.f14819d.m723u(5);
/* 21 */            this.mFragmentLifecycleRegistry.m4487e(t61.ON_PAUSE);
                }

                @Override // android.app.Activity
                public void onPostResume() {
/* 1 */             super.onPostResume();
/* 4 */             onResumeFragments();
                }

                @Override // androidx.activity.ComponentActivity, android.app.Activity
                public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
/* 3 */             this.mFragments.m7014a();
/* 6 */             super.onRequestPermissionsResult(i, strArr, iArr);
                }

                @Override // android.app.Activity
                public void onResume() {
/* 3 */             this.mFragments.m7014a();
/* 6 */             super.onResume();
/* 10 */            this.mResumed = true;
/* 18 */            this.mFragments.f14381a.f14819d.m728z(true);
                }

                public void onResumeFragments() {
/* 5 */             this.mFragmentLifecycleRegistry.m4487e(t61.ON_RESUME);
/* 12 */            vm0 vm0Var = this.mFragments.f14381a.f14819d;
/* 15 */            vm0Var.f1482G = false;
/* 17 */            vm0Var.f1483H = false;
/* 21 */            vm0Var.f1489N.f1523i = false;
/* 24 */            vm0Var.m723u(7);
                }

                @Override // android.app.Activity
                public void onStart() {
/* 3 */             this.mFragments.m7014a();
/* 6 */             super.onStart();
/* 10 */            this.mStopped = false;
/* 15 */            if (!this.mCreated) {
/* 17 */                this.mCreated = true;
/* 23 */                vm0 vm0Var = this.mFragments.f14381a.f14819d;
/* 25 */                vm0Var.f1482G = false;
/* 27 */                vm0Var.f1483H = false;
/* 31 */                vm0Var.f1489N.f1523i = false;
/* 34 */                vm0Var.m723u(4);
                    }
/* 43 */            this.mFragments.f14381a.f14819d.m728z(true);
/* 50 */            this.mFragmentLifecycleRegistry.m4487e(t61.ON_START);
/* 57 */            vm0 vm0Var2 = this.mFragments.f14381a.f14819d;
/* 59 */            vm0Var2.f1482G = false;
/* 61 */            vm0Var2.f1483H = false;
/* 65 */            vm0Var2.f1489N.f1523i = false;
/* 68 */            vm0Var2.m723u(5);
                }

                @Override // android.app.Activity
                public void onStateNotSaved() {
/* 3 */             this.mFragments.m7014a();
                }

                @Override // android.app.Activity
                public void onStop() {
/* 1 */             super.onStop();
/* 5 */             this.mStopped = true;
/* 7 */             markFragmentsCreated();
/* 14 */            vm0 vm0Var = this.mFragments.f14381a.f14819d;
/* 16 */            vm0Var.f1483H = true;
/* 20 */            vm0Var.f1489N.f1523i = true;
/* 23 */            vm0Var.m723u(4);
/* 30 */            this.mFragmentLifecycleRegistry.m4487e(t61.ON_STOP);
                }

                public void setEnterSharedElementCallback(md2 md2Var) {
/* 2 */             AbstractC2203t2.m8675c(this, null);
                }

                public void setExitSharedElementCallback(md2 md2Var) {
/* 2 */             AbstractC2203t2.m8676d(this, null);
                }

                public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
/* 2 */             if (i == -1) {
/* 4 */                 startActivityForResult(intent, -1, bundle);
                    } else {
/* 8 */                 fragment.startActivityForResult(intent, i, bundle);
                    }
                }

                @Deprecated
                public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
/* 2 */             if (i == -1) {
/* 14 */                startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                    } else {
/* 18 */                fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
                    }
                }

                public void supportFinishAfterTransition() {
/* 1 */             AbstractC2203t2.m8673a(this);
                }

                @Deprecated
                public void supportInvalidateOptionsMenu() {
/* 1 */             invalidateMenu();
                }

                public void supportPostponeEnterTransition() {
/* 1 */             AbstractC2203t2.m8674b(this);
                }

                public void supportStartPostponedEnterTransition() {
/* 1 */             AbstractC2203t2.m8677e(this);
                }

                @Deprecated
                public final void validateRequestPermissionsRequestCode(int i) {
                }

/* 11 */        public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
/* 12 */            startActivityFromFragment(fragment, intent, i, (Bundle) null);
                }

                @Override // android.app.Activity, android.view.LayoutInflater.Factory2
/* 13 */        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
/* 14 */            View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
                    return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
                }
            }
