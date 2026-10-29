            package com.google.android.recaptcha.internal;

            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public final class zzgn {
                public /* synthetic */ zzgn(DefaultConstructorMarker defaultConstructorMarker) {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final int zzc(String str) {
/* 7 */             String strM6261k = C1852e.m6261k("18.7.1", ".", HttpUrl.FRAGMENT_ENCODE_SET);
/* 15 */            int iM6227C = StringsKt.m6227C(strM6261k, "-", 0, false, 6);
/* 20 */            if (iM6227C != -1) {
/* 23 */                strM6261k = strM6261k.substring(0, iM6227C);
                    }
/* 27 */            return Integer.parseInt(strM6261k);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final String zzd(String str) {
/* 13 */            return "cesdb".concat(StringsKt.m6237M("18.7.1", "-", HttpUrl.FRAGMENT_ENCODE_SET));
                }

/* 4 */         private zzgn() {
/* 5 */             throw null;
                }
            }
