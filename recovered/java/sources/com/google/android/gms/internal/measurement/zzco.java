            package com.google.android.gms.internal.measurement;

            import android.os.Bundle;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzco extends zzct {
                private final AtomicReference zza = new AtomicReference();
                private boolean zzb;

                /* JADX WARN: Code restructure failed: missing block: B:3:0x0002, code lost:
                
                    r3 = r3.get("r");
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object zzf(Bundle bundle, Class cls) {
                    Object obj;
/* 1 */             if (bundle == null || obj == null) {
/* 43 */                return null;
                    }
                    try {
/* 11 */                return cls.cast(obj);
                    } catch (ClassCastException e) {
/* 39 */                AbstractC1245n0.m4891s("AM", AbstractC0886en.m3509m("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
/* 42 */                throw e;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzcu
                public final void zzb(Bundle bundle) {
/* 1 */             AtomicReference atomicReference = this.zza;
                    synchronized (atomicReference) {
                        try {
                            try {
/* 4 */                         atomicReference.set(bundle);
/* 8 */                         this.zzb = true;
/* 12 */                        this.zza.notify();
                            } catch (Throwable th) {
/* 22 */                        this.zza.notify();
/* 25 */                        throw th;
                            }
                        } catch (Throwable th2) {
/* 27 */                    throw th2;
                        }
                    }
                }

                public final String zzc(long j) {
/* 11 */            return (String) zzf(zze(j), String.class);
                }

                public final Long zzd(long j) {
/* 11 */            return (Long) zzf(zze(j), Long.class);
                }

                public final Bundle zze(long j) {
                    Bundle bundle;
/* 1 */             AtomicReference atomicReference = this.zza;
                    synchronized (atomicReference) {
/* 6 */                 if (!this.zzb) {
                            try {
/* 8 */                         atomicReference.wait(j);
                            } catch (InterruptedException unused) {
/* 15 */                        return null;
                            }
                        }
/* 23 */                bundle = (Bundle) this.zza.get();
                    }
/* 26 */            return bundle;
                }
            }
