            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzox implements zzow {
                /* JADX WARN: Code duplicated, block: B:14:0x002c  */
                /* JADX WARN: Code duplicated, block: B:16:0x002f A[RETURN] */
                @Override // com.google.android.recaptcha.internal.zzow
                public final StackTraceElement zza(Class cls, int i) {
/* 6 */             StackTraceElement[] stackTrace = new Throwable().getStackTrace();
/* 10 */            String name = cls.getName();
/* 14 */            int i2 = 3;
/* 16 */            boolean z = false;
/* 19 */            while (i2 < stackTrace.length) {
/* 31 */                if (stackTrace[i2].getClassName().equals(name)) {
/* 33 */                    z = true;
                        } else {
/* 35 */                    if (z) {
/* 43 */                        if (i2 != -1) {
/* 45 */                            return stackTrace[i2];
                                }
/* 48 */                        return null;
                            }
/* 38 */                    z = false;
                        }
/* 39 */                i2++;
                    }
/* 42 */            i2 = -1;
/* 43 */            if (i2 != -1) {
/* 45 */                return stackTrace[i2];
                    }
/* 48 */            return null;
                }
            }
