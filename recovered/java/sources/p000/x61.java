            package p000;

            import android.app.Activity;
            import android.content.ContextWrapper;
            import android.content.Intent;
            import android.os.Bundle;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0086a;
            import androidx.fragment.app.FragmentActivity;
            import java.io.FileDescriptor;
            import java.io.PrintWriter;
            import java.lang.ref.WeakReference;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 171 */   public abstract class x61 {
                protected final e71 mLifecycleFragment;

                public x61(e71 e71Var) {
/* 4 */             this.mLifecycleFragment = e71Var;
                }

                public static e71 getFragment(w61 w61Var) {
                    zc3 zc3Var;
                    rf3 rf3Var;
/* 1 */             Activity activity = w61Var.f18458a;
/* 5 */             if (!(activity instanceof FragmentActivity)) {
/* 86 */                if (activity == null) {
/* 168 */                   C1951n4.m6859j("Can't get fragment for unexpected activity.");
/* 171 */                   return null;
                        }
/* 90 */                WeakHashMap weakHashMap = zc3.f20098b;
/* 96 */                WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
/* 98 */                if (weakReference != null && (zc3Var = (zc3) weakReference.get()) != null) {
/* 109 */                   return zc3Var;
                        }
                        try {
/* 118 */                   zc3 zc3Var2 = (zc3) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
/* 120 */                   if (zc3Var2 == null || zc3Var2.isRemoving()) {
/* 130 */                       zc3Var2 = new zc3();
/* 145 */                       activity.getFragmentManager().beginTransaction().add(zc3Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                            }
/* 153 */                   weakHashMap.put(activity, new WeakReference(zc3Var2));
/* 156 */                   return zc3Var2;
                        } catch (ClassCastException e) {
/* 165 */                   throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
                        }
                    }
/* 7 */             FragmentActivity fragmentActivity = (FragmentActivity) activity;
/* 9 */             WeakHashMap weakHashMap2 = rf3.f16039b;
/* 13 */            AbstractC0111w supportFragmentManager = fragmentActivity.getSupportFragmentManager();
/* 17 */            WeakHashMap weakHashMap3 = rf3.f16039b;
/* 23 */            WeakReference weakReference2 = (WeakReference) weakHashMap3.get(fragmentActivity);
/* 25 */            if (weakReference2 != null && (rf3Var = (rf3) weakReference2.get()) != null) {
/* 35 */                return rf3Var;
                    }
                    try {
/* 40 */                rf3 rf3Var2 = (rf3) supportFragmentManager.m680D("SLifecycleFragmentImpl");
/* 42 */                if (rf3Var2 == null || rf3Var2.isRemoving()) {
/* 52 */                    rf3Var2 = new rf3();
/* 57 */                    C0086a c0086a = new C0086a(supportFragmentManager);
/* 62 */                    c0086a.m639e(0, rf3Var2, "SLifecycleFragmentImpl", 1);
/* 65 */                    c0086a.m638d(true);
                        }
/* 73 */                weakHashMap3.put(fragmentActivity, new WeakReference(rf3Var2));
/* 76 */                return rf3Var2;
                    } catch (ClassCastException e2) {
/* 85 */                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
                    }
                }

                public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                }

                public Activity getActivity() {
/* 3 */             Activity activityMo3338d = this.mLifecycleFragment.mo3338d();
/* 7 */             kb1.m6061n(activityMo3338d);
/* 10 */            return activityMo3338d;
                }

                public void onActivityResult(int i, int i2, Intent intent) {
                }

                public void onCreate(Bundle bundle) {
                }

                public void onDestroy() {
                }

                public void onResume() {
                }

                public void onSaveInstanceState(Bundle bundle) {
                }

                public void onStart() {
                }

                public abstract void onStop();

/* 172 */       public static e71 getFragment(Activity activity) {
/* 173 */           return getFragment(new w61(activity));
                }

/* 173 */       public static e71 getFragment(ContextWrapper contextWrapper) {
/* 174 */           throw new UnsupportedOperationException();
                }
            }
