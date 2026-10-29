            package xhpgvfjuz;

            import android.app.Service;
            import android.content.Intent;
            import android.os.IBinder;
            
            /* JADX INFO: renamed from: xhpgvfjuz.aG */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class ServiceC2401aG extends Service {

                /* JADX INFO: renamed from: a */
                private final AbstractBinderC2429as f19133a = new BinderC2384P(this);

                /* JADX INFO: renamed from: a */
                public native int m9871a();

                /* JADX INFO: renamed from: b */
                public native boolean m9872b();

                /* JADX INFO: renamed from: c */
                public native int m9873c();

                /* JADX INFO: renamed from: d */
                public native int m9874d();

                @Override // android.app.Service
                public IBinder onBind(Intent intent) {
                    return this.f19133a;
                }
            }
