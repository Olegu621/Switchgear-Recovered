            package com.google.android.gms.auth.api.signin.internal;

            import android.os.Parcel;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.internal.p014authapi.zbb;
            import com.google.android.gms.internal.p014authapi.zbc;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zbq extends zbb implements zbr {
                @Override // com.google.android.gms.internal.p014authapi.zbb
                public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) {
                    switch (i) {
                        case ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE /* 101 */:
/* 56 */                    zbc.zbb(parcel);
/* 59 */                    f42.m3660p();
/* 62 */                    return false;
                        case 102:
/* 27 */                    Status status = (Status) zbc.zba(parcel, Status.CREATOR);
/* 29 */                    zbc.zbb(parcel);
/* 32 */                    zbc(status);
                            break;
                        case 103:
/* 12 */                    Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
/* 14 */                    zbc.zbb(parcel);
/* 17 */                    mo1998E(status2);
                            break;
                        default:
/* 4 */                     return false;
                    }
/* 35 */            parcel2.writeNoException();
/* 38 */            return true;
                }
            }
