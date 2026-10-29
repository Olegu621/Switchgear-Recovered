            package androidx.lifecycle;

            import android.app.Application;
            import android.content.Context;
            import android.os.Handler;
            import java.util.HashSet;
            import java.util.List;
            import kotlin.Metadata;
            import p000.C0875ec;
            import p000.a71;
            import p000.b71;
            import p000.f42;
            import p000.nd0;
            import p000.t61;
            import p000.ux1;
            import p000.wx0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m6176d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lwx0;", "Lg71;", "<init>", "()V", "lifecycle-process_release"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class ProcessLifecycleInitializer implements wx0 {
                @Override // p000.wx0
                public final Object create(Context context) {
/* 1 */             context.getClass();
/* 4 */             C0875ec c0875ecM3362v = C0875ec.m3362v(context);
/* 8 */             c0875ecM3362v.getClass();
/* 21 */            if (!((HashSet) c0875ecM3362v.f7614c).contains(ProcessLifecycleInitializer.class)) {
/* 89 */                f42.m3656l("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
/* 92 */                return null;
                    }
/* 30 */            if (!b71.f2282a.getAndSet(true)) {
/* 33 */                Context applicationContext = context.getApplicationContext();
/* 37 */                applicationContext.getClass();
/* 47 */                ((Application) applicationContext).registerActivityLifecycleCallbacks(new a71());
                    }
/* 50 */            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f1535w;
/* 52 */            processLifecycleOwner.getClass();
/* 60 */            processLifecycleOwner.f1540e = new Handler();
/* 66 */            processLifecycleOwner.f1541f.m4487e(t61.ON_CREATE);
/* 69 */            Context applicationContext2 = context.getApplicationContext();
/* 73 */            applicationContext2.getClass();
/* 83 */            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new ux1(processLifecycleOwner));
/* 86 */            return processLifecycleOwner;
                }

                @Override // p000.wx0
                public final List dependencies() {
/* 1 */             return nd0.f14189a;
                }
            }
