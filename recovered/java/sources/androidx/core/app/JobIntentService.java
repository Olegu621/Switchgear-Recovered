            package androidx.core.app;

            import android.app.Service;
            import android.content.ComponentName;
            import android.content.Intent;
            import android.os.Build;
            import android.os.IBinder;
            import android.os.PowerManager;
            import java.util.HashMap;
            import p000.C1951n4;
            import p000.l01;
            import p000.m01;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public abstract class JobIntentService extends Service {

                /* JADX INFO: renamed from: b */
                public static final HashMap f1235b = new HashMap();

                /* JADX INFO: renamed from: a */
                public m01 f1236a;

                @Override // android.app.Service
                public final IBinder onBind(Intent intent) {
/* 1 */             m01 m01Var = this.f1236a;
/* 3 */             if (m01Var != null) {
/* 1 */                 return m01Var.getBinder();
                    }
/* 10 */            return null;
                }

                @Override // android.app.Service
                public final void onCreate() {
/* 1 */             super.onCreate();
/* 4 */             int i = Build.VERSION.SDK_INT;
/* 8 */             if (i >= 26) {
/* 15 */                this.f1236a = new m01(this);
/* 17 */                return;
                    }
/* 19 */            this.f1236a = null;
/* 27 */            ComponentName componentName = new ComponentName(this, getClass());
/* 30 */            HashMap map = f1235b;
/* 38 */            if (((l01) map.get(componentName)) == null) {
/* 40 */                if (i >= 26) {
/* 122 */                   C1951n4.m6859j("Can't be here without a job id");
/* 125 */                   return;
                        }
/* 44 */                l01 l01Var = new l01();
/* 47 */                getApplicationContext();
/* 56 */                PowerManager powerManager = (PowerManager) getSystemService("power");
/* 85 */                powerManager.newWakeLock(1, componentName.getClassName() + ":launch").setReferenceCounted(false);
/* 113 */               powerManager.newWakeLock(1, componentName.getClassName() + ":run").setReferenceCounted(false);
/* 116 */               map.put(componentName, l01Var);
                    }
                }

                @Override // android.app.Service
                public final int onStartCommand(Intent intent, int i, int i2) {
/* 1 */             return 2;
                }
            }
