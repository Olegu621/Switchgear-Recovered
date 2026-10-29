            package xhpgvfjuz;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            
            /* JADX INFO: renamed from: xhpgvfjuz.g */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class ServiceConnectionC2442g implements ServiceConnection {
                /* JADX INFO: renamed from: a */
                private native void m9933a(InterfaceC2422al interfaceC2422al);

                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    m9933a(AbstractBinderC2429as.m9905a(iBinder));
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                }
            }
