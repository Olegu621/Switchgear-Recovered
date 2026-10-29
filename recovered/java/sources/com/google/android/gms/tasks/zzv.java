            package com.google.android.gms.tasks;

            import android.app.Activity;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import p000.e71;
            import p000.x61;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzv extends x61 {
                private final List zza;

                private zzv(e71 e71Var) {
/* 1 */             super(e71Var);
/* 9 */             this.zza = new ArrayList();
/* 15 */            this.mLifecycleFragment.mo3336b("TaskOnStopCallback", this);
                }

                public static zzv zza(Activity activity) {
                    zzv zzvVar;
/* 1 */             e71 fragment = x61.getFragment(activity);
                    synchronized (fragment) {
                        try {
/* 14 */                    zzvVar = (zzv) fragment.mo3337c(zzv.class, "TaskOnStopCallback");
/* 16 */                    if (zzvVar == null) {
/* 20 */                        zzvVar = new zzv(fragment);
                            }
                        } catch (Throwable th) {
/* 29 */                    throw th;
                        }
                    }
/* 27 */            return zzvVar;
                }

                @Override // p000.x61
                public final void onStop() {
                    synchronized (this.zza) {
                        try {
/* 6 */                     Iterator it = this.zza.iterator();
/* 14 */                    while (it.hasNext()) {
/* 26 */                        zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
/* 28 */                        if (zzqVar != null) {
/* 30 */                            zzqVar.zzc();
                                }
                            }
/* 38 */                    this.zza.clear();
                        } catch (Throwable th) {
/* 44 */                    throw th;
                        }
                    }
                }

                public final void zzb(zzq zzqVar) {
                    synchronized (this.zza) {
/* 11 */                this.zza.add(new WeakReference(zzqVar));
                    }
                }
            }
