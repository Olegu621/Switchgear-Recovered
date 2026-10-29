            package p000;

            import android.app.PendingIntent;
            import android.content.DialogInterface;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Looper;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.internal.base.zau;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ya3 extends x61 implements DialogInterface.OnCancelListener {

                /* JADX INFO: renamed from: a */
                public volatile boolean f19556a;

                /* JADX INFO: renamed from: b */
                public final AtomicReference f19557b;

                /* JADX INFO: renamed from: c */
                public final zau f19558c;

                /* JADX INFO: renamed from: d */
                public final pr0 f19559d;

                /* JADX INFO: renamed from: e */
                public final C1827kd f19560e;

                /* JADX INFO: renamed from: f */
                public final ur0 f19561f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ya3(e71 e71Var, ur0 ur0Var) {
/* 3 */             super(e71Var);
/* 1 */             pr0 pr0Var = pr0.f15259d;
/* 12 */            this.f19557b = new AtomicReference(null);
/* 23 */            this.f19558c = new zau(Looper.getMainLooper());
/* 25 */            this.f19559d = pr0Var;
/* 33 */            this.f19560e = new C1827kd(0);
/* 35 */            this.f19561f = ur0Var;
/* 41 */            this.mLifecycleFragment.mo3336b("ConnectionlessLifecycleHelper", this);
                }

                @Override // p000.x61
                public final void onActivityResult(int i, int i2, Intent intent) {
/* 1 */             AtomicReference atomicReference = this.f19557b;
/* 7 */             dc3 dc3Var = (dc3) atomicReference.get();
/* 11 */            ur0 ur0Var = this.f19561f;
/* 14 */            if (i != 1) {
/* 17 */                if (i == 2) {
/* 28 */                    int iM8004c = this.f19559d.m8004c(getActivity(), qr0.f15711a);
/* 32 */                    if (iM8004c == 0) {
/* 34 */                        atomicReference.set(null);
/* 37 */                        zau zauVar = ur0Var.f17695n;
/* 43 */                        zauVar.sendMessage(zauVar.obtainMessage(3));
/* 46 */                        return;
                            } else {
/* 47 */                        if (dc3Var == null) {
/* 122 */                           return;
                                }
/* 55 */                        if (dc3Var.f7118b.f3416b == 18 && iM8004c == 18) {
/* 122 */                           return;
                                }
                            }
                        }
                    } else if (i2 == -1) {
/* 63 */                atomicReference.set(null);
/* 66 */                zau zauVar2 = ur0Var.f17695n;
/* 72 */                zauVar2.sendMessage(zauVar2.obtainMessage(3));
/* 75 */                return;
                    } else if (i2 == 0) {
/* 78 */                if (dc3Var != null) {
/* 98 */                    ConnectionResult connectionResult = new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, dc3Var.f7118b.toString(), null);
/* 101 */                   int i3 = dc3Var.f7117a;
/* 103 */                   atomicReference.set(null);
/* 106 */                   ur0Var.m9131i(connectionResult, i3);
/* 109 */                   return;
                        }
/* 122 */               return;
                    }
/* 110 */           if (dc3Var != null) {
/* 112 */               ConnectionResult connectionResult2 = dc3Var.f7118b;
/* 114 */               int i4 = dc3Var.f7117a;
/* 116 */               atomicReference.set(null);
/* 119 */               ur0Var.m9131i(connectionResult2, i4);
                    }
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
/* 6 */             ConnectionResult connectionResult = new ConnectionResult(13, null, null);
/* 9 */             AtomicReference atomicReference = this.f19557b;
/* 15 */            dc3 dc3Var = (dc3) atomicReference.get();
/* 21 */            int i = dc3Var == null ? -1 : dc3Var.f7117a;
/* 23 */            atomicReference.set(null);
/* 28 */            this.f19561f.m9131i(connectionResult, i);
                }

                @Override // p000.x61
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 4 */             if (bundle != null) {
/* 49 */                this.f19557b.set(bundle.getBoolean("resolving_error", false) ? new dc3(new ConnectionResult(bundle.getInt("failed_status"), null, (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
                    }
                }

                @Override // p000.x61
                public final void onResume() {
/* 1 */             super.onResume();
/* 10 */            if (this.f19560e.isEmpty()) {
/* 17 */                return;
                    }
/* 14 */            this.f19561f.m9126b(this);
                }

                @Override // p000.x61
                public final void onSaveInstanceState(Bundle bundle) {
/* 1 */             super.onSaveInstanceState(bundle);
/* 10 */            dc3 dc3Var = (dc3) this.f19557b.get();
/* 12 */            if (dc3Var == null) {
/* 14 */                return;
                    }
/* 15 */            ConnectionResult connectionResult = dc3Var.f7118b;
/* 20 */            bundle.putBoolean("resolving_error", true);
/* 27 */            bundle.putInt("failed_client_id", dc3Var.f7117a);
/* 34 */            bundle.putInt("failed_status", connectionResult.f3416b);
/* 41 */            bundle.putParcelable("failed_resolution", connectionResult.f3417c);
                }

                @Override // p000.x61
                public final void onStart() {
/* 1 */             super.onStart();
/* 5 */             this.f19556a = true;
/* 13 */            if (this.f19560e.isEmpty()) {
/* 20 */                return;
                    }
/* 17 */            this.f19561f.m9126b(this);
                }

                @Override // p000.x61
                public final void onStop() {
/* 2 */             this.f19556a = false;
/* 4 */             ur0 ur0Var = this.f19561f;
/* 6 */             ur0Var.getClass();
                    synchronized (ur0.f17680r) {
                        try {
/* 14 */                    if (ur0Var.f17692k == this) {
/* 17 */                        ur0Var.f17692k = null;
/* 21 */                        ur0Var.f17693l.clear();
                            }
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
                }
            }
