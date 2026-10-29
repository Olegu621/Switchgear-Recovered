            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.drive.events.ChangeEvent;
            import com.google.android.gms.drive.events.CompletionEvent;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzfq implements Parcelable.Creator<zzfp> {
                @Override // android.os.Parcelable.Creator
                public final zzfp createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             int iM7871D = 0;
/* 8 */             ChangeEvent changeEvent = null;
/* 9 */             CompletionEvent completionEvent = null;
/* 10 */            com.google.android.gms.drive.events.zzo zzoVar = null;
/* 11 */            com.google.android.gms.drive.events.zzb zzbVar = null;
/* 12 */            com.google.android.gms.drive.events.zzv zzvVar = null;
/* 13 */            com.google.android.gms.drive.events.zzr zzrVar = null;
/* 18 */            while (parcel.dataPosition() < iM7883P) {
/* 20 */                int i = parcel.readInt();
/* 24 */                char c = (char) i;
/* 26 */                if (c == 2) {
/* 112 */                   iM7871D = qj3.m7871D(i, parcel);
                        } else if (c == 3) {
/* 109 */                   changeEvent = (ChangeEvent) qj3.m7898i(parcel, i, ChangeEvent.CREATOR);
                        } else if (c == 5) {
/* 99 */                    completionEvent = (CompletionEvent) qj3.m7898i(parcel, i, CompletionEvent.CREATOR);
                        } else if (c == 6) {
/* 89 */                    zzoVar = (com.google.android.gms.drive.events.zzo) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zzo.CREATOR);
                        } else if (c == 7) {
/* 79 */                    zzbVar = (com.google.android.gms.drive.events.zzb) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zzb.CREATOR);
                        } else if (c == '\t') {
/* 69 */                    zzvVar = (com.google.android.gms.drive.events.zzv) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zzv.CREATOR);
                        } else if (c != '\n') {
/* 48 */                    qj3.m7878K(i, parcel);
                        } else {
/* 59 */                    zzrVar = (com.google.android.gms.drive.events.zzr) qj3.m7898i(parcel, i, com.google.android.gms.drive.events.zzr.CREATOR);
                        }
                    }
/* 117 */           qj3.m7908s(iM7883P, parcel);
/* 122 */           return new zzfp(iM7871D, changeEvent, completionEvent, zzoVar, zzbVar, zzvVar, zzrVar);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzfp[] newArray(int i) {
/* 1 */             return new zzfp[i];
                }
            }
