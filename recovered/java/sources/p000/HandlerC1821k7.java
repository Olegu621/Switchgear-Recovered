            package p000;

            import android.content.DialogInterface;
            import android.os.Handler;
            import android.os.Message;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: renamed from: k7 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class HandlerC1821k7 extends Handler {

                /* JADX INFO: renamed from: a */
                public WeakReference f12625a;

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
/* 1 */             int i = message.what;
/* 4 */             if (i == -3 || i == -2 || i == -1) {
/* 38 */                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f12625a.get(), message.what);
                    } else {
/* 13 */                if (i != 1) {
/* 15 */                    return;
                        }
/* 20 */                ((DialogInterface) message.obj).dismiss();
                    }
                }
            }
