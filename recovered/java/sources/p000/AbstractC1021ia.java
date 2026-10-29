            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import androidx.appcompat.app.AppLocalesMetadataHolderService;
            import java.lang.ref.WeakReference;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: ia */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1021ia {

                /* JADX INFO: renamed from: a */
                public static final ExecutorC0984ha f9502a = new ExecutorC0984ha(new o80(3));

                /* JADX INFO: renamed from: b */
                public static final int f9503b = -100;

                /* JADX INFO: renamed from: c */
                public static h91 f9504c = null;

                /* JADX INFO: renamed from: d */
                public static h91 f9505d = null;

                /* JADX INFO: renamed from: e */
                public static Boolean f9506e = null;

                /* JADX INFO: renamed from: f */
                public static boolean f9507f = false;

                /* JADX INFO: renamed from: i */
                public static final C1827kd f9508i = new C1827kd(0);

                /* JADX INFO: renamed from: v */
                public static final Object f9509v = new Object();

                /* JADX INFO: renamed from: w */
                public static final Object f9510w = new Object();

                /* JADX INFO: renamed from: b */
                public static boolean m4499b(Context context) {
/* 3 */             if (f9506e == null) {
                        try {
/* 5 */                     int i = AppLocalesMetadataHolderService.f365a;
/* 28 */                    Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AbstractC0912fc.m3703a() | 128).metaData;
/* 30 */                    if (bundle != null) {
/* 42 */                        f9506e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
/* 47 */                    f9506e = Boolean.FALSE;
                        }
                    }
/* 51 */            return f9506e.booleanValue();
                }

                /* JADX INFO: renamed from: f */
                public static void m4500f(LayoutInflaterFactory2C2324wa layoutInflaterFactory2C2324wa) {
                    synchronized (f9509v) {
                        try {
/* 6 */                     Iterator it = f9508i.iterator();
                            while (true) {
/* 11 */                        wb1 wb1Var = (wb1) it;
/* 17 */                        if (wb1Var.hasNext()) {
/* 29 */                            AbstractC1021ia abstractC1021ia = (AbstractC1021ia) ((WeakReference) wb1Var.next()).get();
/* 31 */                            if (abstractC1021ia == layoutInflaterFactory2C2324wa || abstractC1021ia == null) {
/* 35 */                                wb1Var.remove();
                                    }
                                }
                            }
                        } catch (Throwable th) {
/* 44 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo4501a();

                /* JADX INFO: renamed from: d */
                public abstract void mo4502d();

                /* JADX INFO: renamed from: e */
                public abstract void mo4503e();

                /* JADX INFO: renamed from: g */
                public abstract boolean mo4504g(int i);

                /* JADX INFO: renamed from: h */
                public abstract void mo4505h(int i);

                /* JADX INFO: renamed from: i */
                public abstract void mo4506i(View view);

                /* JADX INFO: renamed from: j */
                public abstract void mo4507j(View view, ViewGroup.LayoutParams layoutParams);

                /* JADX INFO: renamed from: k */
                public abstract void mo4508k(CharSequence charSequence);

                /* JADX INFO: renamed from: m */
                public abstract AbstractC1778j2 mo4509m(InterfaceC1013i2 interfaceC1013i2);
            }
