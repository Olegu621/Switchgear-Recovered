            package xhpgvfjuz;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            
            /* JADX INFO: renamed from: xhpgvfjuz.ay */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class ServiceC2435ay extends Service {

                /* JADX INFO: renamed from: a */
                private final AbstractBinderC2429as f19153a = new BinderC2409aO(this);

                /* JADX INFO: renamed from: a */
                native int m9927a();

                /* JADX INFO: renamed from: b */
                native boolean m9928b();

                /* JADX INFO: renamed from: c */
                native int m9929c();

                /* JADX INFO: renamed from: d */
                native int m9930d();

                @Override // android.app.Service
                public IBinder onBind(Intent intent) {
                    return this.f19153a;
                }
            }
