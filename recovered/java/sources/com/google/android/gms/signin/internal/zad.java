            package com.google.android.gms.signin.internal;

            import android.os.Parcel;
            import com.google.android.gms.internal.base.zab;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zad extends zab implements zae {
                @Override // com.google.android.gms.internal.base.zab
                public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
                    switch (i) {
                        case 3:
/* 93 */                    com.google.android.gms.internal.base.zac.zab(parcel);
                            break;
                        case 4:
/* 73 */                    com.google.android.gms.internal.base.zac.zab(parcel);
                            break;
                        case 5:
                        default:
/* 4 */                     return false;
                        case 6:
/* 61 */                    com.google.android.gms.internal.base.zac.zab(parcel);
                            break;
                        case 7:
/* 49 */                    com.google.android.gms.internal.base.zac.zab(parcel);
                            break;
                        case 8:
/* 24 */                    zak zakVar = (zak) com.google.android.gms.internal.base.zac.zaa(parcel, zak.CREATOR);
/* 26 */                    com.google.android.gms.internal.base.zac.zab(parcel);
/* 29 */                    mo2011q(zakVar);
                            break;
                        case 9:
/* 14 */                    com.google.android.gms.internal.base.zac.zab(parcel);
                            break;
                    }
/* 96 */            parcel2.writeNoException();
/* 99 */            return true;
                }
            }
