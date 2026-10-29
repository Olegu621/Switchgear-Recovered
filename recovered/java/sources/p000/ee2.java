            package p000;

            import android.app.Activity;
            import android.os.IBinder;
            import android.view.View;
            import android.view.Window;
            import android.view.WindowManager;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ee2 implements View.OnAttachStateChangeListener {

                /* JADX INFO: renamed from: a */
                public final fe2 f7657a;

                /* JADX INFO: renamed from: b */
                public final WeakReference f7658b;

                public ee2(fe2 fe2Var, Activity activity) {
/* 1 */             fe2Var.getClass();
/* 7 */             this.f7657a = fe2Var;
/* 14 */            this.f7658b = new WeakReference(activity);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    Window window;
                    WindowManager.LayoutParams attributes;
/* 1 */             view.getClass();
/* 4 */             view.removeOnAttachStateChangeListener(this);
/* 13 */            Activity activity = (Activity) this.f7658b.get();
/* 32 */            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 33 */            if (activity == null || iBinder == null) {
/* 38 */                return;
                    }
/* 41 */            this.f7657a.m3755c(iBinder, activity);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 1 */             view.getClass();
                }
            }
