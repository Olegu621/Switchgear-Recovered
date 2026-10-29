            package androidx.fragment.app;

            import android.app.Activity;
            import android.app.Dialog;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.Looper;
            import android.view.LayoutInflater;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import androidx.lifecycle.runtime.R$id;
            import p000.C1951n4;
            import p000.DialogC0860dy;
            import p000.RunnableC2495ye;
            import p000.dn0;
            import p000.fm0;
            import p000.gr0;
            import p000.j80;
            import p000.k80;
            import p000.l80;
            import p000.mm0;
            import p000.um0;
            
            /* JADX INFO: renamed from: androidx.fragment.app.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DialogInterfaceOnCancelListenerC0097i extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

                /* JADX INFO: renamed from: U */
                public boolean f1445U;

                /* JADX INFO: renamed from: W */
                public Dialog f1447W;

                /* JADX INFO: renamed from: X */
                public boolean f1448X;

                /* JADX INFO: renamed from: Y */
                public boolean f1449Y;

                /* JADX INFO: renamed from: Z */
                public boolean f1450Z;

                /* JADX INFO: renamed from: a */
                public Handler f1451a;

                /* JADX INFO: renamed from: b */
                public final RunnableC2495ye f1453b = new RunnableC2495ye(this, 4);

                /* JADX INFO: renamed from: c */
                public final j80 f1454c = new j80(this);

                /* JADX INFO: renamed from: d */
                public final k80 f1455d = new k80(this);

                /* JADX INFO: renamed from: e */
                public int f1456e = 0;

                /* JADX INFO: renamed from: f */
                public int f1457f = 0;

                /* JADX INFO: renamed from: i */
                public boolean f1458i = true;

                /* JADX INFO: renamed from: v */
                public boolean f1459v = true;

                /* JADX INFO: renamed from: w */
                public int f1460w = -1;

                /* JADX INFO: renamed from: V */
                public final gr0 f1446V = new gr0(this);

                /* JADX INFO: renamed from: a0 */
                public boolean f1452a0 = false;

                @Override // androidx.fragment.app.Fragment
                public final mm0 createFragmentContainer() {
/* 7 */             return new l80(this, super.createFragmentContainer());
                }

                /* JADX INFO: renamed from: g */
                public final void m666g(boolean z, boolean z2) {
/* 3 */             if (this.f1449Y) {
/* 5 */                 return;
                    }
/* 7 */             this.f1449Y = true;
/* 10 */            this.f1450Z = false;
/* 12 */            Dialog dialog = this.f1447W;
/* 14 */            if (dialog != null) {
/* 17 */                dialog.setOnDismissListener(null);
/* 22 */                this.f1447W.dismiss();
/* 25 */                if (!z2) {
/* 37 */                    if (Looper.myLooper() == this.f1451a.getLooper()) {
/* 41 */                        onDismiss(this.f1447W);
                            } else {
/* 49 */                        this.f1451a.post(this.f1453b);
                            }
                        }
                    }
/* 52 */            this.f1448X = true;
/* 56 */            if (this.f1460w >= 0) {
/* 58 */                AbstractC0111w parentFragmentManager = getParentFragmentManager();
/* 62 */                int i = this.f1460w;
/* 64 */                parentFragmentManager.getClass();
/* 67 */                if (i < 0) {
/* 87 */                    C1951n4.m6859j(fm0.m3781g(i, "Bad id: "));
/* 90 */                    return;
                        } else {
/* 74 */                    parentFragmentManager.m726x(new um0(parentFragmentManager, i, 1), z);
/* 78 */                    this.f1460w = -1;
/* 80 */                    return;
                        }
                    }
/* 91 */            AbstractC0111w parentFragmentManager2 = getParentFragmentManager();
/* 95 */            parentFragmentManager2.getClass();
/* 100 */           C0086a c0086a = new C0086a(parentFragmentManager2);
/* 103 */           c0086a.f1400p = true;
/* 105 */           AbstractC0111w abstractC0111w = this.mFragmentManager;
/* 107 */           if (abstractC0111w != null && abstractC0111w != c0086a.f1401q) {
/* 142 */               throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
                    }
/* 149 */           c0086a.m636b(new dn0(this, 3));
/* 152 */           if (z) {
/* 154 */               c0086a.m638d(true);
                    } else {
/* 158 */               c0086a.m638d(false);
                    }
                }

                /* JADX INFO: renamed from: h */
                public Dialog mo667h() {
/* 6 */             if (AbstractC0111w.m674K(3)) {
/* 8 */                 toString();
                    }
/* 19 */            return new DialogC0860dy(requireContext(), this.f1457f);
                }

                @Override // androidx.fragment.app.Fragment
                public final void onAttach(Context context) {
/* 1 */             super.onAttach(context);
/* 10 */            getViewLifecycleOwnerLiveData().m120f(this.f1446V);
/* 15 */            if (this.f1450Z) {
/* 20 */                return;
                    }
/* 18 */            this.f1449Y = false;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                }

                @Override // androidx.fragment.app.Fragment
                public void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 9 */             this.f1451a = new Handler();
