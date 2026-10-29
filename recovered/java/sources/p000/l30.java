            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import android.support.customtabs.ICustomTabsService;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class l30 implements ServiceConnection {
                private Context mApplicationContext;

                public Context getApplicationContext() {
/* 1 */             return this.mApplicationContext;
                }

                public abstract void onCustomTabsServiceConnected(ComponentName componentName, e30 e30Var);

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 3 */             if (this.mApplicationContext != null) {
/* 14 */                onCustomTabsServiceConnected(componentName, new k30(ICustomTabsService.Stub.asInterface(iBinder), componentName));
                    } else {
/* 20 */                f42.m3656l("Custom Tabs Service connected before an applicationcontext has been provided.");
                    }
                }

                public void setApplicationContext(Context context) {
/* 1 */             this.mApplicationContext = context;
                }
            }
