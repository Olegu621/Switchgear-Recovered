            package com.google.android.gms.internal.p014authapi;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Parcel;
            import android.text.TextUtils;
            import com.google.android.gms.auth.api.credentials.HintRequest;
            import p000.C0177be;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zbn {
                public static PendingIntent zba(Context context, C0177be c0177be, HintRequest hintRequest, String str) {
/* 3 */             kb1.m6062o(context, "context must not be null");
/* 8 */             kb1.m6062o(hintRequest, "request must not be null");
/* 15 */            if (TextUtils.isEmpty(str)) {
/* 17 */                str = zbbb.zba();
                    } else {
/* 22 */                kb1.m6061n(str);
                    }
/* 35 */            Intent intentPutExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (String) null);
/* 41 */            intentPutExtra.putExtra("logSessionId", str);
/* 44 */            Parcel parcelObtain = Parcel.obtain();
/* 49 */            hintRequest.writeToParcel(parcelObtain, 0);
/* 52 */            byte[] bArrMarshall = parcelObtain.marshall();
/* 56 */            parcelObtain.recycle();
/* 61 */            intentPutExtra.putExtra("com.google.android.gms.credentials.HintRequest", bArrMarshall);
/* 71 */            return PendingIntent.getActivity(context, 2000, intentPutExtra, zbbc.zba | 134217728);
                }
            }
