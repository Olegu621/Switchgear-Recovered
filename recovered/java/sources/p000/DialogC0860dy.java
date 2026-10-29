            package p000;

            import android.app.Dialog;
            import android.content.Context;
            import android.os.Build;
            import android.os.Bundle;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import android.window.OnBackInvokedDispatcher;
            import androidx.lifecycle.runtime.R$id;
            
            /* JADX INFO: renamed from: dy */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public class DialogC0860dy extends Dialog implements g71, tp1, z62 {

                /* JADX INFO: renamed from: a */
                public i71 f7442a;

                /* JADX INFO: renamed from: b */
                public final y62 f7443b;

                /* JADX INFO: renamed from: c */
                public final sp1 f7444c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DialogC0860dy(Context context, int i) {
/* 4 */             super(context, i);
/* 1 */             context.getClass();
/* 12 */            this.f7443b = new y62(this);
/* 26 */            this.f7444c = new sp1(new RunnableC2166s2(this, 12));
                }

                /* JADX INFO: renamed from: a */
                public static void m3279a(DialogC0860dy dialogC0860dy) {
/* 1 */             super.onBackPressed();
                }

                @Override // android.app.Dialog
                public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
/* 1 */             view.getClass();
/* 4 */             m3280b();
/* 7 */             super.addContentView(view, layoutParams);
                }

                /* JADX INFO: renamed from: b */
                public final void m3280b() {
/* 1 */             Window window = getWindow();
/* 5 */             window.getClass();
/* 8 */             View decorView = window.getDecorView();
/* 12 */            decorView.getClass();
/* 17 */            decorView.setTag(R$id.view_tree_lifecycle_owner, this);
/* 20 */            Window window2 = getWindow();
/* 24 */            window2.getClass();
/* 27 */            View decorView2 = window2.getDecorView();
/* 31 */            decorView2.getClass();
/* 36 */            decorView2.setTag(androidx.activity.R$id.view_tree_on_back_pressed_dispatcher_owner, this);
/* 39 */            Window window3 = getWindow();
/* 43 */            window3.getClass();
/* 46 */            View decorView3 = window3.getDecorView();
/* 50 */            decorView3.getClass();
/* 55 */            decorView3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
                }

                @Override // p000.g71
                public final v61 getLifecycle() {
/* 1 */             i71 i71Var = this.f7442a;
/* 3 */             if (i71Var != null) {
/* 12 */                return i71Var;
                    }
/* 7 */             i71 i71Var2 = new i71(this);
/* 10 */            this.f7442a = i71Var2;
/* 12 */            return i71Var2;
                }

                @Override // p000.tp1
                public final sp1 getOnBackPressedDispatcher() {
/* 1 */             return this.f7444c;
                }

                @Override // p000.z62
                public final x62 getSavedStateRegistry() {
/* 3 */             return this.f7443b.f19509b;
                }

                @Override // android.app.Dialog
                public final void onBackPressed() {
/* 3 */             this.f7444c.m8602b();
                }

                @Override // android.app.Dialog
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 8 */             if (Build.VERSION.SDK_INT >= 33) {
/* 1 */                 OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
/* 14 */                onBackInvokedDispatcher.getClass();
/* 17 */                sp1 sp1Var = this.f7444c;
/* 19 */                sp1Var.getClass();
/* 22 */                sp1Var.f16742e = onBackInvokedDispatcher;
/* 26 */                sp1Var.m8603c(sp1Var.f16744g);
                    }
/* 31 */            this.f7443b.m10114b(bundle);
/* 34 */            i71 i71Var = this.f7442a;
/* 36 */            if (i71Var == null) {
/* 40 */                i71Var = new i71(this);
/* 43 */                this.f7442a = i71Var;
                    }
/* 47 */            i71Var.m4487e(t61.ON_CREATE);
                }

                @Override // android.app.Dialog
                public final Bundle onSaveInstanceState() {
/* 1 */             Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
/* 5 */             bundleOnSaveInstanceState.getClass();
/* 10 */            this.f7443b.m10115c(bundleOnSaveInstanceState);
/* 13 */            return bundleOnSaveInstanceState;
                }

                @Override // android.app.Dialog
                public final void onStart() {
/* 1 */             super.onStart();
/* 4 */             i71 i71Var = this.f7442a;
/* 6 */             if (i71Var == null) {
/* 10 */                i71Var = new i71(this);
/* 13 */                this.f7442a = i71Var;
                    }
/* 17 */            i71Var.m4487e(t61.ON_RESUME);
                }

                @Override // android.app.Dialog
                public void onStop() {
/* 1 */             i71 i71Var = this.f7442a;
/* 3 */             if (i71Var == null) {
/* 7 */                 i71Var = new i71(this);
/* 10 */                this.f7442a = i71Var;
                    }
/* 14 */            i71Var.m4487e(t61.ON_DESTROY);
/* 18 */            this.f7442a = null;
/* 20 */            super.onStop();
                }

                @Override // android.app.Dialog
                public void setContentView(View view) {
/* 1 */             view.getClass();
/* 4 */             m3280b();
/* 7 */             super.setContentView(view);
                }

                @Override // android.app.Dialog
/* 10 */        public void setContentView(int i) {
/* 11 */            m3280b();
/* 12 */            super.setContentView(i);
                }

                @Override // android.app.Dialog
/* 12 */        public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
                    view.getClass();
/* 13 */            m3280b();
/* 14 */            super.setContentView(view, layoutParams);
                }
            }
