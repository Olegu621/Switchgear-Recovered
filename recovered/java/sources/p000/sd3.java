            package p000;

            import android.R;
            import android.app.Activity;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.view.Display;
            import android.view.View;
            import android.view.ViewTreeObserver;
            import com.google.android.gms.games.internal.zzap;
            import com.google.android.gms.internal.games_v2.zzam;
            import com.google.android.gms.internal.games_v2.zzc;
            import com.google.android.gms.internal.games_v2.zzez;
            import java.lang.ref.WeakReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sd3 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

                /* JADX INFO: renamed from: a */
                public final nd3 f16542a;

                /* JADX INFO: renamed from: c */
                public WeakReference f16544c;

                /* JADX INFO: renamed from: d */
                public boolean f16545d = false;

                /* JADX INFO: renamed from: b */
                public final zzam f16543b = new zzam(0, null);

                public sd3(nd3 nd3Var) {
/* 7 */             this.f16542a = nd3Var;
                }

                /* JADX INFO: renamed from: a */
                public final void m8482a(Activity activity) {
                    View decorView;
                    try {
/* 4 */                 decorView = activity.findViewById(R.id.content);
                    } catch (IllegalStateException unused) {
/* 9 */                 decorView = null;
                    }
/* 12 */            if (decorView == null && (decorView = activity.getWindow().getDecorView()) == null) {
/* 34 */                zzez.zzg("PopupManager", "Failed to bind to: ".concat(String.valueOf(activity)));
                    } else {
/* 48 */                zzez.zzf("PopupManager", "Binding to: ".concat(String.valueOf(activity)));
/* 51 */                m8483b(decorView);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m8483b(View view) {
/* 1 */             nd3 nd3Var = this.f16542a;
/* 3 */             nd3Var.m6972e();
/* 6 */             WeakReference weakReference = this.f16544c;
/* 8 */             if (weakReference != null) {
/* 14 */                View decorView = (View) weakReference.get();
/* 16 */                Context context = nd3Var.getContext();
/* 20 */                if (decorView == null && (context instanceof Activity)) {
/* 32 */                    decorView = ((Activity) context).getWindow().getDecorView();
                        }
/* 36 */                if (decorView != null) {
/* 38 */                    decorView.removeOnAttachStateChangeListener(this);
/* 45 */                    decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        }
                    }
/* 49 */            this.f16544c = null;
/* 51 */            Context context2 = nd3Var.getContext();
/* 57 */            if (view == null && (context2 instanceof Activity)) {
/* 63 */                Activity activity = (Activity) context2;
                        try {
/* 68 */                    view = activity.findViewById(R.id.content);
                        } catch (IllegalStateException unused) {
                        }
/* 72 */                if (view == null) {
/* 78 */                    view = activity.getWindow().getDecorView();
                        }
/* 84 */                zzez.zzg("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
                    }
/* 87 */            if (view == null) {
/* 112 */               zzez.zzc("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
/* 115 */               return;
                    }
/* 89 */            m8485d(view);
/* 97 */            this.f16544c = new WeakReference(view);
/* 99 */            view.addOnAttachStateChangeListener(this);
/* 106 */           view.getViewTreeObserver().addOnGlobalLayoutListener(this);
                }

                /* JADX INFO: renamed from: c */
                public final void m8484c() {
/* 1 */             zzam zzamVar = this.f16543b;
/* 3 */             IBinder iBinder = zzamVar.zza;
/* 6 */             if (iBinder == null) {
/* 72 */                this.f16545d = true;
/* 74 */                return;
                    }
/* 8 */             nd3 nd3Var = this.f16542a;
/* 10 */            Bundle bundleZza = zzamVar.zza();
/* 18 */            if (nd3Var.isConnected() && (!nd3Var.f14200i.f9733e.f14371b || !nd3Var.f14201v.f17053a)) {
                        try {
/* 38 */                    zzap zzapVar = (zzap) nd3Var.getService();
/* 40 */                    Parcel parcelZza = zzapVar.zza();
/* 44 */                    parcelZza.writeStrongBinder(iBinder);
/* 47 */                    zzc.zzd(parcelZza, bundleZza);
/* 52 */                    zzapVar.zzc(5005, parcelZza);
/* 57 */                    nd3Var.f14201v.f17053a = true;
                        } catch (RemoteException e) {
/* 65 */                    zzez.zzh("GamesGmsClientImpl", "service died", e);
                        }
                    }
/* 69 */            this.f16545d = false;
                }

                /* JADX INFO: renamed from: d */
                public final void m8485d(View view) {
/* 1 */             Display display = view.getDisplay();
/* 12 */            int displayId = display != null ? display.getDisplayId() : -1;
/* 13 */            IBinder windowToken = view.getWindowToken();
/* 18 */            int[] iArr = new int[2];
/* 20 */            view.getLocationInWindow(iArr);
/* 23 */            int width = view.getWidth();
/* 27 */            int height = view.getHeight();
/* 31 */            zzam zzamVar = this.f16543b;
/* 33 */            zzamVar.zzc = displayId;
/* 35 */            zzamVar.zza = windowToken;
/* 38 */            int i = iArr[0];
/* 40 */            zzamVar.zzd = i;
/* 43 */            int i2 = iArr[1];
/* 45 */            zzamVar.zze = i2;
/* 48 */            zzamVar.zzf = i + width;
/* 51 */            zzamVar.zzg = i2 + height;
/* 55 */            if (this.f16545d) {
/* 57 */                m8484c();
                    }
                }

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    View view;
/* 1 */             WeakReference weakReference = this.f16544c;
/* 3 */             if (weakReference == null || (view = (View) weakReference.get()) == null) {
/* 14 */                return;
                    }
/* 15 */            m8485d(view);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
/* 1 */             m8485d(view);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
/* 3 */             this.f16542a.m6972e();
/* 6 */             view.removeOnAttachStateChangeListener(this);
                }
            }
