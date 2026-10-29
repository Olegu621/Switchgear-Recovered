            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ui0 extends BroadcastReceiver {

                /* JADX INFO: renamed from: b */
                public static final AtomicReference f17542b = new AtomicReference();

                /* JADX INFO: renamed from: a */
                public final Context f17543a;

                public ui0(Context context) {
/* 4 */             this.f17543a = context;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    synchronized (vi0.f18190j) {
                        try {
/* 12 */                    Iterator it = ((zb1) vi0.f18191k.values()).iterator();
/* 20 */                    while (it.hasNext()) {
/* 28 */                        ((vi0) it.next()).m9277e();
                            }
                        } catch (Throwable th) {
/* 42 */                    throw th;
                        }
                    }
/* 37 */            this.f17543a.unregisterReceiver(this);
                }
            }
