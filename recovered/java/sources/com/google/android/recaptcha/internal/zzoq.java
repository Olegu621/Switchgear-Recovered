            package com.google.android.recaptcha.internal;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            enum zzoq {
                BOOLEAN,
                STRING,
                LONG,
                DOUBLE;

                public static /* bridge */ /* synthetic */ zzoq zza(Object obj) {
/* 3 */             if (obj instanceof String) {
/* 5 */                 return STRING;
                    }
/* 10 */            if (obj instanceof Boolean) {
/* 12 */                return BOOLEAN;
                    }
/* 17 */            if (obj instanceof Long) {
/* 19 */                return LONG;
                    }
/* 24 */            if (obj instanceof Double) {
/* 26 */                return DOUBLE;
                    }
/* 43 */            C1951n4.m6856g("invalid tag type: ".concat(String.valueOf(obj.getClass())));
/* 46 */            return null;
                }
            }
