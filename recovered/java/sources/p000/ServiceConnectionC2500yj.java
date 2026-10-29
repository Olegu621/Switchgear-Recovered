            package p000;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.IBinder;
            import java.util.concurrent.LinkedBlockingQueue;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: renamed from: yj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ServiceConnectionC2500yj implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public boolean f19655a = false;

                /* JADX INFO: renamed from: b */
                public final LinkedBlockingQueue f19656b = new LinkedBlockingQueue();

                /* JADX INFO: renamed from: a */
                public final IBinder m10152a() throws TimeoutException {
/* 3 */             kb1.m6060m("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
/* 8 */             if (this.f19655a) {
/* 38 */                f42.m3656l("Cannot call get on this connection more than once");
/* 41 */                return null;
                    }
/* 11 */            this.f19655a = true;
/* 23 */            IBinder iBinder = (IBinder) this.f19656b.poll(10000L, TimeUnit.MILLISECONDS);
/* 25 */            if (iBinder != null) {
/* 27 */                return iBinder;
                    }
/* 35 */            throw new TimeoutException("Timed out waiting for the service connection");
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 3 */             this.f19656b.add(iBinder);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
                }
            }
