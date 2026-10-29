            package com.google.android.play.agesignals.protocol;

            import android.os.Bundle;
            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.android.gms.internal.playcore_age_signals.zza;
            import com.google.android.gms.internal.playcore_age_signals.zzb;
            import com.google.android.gms.internal.playcore_age_signals.zzc;
            import com.google.android.gms.internal.playcore_age_signals.zzo;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.Date;
            import p000.C0009a7;
            import p000.ek3;
            import p000.fg3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IAgeSignalsServiceCallback extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends zzb implements IAgeSignalsServiceCallback {

                    /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                    public static class Proxy extends zza implements IAgeSignalsServiceCallback {
                    }

                    @Override // com.google.android.gms.internal.playcore_age_signals.zzb
                    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
                        ek3 ek3Var;
/* 3 */                 if (i != 1) {
/* 6 */                     if (i != 3) {
/* 1 */                         return false;
                            }
/* 15 */                    Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
/* 17 */                    zzc.zzb(parcel);
/* 20 */                    fg3 fg3Var = (fg3) this;
/* 24 */                    zzo zzoVar = fg3Var.f8208c.f19090b;
/* 26 */                    TaskCompletionSource taskCompletionSource = fg3Var.f8207b;
/* 28 */                    zzoVar.zzu(taskCompletionSource);
/* 33 */                    int i3 = bundle.getInt("error.code");
/* 49 */                    fg3Var.f8206a.zza("onError(%d)", Integer.valueOf(i3));
/* 57 */                    taskCompletionSource.trySetException(new C0009a7(i3));
/* 2 */                     return true;
                        }
/* 67 */                Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
/* 69 */                zzc.zzb(parcel);
/* 72 */                fg3 fg3Var2 = (fg3) this;
/* 76 */                zzo zzoVar2 = fg3Var2.f8208c.f19090b;
/* 78 */                TaskCompletionSource taskCompletionSource2 = fg3Var2.f8207b;
/* 80 */                zzoVar2.zzu(taskCompletionSource2);
/* 89 */                fg3Var2.f8206a.zzc("onCompleteCheckAgeSignals", new Object[0]);
/* 98 */                if (bundle2.containsKey("user.status")) {
/* 203 */                   ek3Var = new ek3(bundle2.containsKey("user.status") ? Integer.valueOf(bundle2.getInt("user.status")) : null, bundle2.containsKey("age.range.lower") ? Integer.valueOf(bundle2.getInt("age.range.lower")) : null, bundle2.containsKey("age.range.upper") ? Integer.valueOf(bundle2.getInt("age.range.upper")) : null, bundle2.containsKey("most.recent.approval.date") ? new Date(bundle2.getLong("most.recent.approval.date")) : null, bundle2.containsKey("install.id") ? bundle2.getString("install.id") : null);
                        } else {
/* 107 */                   ek3Var = new ek3(null, null, null, null, null);
                        }
/* 206 */               taskCompletionSource2.trySetResult(ek3Var);
/* 2 */                 return true;
                    }
                }
            }
