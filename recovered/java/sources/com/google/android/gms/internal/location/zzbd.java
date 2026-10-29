            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.os.IBinder;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbd implements Parcelable.Creator<zzbc> {
                @Override // android.os.Parcelable.Creator
                public final zzbc createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 7 */             int iM7871D = 1;
/* 8 */             zzba zzbaVar = null;
/* 9 */             IBinder iBinderM7870C = null;
/* 10 */            PendingIntent pendingIntent = null;
/* 11 */            IBinder iBinderM7870C2 = null;
/* 12 */            IBinder iBinderM7870C3 = null;
/* 17 */            while (parcel.dataPosition() < iM7883P) {
/* 19 */                int i = parcel.readInt();
                        switch ((char) i) {
                            case 1:
/* 69 */                        iM7871D = qj3.m7871D(i, parcel);
                                break;
                            case 2:
/* 65 */                        zzbaVar = (zzba) qj3.m7898i(parcel, i, zzba.CREATOR);
                                break;
                            case 3:
/* 53 */                        iBinderM7870C = qj3.m7870C(i, parcel);
                                break;
                            case 4:
/* 49 */                        pendingIntent = (PendingIntent) qj3.m7898i(parcel, i, PendingIntent.CREATOR);
                                break;
                            case 5:
/* 37 */                        iBinderM7870C2 = qj3.m7870C(i, parcel);
                                break;
                            case 6:
/* 31 */                        iBinderM7870C3 = qj3.m7870C(i, parcel);
                                break;
                            default:
/* 27 */                        qj3.m7878K(i, parcel);
                                break;
                        }
                    }
/* 75 */            qj3.m7908s(iM7883P, parcel);
/* 80 */            return new zzbc(iM7871D, zzbaVar, iBinderM7870C, pendingIntent, iBinderM7870C2, iBinderM7870C3);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ zzbc[] newArray(int i) {
/* 1 */             return new zzbc[i];
                }
            }