/* 20 */            this.f1459v = this.mContainerId == 0;
/* 22 */            if (bundle != null) {
/* 30 */                this.f1456e = bundle.getInt("android:style", 0);
/* 38 */                this.f1457f = bundle.getInt("android:theme", 0);
/* 46 */                this.f1458i = bundle.getBoolean("android:cancelable", true);
/* 56 */                this.f1459v = bundle.getBoolean("android:showsDialog", this.f1459v);
/* 65 */                this.f1460w = bundle.getInt("android:backStackId", -1);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onDestroyView() {
/* 1 */             super.onDestroyView();
/* 4 */             Dialog dialog = this.f1447W;
/* 6 */             if (dialog != null) {
/* 9 */                 this.f1448X = true;
/* 12 */                dialog.setOnDismissListener(null);
/* 17 */                this.f1447W.dismiss();
/* 22 */                if (!this.f1449Y) {
/* 26 */                    onDismiss(this.f1447W);
                        }
/* 29 */                this.f1447W = null;
/* 32 */                this.f1452a0 = false;
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onDetach() {
/* 1 */             super.onDetach();
/* 6 */             if (!this.f1450Z && !this.f1449Y) {
/* 13 */                this.f1449Y = true;
                    }
/* 21 */            getViewLifecycleOwnerLiveData().mo123i(this.f1446V);
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
/* 3 */             if (this.f1448X) {
/* 19 */                return;
                    }
/* 10 */            if (AbstractC0111w.m674K(3)) {
/* 12 */                toString();
                    }
/* 16 */            m666g(true, true);
                }

                @Override // androidx.fragment.app.Fragment
                public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
/* 1 */             LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
/* 5 */             boolean z = this.f1459v;
/* 8 */             if (z && !this.f1445U) {
/* 16 */                if (z && !this.f1452a0) {
                            try {
/* 25 */                        this.f1445U = true;
/* 27 */                        Dialog dialogMo667h = mo667h();
/* 31 */                        this.f1447W = dialogMo667h;
/* 35 */                        if (this.f1459v) {
/* 37 */                            int i = this.f1456e;
/* 39 */                            if (i == 1 || i == 2) {
/* 58 */                                dialogMo667h.requestWindowFeature(1);
                                    } else if (i == 3) {
/* 47 */                                Window window = dialogMo667h.getWindow();
/* 51 */                                if (window != null) {
/* 55 */                                    window.addFlags(24);
                                        }
/* 58 */                                dialogMo667h.requestWindowFeature(1);
                                    }
/* 61 */                            Context context = getContext();
/* 67 */                            if (context instanceof Activity) {
/* 73 */                                this.f1447W.setOwnerActivity((Activity) context);
                                    }
/* 83 */                            this.f1447W.setCancelable(this.f1458i);
/* 90 */                            this.f1447W.setOnCancelListener(this.f1454c);
/* 97 */                            this.f1447W.setOnDismissListener(this.f1455d);
/* 100 */                           this.f1452a0 = true;
                                } else {
/* 104 */                           this.f1447W = null;
                                }
/* 106 */                       this.f1445U = false;
                            } catch (Throwable th) {
/* 109 */                       this.f1445U = false;
/* 111 */                       throw th;
                            }
                        }
/* 116 */               if (AbstractC0111w.m674K(2)) {
/* 118 */                   toString();
                        }
/* 121 */               Dialog dialog = this.f1447W;
/* 123 */               if (dialog != null) {
/* 129 */                   return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
                        }
                    } else if (AbstractC0111w.m674K(2)) {
/* 140 */               toString();
                    }
/* 143 */           return layoutInflaterOnGetLayoutInflater;
                }

                @Override // androidx.fragment.app.Fragment
                public void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 4 */             Dialog dialog = this.f1447W;
/* 6 */             if (dialog != null) {
/* 8 */                 Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
/* 15 */                bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
/* 20 */                bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
                    }
/* 23 */            int i = this.f1456e;
/* 25 */            if (i != 0) {
/* 29 */                bundle.putInt("android:style", i);
                    }
/* 32 */            int i2 = this.f1457f;
/* 34 */            if (i2 != 0) {
/* 38 */                bundle.putInt("android:theme", i2);
                    }
/* 41 */            boolean z = this.f1458i;
/* 43 */            if (!z) {
/* 47 */                bundle.putBoolean("android:cancelable", z);
                    }
/* 50 */            boolean z2 = this.f1459v;
/* 52 */            if (!z2) {
/* 56 */                bundle.putBoolean("android:showsDialog", z2);
                    }
/* 59 */            int i3 = this.f1460w;
/* 62 */            if (i3 != -1) {
/* 66 */                bundle.putInt("android:backStackId", i3);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onStart() {
/* 1 */             super.onStart();
/* 4 */             Dialog dialog = this.f1447W;
/* 6 */             if (dialog != null) {
/* 9 */                 this.f1448X = false;
/* 11 */                dialog.show();
/* 20 */                View decorView = this.f1447W.getWindow().getDecorView();
/* 24 */                decorView.getClass();
/* 29 */                decorView.setTag(R$id.view_tree_lifecycle_owner, this);
/* 34 */                decorView.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, this);
/* 39 */                decorView.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public void onStop() {
/* 1 */             super.onStop();
/* 4 */             Dialog dialog = this.f1447W;
/* 6 */             if (dialog != null) {
/* 8 */                 dialog.hide();
                    }
                }

                @Override // androidx.fragment.app.Fragment
                public final void onViewStateRestored(Bundle bundle) {
                    Bundle bundle2;
/* 1 */             super.onViewStateRestored(bundle);
/* 6 */             if (this.f1447W == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
/* 23 */                return;
                    }
/* 20 */            this.f1447W.onRestoreInstanceState(bundle2);
                }

                @Override // androidx.fragment.app.Fragment
                public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                    Bundle bundle2;
/* 1 */             super.performCreateView(layoutInflater, viewGroup, bundle);
/* 6 */             if (this.mView != null || this.f1447W == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
/* 27 */                return;
                    }
/* 24 */            this.f1447W.onRestoreInstanceState(bundle2);
                }
            }
